public class GugudanMain {
	public static void main(String[] args) {
		int inputnum = Gugudan.takenum();
		int[] result = Gugudan.calculate(inputnum);
		Gugudan.print(result);
	}
}
