package exercicio6;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		
		 Scanner leitor = new Scanner(System.in);
		 
	        //variaveis para a realizacao dos calculos 
		 
	        int ac1, ac2, ag, af;
	        double valor1, valor2, valorg, valorf, mediafinal;
	        
	        //perguntas feitas com caixas de texto, para que o aluno informe as notas
	        
	        System.out.println("Qual foi a sua nota da AC1:");
	        ac1 = leitor.nextInt();
	        System.out.println("Qual foi a sua nota da AC2:");
	        ac2 = leitor.nextInt();
	        System.out.println("Qual foi a sua nota da AG:");
	        ag = leitor.nextInt();
	        System.out.println("Qual foi a sua nota da AF:");
	        af = leitor.nextInt();
	        
	       //calculo da nota do aluno junto ao valor base
	        
	        valor1 = (0.15 * ac1);
	        valor2 = (0.3 * ac2);
	        valorg = (0.1 * ag);
	        valorf = (0.45 * af);
	        
	       //caculo final  e demonstracao da media
	        
	        mediafinal = valor1 + valor2 + valorg + valorf;
	        System.out.println("a media final do aluno e: " + mediafinal);
	    }
	}
	