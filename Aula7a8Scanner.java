package aulasOnline;
import java.util.Scanner;
public class Aula7a8Scanner {
	public static void main (String args[]) {				
		//Aqui um print para mostrar pro usu�rio
		System.out.println("Digite um n�mero por favor:");
		
		// E ent�o criamos uma variavel para o nosso Scanner com o nome de exemplo
		Scanner exemplo = new Scanner(System.in);
		// E dizemos que temos um novo objeto instanciando essa vari�vel, e passamos como parametro uma entrada de dados.
		// Que � para o usu�rio digitar alguma coisa.
		
		// E aqui imprimimos na linha seguinte o que ele digitou.
		System.out.println(exemplo.nextLine());
		
		// E se voc� passar como parametro s� a vari�vel que ele vai digitar, vai aparecer uma mensagem imensa
		// mostrando v�rias informa��es sobre a sua Classe Scanner, por isso precisa do nextLine(); 
		// para o java entender que o usuario vai digitar, e a� vai poder mostrar o que ele digitou.
		//Exemplo:
		//System.out.println(exemplo);
		
		//Podemos assim usar a variavel exemplo que o usuario j� digitou para colocar este valor em outras vari�veis.
		
		int exemploInt= exemplo.nextInt();
		double exemploDouble = exemplo.nextDouble();
		String exemploString = exemplo.toString();
		
	}
}
