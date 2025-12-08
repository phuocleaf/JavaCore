package hope;

import java.util.Scanner;

public class Lab1Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("nhap do dai canh thu nhat :");
		double a = scanner.nextDouble();

		System.out.println("nhap chieu dai canh thu hai");
		double b = scanner.nextDouble();

		System.out.println("Chu vi: " + ((a + b) * 2));
		System.out.println("Dien tich: " + (a * b));
		System.out.println("Canh nho nhat: " + Math.min(a, b));

		scanner.close();
	}
}
