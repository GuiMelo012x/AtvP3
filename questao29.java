import java.util.Scanner;
public class questao29 {
    public static void main(String[] args) {
        //Receba uma string contendo um endereço de e-mail e concatene-a com uma mensagem de agradecimento personalizada.
        Scanner sc = new Scanner(System.in);
        String mensagem = "obrigado pelo convite,";
        String email = "guilherme.melo@outlook.com";
        System.out.println( mensagem + " " + email);
    }
}