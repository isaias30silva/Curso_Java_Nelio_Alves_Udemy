import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			int quadrado = i * i;
			int cubo = i * i * i;
			
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		scanner.close();
		
	}

}
