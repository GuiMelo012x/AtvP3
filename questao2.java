import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {
        // Peça ao usuário que digite sua idade em texto (por exemplo, "18") e converta-a em um número inteiro.
        Scanner sc = new Scanner(System.in);
        String idade = "18";
        int number = Integer.parseInt(idade);
        System.out.println(number);
    }
}