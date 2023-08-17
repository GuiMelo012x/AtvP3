import java.util.Scanner;
public class questao5 {
    public static void main(String[] args) {
    //Receba um número decimal do usuário e calcule o seu quadrado.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("O quadrado do número é " + n*n);
    }
}