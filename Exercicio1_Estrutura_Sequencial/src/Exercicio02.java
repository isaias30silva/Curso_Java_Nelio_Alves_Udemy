import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		double pi = 3.14159;

		Scanner scanner = new Scanner(System.in);

		double raio = scanner.nextDouble();

		double area = pi * (raio * raio);

		System.out.printf("A=%.4f%n", area);
	}

}
