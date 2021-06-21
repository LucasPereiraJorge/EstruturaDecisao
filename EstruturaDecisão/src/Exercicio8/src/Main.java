import java.util.Scanner;

public class Main {
    static void myMethod(float prod1, float prod2, float prod3) {

        float produtoBarato = Math.min(prod1,prod2);
        float produtoFinal = Math.min(produtoBarato,prod3);
        System.out.println("O produto mais barato é " + produtoFinal);

    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite o valor dos 3 produtos");
        myMethod(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
    }
}
