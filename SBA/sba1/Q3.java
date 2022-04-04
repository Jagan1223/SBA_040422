package sba1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of students");
		int n = sc.nextInt();
		ArrayList<String> first_name = new ArrayList<String>();
		ArrayList<String> second_name = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter first name of student no." + i);
			first_name.add(sc.next());
			System.out.println("Enter last name of student no." + i);
			second_name.add(sc.next());
		}
		for (int i = 0; i < n; i++) {
			System.out.println(
					"Full name of student no." + (i + 1) + "= " + first_name.get(i) + " " + second_name.get(i));
		}

	}

}
