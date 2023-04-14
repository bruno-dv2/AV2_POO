import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q7_BrunoAguiar {

    public static void main(String[] args) {
    	
        String nomeArquivo = "C:\\ws-eclipse\\AV2_BrunoAguiar\\src\\inteiros.txt"; 
        int soma = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) { 
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] numeros = linha.split(" ");
                for (String numero : numeros) { 
                    soma += Integer.parseInt(numero);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        System.out.println("A soma dos numeros no arquivo é: " + soma);
    }
}