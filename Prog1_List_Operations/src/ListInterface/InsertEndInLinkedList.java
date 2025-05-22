package ListInterface;
import java.util.LinkedList;
public class InsertEndInLinkedList {

	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();
        colors.addFirst("Green");
        colors.addLast("Blue");
        colors.add("Orange");
		  colors.offerLast("Pink");
		  System.out.println(colors);

	}

}
