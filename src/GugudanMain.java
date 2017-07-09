public class GugudanMain {
	public static void main(String[] args) {
		int[] number = Gugudan.inputnum();
		int[] result = Gugudan.calculate(number);
		Gugudan.print(result);
	}
}