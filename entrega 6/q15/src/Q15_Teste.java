import static org.junit.Assert.assertArrayEquals;
import org.junit.Test; 

public class Q15_Teste {
    
@Test
    public void teste_Contagem_1() {
        int[] input = {5, 10, 30, 40, 60, -1};
        int[] expected = {2, 2, 1, 0};
        int[] actual = Questao_15.contarIntervalos(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void teste_Contagem_2() {
        int[] input = {15, 25, 35, 50, 70, -1};
        int[] expected = {2, 2, 1, 0};
        int[] actual = Questao_15.contarIntervalos(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void teste_Contagem_3() {
        int[] input = {-5, -10, -15, -20, -25, -1};
        int[] expected = {0, 0, 0, 0};
        int[] actual = Questao_15.contarIntervalos(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void tteste_Contagem_4() {
        int[] input = {200, 300, 400, 500, -1};
        int[] expected = {0, 0, 0, 0};
        int[] actual = Questao_15.contarIntervalos(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void teste_Contagem_5() {
        int[] input = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, -1};
        int[] expected = {2, 3, 2, 3};
        int[] actual = Questao_15.contarIntervalos(input);
        assertArrayEquals(expected, actual);
    }

    public void teste_Contagem_6() {
        int[] input = {5, 10, 30, 40, 60, 80, -1};
        int[] expected = {3, 2, 1, 1};
        int[] actual = Questao_15.contarIntervalos(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void teste_Contagem_7() {
        int[] input = {35, 45, 55, 65, 75, -1};
        int[] expected = {0, 2, 3, 0};
        int[] actual = Questao_15.contarIntervalos(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void teste_Contagem_8() {
        int[] input = {5, 25, 50, 75, 100, -1};
        int[] expected = {2, 1, 1, 1};
        int[] actual = Questao_15.contarIntervalos(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void teste_Contagem_9() {
        int[] input = {10, 10, 10, 10, 10, -1};
        int[] expected = {5, 0, 0, 0};
        int[] actual = Questao_15.contarIntervalos(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void teste_Contagem_10() {
        int[] input = {0, 100, -1};
        int[] expected = {1, 0, 0, 1};
        int[] actual = Questao_15.contarIntervalos(input);
        assertArrayEquals(expected, actual);
    }
}
