package lesson_three.exercise;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập vào tháng và năm từ bàn phím
        System.out.print("Nhập tháng (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        // Bước 2: Xác định số ngày trong tháng
        int daysInMonth;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                // Năm nhuận: Chia hết cho 4 nhưng không chia hết cho 100, hoặc năm chia hết cho 400
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Năm nhuận
                } else {
                    daysInMonth = 28; // Năm không nhuận
                }
                break;
            default:
                daysInMonth = 31;
                break;
        }

        // Bước 3: In ra màn hình console số ngày trong tháng
        System.out.printf("Số ngày trong tháng %d năm %d là %d ngày.", month, year, daysInMonth);
    }
}
