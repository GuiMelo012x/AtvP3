import java.util.Scanner;
public class questao25 {
    public static void main(String[] args) {
        //Solicite ao usuário que insira seu ano de nascimento e concatene-o com uma mensagem de boas-vindas, como "Bem-vindo ao nosso programa, nascido em [ano de nascimento]!".
        Scanner sc = new Scanner(System.in);
        String ano = sc.next();
        System.out.println("Bem-vindo ao nosso programa, nascido em " + ano);
    }
}