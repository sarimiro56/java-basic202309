package day07.exception;

import util.Utility;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LoginUser user = new LoginUser("abc123", "1234");

        String id = Utility.input("ID: ");
        String pw = Utility.input("PW: ");

        try {
            String result = user.validate(id, pw);
        } catch (LoginFailException e) {
//            e.printStackTrace(); // 에러 로그 출력
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {

        }

    }
}