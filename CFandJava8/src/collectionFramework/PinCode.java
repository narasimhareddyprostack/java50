package collectionFramework;

public class PinCode {
	  public static void main(String[] args) {
	        System.out.println(validPinCode("garden"));
	    }
	    static boolean validPinCode(String word){
	        for(char ch:word.toCharArray()){
	            //System.out.println(ch);
	            if(!Character.isDigit(ch)) {
	            	return false;
	            }
	        }
			return true;
	    }
}
