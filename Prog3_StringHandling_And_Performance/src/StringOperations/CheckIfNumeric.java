package StringOperations;

public class CheckIfNumeric {

	public static void main(String[] args) {
		String[] tests = { null, "", "12345", "42shravan", "007", " 123 ", "-99" };

        for (String t : tests) {
            System.out.printf("\"%s\" → %b%n", t, isNumeric(t));
        }
	}
    public static boolean isNumeric(String s) {
        if (s == null || s.isEmpty()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;

	}

}
