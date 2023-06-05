import java.util.LinkedList;

public class LinkedListCarros {

	public static void main(String[] args) {
		/*
		 addFirst()
		 addLast()
		 removeFirst()
		 removeLast()
		 getFirst()
	     getLast()
		 */
		
		//O LinkedList é útil quando você precisa adicionar ou remover 
		//elementos com frequência, mas o acesso aos elementos é mais lento.

		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
        System.out.println(cars);        
        
        //Adicionando ao início da lista
        cars.addFirst("HB20");
        System.out.println(cars);
        
        //Adicionando ao fim da lista
        cars.addLast("Onix");
        System.out.println(cars);
        
        //Pegando dados no meio da lista
        String carro;
        carro = cars.get(2);
        System.out.println("O carro na posição 3 é: " + carro);
        System.out.println(cars);
        
        //Removendo o primeiro carro
        cars.removeFirst();
        System.out.println(cars);
        
        //Removendo o ultimo carro
        cars.removeLast();
        System.out.println(cars);
      
        //Pegando o primeiro item
        System.out.println("O primeiro carro é: " + cars.getFirst());
        
        //Pegando o ultimo item
        System.out.println("O último carro é: " + cars.getLast());
        
        //Limpando a lista
        cars.clear();
        System.out.println(cars);
        if(cars.isEmpty()) {
        	System.out.println("O LinkedList está vazio");
        }
	}

}
