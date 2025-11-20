package lesson_three.practice;

public class TernaryOperator03 {
    public static void main(String[] args) {
        // Toán tử 3 ngôi cung cấp một cách ngắn gọn để viết một câu lệnh if-else

        // biến = <điều kiện> ? <biểu thức 1> : <biểu thức 2>


        // Tìm max của 2 số a, b
        int a = 3;
        int b = 2;

        int max;

        // Cách 1: if-else => tốn nhiều dòng
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("max=" + max);

        // Cách 2: toán tử 3 ngôi
        max = a > b ? a : b;
        System.out.println("max=" + max);

        int min = a > b ? b : a;
        System.out.println("min=" + min);
    }
}
