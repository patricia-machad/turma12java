package lista2;
import java.util.Scanner;
	/*Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem 
 	* indicando se este n�mero � par ou �mpar, e se � positivo ou negativo.
 	*/
public class exercicio4 {
	public static void main (String[] args) 
	{
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("DIGITE UM NUMERO:");
		numero = leia.nextInt();
		if (numero>=0) 
		{
			System.out.println("NUMERO POSITIVO");
		}
		else
		{
			System.out.println("NUMERO NEGATIVO");
		}
			
	}

}
