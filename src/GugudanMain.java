public class GugudanMain {
	public static void main(String[] args) {
		int times = Gugudan.takenum();
		int[] result = Gugudan.calculate(times);
		Gugudan.print(result);
	}
}