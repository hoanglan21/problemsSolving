package fall2019;

import java.util.ArrayList;
import java.util.HashMap;

public class leetCode860 {
	
	public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> give = new HashMap<Integer, Integer>();
        give.put(5, 0);
        give.put(10, 0);
        give.put(20, 0);
        for (int index = 0; index < bills.length; index++) {
            if (bills[index] == 5) {
                give.replace(5, give.get(5)+1);
            }
            else if (bills[index] == 10) {
                if (give.get(5) > 0) {
                	give.replace(5, give.get(5)-1);
                	give.replace(10, give.get(10)-1);
                }
                else {
                    return false;
                }
            }
            else {
            	if (give.get(10) > 0 && give.get(5) > 0) {
            		give.replace(5, give.get(5)-1);
            		give.replace(10, give.get(10)-1);
            		give.replace(20, give.get(20)+1);
            	}
            	else if (give.get(5)>3) {
            		give.replace(5, give.get(5)-1);
            		give.replace(20, give.get(20)+1);
            	}
                else {
                    return false;
                }
            }
        }
        return true;
        
    }

}
