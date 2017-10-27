package aula06;

public class ClassA 
{
	private String privado;
	
	protected String protegido;
	
	public String publico;
	
	String pacote;
	
	public static void main(String[] args) 
	{
		ClassA a = new ClassA();
		
		a.pacote = "pacote A";
		a.protegido = "protegido A";
		a.publico = "publico A";
		a.privado = "privado A";
	}
}
