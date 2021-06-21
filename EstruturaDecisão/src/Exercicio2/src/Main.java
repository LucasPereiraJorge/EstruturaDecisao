import java.util.Scanner;

public class Main {
    static void myMethod(int n1 ){
        if (n1 > 0) {
            System.out.println("O número é positivo");
        }
        else if (n1 <0) {
            System.out.println("O número é negativo");
        }
        else
            System.out.println(" o número é igual a 0");

    }

    public static void main(String[] args) {
        System.out.println("Digite dois números");
        Scanner sc = new Scanner(System.in);
        myMethod(sc.nextInt());
    }
}
