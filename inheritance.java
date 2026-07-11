import java.util.*;
abstract class shape {
	int a, b;
	
	abstract void printarea();
}

class Rectangle extends shape {
	Rectangle(int l, int b) {
        a = l;
		this.b = b;
		
	}
	void printarea() {
		System.out.print("Area of rectangle: " + (a*b));
	}
}

class Triangle extends shape {
	Triangle(int base, int height) {
		a = base;
		b = height;
	}
	void printarea() {
		System.out.print("Area of Triangle: " + (0.5*a*b));
	}
}

class circle extends shape {
	circle(int rad) {
		a = rad;
	}
	void printarea() {
			System.out.print("area of circle: " + (3.14 * a * a));
	}
}

public class inheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("Enter lenght and breadth of reactangle: \n");
		int l = sc.nextInt(), b = sc.nextInt();
		Rectangle r = new Rectangle(l, b);
		r.printarea();
		
		System.out.println("\nEnter base and height of circle: ");
		int base = sc.nextInt(), height = sc.nextInt();
		Triangle t = new Triangle(base, height);
		t.printarea();
		
		System.out.println("\nEnter radius of circle: ");
		int rad = sc.nextInt();
		circle c = new circle(rad);
		c.printarea();
		
	}
}
	