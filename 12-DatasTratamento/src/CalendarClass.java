import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {
		// Demonstração do uso da classe Calendar em Java
		
		// Obtendo a data e hora atual
		System.out.println("==> Recuperação da data com a classe Calendar");
		Calendar cal = Calendar.getInstance();
		System.out.println("Data e Hora atual: " + cal.getTime() + "\n");
		
		// Mostrando o dia da semana, mês e ano
		System.out.println("==> Mostra o dia da semana, mês e ano");
		System.out.println("Data/Hora atual: " + cal.getTime());
		System.out.println("Ano: " + cal.get(Calendar.YEAR));
		System.out.println("Mês: " + (cal.get(Calendar.MONTH) + 1)); // Os meses são baseados em zero, então adicionamos 1
		System.out.println("Dia do Mês: " + cal.get(Calendar.DAY_OF_MONTH) + "\n");

		// Alterando a data/hora com o método set
		System.out.println("==> Alterando a data/hora com o método set");
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 4);

		System.out.println("Data/Hora atual: " + cal.getTime());
		System.out.println("Ano: " + cal.get(Calendar.YEAR));
		System.out.println("Mês: " + (cal.get(Calendar.MONTH) + 1));
		System.out.println("Dia do Mês: " + cal.get(Calendar.DAY_OF_MONTH) + "\n");
		
		// Recuperando a hora do dia
		System.out.println("==> Recuperando a hora do dia");
		
		Calendar cal1 = Calendar.getInstance();
		int hora = cal1.get(Calendar.HOUR_OF_DAY);
		System.out.println("Agora são: " + hora + " hrs");
		if (hora > 6 && hora < 12) {
			System.out.println("Bom Dia");
		} else if (hora >= 12 && hora < 18) {
			System.out.println("Boa Tarde");
		} else {
			System.out.println("Boa Noite");
		}
	}
}
