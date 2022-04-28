import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //variaveis para a realizacao dos calculos 
        int ac1, ac2, ag, af;
        double peso1, peso2, pesog, pesof, mediafinal;
        //perguntas para informar as notas
        System.out.println("Qual foi a sua nota da AC1:");
        ac1 = leitor.nextInt();
        System.out.println("Qual foi a sua nota da AC2:");
        ac2 = leitor.nextInt();
        System.out.println("Qual foi a sua nota da AG:");
        ag = leitor.nextInt();
        System.out.println("Qual foi a sua nota da AF:");
        af = leitor.nextInt();
       //calculo da nota do aluno junto ao numero base
        peso1 = (0.15 * ac1);
        peso2 = (0.3 * ac2);
        pesog = (0.1 * ag);
        pesof = (0.45 * af);
       //caculo final e demonstracao da media
        mediafinal = peso1 + peso2 + pesog + pesof;
        System.out.println("a media final do aluno e: " + mediafinal);
    }
}