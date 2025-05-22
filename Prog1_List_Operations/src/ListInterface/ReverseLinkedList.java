package ListInterface;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();
        colors.add("Green");
        colors.add("Blue");
        colors.add("Orange");
		 
		System.out.println(colors);
		 
		 
		 Iterator<String>iterator =  colors.descendingIterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}


	}

}
