package lesson_three.exercise;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất (a): ");
        int a = scanner.nextInt();

        System.out.print("Nhập số thứ hai (b): ");
        int b = scanner.nextInt();

        // Cách 1: Sử dụng biến tạm để đảo giá trị
        int temp = a;
        a = b;
        b = temp;

        // Cách 2: không dùng biến tạm
        // Giả sử a = 2, b = 3
        a = a + b; // a = 2 + 3 = 5
        b = a - b; // b = 5 - 3 = 2
        a = a - b; // a = 5 - 2 = 3

        System.out.println("Sau khi đảo giá trị:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
