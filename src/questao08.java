import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int A, B;
		System.out.print("Digite um valor para A: ");
		A = ler.nextInt();

		System.out.print("Digite um valor para B: ");
		B = ler.nextInt();

		if (A > 10) {
			System.out.println("A > 10");
		}
		if ((A + B) == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("N�meros n�o v�lidos!");
		}
	}
}
