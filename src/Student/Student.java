package Student;

public class Student {

	private String name;
	private int[] grades;

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
		} else {
			this.grades = null;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		if (this.grades != null) {
			for (int i = 0; i < grades.length; i++) {
				if (grades[i] < 2 || grades[i] > 5) {
					throw new IllegalArgumentException(
							"Недопустимая оценка в передаваемом массиве, число не входит в диапазон от 2 до 5: "
									+ grades[i]);
				}
			}
		}
		this.grades = grades;
	}

	@Override
	public String toString() {
		String result = name + ": ";
		if (this.grades != null) {
			for (int i = 0; i < grades.length; i++) {
				if (i == grades.length - 1) {
					result += Integer.toString(grades[i]);
				} else {
					result += Integer.toString(grades[i]) + ", ";
				}
			}
		} else {
			result += "оценок нет.";
		}
		return result;
	}
}
