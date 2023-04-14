import java.util.Random;

public class Q6_BrunoAguiar {

    public static void main(String[] args) {
        int m = 2; 
        int n = 2; 
        int p = 2; 
        
        double[][] matrizA = inicializarMatriz(m, n);
        double[][] matrizB = inicializarMatriz(n, p);

        double[][] matrizC = new double[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                double soma = 0.0;
                for (int k = 0; k < n; k++) {
                    soma += matrizA[i][k] * matrizB[k][j];
                }
                matrizC[i][j] = soma;
            }
        }
        System.out.println("Matriz A: ");
        imprimirMatriz(matrizA);
        System.out.println("Matriz B: ");
        imprimirMatriz(matrizB);
        System.out.println("Matriz C = A * B: ");
        imprimirMatriz(matrizC);
    }

    public static double[][] inicializarMatriz(int linhas, int colunas) {
        double[][] matriz = new double[linhas][colunas];
        Random random = new Random();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(11);
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
            	System.out.printf("%.0f ", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}