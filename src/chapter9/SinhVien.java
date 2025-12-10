package chapter9;

public class SinhVien {
	private String id;
	private String name;
	private double score;
	private int age;

	public SinhVien(String id, String name, double score, int age) {

		this.id = id;
		this.name = name;
		this.score = score;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", name=" + name + ", score=" + score + ", age=" + age + "]";
	}

}
