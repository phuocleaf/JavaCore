package hope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		int mang[] = new int[5];

		int[] mang2 = new int[] { 1, 2, 3 };

		List<String> a = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mang.length; i++) {
			System.out.println("nhap phan tu thu: " + (i + 1));
			int input = sc.nextInt();
			mang[i] = input;
		}

		System.out.println(Arrays.toString(mang));
	}
}
