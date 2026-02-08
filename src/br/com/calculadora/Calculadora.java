package br.com.calculadora;

import java.util.Scanner;
import java.lang.Exception;

//Projeto de calculadora com as 4 operaçãoes basicas
public class Calculadora {
    public static void main(String[] args) {
        double a, b, resultado;
        char operador;
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("Digite o primeiro numero:");
        a = sc.nextDouble();

        System.out.println("Digite o operador (+    8    ou    -     ou    *     ou    /):");
        operador = sc.next().charAt(0);

        System.out.println("Digite o segundo numero:");
        b = sc.nextDouble();

        resultado = calcula(a, b, operador);
        System.out.println("O resultado é: " + resultado);
    }

    /** Funcao que efetua a operacao entre dois valores e retorna o resultado
     * inputs: dois operandos tipo double e um operador do tipo char (+, -, x, /)
     * output: um resultado do tipo double
     */
    public static double calcula(double a, double b, char operador){
        double resultado = 0.0;

        /** Validação dos inputs */
        try
        {
            if ((operador == '/') && (b == 0.0)) {
                System.out.println("Não é permitido divisão por zero.");
                throw new Exception("Houve divisão por zero");
            }
        }
        catch(Exception e)
        {
            ;
        }
        
        switch(operador){
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                resultado = a / b;
                break;
        }

        return resultado;
    }
}