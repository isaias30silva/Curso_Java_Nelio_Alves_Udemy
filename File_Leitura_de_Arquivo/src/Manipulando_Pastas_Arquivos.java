import java.io.File;
import java.util.Scanner;

public class Manipulando_Pastas_Arquivos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// capturando uma lista de todas as pastas que existem no caminho inserido
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}

		// capturando uma lista de todos os arquivos que existem no caminho inserido
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES");
		for (File file : files) {
			System.out.println(file);
		}

		//criando uma pasta no caminho informado
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);

		sc.close();
	}

}
