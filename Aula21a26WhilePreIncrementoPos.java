package aulasOnline;

public class Aula21a26WhilePreIncrementoPos {
	public static void main(String args[]) {
		
	int x = 0;
	int y = 1;
	while (x<10) {
		x+=1;
		System.out.println(x);
	// aqui vai contar do 1 ao 10, pq come�a com o incremento	
	}
	
	//Aqui vai do 1 ao 10, da mesma forma, y vale um, mostra, soma um.
	while (y<=10) {
		System.out.println(y);
		y+=1;
	}
	
		
		// do 10 ao 0
	int z=10;
	
	while (z>=0) {
		System.out.println(z);
		z-=1;
	}
	// java sempre le da direita pra esquerda, exceto por atribui��o( o sinal de igualdade) , que le da esquerda para direita.
	
	
	int p=0;
	int l=0;
	
	// o auto encremento antes d� que o p vale um (pr� incremento)
	System.out.println(++p);
	// o auto incremento depois s� altera o valor no final
	System.out.println(l++); // p�s incremento
	// porque o java le da esquerda pra direita exceto quanto temos o sinal de atribui��o (=)
	System.out.println(l);
	
	}
	
	
	//
	
	
}
