package lab03;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		System.out.println("running");

		System.out.println("run");

		Scanner scanner = new Scanner(System.in);

		System.out.println("nhap mot so: ");
		int num = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
		}

		scanner.close();
	}
}
