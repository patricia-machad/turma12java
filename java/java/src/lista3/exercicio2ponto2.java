package lista3;

import java.util.Scanner;

/*Obtenha um n�mero digitado pelo usu�rio e repita a opera��o 
**e multiplicar ele por tr�s  (imprimindo o novo valor) at� que 
**ele seja maior do que 100. Ex.: se o usu�rio digita 5,  
**deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.
*/
public class exercicio2ponto2 {
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);

		int numero;
		int numeroNovo;
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();

		numeroNovo = numero;
		while(numeroNovo <=100)
		{
			if(numero == numeroNovo)
			{
				System.out.println(numeroNovo );
			}
			numeroNovo = (numeroNovo*3);
			System.out.println( numeroNovo);
		}
	}

}
