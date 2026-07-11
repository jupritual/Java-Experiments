import java.util.*;
public class stud {
	String name;
	int rollno;
	double marks;
	
	
	stud() {
		name = "Anyonymous";
		rollno = 0;
		marks = 00.00;
		System.out.println("Defualt contructor called");
	}
	stud(String n, int r, double m) {
		name = n;
		rollno = r;
		marks = m;
		System.out.println("parameterized contructor called");
	}
	stud(stud s) {
		name = s.name;
		rollno = s.rollno;
		marks = s.marks;
		System.out.println("Copy contructor called");
	}
	stud(String n, int r) {
		name = n;
		rollno = r;
		marks = 0;
		System.out.println("Overloaded contructor called");
	}
	void display() {
		System.out.println("student name: " + name);
		System.out.println("student roll no: " + rollno);
		System.out.println("student marks: " + marks);
	}
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stud stud1 = new stud();
		stud1.display();
		
		System.out.println("Enter name, rollno and marks for student:\n");
		String n = sc.nextLine();
		int r = sc.nextInt();
		double m = sc.nextDouble();
		sc.nextLine();
		stud stud2 = new stud(n, r, m);
		stud2.display();
		
		stud stud3 = new stud(stud2);
		stud3.display();
		
		System.out.println("Enter student name and rollno:\n");
		String na = sc.nextLine();
		int ro = sc.nextInt();
		stud stud4 = new stud(na, ro);
		stud4.display();
		
	}
}