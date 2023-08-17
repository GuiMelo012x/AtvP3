import java.util.Scanner;
public class questao23 {
    public static void main(String[] args) {
        //Solicite ao usuário que digite uma data no formato "dd/mm/aaaa" e extraia o dia, o mês e o ano separadamente, convertendo-os em números inteiros.
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        String[] barra = data.split("/");
        int dia = Integer.parseInt(barra[0]);
        int mes = Integer.parseInt(barra[1]);
        int ano = Integer.parseInt(barra[2]);
        System.out.println("Nasceu no dia " + dia + ", no mês " + mes + ", do ano de " + ano);
    }
}