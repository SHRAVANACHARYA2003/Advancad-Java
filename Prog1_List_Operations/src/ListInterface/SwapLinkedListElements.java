package ListInterface;
import java.util.Collections;
import java.util.LinkedList;

public class SwapLinkedListElements {

	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();
        colors.addFirst("Green");
        colors.addLast("Blue");
        colors.add("Orange");
        System.out.println(" List of colors: "+colors);
        Collections.swap(colors, 0, 2);
        System.out.println("After Swapping:"+colors);


	}

}
