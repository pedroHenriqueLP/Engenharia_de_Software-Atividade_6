public class Questao_12 {
    
    public static int calcula() {
        int soma = 0;
        
        for (int i = 1; i <= 500; i++) {
            if (i % 2 != 0 && i % 3 == 0) {
                soma += i;
            }
        }
        return soma;
    }
}
