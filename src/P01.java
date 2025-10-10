import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, dobro;


        System.out.println("Escolha o numero que vai ser dobrado: ");
        n1 = sc.nextInt();


        dobro = n1 * 2;


        System.out.println("O dobro de " + n1 + " é " + dobro);

        sc.close();
    }
}