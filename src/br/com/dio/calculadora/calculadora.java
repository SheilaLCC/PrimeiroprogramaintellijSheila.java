package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		double soma = soma(a,b);
		double subtracao = subtracao (a,b);
		double divisao = divisao (a,b);
		double multiplicacao = multiplicacao (a,b);
		
<<<<<<< Updated upstream
		System.out.println("A soma dos dois numeros � : " + soma);
		System.out.println("A subtracao dos dois numeros �: " + subtracao);
		System.out.println("A divisao dos dois numeros � : " + divisao);
		System.out.println("A multiplicacao dos dois numeros � : " + multiplicacao);
=======
		System.out.println("A soma dos dois n�meros � igual a : " + soma);
		System.out.println("A subtra��o dos dois n�meros � igual a : " + subtracao);
		System.out.println("A divis�o dos dois n�meros � igual a : " + divisao);
		System.out.println("A multiplicac�o dos dois n�meros � igual a : " + multiplicacao);
>>>>>>> Stashed changes
		}

	public static double soma (double a, double b) {
		return a + b;		
	}
	public static double subtracao (double a, double b) {
		return a - b;		
	}
	public static double divisao (double a, double b) {
		return a / b;		
	}
	public static double multiplicacao (double a, double b) {
		return a * b;		
	}
}
