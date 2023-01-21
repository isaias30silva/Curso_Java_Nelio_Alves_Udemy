import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		double pi = 3.14159;

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double C = scanner.nextDouble();

		// triângulo retângulo = é a metade do produto entre a base e a altura
		double triRetang = (A * C) / 2;

		// A área de um círculo é pi vezes o raio elevado ao quadrado (A = π r²).
		double areaCirc = (C * C) * pi;

		// A área de um trapézio é a medida de sua superfície e corresponde à metade
		// do produto entre sua altura e a soma de suas bases.
		double areaTrap = (A + B) * C / 2;

		// Área do quadrado: multiplicamos o comprimento da sua base pela sua altura.
		double areaQuad = (B * B);

		// Área do retângulo: basta calcular o produto entre a sua base e a sua altura
		double areaRet = A * B;

		System.out.printf("TRIANGULO: %.3f%n", triRetang);
		System.out.printf("Circulo: %.3f%n", areaCirc);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrap);
		System.out.printf("QUADRADO: %.3f%n", areaQuad);
		System.out.printf("RETANGULO: %.3f%n", areaRet);

		scanner.close();
	}

}
