package aulasOnline;

import java.util.Scanner;

public class Aula9Calculadora {

	
	public static void main (String args[]) {
		//Iremos montar uma calculadora simples como exemplo
		double num1,num2,soma,multi,divi,sub,subInverso;
		Scanner digitaAi = new Scanner(System.in);
		
		System.out.println("Digite o valor para num1: ");
		num1 = digitaAi.nextDouble();
		// Aqui atribuimos o valor da mesma forma, variavel = nome_da_variavel_quedigitou.nextTipo_da_variavel();
		
		System.out.println("Digite o valor para num2:");
		num2 = digitaAi.nextDouble();
		
		
		soma = num1+num2;
		System.out.println("A soma é:"+soma);
		sub = num1-num2;
		System.out.println("Substração de num1-num2 é: "+sub);
		
		subInverso=num2-num1;
		System.out.println("Subtração de num2-num1 é:"+subInverso);
	
		multi = num1*num2;
		System.out.println("A multi de num1 X num 2 é: "+multi);
	
		divi = num1/num2;
		System.out.println("A divi de num1 por num2 é:"+divi);
	
		
		
	}
}
