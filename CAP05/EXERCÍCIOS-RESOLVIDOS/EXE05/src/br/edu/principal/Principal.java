package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double fim, expoente, num_termos, den = 0, denominador, fat, i, j, x, s;
		num_termos =  5;
		x = 3;
		s = 0;
		denominador = 1;
		for (i = 1; i <= num_termos; i ++) {
			fim = denominador;
			fat = 1;
			for (j = 1; j <= fim; j ++) {
				fat = fat * j;
			}
			expoente = i + 1;
			if (expoente % 2 == 0) {
				s = s - Math.pow(x,expoente) / fat;
			}
			else {
				s = s + Math.pow(x, expoente) / fat;
			}
			if (denominador == 4) {
				den = -1;
			}
			if (denominador == 1) {
				den = 1;
			}
			if (den == 1) {
				denominador = denominador + 1;
			}
			else {
				denominador = denominador - 1;
			}
		}
		System.out.println(s);
	}

}
