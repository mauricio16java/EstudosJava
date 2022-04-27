package mediaaluno.executaveis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import mediaaluno.classe.Aluno;
import mediaaluno.classe.Diciplina;
import mediaaluno.classe.Secretario;
import mediaaluno.classe.classesStaticas.StatusAluno;

public class ExecutavelAluno {
	public static void main(String[] args) {
		String login = JOptionPane.showInputDialog("informe o login");
		String senha = JOptionPane.showInputDialog("informe a senha");
		Secretario secretario = new Secretario();
		secretario.setLogin(login);
		secretario.setSenha(senha);
		
		if (secretario.autenticar()) {
			

			List<Aluno> alunos = new ArrayList<Aluno>();

			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 5; qtd++) {

				String nome = JOptionPane.showInputDialog("NOME  DO ALUNO ? :  " + qtd + "");
//			String idade = JOptionPane.showInputDialog("IDADE : ");
//			String dataNacimento = JOptionPane.showInputDialog("DATA DE NASCIMENTO : ");
//			String cpf = JOptionPane.showInputDialog("CPF : ");
//			String rg = JOptionPane.showInputDialog("RG : ");
//			String mae = JOptionPane.showInputDialog("NOME DA MAE : ");
//			String Pai = JOptionPane.showInputDialog("NOME DO PAI :");
//			String dataMatricula = JOptionPane.showInputDialog("DATA DA MATRICULA : ");
//			String serieMatruculado = JOptionPane.showInputDialog("SERIE MATRICULADO : ");
//			String escola = JOptionPane.showInputDialog("ESCOLA :");

				Aluno aluno1 = new Aluno();

				aluno1.setNome(nome);
//			aluno1.setIdade(Integer.valueOf(idade));
//			aluno1.setDataNacimento(dataNacimento);
//			aluno1.setCpf(cpf);
//			aluno1.setRg(rg);
//			aluno1.setNomeMae(mae);
//			aluno1.setNomePai(Pai);
//			aluno1.setDataMatricula(dataMatricula);
//			aluno1.setSerieMtriculado(serieMatruculado);
//			aluno1.setEscola(escola);

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
					int contunueRemover = 0;
					int posisao = 1;
					while (contunueRemover == 0) {
						String diciplinaRemover = JOptionPane
								.showInputDialog("deseja remover qual diciplina 1, 2, 3, ou 4");
						aluno1.getDiciplinas().remove(Integer.valueOf(diciplinaRemover).intValue() - posisao);
						posisao++;
						contunueRemover = JOptionPane.showInternalConfirmDialog(null, "continuar removendo ?");
					}
				}
				alunos.add(aluno1);
			}
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			for (Aluno aluno : alunos) {
				if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else {
					if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);

					}

				}

			}
			System.out.println("############ lista de Aprovados################");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out
						.println("Resultado = " + aluno.getAlunoAprovado() + "  com a media = " + aluno.getMediaNota());

			}
			System.out.println("#############lista dos em Recuperação###########");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out
						.println("Resultado =  " + aluno.getAlunoAprovado() + "com a media =  " + aluno.getMediaNota());

			}
			System.out.println("############lista dos Reprovados##################");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println(
						"Resultado = " + aluno.getAlunoAprovado() + "  com  a media  =  " + aluno.getMediaNota());

			}

		}else {
			JOptionPane.showMessageDialog(null, "acesso negado");
		}
	}

}
