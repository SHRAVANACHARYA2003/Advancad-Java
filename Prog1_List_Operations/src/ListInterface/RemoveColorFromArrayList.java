package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class RemoveColorFromArrayList {

	public static void main(String[] args) {
		 List<String>colors=new ArrayList<>();
	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Yellow");
	        colors.add("Violet");
		    colors.add("Indigo");
	        System.out.println("Original List of colors: "+colors);
			colors.remove(2); // Remove by index
			colors.remove("Blue");
			System.out.println("After removing elements: "+colors);

	}

}
