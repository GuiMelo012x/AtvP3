import java.util.Scanner;
public class questao10 {
    public static void main(String[] args) {
        //Peça ao usuário que digite o seu nome e o seu sobrenome. Em seguida, exiba o nome completo invertido (sobrenome, nome).
        Scanner sc = new Scanner(System.in);
        String nomeC = sc.nextLine();
        String[] nome = nomeC.split(" ");
        String primeiro = nome[0];
        String segundo = nome[1];
        System.out.println(segundo + ", " + primeiro);
    }
}
