import java.util.Scanner;

public class Ung_dung_doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số cần đọc: ");
        int numbers = scanner.nextInt();

        if (numbers >= 0 && numbers < 10) {
            switch (numbers) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Out of ability");
                    break;
            }
        } else if (numbers >= 10 && numbers < 20) {
            switch (numbers) {
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
                default:
                    System.out.println("Out of ability");
                    break;
            }
        } else if (numbers >= 20 && numbers < 100) {
            int tens = numbers / 10;
            int units = numbers % 10;
            switch (tens) {
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }
            if (units != 0) {
                System.out.print(" ");
                switch (units) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
        } else if (numbers >= 100 && numbers < 1000) {
            int hundreds = numbers / 100;
            int tensAndUnits = numbers % 100;
            switch (hundreds) {
                case 1:
                    System.out.print("One Hundred");
                    break;
                case 2:
                    System.out.print("Two Hundred");
                    break;
                case 3:
                    System.out.print("Three Hundred");
                    break;
                case 4:
                    System.out.print("Four Hundred");
                    break;
                case 5:
                    System.out.print("Five Hundred");
                    break;
                case 6:
                    System.out.print("Six Hundred");
                    break;
                case 7:
                    System.out.print("Seven Hundred");
                    break;
                case 8:
                    System.out.print("Eight Hundred");
                    break;
                case 9:
                    System.out.print("Nine Hundred");
                    break;
            }
            if (tensAndUnits != 0) {
                System.out.print(" and ");
                if (tensAndUnits < 10) {
                    switch (tensAndUnits) {
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }
                } else if (tensAndUnits < 20) {
                    switch (tensAndUnits) {
                        case 10:
                            System.out.println("Ten");
                            break;
                        case 11:
                            System.out.println("Eleven");
                            break;
                        case 12:
                            System.out.println("Twelve");
                            break;
                        case 13:
                            System.out.println("Thirteen");
                            break;
                        case 14:
                            System.out.println("Fourteen");
                            break;
                        case 15:
                            System.out.println("Fifteen");
                            break;
                        case 16:
                            System.out.println("Sixteen");
                            break;
                        case 17:
                            System.out.println("Seventeen");
                            break;
                        case 18:
                            System.out.println("Eighteen");
                            break;
                        case 19:
                            System.out.println("Nineteen");
                            break;
                    }
                } else {
                    int tens = tensAndUnits / 10;
                    int units = tensAndUnits % 10;
                    switch (tens) {
                        case 2:
                            System.out.print("Twenty");
                            break;
                        case 3:
                            System.out.print("Thirty");
                            break;
                        case 4:
                            System.out.print("Forty");
                            break;
                        case 5:
                            System.out.print("Fifty");
                            break;
                        case 6:
                            System.out.print("Sixty");
                            break;
                        case 7:
                            System.out.print("Seventy");
                            break;
                        case 8:
                            System.out.print("Eighty");
                            break;
                        case 9:
                            System.out.print("Ninety");
                            break;
                    }
                    if (units != 0) {
                        System.out.print(" ");
                        switch (units) {
                            case 1:
                                System.out.println("One");
                                break;
                            case 2:
                                System.out.println("Two");
                                break;
                            case 3:
                                System.out.println("Three");
                                break;
                            case 4:
                                System.out.println("Four");
                                break;
                            case 5:
                                System.out.println("Five");
                                break;
                            case 6:
                                System.out.println("Six");
                                break;
                            case 7:
                                System.out.println("Seven");
                                break;
                            case 8:
                                System.out.println("Eight");
                                break;
                            case 9:
                                System.out.println("Nine");
                                break;
                        }
                    }
                }
            }
        }
    }
}


