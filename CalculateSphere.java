package testes.faculdade;

import javax.swing.JOptionPane;

public class CalculateSphere {


		public static void main(String[] args) {
			double radius, C, A, V;
			
			System.out.print("Digite a medida do raio da esfera: ");
			radius = Double.parseDouble(JOptionPane.showInputDialog(null));
			
			C = 2 * 3.14159 * radius;
			A = 4 * 3.14159 * radius * radius;
			V = 4 * 3.14159 * radius * radius * radius / 3;
			
			System.out.printf("COMPRIMENTO = %f\n", C);
			System.out.printf("AREA = %f\n", A);
			System.out.printf("VOLUME = %f\n", V);
		}
	
	}


