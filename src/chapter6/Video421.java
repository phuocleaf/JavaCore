package chapter6;

public class Video421 {
	public static void main(String[] args) {
		System.out.println("run video 421");

		SinhVienIT it = new SinhVienIT("123", "Phuoc", 10, 0.1, "java");
		it.getMoney();

		System.out.println("get id " + it.getId());

		SinhVienCoKhi cokhi = new SinhVienCoKhi("123", "Phdsfuoc", 10, 0.1, "machine");
		System.out.println("get id " + cokhi.getName());
	}
}
