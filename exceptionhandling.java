import java.util.*;
class exceptionhandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numerator: ");
		int a = sc.nextInt();
		System.out.println("Enter Denominator: ");
		int b = sc.nextInt();
		try {
			System.out.println("Your Answer: " + (a/b));
		}
		catch (ArithmeticException e) {
			
			System.out.println("Cannot divid by zero");
		}
		finally {
			System.out.println("Program Executed Successfully");
		}
}}