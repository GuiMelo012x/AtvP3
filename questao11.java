import java.util.Scanner;
public class questao11 {
    public static void main(String[] args) {
        // Receba uma string digitada pelo usuário e imprima o seu tamanho (número de caracteres).
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] qtd = string.split("");
        System.out.println("o numero de caracteres dessa string é " + qtd.length);
    }
}