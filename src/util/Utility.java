package util;

import java.util.Scanner;

public class Utility {
    // 입력 기능 유틸성 메서드
    static Scanner sc = new Scanner(System.in);

    public static void makeLine() {
        System.out.println("=====================");
    }
    // 문자열을 입력받는 기능
    public static String input(String message) {
        System.out.println(message);
        return sc.nextLine();
    }
}
