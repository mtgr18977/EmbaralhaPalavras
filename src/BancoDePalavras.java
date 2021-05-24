import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {
	
	public String retornaPalavra() throws FileNotFoundException{
		Scanner scanner = new Scanner(new FileReader("palavras.txt"));
		Random r = new Random();
		String palavra = null;
		int a = r.nextInt(20);
		
		for (int i = 0; i <= a; i++) {
			palavra = scanner.nextLine();
		}
		scanner.close();
		return palavra.toLowerCase();
	}
}
