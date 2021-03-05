package one.digitalinnovation.comparable.exercicio;

public class Professor implements Comparable<Professor> {

	private String nome;
	private Integer idade;
	private char sexo;

	public Professor(String nome, Integer idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";		
	}

	@Override
	public int compareTo(Professor o) {
		return this.getIdade() - o.getIdade();
	}

}
