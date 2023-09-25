public class CalculadoraIMC {

    public static String calcularIMC(double peso, double altura) {
        double resultado = peso / (altura * altura);
        String resultadoFormatado;

        if (resultado < 18.5) {
            resultadoFormatado = "Abaixo do Peso";
        }
        
        else if ((resultado >= 18.5) && (resultado < 25)) {
            resultadoFormatado = "Peso Normal";
        }
        
        else if ((resultado >= 25) && (resultado < 30)) {
            resultadoFormatado = "Acima do Peso";
        }
        
        else {
            resultadoFormatado = "Obesidade";
        }

        return "O seu IMC é: " + String.format("%.2f", resultado) + ", que, segundo a tabela, é considerado " + resultadoFormatado + ".";
    }
}
