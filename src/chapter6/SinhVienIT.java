package chapter6;

public class SinhVienIT extends SinhVien {
	private String language;

	public SinhVienIT(String id, String name, double price, double tax, String language) {
		super(id, name, price, tax);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void getMoney() {
		System.out.println("run get money");
		super.info();
	}

	public void info() {
		System.out.println("run info from sv it");
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}
}
