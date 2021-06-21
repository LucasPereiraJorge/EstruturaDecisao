import java.util.Scanner;

public class Main {
    static void myMethod(String turno) {
        if ("m" .equalsIgnoreCase(turno)) {
            System.out.println("Bom dia!!");
        }else if ("V" .equalsIgnoreCase(turno)) {
            System.out.println("Boa tarde!!");
        }else if ("N" .equalsIgnoreCase(turno)) {
            System.out.println("Boa noite!!");
        }else {
            System.out.println("Turno inválido");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu turno : M-matutino ou V-Vespertino ou N- Noturno");
        myMethod(scanner.next());
    }
}
