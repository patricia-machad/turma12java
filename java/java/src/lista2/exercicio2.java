package lista2;
import java.util.Scanner;

	/**Elabore um sistema que leia as vari�veis C e N, 
	 *respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio. 
	 *E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. 
	 *Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento 
	 *armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. 
	 *A hora excedente de trabalho vale R$ 20,00. 
	 *No final do processamento imprimir o sal�rio total e o sal�rio excedente.
    **/
public class exercicio2 {
	public static void main(String[] args) 
	{
		
	double C;
	double N = 0;
	double E;
	double salario;
	double extra;
	//GANHA 10 REAIS A HORA
	//SE AS HORAS PASSAREM DE 50, CALCULAR EXCESSO 
	//HORA EXTRA = 20 REAIS
	Scanner leia = new Scanner(System.in);
	
	E = (N-50);
	extra = E*20;
	salario = 50*10;
	
	System.out.println("DIGITE O CODIGO DO TRABALHADOR: ");
	C = leia.nextDouble();
	System.out.println("DIGITE A QUANTIDADE DE HORAS TRABALHADAS: ");
	N = leia.nextDouble();
	
	if (N<=50) 
	{
		System.out.printf("ZERAR!");
	}
	else if (N>50) 
	{
		System.out.printf("TOTAL DO SALARIO � DE: %.3f E O SALARIO EXCEDENTE � DE %.3f ",salario, E);
	}
		
	}
}
