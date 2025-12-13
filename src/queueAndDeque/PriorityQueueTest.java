package queueAndDeque;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		Queue<String> danhSachSinhVien = new PriorityQueue<String>();
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
