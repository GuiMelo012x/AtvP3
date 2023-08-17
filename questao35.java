import java.util.Scanner;
public class questao35 {
    public static void main(String[] args) {
        // Peça ao usuário para digitar a sua idade e, em seguida, informe quantos meses e quantos dias ele já viveu (considerando um ano com 365 dias).
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        int meses = 12 * idade;
        int dias = 365 * idade;
        System.out.println("Você tem " + idade +" anos " + "e já viveu " + meses + " meses e " + dias + " dias");
    }
}