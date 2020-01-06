package fall2019;

import java.util.HashMap;

public class leetCode455 {

	public int findContentChildren(int[] g, int[] s) {
       int number = 0; 
       
       for (int index = 0; index < g.length; index++) {
    	   for (int j = 0; j < s.length; j++) {
    		   if (g[index] <= s[j]) {
    			   number++;
    			   s[j] = -1;
    			   j = s.length;
    		   }
    	   }
       }
       
       return number;
    }
}
