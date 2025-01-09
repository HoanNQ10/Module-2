import java.util.Scanner;
import java.util.Locale;

public class Tinh_chi_so_can_nang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double weight, height, bmi;

        System.out.println("Your weight (in kilograms): ");
        weight = scanner.nextDouble();

        System.out.println("Your height (in meters): ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.println("Your bmi is: " + bmi);

        if (bmi < 18) {
            System.out.println("You are underweight");
        } else if (bmi < 25) {
            System.out.println("You are normal");
        } else if (bmi < 30) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese");
        }

    }
}
