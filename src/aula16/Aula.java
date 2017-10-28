package aula16;

public class Aula 
{
	static String nome = "Ana";
	
	String sobrenome = "Monteiro";
	
	void imprime()
	{
		System.out.println(nome + " " + sobrenome);
	}
	
	static void show() 
	{
		System.out.println(nome + " " + new Aula().sobrenome);
	}
	
	public static void main(String[] args) 
	{
		//System.out.println(nome + " " + sobrenome);
		
		System.out.println("----- Aula ------");
		
		new Aula().imprime();
		
		System.out.println(nome + " " + new Aula().sobrenome);
		
		show();
		
		System.out.println("----- MyClass ------");
		
		MyClass my = new MyClass();
		
		my.imprime();
		
		MyClass.show();
		
		System.out.println("------ instancias ------");
		
		Aula a1 = new Aula();
		a1.sobrenome = "da Silva";
		a1.nome = "Marina";
		
		Aula a2 = new Aula();
		//a2.sobrenome = "de Soura";
		
		Aula a3 = new Aula();
		a3.sobrenome = "Moura";
		
		System.out.println("a1: " + nome + " " + a1.sobrenome);
		System.out.println("a2: " + nome + " " + a2.sobrenome);
		System.out.println("a3: " + nome + " " + a3.sobrenome);
		System.out.println("Aula: " + nome + " " + new Aula().sobrenome);
		
	}
}
