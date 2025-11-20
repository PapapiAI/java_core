package lesson_three.exercise;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập vào một ký tự từ bàn phím
        System.out.print("Nhập một ký tự chữ cái: ");
        char character = scanner.next().charAt(0);

        // Bước 2: Kiểm tra xem ký tự nhập vào có phải là chữ cái không
        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
            // Bước 3: Đổi chữ hoa thành chữ thường và ngược lại
            if (character >= 'a' && character <= 'z') {
                // Đổi chữ thường thành chữ hoa
                character -= 32;
            } else {
                // Đổi chữ hoa thành chữ thường
                character += 32;
            }

            // Bước 4: In ra màn hình console ký tự sau khi đã đổi
            System.out.println("Ký tự sau khi đã đổi: " + character);
        } else {
            System.out.println("Bạn đã nhập sai. Hãy nhập một ký tự chữ cái.");
        }
    }
}
