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

		for (int pos = 1; pos <= 4; pos++) {
			String nomeDiciplina = JOptionPane.showInputDialog("NOME DA DICIPLINA : " + pos + " ");
			String notaDiciplina = JOptionPane.showInputDialog("NOTA DA DICIPLINA : " + pos + " ");
			Diciplina diciplina = new Diciplina();
			diciplina.setDiciplina(nomeDiciplina);
			diciplina.setNota(Double.valueOf(notaDiciplina));

			aluno1.getDiciplinas().add(diciplina);

		}
		int escolha = JOptionPane.showConfirmDialog(null, "deseja remove diciplina ?");
		if (escolha == 0) {
			String diciplinaRemover = JOptionPane.showInputDialog("deseja remover qual diciplina 1, 2, 3, ou 4");
			aluno1.getDiciplinas().remove(Integer.valueOf(diciplinaRemover).intValue() - 1);
		}

		System.out.println(aluno1.toString());
		System.out.println("A MEDIA DO ALUNO E : " + aluno1.getMediaNota());
		System.out.println("RESULTADO  " + aluno1.getAlunoAprovado());

	}

}
