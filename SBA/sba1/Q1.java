package sba1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1 {
	public static void main(String[] args) {
		List<Double> list2 = new ArrayList<Double>();
		list2.add(35.55);
		list2.add(21.55);
		list2.add(53.55);
		list2.add(43.55);
		Collections.sort(list2, Collections.reverseOrder());
		System.out.println("Array elements in descending order");
		for (Double number : list2)
			System.out.println(number);
	}
}