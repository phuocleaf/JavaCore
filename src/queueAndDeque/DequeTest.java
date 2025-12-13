package queueAndDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
	public static void main(String[] args) {
		Deque<String> danhSachSinhVien = new ArrayDeque<>();
		danhSachSinhVien.offer("Phuoc");
		danhSachSinhVien.offer("Y");
		danhSachSinhVien.offer("Nhi");

		danhSachSinhVien.offer("Su");

		while (true) {
			String ten = danhSachSinhVien.poll();
			if (ten == null)
				break;
			System.out.println(ten);
		}
	}
}
