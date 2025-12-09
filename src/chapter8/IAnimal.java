package chapter8;

public interface IAnimal {
	public void animalSound();

	default public void run() {
		System.out.println("animal ec ec");
	}
}
