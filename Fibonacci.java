package testes.faculdade;

public class Fibonacci {
	public static void main(String[] args) {
		int hi = 1, lo = 0;

		System.out.println(lo);
		while (hi < 5000) {
			System.out.println(hi);
			hi = lo + hi;
			lo = hi - lo;
		}

	}
}
