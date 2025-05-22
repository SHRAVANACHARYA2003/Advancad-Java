package StringOperations;

public class WordCountInString {

	public static void main(String[] args) {
		 String sentence = "My Name Is Shravan";
		 System.out.println("Sentence:"+sentence);
	        int wordCount = countWords(sentence);
	        System.out.println("Number of words: " + wordCount);
	    }

	    
	    public static int countWords(String text) {
	        if (text == null || text.trim().isEmpty()) {
	            return 0;
	        }
	       
	        String[] words = text.trim().split("\\s+");
	        return words.length;

	}

}
