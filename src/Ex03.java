import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, contador = 0;
        for (int i = 1; i < 20; i++) {
            System.out.println("Digite um número: ");
            number1 = scanner.nextInt();
            if (number1 > 8) {
                contador++;
            }
        }
        System.out.println("O número de números maior que 8 é: " + contador);
    }
}
