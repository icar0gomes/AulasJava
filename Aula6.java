import java.util.Random;
import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner leitura = new Scanner(System.in);
        final int sorteio = aleatorio.nextInt(1, 6);

        System.out.println("""
                Fala meus guri!
                Você tem 3 chances, começa com 30 pontos, firmeza?
                É nóis, tenta ai!
                """);

        System.out.println("Digite um numero:");
        int pontuacao = 30;
        int numero = leitura.nextInt();

        if (sorteio < numero) {
            pontuacao -= 10;
            System.out.println("Número digitado é maior que o número correto e você está com " + pontuacao + " pontos ");
            System.out.println("Tente de novo ");
            numero = leitura.nextInt();
            

        } else if (sorteio > numero) {
            pontuacao -= 10;
            System.out.println("Número digitado menor que o número correto e você está com " + pontuacao + " pontos ");
            System.out.println("Tente de novo ");
            numero = leitura.nextInt();
            

        } else {

            System.out.println("Você acertou " + pontuacao + " pontos ");
            leitura.close();

            return;

        }

        leitura.close();
    }
}