import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good evening" };
		
		String path = "/Users/isaiassilva/Documents/testeRegularExpressions/out.txt";
		
		//se incluir true depois de path no parâmetro o conteúdo será adicionado e não sobreposto ao 
		//arquivo, caso ele já exista.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
