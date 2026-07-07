package exam_throws;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionMethod2 {
    public static void main(String[] args) {
        fileWrite();
        System.out.println();
    }

    public static void fileWrite() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("hello.txt");
            fw.write("java");
            System
                    .out.println("파일 저장이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 문제가 발생했습니다.");
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            }catch (IOException e) {
                System.out.println("파일을 닫는 중 문제가 발생했습니다.");
            }
        }
    }
}
