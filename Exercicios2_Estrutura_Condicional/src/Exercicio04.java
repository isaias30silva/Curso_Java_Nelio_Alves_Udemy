import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int horaIni = scanner.nextInt();
		int horaFin = scanner.nextInt();

		int horaIni1 = 0;
		int horaFin1 = 0;

		if (horaIni > 0 && horaIni < 13) {
			horaIni1 = horaIni;
		} else {
			horaIni1 = horaIni - 12;
		}
		
		if(horaFin >= 13 && horaFin <=24) {
			horaFin1 = horaFin;
		} else {
			horaFin1 = horaFin + 12;
		}
		
		int duracao = horaFin1 - horaIni1;
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		scanner.close();

	}

}
