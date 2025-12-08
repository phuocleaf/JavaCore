package lab03;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		System.out.println("run");

		Scanner scanner = new Scanner(System.in);

		System.out.println("nhap mot so nguyen: ");
		int num = scanner.nextInt();

		boolean checked = false;

		for (int i = num - 1; i > 1; i--) {
			if (num % i == 0) {
				checked = true;
				break;
			}
		}

		if (checked)
			System.out.println("khong phai so nguyen to");
		else
			System.out.println("La so nguyen to");

		scanner.close();
	}
}
