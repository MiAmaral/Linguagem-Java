package Embarque;

import java.util.Scanner;

import Controle.Aeronaves;

/*
		 * Informar a quantidade de aeronaves no pátio, o nº dos voos por ordem de chegada. 
		 * A ordem de decolagem  é FIFO, o primeiro que entra é o primeiro que sai. 
		 * Mostrar qual o primeiro voo a decolar
		 */
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aeronaves air = new Aeronaves();
		
		//Adicioando quantidade de aeronaves ao arraylist
		System.out.println("Informe o número de aeronaves");
		int numeroAeronaves = sc.nextInt();
		
		//Adicionando número dos voos
		System.out.println("Informe o número dos voos");
		for (int i = 0; i < numeroAeronaves; i++) {
			int numeroVoo = sc.nextInt();
			air.addVoo(numeroVoo);
		}
		
		System.out.println("O primeiro a decolar será : " + air.primeiroVoo());
		air.listaVoos();
		sc.close();
		
	}

}
