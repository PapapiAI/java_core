package lesson_three.practice;

import java.util.Scanner;

public class ConditionalStatement03 {
    public static void main(String[] args) {
        // Câu lệnh điều kiện cho phép thực thi một khối lệnh nào đó
        // dựa trên giá trị đúng hoặc sai của một biểu thức điều kiện

        /*
        Xếp loại học viên:
        Điểm < 5: Yếu
        Điểm >= 5: Khá
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm: ");
        double score = scanner.nextDouble();

        // Cách 1: Câu điều kiện thiếu
        if (score < 5) {
            System.out.println("Yếu");
        }

        if (score >= 5) {
            System.out.println("Khá");
        }

        // Cách 2: Câu điều kiện đủ
        if (score < 5) {
            System.out.println("Yếu");
        } else {
            System.out.println("Khá");
        }

        /// Vậy cách nào tối ưu hơn ???



        /*
        Xếp loại học viên:
        Điểm < 5: Yếu
        Điểm >= 5 và điểm < 8: Khá
        Điểm >= 8: Tốt
         */

        if (score < 5) {
            System.out.println("Yếu");
        } else if (score < 8) {
            System.out.println("Khá");
        } else {
            System.out.println("Tốt");
        }
    }
}
