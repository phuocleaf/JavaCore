package hope;

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] clubs = { 15, 5, 54, 45, 4, 11 }; // so luong phan tu co dinh

		for (int i = 0; i < clubs.length; i++) {
			for (int j = i + 1; j < clubs.length; j++) {
				if (clubs[i] > clubs[j]) {
					int temp = clubs[i];
					clubs[i] = clubs[j];
					clubs[j] = temp;
				}
			}
		}

		System.out.println("run here " + Arrays.toString(clubs));

	}
}
