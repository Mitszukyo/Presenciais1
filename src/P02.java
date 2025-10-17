import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {

        int num1, num2, num3, num4, soma;
        int multiplicador;
        double media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        num3 = sc.nextInt();

        System.out.println("Digite o quarto numero: ");
        num4 = sc.nextInt();

        soma = num1 + num2 + num3 + num4;
        multiplicador = (num1 + num2) * (num3 + num4);
        media = (num1 + num2 + num3 + num4) / 4;
        System.out.println("A soma dos numeros " + num1 + " e " + num2 + " e " + num3 + " equivale a: " + soma);
        System.out.println("A multiplicaçao dos numeros " + num1 + " + " + num2 + " vezes os numeros "
                + num3 + " + " + num4 + "equivale a: " + multiplicador);
        System.out.println("A media dos valores " + num1 + " e " + num2 + " e " + num3 + " e " + num4 + " equivale a " + media);

/*
 tem que usar parenteses para definir a ordem que voce quer que seja feita antes da ordem comum
 1º	Parênteses	()	Sempre primeiro
 2º	Expoentes	 ^, ∗∗,  ​	Após Parênteses
 3º	Multiplicação e Divisão	∗,×,/,÷	Da esquerda para a direita
 4º	Adição e Subtração	+,−	Da esquerda para a direita
* */



    }
}
