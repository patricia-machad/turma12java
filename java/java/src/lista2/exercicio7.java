package lista2;
import java.util.Scanner; 
	/*
	 *Receber valores de base e altura de um tri�ngulo e verificar 
	 *se s�o valores v�lidos (positivos maiores que zero). 
	 *Em caso afirmativo, calcular a �rea do tri�ngulo.
	 */

public class exercicio7 {
	public static void main(String[] args)
	{
						
		Scanner leia = new Scanner(System.in); 
		double base=0.0, altura=0.0, area=0.0; 
		System.out.print("Digite a base:"); 
		base = leia.nextDouble(); 
		System.out.print("Digite a altura: "); 
		altura = leia.nextDouble(); 
				
				//usando tenario
		System.out.println( (base > 0 && altura > 0 )? "A area do triangulo � "+((base * altura)/2):"Vc n�o digitou valores validos!!!" );
				
				//usando if normal
		if (base > 0 && altura > 0 )
		{
		System.out.printf("A area do triangulo � %.2f", ((base * altura)/2));
		}
		else
		{
		System.out.println("Vc n�o digitou valores validos!!!");
		}
					
		
	}

}


