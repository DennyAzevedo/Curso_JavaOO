package aula13;

public class Aula 
{
	private Veiculo veiculo;
	
	private Carro carro;
	
	private Moto moto;
	
	void veiculos()
	{
		veiculo = new Ford();
		veiculo.setCor("Amarelo");
		veiculo.setPeso(600);
		System.out.println(veiculo.toString());
		
		veiculo = new Yamaha(); // up cast
		veiculo.setCor("Preta");
		veiculo.setPeso(120);
		//veiculo.setNome("Fazer 150"); //não é possível, apenas da subclasse
		System.out.println(veiculo.toString());
		
		moto = (Moto) veiculo; // down cast
		moto.setNome("Fazer 300");
		System.out.println(moto.toString()+ ", " + moto.getNome());
	}
	
	void carrosEMotos()
	{
		carro = new Ford();
		carro.setCor("Verde");
		carro.setPeso(600);
		System.out.println(carro.toString());
		
		moto = new Yamaha();
		moto.setCor("Prata");
		moto.setPeso(120);
		moto.setNome("Fazer 250");
		System.out.println(moto.toString()+ ", " + moto.getNome());
	}
	
	public static void main(String[] args) 
	{
		new Aula().veiculos();
		
		new Aula().carrosEMotos();
		
		Ford f = new Ford();
		f.setCor("Branco");
		f.setPeso(600);
		System.out.println(f.toString());
		
		Yamaha y = new Yamaha();
		y.setCor("Azul");
		y.setPeso(120);
		System.out.println(y.toString());
	}

}
