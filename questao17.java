import java.util.Scanner;
public class questao17 {
    public static void main(String[] args) {
        //Solicite ao usuário que insira o seu estado civil e exiba uma mensagem apropriada (por exemplo: "Você é casado(a)", "Você é solteiro(a)", etc.).
        Scanner sc = new Scanner(System.in);
        String estadoC = sc.next();
        System.out.println("Você é " + estadoC);
    }
}