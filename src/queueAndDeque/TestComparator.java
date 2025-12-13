package queueAndDeque;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestComparator {
	public static void main(String[] args) {
		Queue<SinhVien> q = new PriorityQueue<>((a, b) -> a.ten.compareTo(b.ten));

		q.offer(new SinhVien("Phuoc", 8.5));
		q.offer(new SinhVien("Nhi", 9.0));
		q.offer(new SinhVien("Su", 7.0));

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
