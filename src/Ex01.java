import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int number = 10, sum, number1 = 0;
        Scanner scanner = new Scanner(System.in);
        while (number != -1) {
            System.out.println("Digite um número: ");
            number = scanner.nextInt();
            if (number >= 0) {
                sum = number1 += number;
                System.out.println("valor da soma = " + sum);
                System.out.println(number);
            } else {
                break;
            }
        }
    }
}
