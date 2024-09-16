import java.util.Scanner;

/**
 * Aula6A
 */
public class Aula6A {

    public static void main(String[] args) {
        String[] resposta = {
            "você é o sasuke",
            "você é o minato",
            "você é a sakura",
            "você é o naruto",
            "você é kakashi",
            "você é a tenten",
            "você é o orochimaru",};
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite uma cor: ");
            switch (leitura.nextLine()) {
                case "Rosa":
                System.out.println(resposta[7]);
                break;
                case "Azul":
                System.out.println(resposta[5]);
                break;
                case "Amarelo":
                System.out.println(resposta[4]);
                break;
                case "Vermelho":
                System.out.println(resposta[2]);
                break;
                case "Verde":
                System.out.println(resposta[6]);
                break;
                case "Preto":
                System.out.println(resposta[3]);
                break;
                case "Roxo":
                System.out.println(resposta[0]);
                break;
                case "Branco":
                System.out.println(resposta[1]);
                break;
                default:
                System.out.println("Cor inválida");
                
                leitura.close();

            }
        }
}