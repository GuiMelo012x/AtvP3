import java.util.Scanner;
public class questao20 {
    public static void main(String[] args) {
        // Solicite ao usuário que insira dois números decimais e calcule o resto da divisão entre eles.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int resto = a%b;
        if(resto == 0){
            System.out.println("A divisão não tem resto");
        }
        else
            System.out.println("O resto da divisão é " + resto);
    }
}