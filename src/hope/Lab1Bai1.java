package hope;

import java.util.Scanner;

public class Lab1Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("nhap ten sinh vien:");
		String name = scanner.nextLine();

		System.out.println("nhap diem trung binh");
		double score = scanner.nextDouble();

		System.out.printf("sinh vien %s co diem trung binh la %.1f\n", name, score);

		scanner.close();
	}

}
