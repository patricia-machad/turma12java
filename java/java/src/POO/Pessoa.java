package POO;

public class Pessoa {

	public String nome;
	public boolean genero;
	public int anoNascimento;
	public String sobrenome;
	public int idade;
	public int cpf;
	public int numeropassageiro;
	public double horario;
	public int nascimento;
	
	public Pessoa () {
	}
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Pessoa(String nome, String sobrenome) {
	
		this.nome = nome;
		this.sobrenome = sobrenome;
		
	}
	public void idade()
	{
		System.out.println(2020-this.anoNascimento);
	}
	public void idade(int anoAtual)
	{
		this.idade= anoAtual- this.anoNascimento;
	}
	public int PegaIdade(int anoAtual)
	{
		this.idade= anoAtual- this.anoNascimento;
		
		return this.idade;
	}
}