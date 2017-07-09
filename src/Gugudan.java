import java.util.Scanner;

public class Gugudan {
	public static int takenum() {
		System.out.println("Enter the number of time table you want : ");
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		
		return inputValue;
	}
	
	public static int[] calculate(int number) {
		int[] result = new int[number];
		for(int i = 0; i < number; i++) {
			result[i] = number * (i + 1);
	}
		
		return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
		System.out.println(result[i]);
		}
		
	}
}