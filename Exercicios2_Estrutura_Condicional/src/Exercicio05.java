import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		int choice = scanner.nextInt();
		int quant = scanner.nextInt();

		double total = 0;
		switch (choice) {
		case 1:
			total = quant * 4.00;
			break;
		case 2:
			total += quant * 4.50;
			break;
		case 3:
			total = quant * 5.00;
			break;
		case 4:
			total += quant * 2.00;
			break;
		case 5:
			total += quant * 1.50;
		}

		System.out.printf("Total: R$ %.2f%n" , total);

		scanner.close();
	}

}
