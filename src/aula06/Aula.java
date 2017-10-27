package aula06;

import aula05.ClassB;

public class Aula extends ClassB 
{
	public static void main(String[] args) 
	{
		ClassA a = new ClassA();
		
		a.pacote = "pacote A";
		a.protegido = "protegido A";
		a.publico = "publico A";
		
		ClassB b = new ClassB();
		b.publico = "publico B";

		Aula aula = new Aula();
		aula.publico = "publico de B";
		aula.protegido = "protegido de B por herança";
		
		ClassD d = new ClassD();
		d.metodoD();
	}
}
