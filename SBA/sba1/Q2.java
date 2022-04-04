package sba1;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(31);
		list.add(11);
		list.add(52);
		list.add(25);
		int sum = 0;
		for (int i : list)
			sum = sum + i;
		System.out.println("Sum = " + sum);
		int avg = sum / list.size();
		System.out.println("Average = " + avg);
	}
}
