package Exercicios;
import java.util.Scanner;
import POO.Pessoa;
import POO.ProdutoEletronico;

public class ProdutoEletronico1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Pessoa cliente = new Pessoa ("Bem vindos");
		System.out.println(cliente.nome);
		
		System.out.print("Digite o SEU CPF");
		cliente.cpf = leia.nextInt();

		System.out.println("Digite o NOME DO PRODUTO");
		ProdutoEletronico.nomedoproduto = leia.nextLine();
		
		
		System.out.println("Digite O DEFEITO DO PRODUTO");
		ProdutoEletronico.defeito = leia.nextLine();
		
		
		System.out.println("Digite O NUMERO DO PROTOCOLO");
		ProdutoEletronico.numeroprotocolo =leia.nextInt();
		
		
		System.out.print("Digite O SALDO DEVEDOR");
		ProdutoEletronico. valorapagar = leia.nextDouble();
	}
}
