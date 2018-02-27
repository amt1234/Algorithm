import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

//import com.bridgeit.programs.Twodarray9;

public class Twodcoll {

	public static void main(String[] args) {

		int m;
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the m");
		m = scanner.nextInt();

		System.out.println("Enter the n");
		n = scanner.nextInt();

		
		PrintWriter printwriter = new PrintWriter(System.out);

		

		Integer arrayInt[][] = new Integer[m][n];
		Double arraydouble[][] = new Double[m][n];
		Boolean arrayboolen[][] = new Boolean[m][n];

		printwriter.write("Enter your choice :");
		printwriter.write("1.Integer array\n");

		printwriter.write("2.Double array\n");

		printwriter.write("3.Boolean array\n");
		printwriter.flush();
		int choice = scanner.nextInt();
	
		switch (choice) {
		case 1:
			printwriter.write("Integer array is\n");
			printwriter.flush();

			printwriter.write("Enter the elements\n");
			printwriter.flush();

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					arrayInt[i][j] = scanner.nextInt();

				}
			}
			printArray(arrayInt, m, n);
			break;
		case 2:
			printwriter.write("Double array is\n");
			printwriter.flush();

			printwriter.write("Enter the elements\n");
			printwriter.flush();

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					arraydouble[i][j] = scanner.nextDouble();

				}
			}
			printArray(arraydouble, m, n);
			break;
		case 3:
			printwriter.write("boolean array is\n");
			printwriter.flush();

			printwriter.write("Enter the elements\n");
			printwriter.flush();

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					arrayboolen[i][j] = scanner.hasNextLine();

				}
			}
			printArray(arrayboolen, m, n);
			break;

		default:
			printwriter.println("Invalid choice");
			printwriter.flush();
			printwriter.close();
		}
		scanner.close();
	}

	public static <T> void printArray(T[][] arrays, int rows, int columns) {

		PrintWriter printwriter = new PrintWriter(System.out);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				printwriter.print(arrays[i][j] + " ");
				printwriter.flush();
			}
			System.out.println();
		}
	}

}
