import java.util.Scanner;

public class Gugudan {
	public static int[] calculate(int[] number) {
		int first = number[0];
		int second = number[1];
		int result[] = new int[second];
		
		for (int i = 0; i < second; i++) {
			result[i] = first * (i + 1); 
		}
		
		return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] inputnum() {
	System.out.println("Enter two number for calculate you want : ");
	Scanner scanner = new Scanner(System.in);
	String inputValue = scanner.nextLine();
	String[] splitedValue = inputValue.split(",");
	
	int[] number = new int[2];
	number[0] = Integer.parseInt(splitedValue[0]);
	number[1] = Integer.parseInt(splitedValue[1]);
	
	return number;
	}
}