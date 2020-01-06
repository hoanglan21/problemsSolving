package fall2019;

public class leetCode5 {
	
	public String longestPalindrome(String s) {
        boolean palindrome =  false;
        int start = -1;
        int end = -1;
        for (int index = 0; index < s.length(); index++) {
            for (int j = s.length()-1; j >= index; j--){
                palindrome = isPalindrome(s, index, j);
                if (palindrome) {
                    if (j - index >= (end-start)) {
                        start = index;
                        end = j;
                    }
                }
            }
        }
        if (start == -1 || end == -1) {
            return "";
        }
        return s.substring(start, end+1);
    }
    
    public boolean isPalindrome(String s, int index, int j) {
        if (j-index+1 <= 1) {
            return true;
        }
        else if (s.charAt(index) != s.charAt(j)) {
            return false;
        }
        else {
            return isPalindrome(s, index+1, j-1);
        }
    }



}
