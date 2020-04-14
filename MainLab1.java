import java.util.InputMismatchException;
import java.util.Scanner;

public class MainLab1 {
    public static void main(String[] args) {
        Calculating calc;

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");

        try {
            double n = in.nextDouble();
            calc = new Calculating(n);
            System.out.printf("Formula 1: %.3f\nFormula 2: %.3f\nFormula 3: %.3f\nFormula 4: %.3f", calc.formula1(), calc.formula2(), calc.formula3(), calc.formula4());
        } catch (Except | InputMismatchException e) {
            System.out.println(e);
        }
    }
}
