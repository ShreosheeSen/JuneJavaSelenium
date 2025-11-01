package StringReverse;

public class stringreverse3 {

	public static void main(String[] args) {
	
		 String str = "Selenium123 ";
	        String reversed = reverseRecursively(str);
	        System.out.println("Reversed String: " + reversed);
	    }

	    public static String reverseRecursively(String str) {
	        if (str.isEmpty()) {
	            return str;
	        }
	       return reverseRecursively(str.substring(1)) + str.charAt(0);
		

	}

}
