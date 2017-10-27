package aula10;

import java.time.LocalDate;

public class Aula 
{
	public static void main(String[] args) 
	{
		Aluno a1 = new Aluno();
		a1.setDataNascimwento(LocalDate.of(1990, 8, 25));
		a1.setNome("Julia");
		a1.setSobrenome("da Silva");
		a1.setSexo('F');
		a1.setTurno(Turno.MANHA);
		System.out.println(a1.toString());
		
		Professor p1 = new Professor();
		p1.setDataNascimwento(LocalDate.of(1985, 2, 4));
		p1.setNome("Marcos");
		p1.setSobrenome("Ramos");
		p1.setSexo('M');
		p1.setHoras(Horas.TRINTA_HORAS);
		System.out.println(p1.toString());
		
		Aluno a2 = new Aluno("Marta", "Pinheiro", LocalDate.of(1990, 9, 26), 'F', Turno.TARDE);
		System.out.println(a2.toString());
	}
}
