package Lab2;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		System.out.println("run lab2 bai03");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap vao so dien: ");
		int a = scanner.nextInt();

		if (a <= 100) {
			System.out.println("tien dien la: " + a * 1000);
		} else {
			System.out.println("tien dien la: " + (100 * 1000 + (a - 100) * 1500));
		}

		scanner.close();
	}
}
