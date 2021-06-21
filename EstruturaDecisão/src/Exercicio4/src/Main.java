import java.util.Scanner;

public class Main {
    static void myMethod(String letra) {
        switch (letra) {
            case "A", "a":
            case "E", "e":
            case "I","i":
            case "O","o":
            case "U","u":
                System.out.println("Vogal" + letra);
                break;
            default:
                System.out.println("Consoante" + letra);
        }

    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite uma letra");
        myMethod(scanner.next());
    }
}
