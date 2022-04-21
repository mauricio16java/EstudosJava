package mediaaluno.classe;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import mediaaluno.classe.classesStaticas.StatusAluno;

public class Aluno extends Pessoa {

	private String dataMatricula;
	private String serieMtriculado;
	private String escola;

	private List<Diciplina> diciplinas = new ArrayList<Diciplina>();

	public List<Diciplina> getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(List<Diciplina> diciplinas) {
		this.diciplinas = diciplinas;
	}

	public Aluno() {

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

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getSerieMtriculado() {
		return serieMtriculado;
	}

	public void setSerieMtriculado(String serieMtriculado) {
		this.serieMtriculado = serieMtriculado;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public double getMediaNota() {
		double somaNotas = 0.0;
		for (Diciplina diciplina : diciplinas) {
			somaNotas += diciplina.getNota();
		}
		return somaNotas / diciplinas.size();
	}

	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, dataMatricula, dataNacimento, diciplinas, escola, idade, nome, nomeMae, nomePai, rg,
				serieMtriculado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNacimento, other.dataNacimento) && Objects.equals(diciplinas, other.diciplinas)
				&& Objects.equals(escola, other.escola) && idade == other.idade && Objects.equals(nome, other.nome)
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai)
				&& Objects.equals(rg, other.rg) && Objects.equals(serieMtriculado, other.serieMtriculado);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNacimento=" + dataNacimento + ", cpf=" + cpf
				+ ", rg=" + rg + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula
				+ ", serieMtriculado=" + serieMtriculado + ", escola=" + escola + ", diciplinas=" + diciplinas + "]";
	}

	@Override
	public boolean pessoaMaiorIdade() {

		return idade >= 21;
	}

	public String msgMaioridade() {
		return this.pessoaMaiorIdade() ? "Aluno amior de idade " : "Aluno menor de idade";
	}

}
