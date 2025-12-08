package lab4OOP;

public class Video23 {

	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		Student st1 = new Student();// constructor

		Student st2 = new Student("Phuoc", 23);

		System.out.println("ten " + st2.name + " age " + st2.age);
	}
}
