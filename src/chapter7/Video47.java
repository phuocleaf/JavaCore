package chapter7;

class Animal {
	void eat() {
		System.out.println("animal eat");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog eat");
	}
}

class BabyDog extends Animal {

}

public class Video47 {
	public static void main(String[] args) {
		Animal a = new BabyDog();
		a.eat();
	}
}
