import java.util.Scanner;

public class Main {
    static void myMethod(int nota1, int nota2) {

        if ( (nota1+nota2) /2 == 10) {
            System.out.println("Aprovado com Distinção");
        }
        else if ((nota1+nota2)/2 >= 7) {
            System.out.println("Aprovado");
        }
        else if ((nota1+nota2)/2 < 7 ) {
            System.out.println("Reprovado");
        }

    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite suas duas notas");
        myMethod(scanner.nextInt(), scanner.nextInt());
    }
}
