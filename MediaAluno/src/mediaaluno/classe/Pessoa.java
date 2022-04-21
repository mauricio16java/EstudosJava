package mediaaluno.classe;

import java.util.Objects;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected String dataNacimento;
	protected String cpf;
	protected String rg;
	protected String nomeMae;
	protected String nomePai;
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
	public String getDataNacimento() {
		return dataNacimento;
	}
	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf, dataNacimento, idade, nome, nomeMae, nomePai, rg);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(dataNacimento, other.dataNacimento)
				&& idade == other.idade && Objects.equals(nome, other.nome) && Objects.equals(nomeMae, other.nomeMae)
				&& Objects.equals(nomePai, other.nomePai) && Objects.equals(rg, other.rg);
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", dataNacimento=" + dataNacimento + ", cpf=" + cpf
				+ ", rg=" + rg + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	public boolean pessoaMaiorIdade() {
		return idade >=18;
	}
	
	

}
