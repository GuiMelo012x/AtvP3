import java.util.Scanner;
public class questao14 {
    public static void main(String[] args) {
        //Peça ao usuário que insira dois números e exiba o maior deles.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.println(a + " é maior");
        }else
            System.out.println(b + " é maior");
    }
}