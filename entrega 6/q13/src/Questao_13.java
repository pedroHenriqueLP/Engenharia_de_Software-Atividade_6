import java.util.Scanner;

public class Questao_13 {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = Double.MIN_VALUE;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite a altura da pessoa " + i + " em metros: ");
            double altura = scanner.nextDouble();

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
        }
        
        System.out.println("A menor altura do grupo é: " + menorAltura + " metros");
        System.out.println("A maior altura do grupo é: " + maiorAltura + " metros");
    }
}

