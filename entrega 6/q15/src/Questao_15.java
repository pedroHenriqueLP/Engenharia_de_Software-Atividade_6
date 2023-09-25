import java.util.List;
import java.util.Scanner;

public class Questao_15 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int[] intervalos = new int[4];
        
        System.out.println("Digite números. Para encerrar, digite um número negativo.");

        while (true) {
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero >= 0 && numero <= 25) {
                intervalos[0]++;
            } else if (numero >= 26 && numero <= 50) {
                intervalos[1]++;
            } else if (numero >= 51 && numero <= 75) {
                intervalos[2]++;
            } else if (numero >= 76 && numero <= 100) {
                intervalos[3]++;
            }
        }

        System.out.println("Quantidade de números nos intervalos:");
        System.out.println("[0-25]: " + intervalos[0]);
        System.out.println("[26-50]: " + intervalos[1]);
        System.out.println("[51-75]: " + intervalos[2]);
        System.out.println("[76-100]: " + intervalos[3]);
        
        scanner.close();
    }

    public static int[] contarIntervalos(int[] input) {
        int[] contagem = new int[4];

        for (int numero : input) {
            if (numero >= 0 && numero <= 25) {
                contagem[0]++;
            } else if (numero >= 26 && numero <= 50) {
                contagem[1]++;
            } else if (numero >= 51 && numero <= 75) {
                contagem[2]++;
            } else if (numero >= 76 && numero <= 100) {
                contagem[3]++;
            }
        }
        return contagem;
    }
}
