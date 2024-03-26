package Test;

import Main.Divisao;
import Main.Multiplicacao;
import Main.Soma;
import Main.Subtracao;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * @author alexa
 * @version 1.0
 * @since Release 1.0 da aplicação
 */

public class CalculadoraJunitTest {

    private Multiplicacao multi = new Multiplicacao();
    private Soma soma = new Soma();
    private Divisao div = new Divisao();
    private Subtracao sub = new Subtracao();

    // Cenário de Testes 1: Soma de dois valores inteiros positivos
    //Resultado esperado: 10

    @Test
    public void SomarDoisNumerosPositivos() {
        //Parametros a seremn utlizados para o teste
        int resultado = soma.somar(7, 3);
        //Modelo de comparativo de teste
        assertEquals(10, resultado);
    }

    // Cenário de Testes 2: Soma de dois valores inteiros negativos
    //Resultado esperado: -10

    @Test
    public void SomarDoisNumerosNegativos() {
        //Parametros a seremn utlizados para o teste
        int resultado = soma.somar(-7, -3);
        //Modelo de comparativo de teste
        assertEquals(-10, resultado);
    }

    // Cenário de Testes 3: Soma de um número positivo e um número negativo
    //Resultado esperado: 4

    @Test
    public void SomarPositivoENegativo() {
        //Parametros a seremn utlizados para o teste
        int resultado = soma.somar(7, -3);
        //Modelo de comparativo de teste
        assertEquals(4, resultado);
    }

    // Cenário de Testes 4: Soma de zero com zero
    //Resultado esperado: 0

    @Test
    public void SomarZero() {
        //Parametros a seremn utlizados para o teste
        int resultado = soma.somar(0, 0);
        //Modelo de comparativo de teste
        assertEquals(0, resultado);
    }
    //___________________________________________________________________________________

    // Cenário de Testes 5: Subtração de dois valores inteiros positivos
    //Resultado esperado: 16

    @Test
    public void SubtrairDoisPositivos() {
        //Parametros a seremn utlizados para o teste
        int resultado = sub.subtrair(20, 4);
        //Modelo de comparativo de teste
        assertEquals(16, resultado);
    }

    // Cenário de Testes 6: Subtração de dois valores inteiros negativos
    //Resultado esperado: -5

    @Test
    public void SubtrairDoisNegativos() {
        //Parametros a seremn utlizados para o teste
        int resultado = sub.subtrair(-10, -5);
        //Modelo de comparativo de teste
        assertEquals(-5, resultado);
    }

    // Cenário de Testes 7: Subtração de um número positivo e um número negativo
    //Resultado esperado: 15

    @Test
    public void SubtrairPositivoENegativo() {
        //Parametros a seremn utlizados para o teste
        int resultado = sub.subtrair(10, -5);
        //Modelo de comparativo de teste
        assertEquals(15, resultado);
    }

    // Cenário de Testes 8: Subtração de zero com zero
    //Resultado esperado: 0

    @Test
    public void SubtrairZero() {
        //Parametros a seremn utlizados para o teste
        int resultado = sub.subtrair(0, 0);
        //Modelo de comparativo de teste
        assertEquals(0, resultado);
    }

    //___________________________________________________________________________________

    // Cenário de Testes 9: Divisão de dois números inteiros
    //Resultado esperado:

    @Test
    public void DividirDoisNumerosInteiros() {
        //Parametros a seremn utlizados para o teste
        int resultado = div.dividir(50, 25);
        //Modelo de comparativo de teste
        assertEquals(2, resultado);
    }

    // Cenário de Testes 10: Divisão de numero negativo por número positivo
    //Resultado esperado: -2

    @Test
    public void DividirNegativoPorPositivo() {
        //Parametros a seremn utlizados para o teste
        int resultado = div.dividir(-50, 25);
        //Modelo de comparativo de teste
        assertEquals(-2, resultado);
    }

    // Cenário de Testes 11: Divisão de número positivo por número negativo
    //Resultado esperado: -2

    @Test
    public void DividirPositivoPorNegativo() {
        //Parametros a seremn utlizados para o teste
        int resultado = div.dividir(50, -25);
        //Modelo de comparativo de teste
        assertEquals(-2, resultado);
    }

    // Cenário de Testes 12: Divisão por zero
    //Resultado esperado: exception

    @Test
    public void DividirPorZero() {
        //Parametros a seremn utlizados para o teste
        try {
            int resultado = div.dividir(200, 0);
            fail("Exceção de divisão por zero não foi lançada");
        } catch (ArithmeticException e) {
            //Modelo de comparativo de teste
            assertEquals("/ by zero", e.getMessage());
        }
    }
    //___________________________________________________________________________________

    // Cenario de Testes 13: Multiplicacao de dois números inteiros
    //Resultado esperado: 80

    @Test
    public void MultiplicarDoisInteiros(){
        //Parametros a seremn utlizados para o teste
        int resultado = multi.multiplicar(20, 4);
        //Modelo de comparativo de teste
        assertEquals(80, resultado);
    }
    // Cenario de Testes 14: Multiplicacao de um número positivo e um negativo
    //Resultado esperado: -50


    @Test
    public void MultiplicarPositivoENegativo(){
        //Parametros a seremn utlizados para o teste
        int resultado = multi.multiplicar(-5, 10);
        //Modelo de comparativo de teste
        assertEquals(-50, resultado);
    }
    // Cenario de Testes 15: Multiplicacao de zero por um número inteiro
    //Resultado esperado: 0


    @Test
    public void MultiplicarZeroPorInteiro(){
        //Parametros a seremn utlizados para o teste
        int resultado = multi.multiplicar(0, 100);
        //Modelo de comparativo de teste
        assertEquals(0, resultado);
    }

    // Cenario de Testes 16: Multiplicacao de um número negativo por um inteiro
    //Resultado esperado: -48


    @Test
    public void MultiplicarNegativoPorInteiro(){
        //Parametros a seremn utlizados para o teste
        int resultado = multi.multiplicar(-8, 6);
        //Modelo de comparativo de teste
        assertEquals(-48, resultado);
    }

}
