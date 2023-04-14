import java.util.Locale;
import java.util.Scanner;

public class Q3_BrunoAguiar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int n = sc.nextInt();
        int soma = 0, num;
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o número " + i + ": ");
            num = sc.nextInt();
            soma += num;
        }

        System.out.println("A soma dos números é: " + soma);

        sc.close();
	}

}



