import java.util.Scanner;

public class Gugudan {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1); 
		}
		
		return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int takenum() {
		System.out.println("Enter the number of time table you want : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		return number;
	}
	
	
}