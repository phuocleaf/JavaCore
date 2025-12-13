package queueAndDeque;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> danhSachSinhVien = new LinkedList<>();
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
