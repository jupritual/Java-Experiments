import java.util.*;
public class maxofthree{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 3 Numbers: ");
	int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
	int max = (a>c) ? ((a>b) ? a : b) : ((c>b) ? c : b);
	System.out.print("MAX number: " + max);
}
}