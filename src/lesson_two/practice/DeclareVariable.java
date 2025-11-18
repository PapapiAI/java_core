package lesson_two.practice;

public class DeclareVariable {
    public static void main(String[] args) {
        byte b = 5; // 1 byte = 8 bit = 2^8 = 256 => miền giá trị [-128:127]

        short s = 500;
        // Kiểm tra MAX_VALUE của Short ???
        // Gán giá trị vượt quá MAX_VALUE ???

        int i = 5000000;

        // Khai báo kiểu long ???
//            long l = 5000000000000000;

        // Trong java hay lập trình nói chung:
        // Nhắc đến kiểu số nguyên => int
        // Nhắc đến kiểu số thực => double
        double d = 5.0;

        // Khai báo kiểu float ???
//            float f = 5.0;

        // Kết quả chia của 2 số nguyên ???
        System.out.println(3/2);
        System.out.println(19/10);

        // Làm sao để Java trả về kết quả chia theo số thực ???


        // Ép kiểu dữ liệu
        System.out.println((double) i + 7);
    }


    class Operator {
        public static void main(String[] args) {
            int a = 2;
            int b = 3;

            int sum = a + b;

            System.out.println("Tổng: " + sum);
            System.out.println("Hiệu: " + (a - b));
            System.out.println("Tích: " + (a * b));
            System.out.println("Thương: " + ((double) a / b));
            System.out.println("Chia lấy dư: " + (a % b));
        }
    }
}
