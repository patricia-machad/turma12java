package lista3;

import java.util.Scanner;

/*Fa�a um programa que pegue um n�mero do teclado e calcule a 
** soma de todos os n�meros  de 1 at� ele. 
**Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
*/
public class exercicio3ponto2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int numero;
		int soma;

		numero = 0;
		soma = 0;

		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
		
		do
		{
			soma = soma + numero;
			numero = (numero-1);
		}while(numero>=0); 
		{
		System.out.print(soma);
		}
}
	
}
