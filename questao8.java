import java.util.Scanner;
public class questao8 {
    public static void main(String[] args) {
        //Solicite ao usuário uma sequência de números separados por espaço e exiba quantos números foram digitados.
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String[] numeros = N.split(" ");
        System.out.println("Foram digitados " + numeros.length + " números.");
    }
}