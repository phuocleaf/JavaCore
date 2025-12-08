package Lab2;

import java.util.Scanner;

public class Bai04 {

	public static void Bai01() {

	}

	public static void Bai02() {

	}

	public static void Bai03() {

	}

	public static void main(String[] args) {
		/*
		 * 1 giai phuong trinh bac nhat 2 giai phuong trinh bac 2 3 tinh so tien dien 4
		 * ket thuc
		 * 
		 **/

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lua chon cua ban:");
		int choosen = scanner.nextInt();

		switch (choosen) {
		case 1:
			Bai01();
			break;
		case 2:
			Bai02();
			break;
		case 3:
			Bai03();
			break;
		default:
			System.out.println("Ket thuc chuong trinh");
			System.exit(0);
		}

		scanner.close();
	}
}
