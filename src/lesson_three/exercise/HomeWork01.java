package lesson_three.exercise;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập một số nguyên dương x từ bàn phím.
        System.out.print("Nhập một số nguyên dương x: ");
        int x = scanner.nextInt();


        // Bước 2: Tính căn bậc hai của x
        double squareRoot = Math.sqrt(x);

        // Bước 3: Kiểm tra nếu squareRoot là số nguyên (có phần thập phân bằng 0, tức squareRoot % 1 == 0)
        if (squareRoot % 1 == 0) {
            System.out.println(x + " là số chính phương");
        } else {
            System.out.println(x + " không phải là số chính phương");
        }
    }
}
