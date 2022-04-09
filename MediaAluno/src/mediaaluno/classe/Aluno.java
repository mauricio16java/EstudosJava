package mediaaluno.classe;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private int idade;
	private String dataNacimento;
	private String cpf;
	private String rg;
	private String nomeMae;
	private String nomePai;
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
	  for(Diciplina diciplina : diciplinas) {
		  somaNotas += diciplina.getNota();
	  }
	    return somaNotas / diciplinas.size();
	}
	
	/*public double getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 50) {
			if(media >= 70) {
				System.out.println();
			}else {
				System.out.println();
			}
		}else {
			System.out.println();
		}*/
	
	  public boolean getAlunoAprovado() {
		  double media = this.getMediaNota();
		  if(media >=70) {
			  return true;
		  }else {
			  return false;
		  }
	}
	
	

}
