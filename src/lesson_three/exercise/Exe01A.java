package lesson_three.exercise;

import java.util.Scanner;

public class Exe01A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số từ 1 đến 10: ");
        int number = scanner.nextInt();

        String englishNumber;

        if (number == 1) {
            englishNumber = "One";
        } else if (number == 2) {
            englishNumber = "Two";
        } else if (number == 3) {
            englishNumber = "Three";
        } else if (number == 4) {
            englishNumber = "Four";
        } else if (number == 5) {
            englishNumber = "Five";
        } else if (number == 6) {
            englishNumber = "Six";
        } else if (number == 7) {
            englishNumber = "Seven";
        } else if (number == 8) {
            englishNumber = "Eight";
        } else if (number == 9) {
            englishNumber = "Nine";
        } else if (number == 10) {
            englishNumber = "Ten";
        } else {
            englishNumber = "Số không hợp lệ";
        }

        System.out.println("Số " + number + " viết bằng tiếng Anh là: " + englishNumber);
    }
}
