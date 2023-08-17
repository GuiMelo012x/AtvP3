import java.util.Scanner;
public class questao24 {
    public static void main(String[] args) {
        //Receba o nome de uma cidade do usuário e concatene-o com o nome do estado para formar uma mensagem completa, como "Você mora em [cidade], [estado].".
        Scanner sc = new Scanner(System.in);
        String cidade = sc.next();
        String estado = sc.next();
        System.out.println("Você mora em " + cidade + ", " + estado);
    }
}