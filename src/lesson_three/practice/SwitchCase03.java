package lesson_three.practice;

import java.util.Scanner;

public class SwitchCase03 {
    public static void main(String[] args) {
        // Được sử dụng khi cần thực thi một trong nhiều khối lệnh
        // dựa trên giá trị của một biến hoặc biểu thức

        // Nhập vào một số từ 2 đến 8 và xuất ra thứ của tuần tương ứng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();


        // Cách 1: if-else
        if (day == 2) {
            System.out.println("Thứ 2");
        } else if (day == 3) {
            System.out.println("Thứ 3");
        } else if (day == 4) {
            System.out.println("Thứ 4");
        } else if (day == 5) {
            System.out.println("Thứ 5");
        } else if (day == 6) {
            System.out.println("Thứ 6");
        } else if (day == 7) {
            System.out.println("Thứ 7");
        } else if (day == 8) {
            System.out.println("Chủ Nhật");
        } else {
            System.out.println("Ngày không hợp lệ");
        }

        // Cách 2: Switch case => CHỈ sử dụng so sánh bằng hoặc khác
        // Demo KHÔNG có break => chạy tất cả case thỏa mãn
        // break; => câu lệnh nhảy
        switch (day) {
            case 2:
                System.out.println("thứ 2");
                break;
            case 3:
                System.out.println("thứ 3");
                break;
            case 4:
                System.out.println("thứ 4");
                break;
            case 5:
                System.out.println("thứ 5");
                break;
            case 6:
                System.out.println("thứ 6");
                break;
            case 7:
                System.out.println("thứ 7");
                break;
            case 8:
                System.out.println("Chủ Nhật");
                break;
            default:
                System.out.println("Ngày không hợp lệ");
        }
    }
}
