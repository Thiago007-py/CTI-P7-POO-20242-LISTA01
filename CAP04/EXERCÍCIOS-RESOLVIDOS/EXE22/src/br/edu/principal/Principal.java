package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        
		        double salarioMinimo, quilowatts, valorQuilowatt, valorTotal, valorComDesconto, Desconto;
		        
		        System.out.print("Digite o valor do salário mínimo: ");
		        salarioMinimo = scanner.nextDouble();
		        
		        System.out.print("Digite a quantidade de quilowatts consumidos: ");
		        quilowatts = scanner.nextDouble();
		        
		        valorQuilowatt = salarioMinimo / 5;
		        
		        valorTotal = valorQuilowatt * quilowatts;
		        
		        Desconto = valorTotal * 0.15  ;
		        
		        valorComDesconto = valorTotal - Desconto;
		     
		        System.out.printf("Valor de cada quilowatt: R$ %.2f%n", valorQuilowatt);
		        System.out.printf("Valor a ser pago pela residência: R$ %.2f%n", valorTotal);
		        System.out.printf("Valor a ser pago com desconto de 15%%: R$ %.2f%n", valorComDesconto);
		        
		        scanner.close();
		    }
		

		

	}

