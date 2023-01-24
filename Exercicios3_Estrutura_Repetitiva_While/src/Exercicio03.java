import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int choice = scanner.nextInt();

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (choice != 4) {

			switch (choice) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			}
			choice = scanner.nextInt();

		}

		System.out.println("MUITO OBRIGADO\nAlcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);

		scanner.close();
	}

}
