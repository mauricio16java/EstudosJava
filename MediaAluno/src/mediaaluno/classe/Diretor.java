package mediaaluno.classe;

import java.util.Objects;

import MediaAluno.interfaces.PermitirAcesso;

public class Diretor extends Pessoa  implements PermitirAcesso{
	
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	private String login;
	private String senha;
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public Diretor() {
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(registroEducacao, tempoDirecao, titulacao);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diretor other = (Diretor) obj;
		return Objects.equals(registroEducacao, other.registroEducacao) && tempoDirecao == other.tempoDirecao
				&& Objects.equals(titulacao, other.titulacao);
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + "]";
	}
	@Override
	public boolean pessoaMaiorIdade() {
		// TODO Auto-generated method stub
		return super.pessoaMaiorIdade();
	}
	
	@Override
	public boolean autenticar(String loging, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
		
	}
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equals("admin")&& senha.equals("123");
	}
	
	

}
