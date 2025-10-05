import Line.Line;
import Point.Point;
import Student.Student;

void main() {

	//Point
	//1.1
	System.out.println("1.1");
	System.out.println("Точки");
	Point p0 = new Point(1,1);
	Point p1 = new Point(5, 5);
	Point p2 = new Point(1.4, 1.6);

	System.out.println(p0.toString());
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	System.out.println();

	// Line
	//2.1
	System.out.println("2.1");
	Point p1Start = new Point(1, 3);
	Point p1End = new Point(23, 8);
	Line line1 = new Line(p1Start, p1End);

	Point p2Start = new Point(5, 10);
	Point p2End = new Point(25, 10);
	Line line2 = new Line(p2Start, p2End);

	Line line3 = new Line(line1.getStart(), line2.getEnd());

	System.out.println("Исходные линии");
	System.out.println(line1.toString());
	System.out.println(line2.toString());
	System.out.println(line3.toString());
	System.out.println();

	System.out.println("Изменение координат в линиях 1 и 2 с изменениями в 3 линии");
	/*line1.getStart().setX(-1);
	line1.getStart().setY(-20);
	line2.getEnd().setX(100);
	line2.getEnd().setY(189);*/

	line1.setStart(-1, -20);
	line2.setEnd(100, 189);
	System.out.println(line1.toString());
	System.out.println(line2.toString());
	System.out.println(line3.toString());
	System.out.println();

	System.out.println("Изменение координат в линиях 1 и 2 без изменений в 3 линии");
	line1.setStart(p0);
	line2.setEnd(p1);
	System.out.println(line1.toString());
	System.out.println(line2.toString());
	System.out.println(line3.toString());
	System.out.println();

	//Student
	//3.1
	System.out.println("3.1");
	int[] gradesVasya = {3,4,5};
 	Student studentVasya = new Student("Вася", gradesVasya);
	Student studentPetya = new Student("Петя", studentVasya.getGrades());

	System.out.println(studentVasya.toString());
	System.out.println(studentPetya.toString());
	System.out.println();

	studentPetya.getGrades()[0] = 5;
	System.out.println(studentVasya.toString());
	System.out.println(studentPetya.toString());
	System.out.println();


	Student studentAndrey = new Student("Андрей", studentVasya);
	System.out.println(studentVasya.toString());
	System.out.println(studentPetya.toString());
	System.out.println(studentAndrey.toString());
	System.out.println();

	studentVasya.getGrades()[0] = 3;
	System.out.println(studentVasya.toString());
	System.out.println(studentPetya.toString());
	System.out.println(studentAndrey.toString());
	System.out.println();

	//4.1
	System.out.println("4.1");
	System.out.println(new Point(3,5).toString());
	System.out.println(new Point(25, 6).toString());
	System.out.println(new Point(7, 8).toString());
	System.out.println();

	//4.2
	System.out.println("4.2");
	Line line01 = new Line(1,3,23,8);
	Line line02 = new Line(5,10,25,10);
	Line line03 = new Line(line01.getStart(), line02.getEnd());
	System.out.println("Исходные линии");
	System.out.println(line01.toString());
	System.out.println(line02.toString());
	System.out.println(line03.toString());
	System.out.println();

	System.out.println("Изменение координат в линиях 1 и 2 с изменениями в 3 линии");

	line01.setStart(0, 0);
	line02.setEnd(100, 189);
	System.out.println(line01.toString());
	System.out.println(line02.toString());
	System.out.println(line03.toString());

	//5.3
	System.out.println("5.3");
	Line distLine = new Line(-1,1,10,15);
	System.out.println(distLine.lineLength());
}