package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ColorSearchInArrayList {

	public static void main(String[] args) {
		 List<String>colors=new ArrayList<>();
	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Yellow");
	        colors.add("Violet");
		    colors.add("Indigo");
	        System.out.println("List of colors: "+colors);
	        boolean Red = colors.contains("Red");
			System.out.println("Contains Red? " +Red);


	}

}
