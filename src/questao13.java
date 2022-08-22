import java.util.Scanner;

public class questao13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int A, B, aux = 0;
		System.out.print("Digite um valor para A: ");
		A = ler.nextInt();

		System.out.print("Digite um valor para B: ");
		B = ler.nextInt();

		if (A > 10) {
			System.out.println("A > 10");
			aux++;
		}
		if (((A + B) == 20)) {
			System.out.println("A + B == 20");
			aux++;
		}
		if (aux == 0) {
			System.out.println("Números não válidos!");
		}

	}
}
