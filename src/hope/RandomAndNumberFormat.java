package hope;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class RandomAndNumberFormat {
	public static void main(String[] args) {

		Random rd = new Random();

		int num = 200000000;

		for (int i = 0; i < 5; i++) {
			int b = rd.nextInt(5) + 1;
			System.out.println(b);
		}

		NumberFormat vn = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		System.out.println(vn.format(num));

		// more on oracle
	}
}
