import java.util.Scanner;

public class Aula2{
    public static void main(String[] args){
        System.out.println("Escreva cinco nomes");
        Scanner leitorTxt = new Scanner(System.in);
        System.out.println("Digite os: \n");
        String nome = leitorTxt.nextLine();
        System.out.println(nome);
        leitorTxt.close();
    
    }
}