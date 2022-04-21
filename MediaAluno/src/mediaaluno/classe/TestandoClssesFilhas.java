package mediaaluno.classe;

import javax.swing.JOptionPane;

public class TestandoClssesFilhas {
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		String nome = JOptionPane.showInputDialog("nome do Aluno ?");
		String idade = JOptionPane.showInputDialog("idade ?");
		String dataNascimentoString = JOptionPane.showInputDialog("data de nascimento ?");
		String escola = JOptionPane.showInputDialog("nome da escola ?");

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNacimento(dataNascimentoString);
		aluno1.setEscola(escola);

		Diretor diretor = new Diretor();
		String nomeDiretor = JOptionPane.showInputDialog("nome do Diretor?");
		String idadeD = JOptionPane.showInputDialog("idade ?");
		String dataNascimentoD = JOptionPane.showInputDialog("data de nascimento ?");
		String registro = JOptionPane.showInputDialog("Registro Educacional ?");
		String tempoDirecao = JOptionPane.showInputDialog("tempo de direção ?");
		String titulacao = JOptionPane.showInputDialog("titulação ?");

		diretor.setNome(nomeDiretor);
		diretor.setIdade(Integer.valueOf(idadeD));
		diretor.setDataNacimento(dataNascimentoD);
		diretor.setRegistroEducacao(registro);
		diretor.setTempoDirecao(Integer.valueOf(tempoDirecao));
		diretor.setTitulacao(titulacao);

		Secretario secretario = new Secretario();
		String nomeSecretario = JOptionPane.showInputDialog("nome do Secretario?");
		String idadeS = JOptionPane.showInputDialog("idade ?");
		String dataNascimentoS = JOptionPane.showInputDialog("data de nascimento ?");
		String registroS = JOptionPane.showInputDialog("Registro Educacional ?");
		String nivelCargo = JOptionPane.showInputDialog(" gargo ?");
		String experiencia = JOptionPane.showInputDialog("Experiencia ?");

		secretario.setNome(nomeSecretario);
		secretario.setIdade(Integer.valueOf(idadeS));
		secretario.setDataNacimento(dataNascimentoS);
		secretario.setRegistro(registroS);
		secretario.setNivelCargo(nivelCargo);
		secretario.setExperiencia(experiencia);
		
		System.out.println(aluno1.pessoaMaiorIdade()+ "-"+ aluno1.msgMaioridade());
		System.out.println(diretor);
		System.out.println(secretario);
		System.out.println(aluno1.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		aluno1.pessoaMaiorIdade();
		diretor.pessoaMaiorIdade();
		secretario.pessoaMaiorIdade();
		

	}

}
