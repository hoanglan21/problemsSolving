package fall2019;

public class leetCode921 {
	
	public int minAddToMakeValid(String S) {
        return helper(S, 0, 0, 0);
    }
	
	public int helper(String S, int index, int left, int right) {
		if (index == S.length()) {
			return left+right;
		}
		else {
			if (S.charAt(index) == '(') {
				return helper(S, index+1,left+1, right);
			}
			else if (S.charAt(index) == ')' && left > 0) {
				return helper(S, index+1, left-1, right);
			}
			else {
				return helper(S, index+1, left, right+1);
			}
		}
	}

}
