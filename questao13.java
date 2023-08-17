import java.util.Scanner;
public class questao13 {
    public static void main(String[] args) {
        // Receba um número inteiro digitado pelo usuário e verifique se ele é positivo ou negativo.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N>0){
            System.out.println("É positivo");
        }else
            System.out.println("É negativo");
    }
}