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
		

		System.out.println("A soma dos dois numeros é : " + soma);
		System.out.println("A subtracao dos dois numeros é: " + subtracao);
		System.out.println("A divisao dos dois numeros é : " + divisao);
		System.out.println("A multiplicacao dos dois numeros é : " + multiplicacao);

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
