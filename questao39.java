import java.util.Scanner;
public class questao39 {
    public static void main(String[] args) {
        //Peça ao usuário que digite uma temperatura em graus Celsius e a converta para Fahrenheit usando a fórmula: Fahrenheit = (Celsius * 9/5) + 32.
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("A conversão de " + celsius + " °C" + " para Fahrenheit é de " + fahrenheit + " °F");
    }
}