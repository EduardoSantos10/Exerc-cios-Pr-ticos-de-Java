
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int res1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int res2 = scanner.nextInt();

        int res3 = res1 + res2;
        int res4 = res1 - res2;
        int res5 = res1 * res2;
        int res6 = res1 / res2;
        int res7 = res1 % res2;

        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);
        System.out.println(res7);

        scanner.close();
    }

}
