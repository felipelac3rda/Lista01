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
			System.out.println("N�mero v�lido!");
		} else if (A == B) {
			System.out.println("A � igual B; A e B s�o diferentes de 10; A � menor que 10");
		} else {
			System.out.println("N�mero n�o v�lido");
		}
	}
}
