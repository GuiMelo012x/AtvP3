import java.util.Scanner;
public class questao22 {
    public static void main(String[] args) {
        //Receba uma string contendo um número inteiro e some 10 a esse número, convertendo-o novamente para uma string antes de exibi-lo.
        Scanner sc = new Scanner(System.in);
        String numeroStr = sc.next();
        int numeroInt = Integer.parseInt(numeroStr);
        int soma = numeroInt + 10;
        String printNumero = Integer.toString(soma);


        System.out.println(printNumero);
    }
}