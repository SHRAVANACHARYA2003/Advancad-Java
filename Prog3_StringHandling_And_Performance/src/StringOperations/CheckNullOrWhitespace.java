package StringOperations;

public class CheckNullOrWhitespace {

	public static void main(String[] args) {
		String s1 = null;
        String s2 = "";
        String s3 = "    ";
        String s4 = "Hello";

        System.out.println("s1 → " + isNullOrEmpty(s1));   
        System.out.println("s2 → " + isNullOrEmpty(s2));   
        System.out.println("s3 → " + isNullOrEmpty(s3));   
        System.out.println("s4 → " + isNullOrEmpty(s4));   
    }

   
    public static boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
   
	}

}
