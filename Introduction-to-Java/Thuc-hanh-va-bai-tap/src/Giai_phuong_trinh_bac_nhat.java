import java.util.Scanner;

public class Giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất ax + b = c ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập giá trị a:  ");
        double a = scanner.nextDouble();

        System.out.println("Nhập giá trị b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhập giá trị c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double x = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", x);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
