import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int x = 0;
		int in = 0;
		int out = 0;
		for (int i = 1; i <= n; i++) {
			x = scanner.nextInt();
			if(x >= 10 && x <=20) {
				in+= 1;
			} else {
				out+= 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");

		scanner.close();
	}

}
