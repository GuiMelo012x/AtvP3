import java.util.Scanner;
public class questao27 {
    public static void main(String[] args) {
        //Receba o nome de um produto digitado pelo usuário e concatene-o com o preço do produto, adicionando o símbolo de moeda da sua escolha.
        Scanner sc = new Scanner(System.in);
        String produto = sc.next();
        float preço = sc.nextFloat();
        String moeda = sc.next();
        System.out.println("Produto: " + produto);
        System.out.println("Preço: " + moeda + preço);


    }
}