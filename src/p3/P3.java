package p3;

import p1.P;

public class P3 extends P {

	private void test() {
		P firstObj = new P();
		firstObj.a = 10;
		// firstObj.b = 10;//default
		super.c = 10;// protected
		// firstObj.d = 10; khong truy cap duoc vi private
	}

	public static void main(String[] args) {
		P firstObj = new P();
		firstObj.a = 10;
//		firstObj.b = 10;default
//		firstObj.c = 10;// protected
		// firstObj.d = 10; khong truy cap duoc vi private
	}
}
