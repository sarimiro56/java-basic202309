package day07.exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsPractice {

    // 정수를 입력받아서 리턴하는 메서드
    public int inputNumber() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    // 문자열을 정수로 변환하는 기능
    public int convert(String s) throws NumberFormatException {
        int n = Integer.parseInt(s);
        return n;
    }

    public int inputAndConvertNumber() {
        int n = 0;
        int m = 0;
        try {
            n = inputNumber();
            m = convert("100");
        } catch (InputMismatchException e) {
            System.out.println("정수로만 입력하세요");
        } catch (NumberFormatException e) {
            System.out.println("숫자형태의 문자를 전달하세요");
        }

        return n + m;
    }

}