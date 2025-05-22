package StringOperations;

public class TruncateString {

	public static void main(String[] args) {
		String longText  = "The quick brown fox jumps over the lazy dog";
        String shortText = "Hello";

        System.out.println(truncate(longText, 20));  
        System.out.println(truncate(longText, 10)); 
        System.out.println(truncate(shortText, 10)); 
    }

    
    public static String truncate(String text, int maxLen) {
        if (text == null) return null;
        if (maxLen <= 0)  return "";

        if (text.length() <= maxLen) {
            return text;               
        }

        if (maxLen < 4) {                       
            return text.substring(0, maxLen);
        }

        return text.substring(0, maxLen - 1) + '…'; 
    


	}

}
