programa
{
	funcao inicio()
	{
		inteiro anos = 0
		inteiro mes = 0
		inteiro dias = 0
        inteiro diasTotal = 1

        escreva("Escreva sua idade")
        leia (anos)
        escreva("Escreva sua idade em meses")
        leia (mes)
        escreva("Escreva sua idade em dias")
        leia (dias)
    
    
        diasTotal = (dias+(anos*365)+(mes*30))
        escreva("Sua idade em dias é: " + diasTotal)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 420; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */