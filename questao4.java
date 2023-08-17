import java.util.Scanner;
public class questao4 {
    public static void main(String[] args) {
        //Peça ao usuário para digitar dois números inteiros e exiba a soma deles.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}