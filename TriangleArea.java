package testes.faculdade;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float base, altura, area;

		System.out.println("Digite a base: ");
		base = sc.nextInt();
		System.out.println("Digite a altura: ");
		altura = sc.nextInt();

		area = (base * altura) / 2;

		System.out.println(area);

		sc.close();

	}

}
