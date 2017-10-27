package aula11;

public class Aula 
{
	public static void main(String[] args) 
	{
		Aluno a = new Aluno();
		a.setNome("Joana da Silva");
		a.setMatricula("123456789");
		System.out.println("Nome: " + a.getNome() + ", " + "Matricula: " + a.getMatricula());
		
		System.out.println("----------------------------");
		
		Aluno a1 = new Aluno();
		a1.setNome("Joana da Silva");
		a1.setMatricula("1234567890");
		System.out.println("Nome: " + a1.getNome() + ", " + "Matricula: " + a1.getMatricula());
		
		System.out.println("----------------------------");
		
		Professor p1 = new Professor();
		p1.setNome("Marcos da Silva");
		p1.setMatricula("1234567890");
		System.out.println("Nome: " + p1.getNome() + ", " + "Matricula: " + p1.getMatricula());
		
		System.out.println("----------------------------");
		
		Professor p2 = new Professor();
		p2.setNome("Marcos da Silva");
		p2.setMatricula("12345678");
		System.out.println("Nome: " + p2.getNome() + ", " + "Matricula: " + p2.getMatricula());
	}
}
