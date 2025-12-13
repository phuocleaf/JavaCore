package PracticeArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSachSinhVien;

	public DanhSachSinhVien() {
		this.danhSachSinhVien = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSachSinhVien) {
		this.danhSachSinhVien = danhSachSinhVien;
	}

	public void themSinhVien(SinhVien sv) {
		this.danhSachSinhVien.add(sv);
	}

	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSachSinhVien) {
			System.out.println(sinhVien);
		}
	}

	public boolean kiemTraDanhSachRong() {
		return this.danhSachSinhVien.isEmpty();
	}

	public int laySoLuongSinhVien() {
		return this.danhSachSinhVien.size();
	}

	public void lamRongDanhSachSinhVien() {
		this.danhSachSinhVien.removeAll(danhSachSinhVien);
	}

	public boolean kiemTraTonTai(String maSV) {

		// co the dung contains neu nhap vao mot sinh vien contains dung equals neen
		// phai override
		SinhVien sv = new SinhVien(maSV, "", 1, 1);

		for (SinhVien sinhVien : danhSachSinhVien) {
			if (sinhVien.compareTo(sv) == 0)
				return true;
		}

		return false;
	}

	public void xoaSinhVien(SinhVien sv) {
		this.danhSachSinhVien.remove(sv);
	}

	public void timSVTheoTen(String ten) {
		for (SinhVien sinhVien : danhSachSinhVien) {
			if (sinhVien.getHoTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
				return;
			}
		}
		System.out.println("Khong tim thay");
	}

	// comparator
	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhSachSinhVien, new Comparator<SinhVien>() {
			// cho biet khi 2 doi tung dung do nhau thi lay cai gi de so sanh
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getDiemTrungBinh() < o2.getDiemTrungBinh())
					return 1;
				else if (o1.getDiemTrungBinh() == o2.getDiemTrungBinh())
					return 0;
				else
					return -1;
			}

		});

//		this.danhSachSinhVien.sort(
//			    (o1, o2) -> Double.compare(o2.getDiemTrungBinh(), o1.getDiemTrungBinh())
//			);

	}
}
