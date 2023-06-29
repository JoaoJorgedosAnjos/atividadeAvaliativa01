import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, contador1 = 0, contador2 = 0, contador3 = 0;
        for (int i = 1; i < 5; i++) {
            System.out.println("Digite um número: ");
            number = scanner.nextInt();

            if (number >= 0 && number <= 100) {
                contador1++;
                System.out.println("O valor do contador de 0 a 100 é: " + contador1);
            } else if (number > 100 && number <= 200) {
                contador2++;
                System.out.println("O valor do contador de 101 a 200 é: " + contador2);
            } else {
                contador3++;
                System.out.println("O valor do contador de 101 a 200 é: " + contador3);
            }

        }
        System.out.println("------------------------------------------");
        System.out.println("Número de contador de 0 a 100 é: " + contador1 + "\nNúmero de contador de 101 a 200 é: " + contador2 + "\nNúmero de contador acima de 200 é " + contador3);

    }
}
