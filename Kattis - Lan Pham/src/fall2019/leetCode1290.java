package fall2019;

import java.util.ArrayList;

public class leetCode1290 {

	public int getDecimalValue(ListNode head) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        int index = 0;
        while (head != null) {
            values.add(index, head.val);
            head = head.next;
            index++;
        }
        return helperMethod(values);
        
    }
	
	public int helperMethod(ArrayList<Integer> values) {
		int summary = 0;
		int cal = 1;
		for (int index = values.size()-1; index >= 0; index--) {
			if (values.get(index) == 1) {
				summary += Math.pow(2, cal);
				cal++;
			}
			else {
				cal++;
			}
		}
		return summary;
	}
	
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
}

	
