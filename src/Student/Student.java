package Student;

public class Student {

	private String name;
	private int[] grades;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public int[] getGrades() {
		return grades;
	}

	public Student() {
		this.name = "Иван";
		this.grades = null;
	}

	public Student(String name, int[] grades) {
		setName(name);
		setGrades(grades);
	}

	public Student(String name, Student student) {
		setName(name);
		if (student.grades != null) {
			this.grades = new int[student.getGrades().length];
			for (int i = 0; i < this.grades.length; i++) {
				this.grades[i] = student.getGrades()[i];
			}
		}else{
			this.grades = null;
		}
	}


	@Override
	public String toString() {
		String result = name + ": ";
		for (int i = 0; i < grades.length; i++) {
			if (i == grades.length - 1) {
				result += Integer.toString(grades[i]);
			} else {
				result += Integer.toString(grades[i]) + ", ";
			}
		}
		return result;
	}
}
