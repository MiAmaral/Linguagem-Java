import java.util.ArrayList;

import javax.swing.JOptionPane;


/*O ArrayList é uma classe que faz parte da biblioteca padrão do Java
e fornece uma implementação de uma lista redimensionável. Ao contrário 
dos arrays tradicionais, em que o tamanho precisa ser definido durante a
declaração e não pode ser alterado posteriormente, o ArrayList permite adicionar,
remover e acessar elementos de forma dinâmica.*/
public class ArrayListCarros {

	public static void main(String[] args) {
		
		// construindo um arraylist para os carros 
		//o ArrayList é bom quando você precisa acessar os elementos rapidamente 
		//usando índices, mas pode ser mais lento para adicionar ou remover elementos no meio.
		
		ArrayList<String> carros = new ArrayList<>();
		
		//adicioando Carros ao arraylist
		carros.add("FLUENCE");
        carros.add("KOMBI");
        carros.add("JAGUAR");
        carros.add("BMW");
        carros.add("MERCEDES");
        carros.add("FUSCA");
        carros.add("VECTRA");
        carros.add("SANDERO");
        
        //mostrando array
        System.out.println(carros);
        
        //Substituindo MERCEDES por MITSUBISHI -- a substituição é com base na posição do arraylist
        carros.set(4,"MITSUBISHI");
        System.out.println(carros);
        
        //Removendo o VECTRA -- a remoção é pelo conteúdo do arraylist
        carros.remove("VECTRA");
        System.out.println(carros);
        
        //Adicionando Carros ao arraylist
        carros.add(JOptionPane.showInputDialog("Informe a marca do carro: "));
        System.out.println(carros);
        
        //Pesquisando 
        if (carros.contains("BMW")){
        	//substituindo quando não se sabe a posição
        	for (int i = 0; i < carros.size(); i++) {
        		if("BMW".equals(carros.get(i))) {
        			carros.set(i, "BUGATTI");
        			break;
        		}	
			}	
        } else {
        	System.out.println("Não achei o item");
        }
        
        System.out.println(carros);
        System.out.println(carros.size());
        
        //Esvaziando o array
        carros.clear();
        System.out.println(carros);
        
        //Verificando se o array está vazio
        if(carros.isEmpty()) {
        	System.out.println("O vetor está vazio");
        }

	}

}
