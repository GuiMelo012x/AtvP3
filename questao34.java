import java.util.Scanner;
public class questao34 {
    public static void main(String[] args) {
        // Solicite ao usuário que insira três números decimais. Em seguida, calcule e exiba a média aritmética desses números.
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double media = (n1+n2+n3) / 3;
        System.out.printf("A média é %.2f",media);
    }
}