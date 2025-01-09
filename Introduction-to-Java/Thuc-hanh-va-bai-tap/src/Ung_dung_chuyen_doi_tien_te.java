import java.util.Scanner;

public class Ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;

        System.out.println("Nhập số tiền USD: ");
        usd = scanner.nextDouble();
        double change = usd * 23000;
        System.out.println("Giá trị VND: " + change);


    }
}
