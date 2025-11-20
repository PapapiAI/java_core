package lesson_two.exercise;

import java.util.Scanner;

public class Exercise1Method2 {
    public static void main(String[] args) {
        // Bước 1: sử dụng Scanner để nhập năm sinh từ người dùng
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập năm sinh của bạn: ");
        int yearOfBirth = sc.nextInt();

        // Bước 2: Sử dụng java.time.Year.now() để lấy năm hiện tại
        int currentYear = java.time.Year.now().getValue() - yearOfBirth;

        // Bước 3: in tuổi ra màn hình
        int age = currentYear - yearOfBirth;

        // Bước 4: in tuổi ra màn hình
        System.out.println("Tuổi của bạn là: " + age);

    }
}
