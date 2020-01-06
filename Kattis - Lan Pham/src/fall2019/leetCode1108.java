package fall2019;

public class leetCode1108 {
	
		public String defangIPaddr(String address) {
			
			return helperMethod(address, "", 0);
        
    }
		
		public String helperMethod (String address, String answer, int index) {
			
			if (index == address.length()) {
				return answer;
			}
			
			else {
				if (address.charAt(index) == '.') {
					return helperMethod(address, answer+"[.]", index+1);
				}
				else {
					return helperMethod(address, answer+address.charAt(index), index+1);
				}
			}
			
		}

}
