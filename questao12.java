import java.util.Scanner;
public class questao12 {
    public static void main(String[] args) {
        // Solicite ao usuário um número inteiro e exiba se ele é par ou ímpar.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N%2 == 0){
            System.out.println("É par");
        }else
            System.out.println("É impar");
    }
}