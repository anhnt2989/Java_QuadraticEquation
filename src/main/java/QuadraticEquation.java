import java.util.Scanner;


public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Solve quadratic equation with form : ax^2 + bx + c = 0");

        System.out.println("Enter a: ");
        double a = input.nextDouble();

        System.out.println("Enter b: ");
        double b = input.nextDouble();

        System.out.println("Enter c: ");
        double c = input.nextDouble();

        Account quadraticEquation = new Account(a, b, c);

        System.out.println(quadraticEquation.solveQE());

    }
}
