package chapter5;

import java.util.ArrayList;

import lab4OOP.Product;

public class Video33 {
	public static void main(String[] args) {
		System.out.println("runvideo33");

		int a = 10;
		ArrayList<Product> a2 = new ArrayList<Product>(); // generic

		ArrayList<String> a1 = new ArrayList<String>(); // generic

		ArrayList a3 = new ArrayList(); // not generic

		ArrayList<String> a4 = new ArrayList(); // generic / java dimond

		a1.add("sd54f");
		a1.add("s23df");
		a1.add("sd3f");
		a1.add("sd12f");

		a1.remove(1);

		System.out.println(a1.toString());
		System.out.println(a1.get(1));

	}
}
