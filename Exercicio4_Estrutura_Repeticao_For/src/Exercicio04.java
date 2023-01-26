import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();

			if (num2 != 0) {
				double result = (double) num1 / num2;
				System.out.printf("%.1f%n", result);
			} else {
				System.out.println("divisao impossivel");
			}
		}

		scanner.close();
	}

}
