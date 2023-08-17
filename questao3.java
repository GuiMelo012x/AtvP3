import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        // Receba um número inteiro do usuário e converta-o em um número decimal (float).
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float nDec = (float) n;
        System.out.println(nDec);
    }
}