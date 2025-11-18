package lesson_two.practice;

public class PrintInfo {
    public static void main(String[] args) {
        System.out.print("hello");
        System.out.print("hello");
        System.out.print("hello");
        System.out.print("hello");
        System.out.print("hello");

        int a = 2;
        int b = 3;
        // Muốn in ra console: 2 + 3 = 5
        System.out.println(a + " + " + b + " = " + (a + b)); // khá rối rắm

        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}
