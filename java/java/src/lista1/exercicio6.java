package lista1;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
	
    float x1, x2;
    float y1, y2;
    float d, d1;
    	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Digite o valor de x1:");
	x1 = leitor.nextInt();
	System.out.println("Digite o valor de x2:");
	x2 = leitor.nextInt();
	System.out.println("Digite o valor de y1:");
	y1 = leitor.nextInt();
	System.out.println("Digite o valor de y2:");
	y2 = leitor.nextInt();
	
	d1=((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	System.out.printf("O VALOR DE P1 E P2 é: %f", d1);
	}
}
