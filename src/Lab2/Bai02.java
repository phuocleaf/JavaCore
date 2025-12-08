package Lab2;

import java.util.Scanner;

public class Bai02 {

	public static void giaiPhuongTrinhBacNhat(int b, int c) {
		if (b == 0 && c == 0) {
			System.out.println("Phuong trinh vo so nghiem");
		} else if (b == 0 && c != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			System.out.println("phuong trinh co nghiem: " + (float) (-c) / b);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("giai phuong trinh ax^2 + bx + c = 0");

		System.out.println("nhap a :");
		int a = scanner.nextInt();

		System.out.println("nhap b");
		int b = scanner.nextInt();

		System.out.println("nhap c");
		int c = scanner.nextInt();

		if (a == 0) {
			giaiPhuongTrinhBacNhat(b, c);
//			if (b == 0 && c == 0) {
//				System.out.println("Phuong trinh vo so nghiem");
//			} else if (b == 0 && c != 0) {
//				System.out.println("Phuong trinh vo nghiem");
//			} else {
//				System.out.println("phuong trinh co nghiem: " + (float) (-c) / b);
//			}
		} else {
			int delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("phuong trinh vo nghiem");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.println("phuong trinh co nghiem kep " + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);

				System.out.printf("phuong trinh co 2 nghiem %.3f, %.3f", x1, x2);
			}
		}

		scanner.close();
	}
}
