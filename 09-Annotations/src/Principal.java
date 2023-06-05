public class Principal {
//O @SuppressWarnings suprime avisos do compilador para um elemento específico ou para um conjunto de elementos. 
	
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
    	
        Metodos metodos = new Metodos();
        metodos.exibir();
        metodos.cadastrar();
    }
}
