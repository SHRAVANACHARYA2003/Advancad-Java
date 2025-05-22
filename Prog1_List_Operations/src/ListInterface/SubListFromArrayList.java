package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class SubListFromArrayList {

	public static void main(String[] args) {
		List<String>colors=new ArrayList<>();
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Violet");
	    colors.add("Indigo");
        System.out.println(" List of colors: "+colors);
		List<String> subList = colors.subList(0, 2);
		System.out.println("Sublist (0-2): " + subList);

	}

}
