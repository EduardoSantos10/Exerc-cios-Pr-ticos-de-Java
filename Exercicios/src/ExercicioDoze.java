
import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num1 = scanner.nextInt();

        System.out.println("Informe um número: ");
        int num2 = scanner.nextInt();

        System.out.println("Informe um número: ");
        int num3 = scanner.nextInt();

        double media = ((num1 + num2 + num3) / 3);

        System.out.println(media);

        scanner.close();
    }
}
