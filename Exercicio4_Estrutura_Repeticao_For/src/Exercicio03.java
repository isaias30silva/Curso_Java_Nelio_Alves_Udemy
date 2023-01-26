import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {

			double test1 = scanner.nextDouble();
			double test2 = scanner.nextDouble();
			double test3 = scanner.nextDouble();

			double average = (test1 * 2.0 + test2 * 3.0 + test3 * 5.0) / 10.0;

			System.out.printf("%.1f%n", average);
		}

		scanner.close();
	}

}
