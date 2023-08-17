import java.util.Scanner;
public class questao16 {
    public static void main(String[] args) {
        // Peça ao usuário que digite o seu nome e verifique se ele contém mais de 5 caracteres.
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        String[] qtd = nome.split("");
        if(qtd.length > 5){
            System.out.println("O nome contém mais de 5 caracteres");
        }else
            System.out.println("O nome contém menos de 5 caracteres");
        System.out.println("Quantidade de caracteres: " + qtd.length);
    }
}