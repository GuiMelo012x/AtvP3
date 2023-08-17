import java.util.Scanner;
public class questao26 {
    public static void main(String[] args) {
        //Receba um número inteiro e uma string do usuário. Em seguida, concatene-os em uma única string, separando-os com um espaço.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        String c = a + " " + b;
        System.out.println(c);
    }
}