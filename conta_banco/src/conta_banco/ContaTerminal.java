package conta_banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		int numero;
		String agencia, nomeCliente;
		double saldo;
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Por favor, digite o número da Conta: ");
		numero = scanner.nextInt();
		
		System.out.print("Informe o número da agência: ");
		agencia = scanner.next();
		scanner.nextLine();
		
		System.out.print("Informe o nome do cliente: ");
		nomeCliente = scanner.nextLine();
		
		System.out.print("Informe o saldo: ");
		saldo = scanner.nextDouble();
		
		//impressão das informações
		System.out.println("\nOlá ".concat(nomeCliente)
				.concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia)
				.concat(", conta ") + numero + " e seu saldo " + saldo + " já está disponível para saque.");
		
		scanner.close();

	}

}
