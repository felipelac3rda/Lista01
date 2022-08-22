import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int A, B;
		System.out.print("Digite um valor para A: ");
		A = ler.nextInt();

		System.out.print("Digite um valor para B: ");
		B = ler.nextInt();

		if ((A > 10) || ((A + B) == 20)) {
			System.out.println("Número válido!");
		} else if (A == B) {
			System.out.println("A é igual B; A e B são diferentes de 10; A é menor que 10");
		} else {
			System.out.println("Número não válido");
		}
	}
}
