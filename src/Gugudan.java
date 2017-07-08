import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("Enter the number of time table you want : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("User input number : " + number);
		
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = number * (i + 1);
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}