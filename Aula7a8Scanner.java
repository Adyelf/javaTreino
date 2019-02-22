package aulasOnline;
import java.util.Scanner;
public class Aula7a8Scanner {
	public static void main (String args[]) {				
		//Aqui um print para mostrar pro usuário
		System.out.println("Digite um número por favor:");
		
		// E então criamos uma variavel para o nosso Scanner com o nome de exemplo
		Scanner exemplo = new Scanner(System.in);
		// E dizemos que temos um novo objeto instanciando essa variável, e passamos como parametro uma entrada de dados.
		// Que é para o usuário digitar alguma coisa.
		
		// E aqui imprimimos na linha seguinte o que ele digitou.
		System.out.println(exemplo.nextLine());
		
		// E se você passar como parametro só a variável que ele vai digitar, vai aparecer uma mensagem imensa
		// mostrando várias informações sobre a sua Classe Scanner, por isso precisa do nextLine(); 
		// para o java entender que o usuario vai digitar, e aí vai poder mostrar o que ele digitou.
		//Exemplo:
		//System.out.println(exemplo);
		
		//Podemos assim usar a variavel exemplo que o usuario já digitou para colocar este valor em outras variáveis.
		
		int exemploInt= exemplo.nextInt();
		double exemploDouble = exemplo.nextDouble();
		String exemploString = exemplo.toString();
		
	}
}
