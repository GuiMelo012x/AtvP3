import java.util.Scanner;
public class questao36 {
    public static void main(String[] args) {
        //Receba um valor em reais e a cotação do dólar digitados pelo usuário. Em seguida, converta o valor para dólares e exiba o resultado.
        Scanner sc = new Scanner(System.in);
        double reais = sc.nextDouble();
        double cotaçãoD = 4.98;
        double dolar = reais*cotaçãoD;
        System.out.printf("O valor da conversão é de U$ %.2f dólares",dolar);
    }
}