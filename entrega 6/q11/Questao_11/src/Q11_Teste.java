import org.junit.Test;
import static org.junit.Assert.*;


public class Q11_Teste {
    
    @Test
    public void testIMCAbaixoDoPeso1() {
        String resultado = CalculadoraIMC.calcularIMC(50.0, 1.80);
        assertEquals("O seu IMC é: 15,43, que, segundo a tabela, é considerado Abaixo do Peso.", resultado);
     }
     
    @Test
    public void testIMCAbaixoDoPeso2() {
        String resultado = CalculadoraIMC.calcularIMC(56.2, 1.90);
        assertEquals("O seu IMC é: 15,57, que, segundo a tabela, é considerado Abaixo do Peso.", resultado);
     }
    
    @Test
    public void testIMCPesoNormal1() {
        String resultado = CalculadoraIMC.calcularIMC(60.7, 1.76);
        assertEquals("O seu IMC é: 19,60, que, segundo a tabela, é considerado Peso Normal.", resultado);
    }

    @Test
    public void testIMCPesoNormal2() {
        String resultado = CalculadoraIMC.calcularIMC(52.5, 1.67);
        assertEquals("O seu IMC é: 18,82, que, segundo a tabela, é considerado Peso Normal.", resultado);
    }

    @Test
    public void testIMCPesoNormal3() {
        String resultado = CalculadoraIMC.calcularIMC(70.1, 1.84);
        assertEquals("O seu IMC é: 20,71, que, segundo a tabela, é considerado Peso Normal.", resultado);
    }

    @Test
    public void testIMCPesoNormal4() {
        String resultado = CalculadoraIMC.calcularIMC(84.2, 1.90);
        assertEquals("O seu IMC é: 23,32, que, segundo a tabela, é considerado Peso Normal.", resultado);
    }
    
    @Test
    public void testIMCAcimaDoPeso1() {
        String resultado = CalculadoraIMC.calcularIMC(80.0, 1.70);
        assertEquals("O seu IMC é: 27,68, que, segundo a tabela, é considerado Acima do Peso.", resultado);
    }
    
    @Test
    public void testIMCAcimaDoPeso2() {
        String resultado = CalculadoraIMC.calcularIMC(76.5, 1.69);
        assertEquals("O seu IMC é: 26,78, que, segundo a tabela, é considerado Acima do Peso.", resultado);
    }
    
    @Test
    public void testIMCObesidade1() {
        String resultado = CalculadoraIMC.calcularIMC(100.0, 1.65);
        assertEquals("O seu IMC é: 36,73, que, segundo a tabela, é considerado Obesidade.", resultado);
    }

    @Test
    public void testIMCObesidade2() {
        String resultado = CalculadoraIMC.calcularIMC(133.3, 1.68);
        assertEquals("O seu IMC é: 47,23, que, segundo a tabela, é considerado Obesidade.", resultado);
    }
}
