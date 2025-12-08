package lab4OOP;

public class Student {

	public Student() {
		// default constructor
		// neu khong dinh nghia ham tao nao thi java se tu tao
		// neu co dinh nghia ham tao thi khong tu dong tao constructor
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// class attributes
	String name;
	int age;

	// class method
	void learnJava() {
		System.out.println("Learn Java");
	}

	int getAge() {
		return age;
	}
}
