import java.util.Scanner;
public class questao19 {
    public static void main(String[] args) {
        //Peça ao usuário que digite a sua cidade e verifique se ela começa com a letra "S" (ou outra letra de sua escolha).
        Scanner sc = new Scanner(System.in);
        String cidade = sc.next();
        char primeira_letra = cidade.charAt(0);
        System.out.println(primeira_letra);
        if(cidade.charAt(0) == 'S'){
            System.out.println("A cidade digitada começa com S");
        }
        else
            System.out.println("A cidade não começa com S, mas sim com " + primeira_letra);
    }
}