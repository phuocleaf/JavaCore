package chapter6;

public class Car extends Vehical {
	private String model = "mustang";

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.hook();

		System.out.println("brand " + mycar.brand + " model " + mycar.model);
	}
}
