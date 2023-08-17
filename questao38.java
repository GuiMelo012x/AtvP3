import java.util.Scanner;
public class questao38 {
    public static void main(String[] args) {
        //Receba três números inteiros digitados pelo usuário e exiba o resultado da operação (n1 + n2) * n3.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println( (n1+n2) * n3);
    }
}