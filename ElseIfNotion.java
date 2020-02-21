package testes.faculdade;

import java.util.Scanner;

public class ElseIfNotion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Float nota1, nota2, nota3, media;
		System.out.println("Informe a primeira nota: ");
		nota1 = sc.nextFloat();
		System.out.println("Informe a segunda  nota: ");
		nota2 = sc.nextFloat();
		System.out.println("Informe a terceira nota: ");
		nota3 = sc.nextFloat();
		sc.close();
		media = (nota1 + nota2 + nota3) / 3;

		if (media > 9) {
			System.out.println("Conceito A - APROVADO");

		} else if (media > 7.5 && media < 9) {
			System.out.println("Conceito B - APROVADO");

		} else if (media >= 6 && media < 7.5) {
			System.out.println("Conceito C - APROVADO");

		} else {
			System.out.println("Conceito D - REPROVADO");

		}
	}

}
