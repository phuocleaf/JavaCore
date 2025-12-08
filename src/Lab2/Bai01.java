package Lab2;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("giai phuong trinh ax + b = 0");

		System.out.println("nhap a :");
		int a = scanner.nextInt();

		System.out.println("nhap b");
		int b = scanner.nextInt();

		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			System.out.println("phuong trinh co nghiem: " + (float) (-b) / a);
			// ep kieu
		}

		scanner.close();
	}
}
