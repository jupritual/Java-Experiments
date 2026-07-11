import java.util.*;
public class fibonacci{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of terms: ");
int f = sc.nextInt();
int a = 0;
int b = 1;
System.out.print("Fibonacci: ");
for (int i = 0; i < f; i++) {
System.out.print(a + " ");
int temp = a + b;
a = b;
b = temp;
}
}
}