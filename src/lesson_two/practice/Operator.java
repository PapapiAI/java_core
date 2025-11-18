package lesson_two.practice;

public class Operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int sum = a + b;

        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));
        System.out.println("Thương: " + ((double) a / b));
        System.out.println("Chia lấy dư: " + (a % b));

        // ===== Toán tử gán =====
        int c = 100;

        // Tăng c lên 10 đơn vị
        c = c + 10;
        // Hoặc
//        c += 10;
        System.out.println("c = " + c);

        // ===== Toán tử tăng / giảm  =====
        // Toán tử ++: tăng 1 đơn vị
        // Toán tử --: giảm 1 đơn vị

        // Cách sử dụng toán tử ++ và -- được chia thành 2 loại:
        // 1. Hậu tố: được ký hiệu là "++" hoặc "--" đặt sau biến
            // Ý nghĩa: Thực hiện biểu thức gán trước => Giá trị biến thay đổi
        // 2. Tiền tố: được ký hiệu là "++" hoặc "--" đặt sau biến
            // Ý nghĩa: Giá trị thay đổi trước => Thực hiện biểu thức gán

        int x = 5;
        x++; // hậu tố
        --x; // tiền tố

        int y = 10;
        int z = y++;
        // Kết quả ???
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        int m = 10;
        int n = --m;
        // Kết quả ???
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        int k = 2;
        int l = ++k + k++;
        // Kết quả ???
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        int p = 2;
        int q = p++ + p--;
        // Kết quả ???
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
