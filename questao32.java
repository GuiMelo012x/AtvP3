import java.util.Scanner;
public class questao32 {
    public static void main(String[] args) {
        // Receba o raio de uma circunferência digitado pelo usuário e calcule o seu perímetro (2 * π * raio).
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextInt();
        double perimetro = 2 * 3.14 * raio;
        System.out.printf("O perímetro é %.2f", perimetro);
    }
}