package br.com.calculadora;

import java.util.Scanner;
//Projeto de calculadora com as 4 operaçãoes basicas
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Digite o numero:");
        double n1 = sc.nextDouble();

        System.out.println("Digite o operador (+    8    ou    -     ou    *     ou    /):");
        char operador = sc.next().charAt(0);

        System.out.println("Digite o segundo número:");
        double n2 = sc.nextDouble();

        double resultado = 0.0;
     

        switch (operador) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                    resultado = n1 / n2;
                break;
            default:
                System.out.println("ERRO");
                break;
        }

            System.out.println("Resultado: " + resultado);
    }
}