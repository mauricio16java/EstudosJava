package MediaAluno.classesAuxiliares;

import MediaAluno.interfaces.PermitirAcesso;

// e somente quem recebe o conrato da interface de primeiroAcesso e chma o autentica
public class Autenticacao {
	
	private PermitirAcesso permitirAcesso;
	public boolean autenticarEscola(PermitirAcesso acesso) {
		return acesso.autenticar();
	}
	public Autenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
}
