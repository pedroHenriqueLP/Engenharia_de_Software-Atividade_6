import org.junit.Test;
import static org.junit.Assert.*;

public class Q12_Teste {

    @Test
    public void teste_Calculo1() {
        int resultadoEsperado = 20667;
        int resultadoReal = Questao_12.calcula();
        assertEquals(resultadoEsperado, resultadoReal);    
    }
    
    @Test
    public void teste_Calculo2() {
        int resultadoEsperado = 20000;
        int resultadoReal = Questao_12.calcula();
        assertNotEquals(resultadoEsperado, resultadoReal);    
    }
    
    @Test
    public void teste_Calculo3() {
        int resultadoEsperado = 21000;
        int resultadoReal = Questao_12.calcula();
        assertNotEquals(resultadoEsperado, resultadoReal);    
    }
    
    @Test
    public void teste_Calculo4() {
        int resultadoEsperado = 20668;
        int resultadoReal = Questao_12.calcula();
        assertNotEquals(resultadoEsperado, resultadoReal);    
    }
    
    @Test
    public void teste_Calculo5() {
        int resultadoEsperado = 100;
        int resultadoReal = Questao_12.calcula();
        assertNotEquals(resultadoEsperado, resultadoReal);    
    }
    
    @Test
    public void teste_Calculo6() {
        int resultadoEsperado = 10;
        int resultadoReal = Questao_12.calcula();
        assertNotEquals(resultadoEsperado, resultadoReal);    
    }
    
    @Test
    public void teste_Calculo7() {
        int resultadoEsperado = 0;
        int resultadoReal = Questao_12.calcula();
        assertNotEquals(resultadoEsperado, resultadoReal);    
    }
    
    @Test
    public void teste_Calculo8() {
        int resultadoEsperado = -1;
        int resultadoReal = Questao_12.calcula();
        assertNotEquals(resultadoEsperado, resultadoReal);    
    }
    
    @Test
    public void teste_Calculo9() {
        int resultadoEsperado = 30000;
        int resultadoReal = Questao_12.calcula();
        assertNotEquals(resultadoEsperado, resultadoReal);    
    }
    
    @Test
    public void teste_Calculo10() {
        int resultadoEsperado = 742;
        int resultadoReal = Questao_12.calcula();
        assertNotEquals(resultadoEsperado, resultadoReal);    
    }
    

}