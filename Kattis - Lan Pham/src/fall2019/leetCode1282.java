package fall2019;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.junit.Test;

public class leetCode1282 {
	
	List<List<Integer>> answer;
	HashMap<Integer, List<Integer>> hey;
	
	public leetCode1282() {
		answer = new ArrayList<List<Integer>>();
		hey = new HashMap<Integer, List<Integer>>();
	}
	
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        for (int index = 0; index < groupSizes.length; index++) {
        	if (hey.containsKey(groupSizes[index])) {
        		List<Integer> oho = hey.get(groupSizes[index]);
        		oho.add(index);

        	}
        	else {
        		List<Integer> aha = new ArrayList<Integer>();
        		aha.add(index);
        		hey.put(groupSizes[index], aha);
        	}
            
        }
        helperMethod(hey);
        
        return answer;
    }
	
	public void helperMethod(HashMap<Integer, List<Integer>> hey) {
		
		for (Entry<Integer, List<Integer>> key : hey.entrySet()) {
        	if (key.getValue().size() == key.getKey()) {
        		answer.add(key.getValue());
        	}
        	else {
        		
        	int number = key.getValue().size()/key.getKey();

      		for (int index = 0; index < number; index++) {
        			List<Integer> ohno = new ArrayList<Integer>();
        			while (ohno.size() < key.getKey()) {
        				int first = key.getValue().get(0);
        				key.getValue().remove(key.getValue().get(0));
        				ohno.add(first);
        			}
        			answer.add(ohno);
        		}
         	}
        }
	}


@Test
public void test() {
	int[] groupSizes = {2,2,1,1,1,1,1,1};
	leetCode1282 h = new leetCode1282();
	List<List<Integer>> answer = h.groupThePeople(groupSizes);
	for (int index = 0; index < answer.size(); index++) {
		System.out.println(answer.get(index));
	}
	
	
	
}
}

