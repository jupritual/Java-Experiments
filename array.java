import java.util.*;
public class array {
	
	static void sortArray(Scanner sc) {
		System.out.println("Enter how many number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter elements one by one: ");
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Sorted array: ");
		for (int i=0; i<n; i++) {
			System.out.print(arr[i] + " \n");
		}
	}
		
	static void CharToString(Scanner sc) {
		System.out.println("Enter number of character: ");
		int no = sc.nextInt();
		char[] chr = new char[no];
		
		System.out.println("Enter character one by one: ");
		for (int i=0; i<no; i++) {
			chr[i] = sc.next().charAt(0);
		}
		
		String str = new String(chr);
		System.out.println("Converter String: " + str);
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("______sorted array____\n");
			sortArray(sc);
			
			System.out.println("_______Character To String______\n");
			CharToString(sc);
		}
}