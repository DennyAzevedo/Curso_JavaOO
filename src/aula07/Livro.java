package aula07;

public class Livro 
{
	String titulo;
	String autor;
	int paginas;
	boolean lancamento;
	
	public String getTitulo()
	{
		return titulo;
	}
	
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	
	public String getAutor()
	{
		return autor;
	}
	
	public void setAutor(String autor)
	{
		this.autor = autor;
	}
	
	public int getPaginas()
	{
		return paginas;
	}
	
	public void setPaginas(int paginas)
	{
		this.paginas = paginas;
	}
	
	public boolean isLancamento()
	{
		return lancamento;
	}
	
	public void setLancamento(boolean lancamento)
	{
		this.lancamento = lancamento;
	}
}
