package PracticeArrayList;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien ds = new DanhSachSinhVien();
		int chon = 0;
		do {
			System.out.println("chon");
			chon = sc.nextInt();
			sc.nextLine();
			if (chon == 1) {
				System.out.println("1. them thong tin sinh vien:");
				System.out.println("nhap ma sinh vien");
				String masv = sc.nextLine();
				System.out.println("nhap ten sinh vien");
				String tensv = sc.nextLine();
				System.out.println("nhap nam sinh");
				int ns = sc.nextInt();
				System.out.println("nhap diem trung binh");
				Float dtb = sc.nextFloat();

				SinhVien sv = new SinhVien(masv, tensv, ns, dtb);
				ds.themSinhVien(sv);
			} else if (chon == 2) {
				System.out.println("Xuat danh sach sinh vien");
				ds.inDanhSachSinhVien();
			} else if (chon == 3) {
				System.out.println("danh sach sinh vien rong ? " + ds.kiemTraDanhSachRong());

			} else if (chon == 4) {
				System.out.println("so luong sinh vien trong danh sach ? " + ds.laySoLuongSinhVien());
			} else if (chon == 5) {
				System.out.println("lam rong danh sach sinh vien ");
				ds.lamRongDanhSachSinhVien();
				System.out.println("so luong sinh vien trong danh sach ? " + ds.laySoLuongSinhVien());
			} else if (chon == 6) {
				System.out.println("nhap ma sinh vien");
				String masv = sc.nextLine();
				System.out.println("ton tai sinh vien?" + ds.kiemTraTonTai(masv));
			} else if (chon == 7) {

			} else if (chon == 8) {

			} else if (chon == 9) {

			}
		} while (chon != 0);
	}
}
