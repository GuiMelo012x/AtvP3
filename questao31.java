import java.util.Scanner;
public class questao31 {
    public static void main(String[] args) {
        //Peça ao usuário para digitar a base e a altura de um triângulo. Em seguida, calcule e exiba a área do triângulo.
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int altura = sc.nextInt();
        int area = (base*altura)/2;
        System.out.println("A área do triângulo é " + area);
    }
}