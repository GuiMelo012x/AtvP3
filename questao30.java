import java.util.Scanner;
public class questao30 {
    public static void main(String[] args) {
        //Receba dois números inteiros do usuário e exiba a soma, a diferença, o produto e o quociente (divisão inteira) entre eles.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Soma: " + (a+b));
        System.out.println("Diferença: " + (a-b));
        System.out.println("Produto: " + (a*b));
        System.out.println("Quociente: " + (a/b));
    }
}