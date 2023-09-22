package day09.io.stream;

import java.io.FileInputStream;

public class FileInputExample {

    public static void main(String[] args) {

        String path = "/Users/superstar/Desktop/develop/java-study202309/src/day03/member/MemberRepository.java";

        try (FileInputStream fis = new FileInputStream(path)) {

            int data = 0;
            while (data != -1) {
                data = fis.read();

                // 아스키 출력 담당
                System.out.write(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}