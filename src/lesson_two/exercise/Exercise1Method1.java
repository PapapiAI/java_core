package lesson_two.exercise;

import java.util.Scanner;

public class Exercise1Method1 {
    public static void main(String[] args) {
        // Bước 1: sử dụng Scanner để nhập năm sinh từ người dùng
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập năm sinh của bạn: ");
        int yearOfBirth = sc.nextInt();

        // Bước 2: Tính tuổi bằng cách trừ năm hiện tại (2025) cho năm sinh
        int age = 2025 - yearOfBirth;

        // Bước 3: in tuổi ra màn hình
        System.out.println("Tuổi của bạn là: " + age);

    }
}
