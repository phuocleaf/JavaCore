package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		System.out.println("running");

		Scanner scanner = new Scanner(System.in);

		System.out.println("nhap so luong phan tu cua mang: ");
		int num = scanner.nextInt();

		int[] nums = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.printf("nhap phan tu thu %d cua mang:\n", i + 1);
			nums[i] = scanner.nextInt();
		}

		System.out.println(Arrays.toString(nums));

		Arrays.sort(nums);

		System.out.println("sau khi sap xep tang dan:");

		System.out.println(Arrays.toString(nums));

		System.out.println("Phan tu nho nhat: " + nums[0]);
		System.out.println("Phan tu lon nhat " + nums[num - 1]);

		scanner.close();
	}
}
