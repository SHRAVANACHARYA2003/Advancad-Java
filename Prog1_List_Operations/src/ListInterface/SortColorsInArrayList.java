package ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortColorsInArrayList {

	public static void main(String[] args) {
		List<String>colors=new ArrayList<>();
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Violet");
	    colors.add("Indigo");
        System.out.println(" List of colors: "+colors);
        String firstcolor = colors.get(0);
		System.out.println("First Color: " + firstcolor);
		Collections.sort(colors);
		System.out.println("After sorting: " +colors);

	}

}
