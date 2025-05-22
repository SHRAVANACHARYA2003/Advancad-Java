package ListInterface;
import java.util.LinkedList;

public class DisplayLinkedListElementsAndPositions {

	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();
        colors.addFirst("green");
        colors.addLast("Blue");
        colors.add("Orange");
		System.out.println(colors.get(1));

	}

}
