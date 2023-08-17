import java.util.Scanner;
public class questao7 {
    public static void main(String[] args) {
        //Peça ao usuário que digite seu primeiro nome e seu sobrenome separadamente. Em seguida, concatene-os em uma única string e exiba o nome completo.
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        String sobrenome = sc.next();
        System.out.println("Seu nome é " + nome + " " + sobrenome);
    }
}