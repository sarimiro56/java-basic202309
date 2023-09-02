package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] fruits = {};

        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        while (true) {
            String name = sc.next();
            for (int i = 0; i < fruits.length; i++) {
                fruits[i] = name;
                System.out.println(Arrays.toString(fruits));
            }
            if (name.equals("stop")) {
//                System.out.println("먹고 싶은 음식리스트: " + Arrays.toString(fruits));
                break;
            }
        }
        System.out.println("먹고 싶은 음식리스트: " + Arrays.toString(fruits));
    }
}
