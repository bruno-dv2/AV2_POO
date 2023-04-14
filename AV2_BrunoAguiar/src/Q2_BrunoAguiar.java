import java.util.Locale;
import java.util.Scanner;

public class Q2_BrunoAguiar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma sequência de números (ou 0 para sair): ");
		int n;
		int cont = 0;
		
		do {
			n = sc.nextInt();
			cont++;
		} while (n != 0);
		
		System.out.println("A quantidade de entradas é: " + (cont - 1));
		
		sc.close();
	}

}
