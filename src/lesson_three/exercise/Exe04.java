package lesson_three.exercise;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập vào ba hệ số a, b, c từ bàn phím
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();


        // Bước 2: Kiểm tra giá trị của a
        if (a == 0) {
            // Phương trình trở thành phương trình bậc một
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình là x = " + x);
            }

        } else {
            // Bước 3: Tính delta (Δ)
            double delta = b * b - 4 * a * c;

            // Bước 4: Kiểm tra giá trị của delta
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Nghiệm kép của phương trình là x = " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiệm của phương trình là x1 = " + x1 + " và x2 = " + x2);
            }
        }
    }
}
