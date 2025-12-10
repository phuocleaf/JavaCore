package chapter9;

import java.util.Scanner;

public class Video56 {

	public static String nhapMasv() {
		System.out.println("nhap ma sinh vien");
		String result = null;
		while (true) {
			try (Scanner sc = new Scanner(System.in)) {// khong duoc dung vi no se dong scanner cả system in system in
														// đóng rồi thì không mở lại được
				result = sc.nextLine();
				return result;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("nhap ma sinh vien khong hop le, nhap lai");

			}
		}
	}

	public static void main(String[] args) {
		System.out.println("56");

		String name = nhapMasv();
		System.out.println(name);

	}
}
