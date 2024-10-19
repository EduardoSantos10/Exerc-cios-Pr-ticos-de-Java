
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int res1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int res2 = scanner.nextInt();

        int res3 = res1 * res2;

        System.out.println(res3);

        scanner.close();
    }
}
