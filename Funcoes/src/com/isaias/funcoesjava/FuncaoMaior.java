package com.isaias.funcoesjava;

import java.util.Scanner;

public class FuncaoMaior {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite 3 valores:");

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		int higher = max(num1, num2, num3);

		System.out.println("Você digitou os números: " + num1 + ", " + num2 + ", " + "e " + num3);

		showResult(higher);

		scanner.close();

	}

	public static int max(int a, int b, int c) {
		int aux;
		if (a > b && a > c) {
			aux = a;
		} else if (b > c) {
			aux = b;
		} else {
			aux = c;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("O maior valor digitado é " + value);
	}

}
