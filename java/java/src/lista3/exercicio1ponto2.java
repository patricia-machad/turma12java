package lista3;
import java.util.Scanner;
/*Desenvolver um sistema que efetue a soma de todos os n�meros �mpares 
 **que s�o  m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.
 */
public class exercicio1ponto2 {
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		int somaMult = (numero + (numero*3));
		
		for (numero=1; numero<=500;numero++)	
		{
		if (numero%2==1) 
			{
				System.out.printf("NUMERO IMPAR: %s\n", numero);
				somaMult=numero*3;
				System.out.printf("A SOMA DOS VALORES S�O: %s\n", somaMult);
		    }
		      
	
		}
	}
	
}