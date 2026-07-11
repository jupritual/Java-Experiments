import java.util.*;
public class simpleinterest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Principle: ");
double a = sc.nextDouble();
System.out.print("Enter Rate: ");
double b = sc.nextDouble();
System.out.print("Enter Time(years): ");
double c = sc.nextDouble();

double si = (a*b*c) / 100;
System.out.print("Simple Interest: " + si);
}}
