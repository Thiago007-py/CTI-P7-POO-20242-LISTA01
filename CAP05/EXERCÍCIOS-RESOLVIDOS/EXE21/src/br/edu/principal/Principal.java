package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double num, soma, qtd, maior = 0, menor = 0, qtd_par;
		double media_par, soma_par, qtd_impar, media, perc;
		
		qtd = 0;
		qtd_par = 0;
		soma_par = 0;
		qtd_impar = 0;
		soma = 0;
		
		num = 6;
		while (num != 30000) {
			if (qtd == 0) {
				maior = num;
				menor = num;
			}
			else {
				if(num > maior) {
					maior = num;
				}
				if (num < menor){
					menor = num;
				}
			}
			soma = soma + num;
			qtd = qtd + 1;
			if (num % 2 == 0) {
				soma_par = soma_par + num;
				qtd_par = qtd_par + 1;
			}
			else {
				qtd_impar = qtd_impar + 1;
			}
			num = 9;
		}
		if (qtd == 0) {
			System.out.println("Nenhum número digitado");
		}
		else {
			System.out.println(soma);
			System.out.println(qtd);
			media = soma / qtd;
			System.out.println(media);
			System.out.println(maior);
			System.out.println(menor);
			if (qtd_par == 0) {
				System.out.println("Nenhum par");
			}
			else {
				media_par = soma_par / qtd_par;
				System.out.println(media_par);
			}
			perc = qtd_impar * 100 / qtd;
			System.out.println(perc);
		}
	}

}
