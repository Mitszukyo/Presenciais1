import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {

        int num1, num2, num3;
        int soma;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        num3 = sc.nextInt();

        soma = num1 + num2 + num3;
        System.out.println("A soma dos numeros " + num1 + " e " + num2 + " e " + num3 + " equivale a: " + soma);





    }
}
