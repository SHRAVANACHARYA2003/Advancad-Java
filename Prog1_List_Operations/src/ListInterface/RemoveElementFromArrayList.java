package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromArrayList {

	public static void main(String[] args) {
		 List<String>colors=new ArrayList<>();
	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Yellow");
	        colors.add("Violet");
		    colors.add("Indigo");
	        System.out.println("Original List of colors: "+colors);
	        colors.remove(4);
		System.out.println("After removing last index:"+colors);

	}

}
