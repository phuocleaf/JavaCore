package chapter6;

import java.util.ArrayList;
import java.util.Scanner;

public class Video38 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("nhap vao username");
//		String name = scanner.nextLine();
//
//		System.out.println("nhap vao pw");
//		String pw = scanner.nextLine();
//
//		if (name.equals("Phuoc") && pw.length() >= 6) {
//
//			System.out.println("pass");
//		} else
//			System.out.println("away");

		Student student = new Student("Phuoc", "1");
		Student student2 = new Student("ngPhuoc2", "2");
		Student student3 = new Student("taPhuoc3", "13");
		Student student4 = new Student("Phuoc4", "15");
		Student student5 = new Student("Phuoc5", "16");

		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(student);
		arr.add(student2);
		arr.add(student3);
		arr.add(student4);
		arr.add(student5);

		System.out.println(arr);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("ng")) {
				System.out.println(arr.get(i));
			}
		}

		scanner.close();
	}
}
