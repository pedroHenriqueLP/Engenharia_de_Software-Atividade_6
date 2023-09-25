import java.util.Scanner;

public class Questao_14 {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);

        int totalValores = 0;
        int somaValores = 0;
        int valoresPositivos = 0;
        int valoresNegativos = 0;

        System.out.println("Digite os valores (digite 0 para encerrar):");

        while (true) {
            int valor = scanner.nextInt();

            if (valor == 0) {
                break;
            }

            totalValores++;
            somaValores += valor;

            if (valor > 0) {
                valoresPositivos++;
            } else if (valor < 0) {
                valoresNegativos++;
            }
        }

        if (totalValores == 0) {
            System.out.println("Nenhum valor foi inserido.");
        } else {
            double media = (double) somaValores / totalValores;
            double percentualPositivos = (double) valoresPositivos / totalValores * 100;
            double percentualNegativos = (double) valoresNegativos / totalValores * 100;

            System.out.println("Média: " + media);
            System.out.println("Quantidade de valores positivos: " + valoresPositivos);
            System.out.println("Quantidade de valores negativos: " + valoresNegativos);
            System.out.println("Percentual de valores positivos: " + percentualPositivos + "%");
            System.out.println("Percentual de valores negativos: " + percentualNegativos + "%");
        }
    }
}
