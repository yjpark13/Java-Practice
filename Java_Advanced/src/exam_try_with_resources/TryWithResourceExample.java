package exam_try_with_resources;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {

    public static void main(String[] args) {

        FileReader reader = null;

        try {
            reader = new FileReader("file.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
        } finally {
            if (reader != null) {
                try {
                    reader.close();

                } catch (IOException e) {
                    System.out.println("파일을 닫는 중 오류가 발생했습니다.");
                }
            }
        }
    }
}