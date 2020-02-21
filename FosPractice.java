package testes.faculdade;

public class FosPractice {

	/*
	 * Desafio, controlar o laço for sem uso de numeros, deve-se imprimir # em "meia forma de arvore" 
	 * Ex: 
	 * #
	 * ## 
	 * ### 
	 * #### 
	 * #####
	 * 
	 */

	public static void main(String[] args) {

		for (String v = "#"; !v.equals("########"); v += "#") {
			System.out.println(v);
		}

	}

}
