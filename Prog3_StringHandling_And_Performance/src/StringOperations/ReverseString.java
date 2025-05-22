package StringOperations;

public class ReverseString {

	public static void main(String[] args) {
		   String original = "Shravan";
	        String reversed = reverseString(original);

	        System.out.println("Original : " + original);
	        System.out.println("Reversed : " + reversed);
	    }

	  
	    public static String reverseString(String s) {
	        if (s == null) return null;          
	        return new StringBuilder(s).reverse().toString();
	  

	}

}
