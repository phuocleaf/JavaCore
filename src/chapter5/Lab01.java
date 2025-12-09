package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab01 {
	public static void main(String[] args) {

		ArrayList<Double> arr = new ArrayList<Double>();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("nhap vao phan tu cua mang");
			double x = scanner.nextDouble();
			arr.add(x);
			scanner.nextLine();// enter
			System.out.println("ban muon tiep tuc Y/N");
			String c = scanner.nextLine();
			if (c.equals("N") || c.equals("n")) {// object -> equal
				break;
			}
		}

		System.out.println("arr: " + arr);

		double sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}

		System.out.println("tong: " + sum);
		scanner.close();
	}
}
