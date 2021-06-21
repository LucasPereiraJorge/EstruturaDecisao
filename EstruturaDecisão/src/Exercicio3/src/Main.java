import java.util.Scanner;

public class Main {
    static void myMethod(String letra) {
        if ("f" .equalsIgnoreCase(letra)) {
            System.out.println("Sexo feminino escolhido");
        }
        else if ("m" .equalsIgnoreCase(letra)) {
            System.out.println("Sexo masculino escolhido");
        }
        else {
            System.out.println("Sexo inválido");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra : F - Feminino, M - Masculino");
        myMethod(scanner.next());
    }
}
