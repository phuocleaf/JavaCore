package chapter10;

public class Video61 extends Thread {

	public void run() {
		System.out.println("hellofromathread");

	}

	public static void main(String[] args) {

		(new Video61()).start();
		System.out.println("run vode 61");

	}
}
