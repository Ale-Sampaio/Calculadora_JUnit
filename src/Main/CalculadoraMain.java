package Main;

public class CalculadoraMain {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();

        System.out.println("Teste de Soma:");

        // Cenário de Testes 1: Soma de dois valores, Resultado esperado: 10

        int somar = soma.somar(7,3);
        System.out.println(somar);

        // Cenário de Testes 2: Soma de dois valores inteiros negativos, Resultado esperado: -10
        somar = soma.somar(-7,-3);
        System.out.println(somar);

        // Cenário de Testes 3: Soma de um número positivo e um número negativo, Resultado esperado: 4
        somar = soma.somar(7,-3);
        System.out.println(somar);

        // Cenário de Testes 4: Soma de zero com zero, Resultado esperado: 0
        somar = soma.somar(0,0);
        System.out.println(somar +"\n");

        System.out.println("Teste de Subtracao:\n");

        // Cenário de Testes 5: Subtração de dois valores inteiros positivos, Resultado esperado: 16
        int subtrair = subtracao.subtrair(20,4);
        System.out.println(subtrair);

        // Cenário de Testes 6: Subtração de dois valores inteiros negativos, Resultado esperado: -5
        subtrair = subtracao.subtrair(-10,-5);
        System.out.println(subtrair);

        // Cenário de Testes 7: Subtração de um número positivo e um número negativo, Resultado esperado: 15
        subtrair = subtracao.subtrair(10,-5);
        System.out.println(subtrair);

        // Cenário de Testes 8: Subtração de zero com zero, Resultado esperado: 0
        subtrair = subtracao.subtrair(0,0);
        System.out.println(subtrair + "\n");

        System.out.println("Teste de Divisao:\n");

        // Cenário de Testes 9: Divisão de dois números inteiros, Resultado esperado: 2
        int dividir = divisao.dividir(50,25);
        System.out.println(dividir);

        // Cenário de Testes 10: Divisão de número negativo por número positivo, Resultado esperado: -2
        dividir = divisao.dividir(-50,25);
        System.out.println(dividir);

        // Cenário de Testes 11: Divisão de número positivo por número negativo, Resultado esperado: -2
        dividir = divisao.dividir(50,-25);
        System.out.println(dividir);

        // Cenário de Testes 12: Divisão por zero, Resultado esperado:  Deve lançar uma exceção
        try {
            dividir = divisao.dividir(200,0);
            System.out.println(dividir + "\n");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() +"\n");
        }

        System.out.println("Teste de Multiplicacao:\n");

        // Cenário de Testes 13: Multiplicação de dois números inteiros, Resultado esperado: 80
        int multiplicar = multiplicacao.multiplicar(20,4);
        System.out.println(multiplicar);

        // Cenário de Testes 14: Multiplicação de um número positivo e um negativo, Resultado esperado: -50
        multiplicar = multiplicacao.multiplicar(-5,10);
        System.out.println(multiplicar);

        // Cenário de Testes 15: Multiplicação de zero por um número inteiro, Resultado esperado: 0
        multiplicar = multiplicacao.multiplicar(0,100);
        System.out.println(multiplicar);

        // Cenário de Testes 16: Multiplicação de um número negativo por um inteiro, Resultado esperado: -48
        multiplicar = multiplicacao.multiplicar(-8,6);
        System.out.println(multiplicar);
    }
}
