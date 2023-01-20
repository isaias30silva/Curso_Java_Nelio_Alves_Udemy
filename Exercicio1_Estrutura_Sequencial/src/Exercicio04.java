import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int hours = scanner.nextInt();
		double perHour = scanner.nextDouble();

		double salary = hours * perHour;

		System.out.printf("NUMBER = " + number + "\nSALARY = U$ %.2f%n ", salary); 
	}

}
