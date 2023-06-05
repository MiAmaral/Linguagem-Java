//O comando forEach em Java é uma forma simplificada de percorrer 
//elementos em uma coleção, como um array ou uma lista.

public class ComandoForEach {

	public static void main(String[] args) {
		int[] vetorNumeros = new int[] {1,2,3,4,5,6,7,8,9};
		
		//Varrendo o vetor sem o For Each
		System.out.println("Varrendo o vetor sem o For Each");
		for(int i=0; i < vetorNumeros.length; i++) {
			System.out.println("Nº " + vetorNumeros[i]);
		}
		
		//Varrendo o vetor com o For Each
		System.out.println("Varrendo o vetor com o For Each");
		for( int listaNumeros: vetorNumeros) {
			System.out.println("Nº " + listaNumeros);
		}
	}

}
