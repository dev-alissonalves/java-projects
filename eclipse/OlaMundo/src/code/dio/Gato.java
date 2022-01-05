package code.dio;

import java.util.Objects;

public class Gato {
	private String nome;
	private String ra�a;
	private Integer idade;
	
	public Gato(String nome, String ra�a, Integer idade) {
		super();
		this.nome = nome;
		this.ra�a = ra�a;
		this.idade = idade;
	}
	
	public Gato() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome, ra�a);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome)
				&& Objects.equals(ra�a, other.ra�a);
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", ra�a=" + ra�a + ", idade=" + idade + "]";
	}
	
}




