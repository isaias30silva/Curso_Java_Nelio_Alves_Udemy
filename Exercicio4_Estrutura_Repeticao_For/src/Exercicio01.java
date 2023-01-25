import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		int num1 = 0;
		for (int i = 1; i <= num; i++) {
			num1 = i;
			if (num1 % 2 != 0) {
				System.out.println(num1);
			}
		}

		scanner.close();

	}

}
