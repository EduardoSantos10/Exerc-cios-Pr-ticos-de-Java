
import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        double raio = 0;
        double area = 0;
        double PI = 3.1416;

        System.out.println("Escreva o valor de raio: ");

        Scanner scanner = new Scanner(System.in);
        raio = scanner.nextFloat();
        area = scanner.nextFloat();

        area = PI * (raio * raio);

        System.out.println("O valor da area é " + area);
        System.out.println(area);
        scanner.close();
    }
}
