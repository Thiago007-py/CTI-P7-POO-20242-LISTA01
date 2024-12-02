package br.edu.principal;

import java.util.Scanner;

import br.edu.CalculaMedia.CalculaMedia;

public class Principal {

	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        double nota1, nota2, nota3, m;
	        char letra;

	        System.out.print("Digite a primeira nota: ");
	        nota1 = scanner.nextDouble();
	        System.out.print("Digite a segunda nota: ");
	        nota2 = scanner.nextDouble();
	        System.out.print("Digite a terceira nota: ");
	        nota3 = scanner.nextDouble();

	        do {
	            System.out.print("Digite a letra (A para média aritmética, P para média ponderada): ");
	            letra = scanner.next().charAt(0);
	        } while (letra != 'A' && letra != 'P');

	        m = CalculaMedia.calculaMedia(nota1, nota2, nota3, letra);

	        if (letra == 'A') {
	            System.out.println("A média aritmética é: " + m);
	        } else {
	            System.out.println("A média ponderada é: " + m);
	        }

	        scanner.close();
	    }
	}