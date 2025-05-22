package StringOperations;

public class String_Performance {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("AIET");
		for (int i=0; i<10000; i++){
		sb.append("Tpoint");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) +
		"ms");
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("AIET");
		for (int i=0; i<10000; i++){
		sb2.append("Tpoint");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) +
		"ms");
		

	

	}

}
