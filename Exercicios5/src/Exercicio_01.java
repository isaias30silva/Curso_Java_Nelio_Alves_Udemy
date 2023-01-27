import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int num = scanner.nextInt();

		int[] group = new int[num];

		for (int i = 0; i < num; i++) {
				System.out.print("Digite um numero: ");
				group[i] = scanner.nextInt();
		}

		System.out.println("NUMEROS NEGATIVOS: ");
		for (int i = 0; i < num; i++) {
			if (group[i] < 0) {
				System.out.println(group[i]);
			}
		}

		scanner.close();

	}

}
