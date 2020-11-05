programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	    /*Elabore um programa que leia o peso e a altura de um adulto 
	     * e mostre sua condição de acordo com a tabela abaixo.
		*IMC em adultos Condição
		*Abaixo de 18,5 Abaixo do peso
		*Entre 18,5 e 25 Peso normal
		*Entre 25 e 30 Acima do peso	
		*Acima de 30 obeso
		*/

	{
		cadeia nome
		real peso
		real altura
		real IMC
		escreva ("DIGITE SEU NOME: ")
		leia(nome)
		escreva("DIGITE SEU PESO: ")
		leia(peso)
		escreva("DIGITE SUA ALTURA: ")
		leia(altura)
		
		IMC = mat.arredondar((mat.potencia((peso/altura),2)),2)
		
		se(IMC<=18.5)
	     {
			escreva("\nABAIXO DO PESO")
			{
	          enquanto(IMC>18.5 e IMC<25)
				{
				escreva("\nPESO NORMAL")
				}
	   			se(IMC>=25 e IMC<30)
				{
				escreva("\nACIMA DO PESO ")
				}
	   			senao se(IMC>30)
				{
				escreva("OBESO")
				}
		
	    		}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 882; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */