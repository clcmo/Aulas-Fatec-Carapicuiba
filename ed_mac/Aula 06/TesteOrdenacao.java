import java.util.Scanner;
public class TesteOrdenacao{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um tamanho");
		int n = entrada.nextInt();
		Ordenacao ordenacao = new Ordenacao(n);
	}
}