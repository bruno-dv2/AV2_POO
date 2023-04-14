import java.util.Locale;
import java.util.Scanner;

public class Q1_BrunoAguiar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor para a: ");
		int a = sc.nextInt();
		System.out.println("Digite o valor para b: ");
		int b = sc.nextInt();
		int soma = a + b;
		
		System.out.println("A soma dos números é: " + soma);
		
		
		sc.close();

	}

}
