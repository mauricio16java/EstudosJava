package mediaaluno.executaveis;

import javax.swing.JOptionPane;

import mediaaluno.classe.Aluno;
import mediaaluno.classe.Diciplina;

public class ExecutavelAluno {
	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("NOME : ");
		String idade = JOptionPane.showInputDialog("IDADE : ");
		String dataNacimento = JOptionPane.showInputDialog("DATA DE NASCIMENTO : ");
		String cpf = JOptionPane.showInputDialog("CPF : ");
		String rg = JOptionPane.showInputDialog("RG : ");
		String mae = JOptionPane.showInputDialog("NOME DA MAE : ");
		String Pai = JOptionPane.showInputDialog("NOME DO PAI :");
		String dataMatricula = JOptionPane.showInputDialog("DATA DA MATRICULA : ");
		String serieMatruculado = JOptionPane.showInputDialog("SERIE MATRICULADO : ");
		String escola = JOptionPane.showInputDialog("ESCOLA :");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNacimento(dataNacimento);
		aluno1.setCpf(cpf);
		aluno1.setRg(rg);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(Pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMtriculado(serieMatruculado);
		aluno1.setEscola(escola);
		
		
		Diciplina diciplina1 = new Diciplina();
		diciplina1.setDiciplina("BANCO DE DADOS");
		diciplina1.setNota(90);
		
		Diciplina diciplina2 = new Diciplina();
		diciplina2.setDiciplina("java basico");
		diciplina2.setNota(89);
		
		Diciplina diciplina3 = new Diciplina();
		diciplina3.setDiciplina("java oo");
		diciplina3.setNota(79.45);
		
		Diciplina diciplina4 = new Diciplina();
		diciplina4.setDiciplina("algoritimos");
		diciplina4.setNota(85.10);
		
		aluno1.getDiciplinas().add(diciplina1);
		aluno1.getDiciplinas().add(diciplina2);
		aluno1.getDiciplinas().add(diciplina3);
		aluno1.getDiciplinas().add(diciplina4);
		
		
		System.out.println(aluno1.toString());
		System.out.println("A MEDIA DO ALUNO E : " + aluno1.getMediaNota());
		System.out.println("RESULTADO  " + ( aluno1.getAlunoAprovado()? "ALUNO APROVADO" : "ALUNO REPROVADO"));
		
		
		
		
	}

}
