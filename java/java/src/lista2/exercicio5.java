package lista2;
import java.util.Scanner;
  /**A Secretaria de Meio Ambiente que controla o �ndice de polui��o
    *mant�m 3 grupos de ind�strias que s�o altamente poluentes do meio ambiente.
    *O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. 
    *Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem
    *suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o 
    *intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser
    *notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o 
    *medido e emita a notifica��o adequada aos diferentes grupos de empresas.
  **/
public class exercicio5 {
	public static void main(String[] args) 
	{
		
		double indice;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("DIGITE O �NDICE DE POLUI��O: ");
		indice = leia.nextDouble();
		
		if (indice>0.05 && indice<= 0.25) 
		{
			System.out.printf("DENTRO DO PERMITIDO!");
		}
		else if (indice == 0.3) 
		{
			System.out.printf("GRUPO1, SUSPENDAM SUAS ATIVIDADES!");
		}
		else if (indice <= 0.4) 
		{
			System.out.printf("GRUPO1 e GRUPO2, SUSPENDAM SUAS ATIVIDADES!");
		}
		else  
		{
			System.out.printf("TODOS OS GRUPOS, SUSPENDAM SUAS ATIVIDADES!");
	    }
		
	}
	
}

