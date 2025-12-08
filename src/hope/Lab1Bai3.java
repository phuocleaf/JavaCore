package hope;

import java.util.Scanner;

public class Lab1Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("nhap do dai canh:");
		double a = scanner.nextDouble();

		System.out.println("the tich:" + Math.pow(a, 3));

		scanner.close();
	}
}
