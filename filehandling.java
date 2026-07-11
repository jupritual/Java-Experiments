import java.util.*;
import java.io.File;

class filehandling {
	public static void main(String[] args) {
		try {
			File file = new File("file.txt");
			Scanner sc = new Scanner(file);
			int LineNumber = 1;
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(LineNumber + ": " + line);
				LineNumber ++;
			}
		}
		catch (Exception e) {
			System.out.println("File Not Found!");
		}
	}
}