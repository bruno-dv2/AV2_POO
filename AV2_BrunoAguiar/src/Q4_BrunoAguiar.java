import java.util.Locale;
import java.util.Scanner;

public class Q4_BrunoAguiar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite sua frase: ");
		String frase = sc.nextLine();

		String[] palavra = frase.split(" ");
		System.out.println("Palavras que começam com 's': ");
		for (String inicial : palavra) {
			if (inicial.startsWith("s")) {
				System.out.println(inicial);
			}
		}
		sc.close();

	}

}
