import javax.swing.JOptionPane;

/*
* Escreva um algoritmo que solicite ao usu�rio a entrada de 4 notas 
* para cada aluno, calcular a média dos alunos e exibir em tela. 
* Ao final mostrar a média da turma. 
* Ao lado da média do aluno deve seguir a seguinte regra de negócio.
* Se média >= 7,5               Aluno Aprovado
* Se média >= 5,5 e <7,5   Aluno em Recuperação
* Se média < 5,5                Aluno Reprovado
*/
public class Matrizes {

	public static void main(String[] args) {
		
		//Vetor de alunos
		String [] aluno = {"João", "Maria", "Carla"};
		
		//Matriz de notas
		float [][] notas = new float[3][4]; //Matriz com 3 linhas e 4 colunas

		//Para controlar o somatório das notas de cada aluno
		float somaNota, mediaAluno;
		
		//Armazenando o status do Aluno
		String statusAluno;
		
		//Inserindo nota dos alunos
		//Laço externo para associar o aluno a nota
		for (int i = 0; i < 3; i++) {
			System.out.println("ALuno: " + aluno[i]);
			
			//Laço interno para armazenar as notas na linha do aluno correspondente 
			somaNota = 0;
			mediaAluno = 0;
			
			for (int j = 0; j < 4; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota nº " 
			+ (j+1) + " do aluno " + aluno[i]));
				somaNota = somaNota + notas[i][j];
			}
			
			mediaAluno = somaNota /4;
			if(mediaAluno < 5.5) {
				statusAluno = "REPROVADO";
			}else if (mediaAluno >= 5.5 && mediaAluno <= 7.5){
				statusAluno = "EM RECUPERAÇÃO";
			}else {
				statusAluno = "APROVADO";
			}
			//Imprimindo o boletim
			System.out.println("**BOLETIM**");
			System.out.println("Aluno :" + aluno[i]);
			System.out.println("Notas");
			for (int m = 0; m < 4; m++) {
				System.out.println((m+1)+ " - " + notas[i][m]);
			}
		
		System.out.println("Média : " + mediaAluno + " - " + statusAluno);
		} 
	}

}
