import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int cod1 = scanner.nextInt();
		int num1 = scanner.nextInt();
		double price1 = scanner.nextDouble();

		int cod2 = scanner.nextInt();
		int num2 = scanner.nextInt();
		double price2 = scanner.nextDouble();

		double count = (num1 * price1) + (num2 * price2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", count);

		scanner.close();
	}

}
