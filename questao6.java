import java.util.Scanner;
public class questao6 {
    public static void main(String[] args) {
        // Peça ao usuário que insira o seu ano de nascimento e, em seguida, exiba a sua idade.
        Scanner sc = new Scanner(System.in);
        int ano = sc.nextInt();
        int idade =  2023 - ano;
        System.out.println("Você nasceu no ano " + ano + " e tem " + idade + " anos.");
    }
}