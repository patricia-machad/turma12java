package Exercicios;
import java.util.Scanner;
import POO.Aviao;
import POO.Pessoa;
public class Aviao1 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Pessoa cliente = new Pessoa ("Boa tarde Passageiros");
		
		System.out.println(cliente.nome);
		
		System.out.print("Digite o SEU CPF");
		cliente.cpf = leia.nextInt();
		
		System.out.print("Digite o horario do embaraque");
		System.out.print("Digite o numero do passageiro");
		
		System.out.print("Digite o numero da poutrona");
		
		System.out.print("Digite o numero do acento");
	}
}
