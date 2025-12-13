package PracticeMap;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
	private Map<String, String> duLieu = new TreeMap<String, String>();

	public String themTuDien(String key, String value) {
		return this.duLieu.put(key, value);
	}

	public String xoaTu(String key) {
		return this.duLieu.remove(key);
	}

	public String traTu(String key) {
		String value = this.duLieu.get(key);
		return value;
	}

	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = this.duLieu.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}

	public int laySoLuong() {
		return this.duLieu.size();
	}

	public void xoaTatCa() {
		this.duLieu.clear();
	}

	public static void main(String[] args) {
		TuDien tuDien = new TuDien();

	}
}
