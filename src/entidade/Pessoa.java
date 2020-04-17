package entidade;

public class Pessoa {

	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private char genero;
	private String email;

	public Pessoa() {
	}

	public Pessoa(String nome, int idade, double altura, double peso, char genero, String email) {

		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.genero = genero;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getGenero() {
		return genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void envelhecer(int anos) {
		this.idade += anos;
	}
	
	public void engordar(double valor) {
		this.peso += valor;
	}
	
	public void encolher(double valor) {
		this.altura -= valor;
	}

	@Override
	public String toString() {
		return "Pessoa: nome=" + nome + ", idade=" + idade + String.format(", altura= %.2f", altura) + String.format(", peso= %.2f", peso) 
			+ ", genero=" + genero + ", email=" + email + ".";
	}

}
