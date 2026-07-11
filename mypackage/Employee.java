package mypackage;
public class Employee {
	String name;
	int empid;
	double salary;
	
	public Employee(String n, int id, double s) {
		name = n;
		empid = id;
		salary = s;
	}
	
	public void display() {
		System.out.println("Employee name: " + name);
		System.out.println("Employee id: " + empid);
		System.out.println("Employee salary: " + salary);
		System.out.println("");
	}
}
		