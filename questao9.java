import java.util.Scanner;
public class questao9 {
    public static void main(String[] args) {
        //Receba o nome de um animal digitado pelo usuário e exiba uma mensagem informando qual animal foi digitado.
        Scanner sc = new Scanner(System.in);
        String animal = sc.next();
        System.out.println("O animal digitado foi " + animal + ".");

    }
}