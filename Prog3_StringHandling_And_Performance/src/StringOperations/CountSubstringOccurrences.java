package StringOperations;

public class CountSubstringOccurrences {

	public static void main(String[] args) {
		String text = "banana bandana bananas";
        String sub  = "ana";

        System.out.printf("\"%s\" appears %d times in \"%s\"%n",
                          sub, countOccurrences(text, sub), text);

        
        System.out.println(countOccurrences("aaaa", "aa"));      
        System.out.println(countOccurrences("ABCabcABC", "abc")); 
        System.out.println(countOccurrences("hello", ""));        
    }

    
    public static int countOccurrences(String text, String sub) {
        if (text == null || sub == null || sub.isEmpty()) return 0;

        int count = 0;
        int idx = 0;

        while ((idx = text.indexOf(sub, idx)) != -1) {
            count++;
            idx++;               
        }
        return count;
    


	}

}
