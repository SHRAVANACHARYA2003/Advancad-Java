package StringOperations;

import java.security.SecureRandom;

public class GenerateRandomString {
	private static final String CHAR_POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom random = new SecureRandom();

	public static void main(String[] args) {
		int length = 12;
        String randomStr = generateRandomString(length);
        System.out.println("Random string of length " + length + ": " + randomStr);
    }

    
    public static String generateRandomString(int length) {
        if (length <= 0) return "";

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int idx = random.nextInt(CHAR_POOL.length());
            sb.append(CHAR_POOL.charAt(idx));
        }
        return sb.toString();
    

	}

}
