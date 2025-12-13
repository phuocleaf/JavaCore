package queueAndDeque;

public class SinhVien {
	String ten;
	double diem;

	public SinhVien(String ten, double diem) {
		this.ten = ten;
		this.diem = diem;
	}

	@Override
	public String toString() {
		return ten + " - " + diem;
	}
}
