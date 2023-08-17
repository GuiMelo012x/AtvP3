import java.util.Scanner;
public class questao33 {
    public static void main(String[] args) {
        // Receba a base e a altura de um retângulo digitados pelo usuário. Em seguida, calcule e exiba o perímetro do retângulo.
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double altura = sc.nextDouble();
        double perimetro = 2 * (base+altura);
        System.out.printf("O perímetro do retângulo é %.2f", perimetro);
    }
}