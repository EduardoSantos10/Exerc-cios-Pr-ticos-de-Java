public class ExercicioQuinze {

    public static void main(String[] args) {

        int num1 = 10;

        int num2 = 20;

        int trocar = 50;

        // Verificar valores de origem
        // System.out.println(num1);
        // System.out.println(num2);
        // System.out.println(trocar);

        // Realizar a troca

        num1 = num2;
        num2 = trocar;
        trocar = num1;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(trocar);

    }

}
