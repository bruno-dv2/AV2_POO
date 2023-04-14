import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5_BrunoAguiar {

	public static void main(String[] args) {

	File arquivo = new File("C:\\ws-eclipse\\AV2_BrunoAguiar\\src\\resourses\\arquivo.txt");
	List<String> linhas = new ArrayList<>();
	try {
		Scanner sc = new Scanner(arquivo);
		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			linhas.add(linha);
		}
		sc.close();
	 } catch (FileNotFoundException e) {
		System.out.println("Arquivo não encontrado");
		return;
	 }

	int contador = 0;
	for (String linha : linhas) {
		String[] palavras = linha.split("\\s+");
		for (String palavra : palavras) {
			if (palavra.equalsIgnoreCase("link")) {
				contador++;
			}
		}
	}

	System.out.println("A palavra \"link\" apareceu " + contador + " vezes no arquivo.");
	}
}

