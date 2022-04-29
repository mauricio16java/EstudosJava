package mediaaluno.classe;

import java.util.Objects;

import MediaAluno.interfaces.PermitirAcesso;

public class Secretario  extends Pessoa implements PermitirAcesso{
	private String registro;
	private String nivelCargo;
	private String experiencia;
	private String login;
	private String senha;
	
	public Secretario(String login , String senha) {
		this.login = login;
		this.senha = senha;
	}
	public Secretario() {
		// TODO Auto-generated constructor stub
	}
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(experiencia, nivelCargo, registro);
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
		Secretario other = (Secretario) obj;
		return Objects.equals(experiencia, other.experiencia) && Objects.equals(nivelCargo, other.nivelCargo)
				&& Objects.equals(registro, other.registro);
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia + "]";
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
		return login.equals("admin")&& senha.equals("admin");
	}
	

}
