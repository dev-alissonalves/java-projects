package code.dio;

import java.util.Objects;

public class Cachorro {
	private String nome;
	private String raça;
	private Integer idade;
	
	public Cachorro(String nome, String raça, Integer idade) {
		super();
		this.nome = nome;
		this.raça = raça;
		this.idade = idade;
	}
	
	public Cachorro() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome, raça);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cachorro other = (Cachorro) obj;
		return Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome)
				&& Objects.equals(raça, other.raça);
	}

	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + ", raça=" + raça + ", idade=" + idade + "]";
	}
	
	
	
}
