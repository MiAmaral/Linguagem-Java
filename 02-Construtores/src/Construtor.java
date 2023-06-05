//Um construtor em Java é um método especial que é chamado automaticamente quando você cria 
//uma instância (objeto) de uma classe. Ele é responsável por inicializar os membros do objeto
//e pode executar qualquer lógica necessária antes que o objeto esteja pronto para uso.
public class Construtor {

	public static void main(String[] args) {
		//Passando os dados através do construtor com sobrecarga
		Aluno alu = new Aluno (8,9,5);
		//Calculando a média final
		double mediaALunoFinal = alu.calcularMediaAluno();
		
		//Definindo situação do aluno
		if(mediaALunoFinal < 6) {
			alu.situacaoAluno = Aluno.STATUS.reprovado;
		} else {
			alu.situacaoAluno = Aluno.STATUS.aprovado;
		}
		
		//Imprimindo a situação do aluno
		System.out.println("A média do aluno é: " + alu.calcularMediaAluno() + 
				" e a situação é: " +  alu.situacaoAluno);
	
		// Utilizando o enum MATRICULA
		alu.situacaoMatricula = Aluno.MATRICULA.matriculado;
		System.out.println("O aluno está: " + alu.situacaoMatricula);
	}

}
