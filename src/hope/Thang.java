package hope;

public enum Thang {
	thangMot(31), thangHai(28), thangBa(0), thangBon(31), thangNam(31), thangSau(31), thangBay(31), thangTam(31),
	thangChin(31), thangMuoi(31), thangMuoiMot(31), thangMuoiHai(31);

	private int soNgay;

	Thang(int soNgay) {
		this.soNgay = soNgay;
	}

	public int soNgay() {
		return this.soNgay;
	}
}
