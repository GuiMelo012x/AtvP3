import java.util.Scanner;
public class questao21 {
    public static void main(String[] args) {
        //Solicite ao usuário um número decimal e converta-o em um número inteiro.
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        int nInt = (int) N;
        System.out.println(nInt);
    }
}