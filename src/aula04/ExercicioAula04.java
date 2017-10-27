package aula04;

public class ExercicioAula04 
{
	void tabuada(int n)
	{
		for (int m = 1; m <= 10; m++)
		{
			int tabu = n * m; 
			System.out.println(m + " x " + n + " = " + tabu);
		}
	}
	
	public static void main(String[] args)
	{
		ExercicioAula04 ex = new ExercicioAula04();
		ex.tabuada(2);
	}
}
