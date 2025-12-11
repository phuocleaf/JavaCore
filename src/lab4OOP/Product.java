package lab4OOP;

import java.util.Objects;

public class Product {

	private String name;
	private double price;
	private double tax;

	public Product() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, tax);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(tax) == Double.doubleToLongBits(other.tax);
	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Product nhapThongTin(String name, double price, double tax) {
		Product pr = new Product(name, price, tax);
		return pr;
	}

	public void xuatThongTin(Product pr) {
		System.out.println("name " + pr.getName() + " price: " + pr.getPrice() + " tax " + pr.getTax());
	}

	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}

}
