import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConversaoData {

	public static void main(String[] args) throws ParseException {
		// Demonstração de conversão de datas em Java

		// Obtendo a data atual
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();

		// Formatando a data usando SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: " + sdf.format(data));

		// Convertendo objetos Date em formato de texto para Date
		System.out.println("Data convertida: " + sdf.parse("11/03/1999"));
	}
}

