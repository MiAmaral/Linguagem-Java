package Embarque;
/*
 *  Os genéricos são uma funcionalidade que permite criar classes, 
 *  interfaces e métodos que podem ser parametrizados para trabalhar com diferentes
 *  tipos de dados de forma segura e flexível. Eles fornecem uma maneira de criar 
 *  código reutilizável, evitando a necessidade de escrever implementações específicas
 *  para cada tipo de dado.
 */

import java.util.Scanner;

import Controle.AeronavesComGenerics;

public class PrincipalComGenerics {

	public static void main(String[] args) {
		//Instanciando as classes
		Scanner sc = new Scanner(System.in);
		AeronavesComGenerics<Integer> air = new AeronavesComGenerics<>();
		
		System.out.println("Informe o número de aeronaves");
		int numeroAeronaves = sc.nextInt();
		
		//Adicionando voos
		System.out.println("Informe o número dos voos");
		for(int i = 0; i < numeroAeronaves; i++) {
			int numeroVoo= sc.nextInt();
			air.addVoo(numeroVoo);
		}
		
		System.out.println("O primeiro a decolar será : " + air.primeiroVoo());
		air.listaVoos();
		sc.close();		

	}

}
