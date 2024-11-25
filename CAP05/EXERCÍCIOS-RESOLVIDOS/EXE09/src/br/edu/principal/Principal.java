 package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int ta = 0; 
		        int te = 0; 
		        int tr = 0;
		        double totalClasse = 0; 

		        for (int cont = 1; cont <= 6; cont++) {
		            System.out.println("Digite as notas do aluno " + cont + ": ");
		            double n1 = scanner.nextDouble();
		            double n2 = scanner.nextDouble();

		            double media = (n1 + n2) / 2;
		            System.out.println("Média: " + media);

		            if (media <= 3) {
		                tr++; 
		                System.out.println("Reprovado");
		            } else if (media > 3 && media < 7) {
		                te++; 
		                System.out.println("Exame");
		            } else {
		                ta++; 
		                System.out.println("Aprovado");
		            }

		            totalClasse += media;
		        }

		        System.out.println("Total de alunos reprovados: " + tr);
		        System.out.println("Total de alunos em exame: " + te);
		        System.out.println("Total de alunos aprovados: " + ta);

		        double mediaClasse = totalClasse / 6;
		        System.out.println("Média da classe: " + mediaClasse);
		        scanner.close();
		    } 
}



