import java.util.*;
public class threads extends Thread {
	String ThreadName;
	
	threads(String name) {
		ThreadName = name;
	}
	
	public void run() {
		for (int i =0; i<1; i++) {
			System.out.println(ThreadName + " Created Successfully");
		}
	}
	public static void main(String[] args) {
		threads t1 = new threads("Thread 1");
		threads t2 = new threads("Thread 2");
		threads t3 = new threads("Thread 3");
		t1.start();
		t2.start();
		t3.start();
	}
	}