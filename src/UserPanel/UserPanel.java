package UserPanel;

import static CheckInput.CheckInput.createArrIntRange;
import static CheckInput.CheckInput.inputDouble;
import static CheckInput.CheckInput.inputIntRange;

import Line.Line;
import Point.Point;
import Student.Student;

public class UserPanel {


	private void showArray(int[] arr) {
		System.out.print("Результат: ");
		for (int j : arr) {
			System.out.print(j + " ");
		}
	}

	private Point createPoint() {
		double x = inputDouble("Введите значение x: "), y = inputDouble("Введите значение y: ");
		return new Point(x, y);
	}

	// Задача 1
	private void t1() {
		System.out.println("Задание 1");

		System.out.println("Введите координаты первой точки:");
		Point p1 = createPoint();

		System.out.println("Введите координаты второй точки:");
		Point p2 = createPoint();

		System.out.println("Введите координаты третьей точки:");
		Point p3 = createPoint();

		System.out.println("Координаты первой точки:" + p1.toString());
		System.out.println("Координаты второй точки:" + p2.toString());
		System.out.println("Координаты третьей точки:" + p3.toString());
		System.out.println();
	}

	private void t2() {
		System.out.println("Задание 2");
		System.out.println("Создание линии 1:");
		System.out.println("Введите координаты точки начала линии:");
		Point p1Start = createPoint();
		System.out.println("Введите координаты точки конца линии:");
		Point p1End = createPoint();
		Line line1 = new Line(p1Start, p1End);
		System.out.println();

		System.out.println("Создание линии 2:");
		System.out.println("Введите координаты точки начала линии:");
		Point p2Start = createPoint();
		System.out.println("Введите координаты точки конца линии:");
		Point p2End = createPoint();
		Line line2 = new Line(p2Start, p2End);

		System.out.println("Создание линии 3:");
		System.out.println(
				"Точка начала: " + line1.getStart().toString() + "; Точка конца: " + line2.getEnd()
						.toString());
		Line line3 = new Line(line1.getStart(), line2.getEnd());
		System.out.println();

		System.out.println("Исходные линии:");
		System.out.println("Линия 1: " + line1.toString());
		System.out.println("Линия 2: " + line2.toString());
		System.out.println("Линия 3: " + line3.toString());
		System.out.println();

		System.out.println("Изменение координат в линиях 1 и 2 с изменениями в 3 линии:");

		line1.setStart(inputDouble("Введите новую координату x начала линии 1: "),
				inputDouble("Введите новую координату y начала линии 1: "));
		line2.setEnd(inputDouble("Введите новую координату x конца линии 2: "),
				inputDouble("Введите новую координату y конца линии 2: "));
		System.out.println("Линия 1: " + line1.toString());
		System.out.println("Линия 2: " + line2.toString());
		System.out.println("Линия 3: " + line3.toString());
		System.out.println();

		System.out.println("Изменение координат в линиях 1 и 2 без изменений в 3 линии:");
		System.out.println("Введите новые координаты точки начала линии 1: ");
		line1.setStart(createPoint());
		System.out.println("Введите новые координаты точки конца линии 2: ");
		line2.setEnd(createPoint());
		System.out.println("Линия 1: " + line1.toString());
		System.out.println("Линия 2: " + line2.toString());
		System.out.println("Линия 3: " + line3.toString());
		System.out.println();
	}

	private void t3() {
		System.out.println("Задание 3");
		int[] gradesVasya = createArrIntRange("Введите оценки Васи: ", 1, 6);
		Student studentVasya = new Student("Вася", gradesVasya);
		Student studentPetya = new Student("Петя", studentVasya.getGrades());

		System.out.println("Создаем оценки Васе и передаем их Пете:");
		System.out.println(studentVasya.toString());
		System.out.println(studentPetya.toString());
		System.out.println();

		System.out.println("Меняем 1-ую оценку Пети:");
		studentPetya.getGrades()[0] = inputIntRange("Введите оценку от 2 до 5: ", 1, 6);
		System.out.println(studentVasya.toString());
		System.out.println(studentPetya.toString());
		System.out.println();

		System.out.println(
				"Копирование оценок Васи новому студенту Андрею, без 'влияния' оценок Васи на оценки Андрея:");
		Student studentAndrey = new Student("Андрей", studentVasya);
		System.out.println(studentVasya.toString());
		System.out.println(studentPetya.toString());
		System.out.println(studentAndrey.toString());
		System.out.println();

		System.out.println("Меняем 1-ую оценку Васи:");
		studentVasya.getGrades()[0] = inputIntRange("Введите оценку от 2 до 5: ", 1, 6);
		;
		System.out.println(studentVasya.toString());
		System.out.println(studentPetya.toString());
		System.out.println(studentAndrey.toString());
		System.out.println();
	}

	private void t41() {
		System.out.println("Задание 4.1");

		System.out.println("Введите координаты первой точки: ");
		Point p1 = createPoint();

		System.out.println("Введите координаты второй точки: ");
		Point p2 = createPoint();

		System.out.println("Введите координаты третьей точки: ");
		Point p3 = createPoint();

		System.out.println("Координаты первой точки: " + p1.toString());
		System.out.println("Координаты второй точки: " + p2.toString());
		System.out.println("Координаты третьей точки: " + p3.toString());
		System.out.println();
	}

	private void t42() {
		System.out.println("4.2");
		System.out.println("Создание линии 1:");
		Line line01 = new Line(inputDouble("Введите x начала линии 1: "),
				inputDouble("Введите y начала линии 1: "), inputDouble("Введите x конца линии 1: "),
				inputDouble("Введите y конца линии 1: "));

		System.out.println("Создание линии 2:");
		Line line02 = new Line(inputDouble("Введите x начала линии 2: "),
				inputDouble("Введите y начала линии 2: "), inputDouble("Введите x конца линии 2: "),
				inputDouble("Введите y конца линии 2: "));

		System.out.println("Создание линии 3:");
		System.out.println(
				"Точка начала: " + line01.getStart().toString() + "; Точка конца: " + line02.getEnd()
						.toString());
		Line line03 = new Line(line01.getStart(), line02.getEnd());

		System.out.println("Исходные линии");
		System.out.println("Линия 1: " + line01.toString());
		System.out.println("Линия 2: " + line02.toString());
		System.out.println("Линия 3: " + line03.toString());
		System.out.println();

		System.out.println("Изменение координат в линиях 1 и 2 с изменениями в 3 линии:");
		line01.setStart(inputDouble("Введите новую координату x начала линии 1: "),
				inputDouble("Введите новую координату y начала линии 1: "));
		line02.setEnd(inputDouble("Введите новую координату x конца линии 2: "),
				inputDouble("Введите новую координату y конца линии 2: "));
		System.out.println("Линия 1: " + line01.toString());
		System.out.println("Линия 2: " + line02.toString());
		System.out.println("Линия 3: " + line03.toString());
		System.out.println();
	}

	private void t5() {
		System.out.println("5.3");
		System.out.println("Вычисление длинны линии:");
		Line distLine = new Line(inputDouble("Введите x начала линии 1: "),
				inputDouble("Введите y начала линии 1: "), inputDouble("Введите x конца линии 1: "),
				inputDouble("Введите y конца линии 1: "));
		System.out.println("Длинна линии: " + distLine.lineLength());
	}

	public void choiceTask() {
		int task = 0;
		System.out.println("Выберите задание: ");
		System.out.println("1 - Задание 1\n2 - Задание 2\n3 - Задание 3\n4 - Задание 4.1\n5 - Задание 4.2\n6 - Задание 5");
		task = inputIntRange("Введите номер задачи от 1 до 6: ", 0, 7);

		switch (task) {
			case 1:
				t1();
				break;
			case 2:
				t2();
				break;
			case 3:
				t3();
				break;
			case 4:
				t41();
				break;
			case 5:
				t42();
				break;
			case 6:
				t5();
				break;
		}
	}
}
