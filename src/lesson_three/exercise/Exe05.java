package lesson_three.exercise;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập vào thâm niên công tác (TNCT) từ bàn phím
        System.out.print("Nhập thâm niên công tác (TNCT) (số tháng): ");
        int tnct = scanner.nextInt();

        // Bước 2: Đặt lương căn bản là 650000 $
        double luongCanBan = 650000.0;

        // Bước 3: Xác định hệ số lương dựa vào TNCT
        double heSoLuong;
        if (tnct < 12) {
            heSoLuong = 1.92;
        } else if (tnct < 36) {
            heSoLuong = 2.34;
        } else if (tnct < 60) {
            heSoLuong = 3.0;
        } else {
            heSoLuong = 4.5;
        }

        // Bước 4: Tính lương
        double luong = heSoLuong * luongCanBan;

        // Bước 5: In ra màn hình console lương của nhân viên
        System.out.println("Lương của nhân viên là: $" + luong);
    }
}
