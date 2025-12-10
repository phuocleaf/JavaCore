package chapter8;

public class Student extends Person {

	private int mark;
	private String grade;

	public Student(String id, String name, int age, int mark) {
		super(id, name, age);
		this.mark = mark;
		setGrade();
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade() {
		if (mark >= 8)
			grade = "A";
		else if (mark >= 7)
			grade = "B";
		else if (mark >= 6)
			grade = "C";
		else if (mark >= 5)
			grade = "D";
		else
			grade = "tach cmnr";
	}

	@Override
	public String toString() {
		return super.toString() + "Student [mark=" + mark + ", grade=" + grade + "]";
	}

}
