package ListInterface;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListIteratorFromSecond {

	public static void main(String[] args) {
List<String> linkedList = new LinkedList<>();
		
		linkedList.add("Blue");
		linkedList.add("Green");
		linkedList.add("Red");
		Iterator<String>iterator = linkedList.iterator();
		Iterator iteratorobj = linkedList.listIterator(1);
		while(iteratorobj.hasNext()) {
			System.out.println(iteratorobj.next());
		}

	

	}

}
