import java.util.Scanner;
public class questao28 {
    public static void main(String[] args) {
        // Receba um número inteiro do usuário e concatene-o com uma mensagem, informando o dobro desse número.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * 2;
        System.out.println("O dobro do numero digitado é " + n);
    }
}