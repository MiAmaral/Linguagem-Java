import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DatasUsandoSDF {

	public static void main(String[] args) throws ParseException {
		// Exemplo de uso do Simple Date Format (SDF) em Java
		
		// Criando uma instância de SimpleDateFormat para formatar datas
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		// Exemplos de manipulação de datas usando o SDF
		
		// Exemplo 1: Parsing de uma string para obter uma data
		Date data1 = sdf.parse("29/12/2021 00:00:00");
		
		// Exemplo 2: Obtendo a data e hora atual
		Date data2 = new Date();
		
		// Exemplo 3: Criando uma data que representa o marco zero (01/01/1970 00:00:00)
		Date data3 = new Date(0L);
		
		// Exemplo 4: Criando uma data com valor específico (01/01/1970 05:00:00)
		Date data4 = new Date(1000L * 60L * 60L * 5L);
		
		// Imprimindo as datas formatadas no console
		
		System.out.println("data1: " + sdf.format(data1));
		System.out.println("data2: " + sdf.format(data2));
		System.out.println("data3: " + sdf.format(data3));
		System.out.println("data4: " + sdf.format(data4));
	}
}
