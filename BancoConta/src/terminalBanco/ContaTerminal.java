package terminalBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String [] args) throws Exception {
		//TODO:Conhecer e ipmortar a classe Scanner
		//Exibir as mensagens para o nosso usuario
		//Obter pela classe Scanner os valores digitados no Terminal
		//Exibir a mensagem da conta criada
		
		Scanner scan  = new Scanner(System.in);
		
		String nomeCliente;
		String agência;
		int conta;
		double saldo;	
		
		System.out.print("Digite o seu nome: ");
		nomeCliente = scan.next();
		System.out.print("Digite o número da agência mais próxima de você: ");
		agência = scan.next();
		System.out.print("Digite o número da conta que você deseja: ");
		conta = scan.nextInt();
		System.out.print("Qual o valor para seu primeiro depósito? ");
		saldo = scan.nextInt();
		
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta "
							+ "em nosso banco, sua agência é " + agência + ", conta " 
							+ conta + " e seu saldo é de R$ " + saldo + ".");
	
	}
}