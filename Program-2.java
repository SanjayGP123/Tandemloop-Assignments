package TandomloopAssignment;

import java.util.Scanner;

public class SecondQuestion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);    
        System.out.print("Enter a value a: ");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);
            if (i < a - 1) {
                System.out.print(", ");
            }
        }
        scanner.close();
	}
}
