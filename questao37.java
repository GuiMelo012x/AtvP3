import java.util.Scanner;
public class questao37 {
    public static void main(String[] args) {
        // Solicite ao usuário para digitar um número decimal e arredonde-o para o inteiro mais próximo.
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        int arredondado = (int) Math.round(n);
        System.out.println("O numero arredondado para o inteiro mais próximo é " + arredondado);
    }
}