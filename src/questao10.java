import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int A, B;
		System.out.print("Digite um valor para A: ");
		A = ler.nextInt();

		System.out.print("Digite um valor para B: ");
		B = ler.nextInt();

		if (!(A > 10)) {
			System.out.println("N�mero menor que 10");
		}
		if (!((A + B) == 20)) {
			System.out.println("N�mero diferente de 20");
		}

	}
}
