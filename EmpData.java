import mypackage.Employee;
import java.util.*;
public class EmpData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter Employee name: ");
		String n = sc.nextLine();
		System.out.println("Enter Employee id: ");
		int id = sc.nextInt();
		System.out.println("Enter Employee Salary: ");
		int s = sc.nextInt();
		Employee emp = new Employee(n, id, s);
		emp.display();
}}