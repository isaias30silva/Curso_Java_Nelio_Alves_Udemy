import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);

		double pontoX = teclado.nextDouble();
		double pontoY = teclado.nextDouble();

		if (pontoX == 0 && pontoY == 0) {
			System.out.println("Origem");
		}

		else if (pontoX != 0 && pontoY == 0) {
			System.out.println("Eixo X");
		}

		else if (pontoX == 0 && pontoY != 0) {
			System.out.println("Eixo Y");
		}

		else if (pontoX > 0 && pontoY > 0) {
			System.out.println("Q1");
		}

		else if (pontoX < 0 && pontoY > 0) {
			System.out.println("Q2");
		}

		else if (pontoX < 0 && pontoY < 0) {
			System.out.println("Q3");
		}

		else if (pontoX > 0 && pontoY < 0) {
			System.out.println("Q4");
		}

		teclado.close();
	}

}
