package lesson_three.exercise;

import java.util.Scanner;

public class Exe01B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số từ 1 đến 10: ");
        int number = scanner.nextInt();

        String englishNumber;

        switch (number) {
            case 1:
                englishNumber = "One";
                break;
            case 2:
                englishNumber = "Two";
                break;
            case 3:
                englishNumber = "Three";
                break;
            case 4:
                englishNumber = "Four";
                break;
            case 5:
                englishNumber = "Five";
                break;
            case 6:
                englishNumber = "Six";
                break;
            case 7:
                englishNumber = "Seven";
                break;
            case 8:
                englishNumber = "Eight";
                break;
            case 9:
                englishNumber = "Nine";
                break;
            case 10:
                englishNumber = "Ten";
                break;
            default:
                englishNumber = "Số không hợp lệ";
                break;
        }

        System.out.println("Số " + number + " viết bằng tiếng Anh là: " + englishNumber);
    }
}
