package StringOperations;

public class CapitalizeWords {

	public static void main(String[] args) {
		String original = "java is a programming LANGUAGE";
        String capped   = capitalizeWords(original);

        System.out.println("Original : \"" + original + "\"");
        System.out.println("Capital  : \"" + capped   + "\"");
    }

    
    public static String capitalizeWords(String s) {
        if (s == null || s.isEmpty()) return s;

        StringBuilder result = new StringBuilder();
        boolean newWord = true;

        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                newWord = true;
                result.append(c);
            } else {
                if (newWord) {
                    result.append(Character.toUpperCase(c));
                    newWord = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }
        }
        return result.toString();

	}

}
