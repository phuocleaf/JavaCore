package PracticeArrayList;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien> {
	private String maSinhVien, hoTen;
	private int namSinh;
	private float diemTrungBinh;

	public SinhVien(String maSinhVien, String hoTen, int namSinh, float diemTrungBinh) {

		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}

	@Override
	public int compareTo(SinhVien o) {
		return this.maSinhVien.compareTo(o.maSinhVien);
	}

	@Override
	public int hashCode() {
		return Objects.hash(diemTrungBinh, hoTen, maSinhVien, namSinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Float.floatToIntBits(diemTrungBinh) == Float.floatToIntBits(other.diemTrungBinh)
				&& Objects.equals(hoTen, other.hoTen) && Objects.equals(maSinhVien, other.maSinhVien)
				&& namSinh == other.namSinh;
	}

}
