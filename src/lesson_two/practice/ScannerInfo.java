package lesson_two.practice;

import java.util.Scanner;

public class ScannerInfo {
    public static void main(String[] args) {
        // Ngoài kiểu dữ liệu nguyên thủy đều cần new để tạo đối tượng
        Scanner sc = new Scanner(System.in); // System.in là tiêu chuẩn để nhận input từ bàn phím

        System.out.print("Nhập vào a: ");
        int a = sc.nextInt(); // Chờ người dùng nhập dữ liệu từ bàn phím
        System.out.println("a = " + a);

        // Nhập chuỗi
        System.out.print("Nhập vào tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập vào điểm: ");
        double score = sc.nextLong();

        System.out.println("Tên của bạn là: " + name);
        System.out.println("Điểm của bạn là: " + score);
    }
}
