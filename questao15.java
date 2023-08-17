import java.util.Scanner;
public class questao15 {
    public static void main(String[] args) {
    /* Receba a altura e o peso de uma pessoa digitados pelo usuário. Em seguida, calcule o seu índice de
       massa corporal (IMC) utilizando a fórmula: IMC = peso / (altura * altura) e exiba o resultado.         */
    Scanner sc = new Scanner(System.in);
    double altura = sc.nextDouble();
    double peso = sc.nextDouble();
    double IMC = peso / (altura*altura);
        System.out.printf("O seu IMC é: %.2f",IMC);
    }
}