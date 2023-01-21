import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double choice = scanner.nextDouble();

		if (choice >= 0 && choice <= 25) {
			System.out.println("Intervalo (0,25]");
		} else if (choice > 25 && choice <= 50) {
			System.out.println("Intevalo (25,50]");
		} else if (choice > 50 && choice <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (choice > 75 && choice <= 100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora do intervalo");
		}

		scanner.close();

	}

}
