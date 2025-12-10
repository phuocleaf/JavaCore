package chapter9;

import java.util.Scanner;

public class Video52 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			try {
				System.out.println("Nhap x:");
				int x = scanner.nextInt();
				try {

					System.out.println(10 / x);
					System.out.println("end");
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("run error 1");
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("run error");
				continue;
			}

		}

		scanner.close();

	}
}
