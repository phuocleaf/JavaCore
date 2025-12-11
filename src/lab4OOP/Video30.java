package lab4OOP;

public class Video30 {
	public static void main(String[] args) {
		System.out.println("run product");

		Product test = new Product();
		Product pr1 = test.nhapThongTin("Sky 2 gx", 1290000, 0.1);
		Product pr2 = test.nhapThongTin("Sky 2 gx", 1290000, 0.1);
		test.xuatThongTin(pr1);
		System.out.println(pr1.equals(pr2));

		System.out.println("tax: " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}
}
