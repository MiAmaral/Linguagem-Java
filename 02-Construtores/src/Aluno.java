
public class Aluno {

	private double nota1;
	private double nota2;
	private double nota3;
	STATUS situacaoAluno;
	MATRICULA situacaoMatricula;
	
	//Construtor com sobrecarga
	public Aluno(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public enum MATRICULA{
		//Enum, abreviação de "enumeration" (enumeração), é um tipo de dado 
		//especial em Java que permite definir um conjunto fixo de constantes nomeadas.
		//Essas constantes representam valores discretos que são tratados como tipos separados. 
		//O uso de enums pode melhorar a legibilidade e a manutenção do código, pois fornece 
		//um conjunto limitado de opções predefinidas.
		matriculado,
		pendente,
		recusado
	}
	
	//Definindo um enumerador
	public enum STATUS{
		aprovado,
		reprovado 
	}
	
	public double calcularMediaAluno() {
		double mediaNota = (this.nota1 + this.nota2+ this.nota3) / 3;
		return mediaNota;
		
	}
}
