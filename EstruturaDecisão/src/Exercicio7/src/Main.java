import java.util.Scanner;

public class Main {
    static void myMethod(int n1,int n2, int n3) {
        int maiorP = Math.max(n1,n2);
        int maiorF = Math.max(maiorP,n3);

        int menorP = Math.min(n1,n2);
        int menorF = Math.min(menorP,n3);
        System.out.println("O maior é " + maiorF + " E o menor é" + menorF);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 números");
        myMethod(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
}
