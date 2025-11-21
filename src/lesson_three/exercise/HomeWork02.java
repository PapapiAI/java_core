package lesson_three.exercise;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();

        if (day < 1 || day > 31) {
            System.out.println("Ngày không hợp lệ");
            return; // Kết thúc phương thức main => Dừng chương trình
        }

        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Tháng không hợp lệ");
            return; // Kết thúc phương thức main => Dừng chương trình
        }

        // Những tháng có 30 ngày
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 31) {
                System.out.println("Ngày không hợp lệ");
                return; // Kết thúc phương thức main => Dừng chương trình
            }
        }

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        // Kiểm tra năm nhuận, năm nhuận tháng 2 có 29 ngày
        // Năm nhuận là năm: chia hết cho 4 nhưng không chia hết cho 100 hoặc chia hết cho 400
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (month == 2) {
            if (isLeapYear) {
                if (day > 29) {
                    System.out.println("Ngày không hợp lệ");
                    return; // Kết thúc phương thức main => Dừng chương trình
                }
            } else {
                if (day > 28) {
                    System.out.println("Ngày không hợp lệ");
                    return; // Kết thúc phương thức main => Dừng chương trình
                }
            }
        }

        System.out.println("Ngày hợp lệ!");

        // ============= Tìm ngày kế tiếp ==================
        int nextDay = day;   // Tạo ra biến tạm để không ảnh hưởng đến ngày gốc
        int nextMonth = month;
        int nextYear = year;

        // Trường hợp ngày kế tiếp
        nextDay++;

        // Trường hợp qua tháng mới
        if (nextDay > 31 // Những tháng 31 ngày
                || (month == 2 && nextDay > (isLeapYear ? 29 : 28)) // Tháng 2
                || ((month == 4 || month == 6 || month == 9 || month == 11) && nextDay > 30)) {
            nextDay = 1;
            nextMonth++;
        }

        // Trường hợp qua năm mới
        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }

        System.out.printf("Ngày kế tiếp: %d/%d/%d%n", nextDay, nextMonth, nextYear);

        // ============= Tìm ngày trước đó ==================
        int previousDay = day;
        int previousMonth = month;
        int previousYear = year;

        // Trường hợp ngày trước đó
        previousDay--;

        if (previousDay < 1) { // Trường hợp tháng trước đó
            previousMonth--;
            if (previousMonth < 1) { // Trường hợp năm trước đó
                previousMonth = 12;
                previousYear--;
            }

            // Cập nhật ngày cho trường hợp tháng là 30 ngày
            if (previousMonth == 4 || previousMonth == 6 || previousMonth == 9 || previousMonth == 11) {
                previousDay = 30;
            } else if (previousMonth == 2) { // Cập nhật ngày cho trường hợp tháng 2
                if (isLeapYear) {
                    previousDay = 29;
                } else {
                    previousDay = 28;
                }
            } else { // Cập nhật ngày cho trường hợp tháng là 31 ngày
                previousDay = 31;
            }
        }

        System.out.println();
        System.out.printf("Ngày trước đó: %d/%d/%d%n", previousDay, previousMonth, previousYear);
    }
}
