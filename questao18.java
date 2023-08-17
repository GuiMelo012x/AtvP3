import java.util.Scanner;
public class questao18 {
    public static void main(String[] args) {
        //Receba a base e a altura de um retângulo digitados pelo usuário. Em seguida, calcule a sua área e exiba o resultado.
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int altura = sc.nextInt();
        int area = base * altura;
        System.out.println("A área do retângulo é " + area);
    }
}