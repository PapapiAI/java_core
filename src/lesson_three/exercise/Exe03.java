package lesson_three.exercise;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập vào hai hệ số a, b của phương trình từ bàn phím.
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        if (a == 0) { // Bước 2: Kiểm tra xem hệ số a có bằng 0 không.
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else { // Bước 3: Nếu hệ số a khác 0
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
    }
}
