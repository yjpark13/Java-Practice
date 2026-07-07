package exam_05_28;

import java.util.Scanner;
import java.util.ArrayList;

public class Exam_04 {
    private String ip;
    private String user;

    public Exam_04() {}

    public Exam_04(String ip, String user) {

        this.ip = ip;
        this.user = user;

    }

    public String getIp() {

        return ip;

    }

    public void setIp(String ip) {

        this.ip = ip;

    }

    public String getUser() {

        return user;

    }

    public void setUser(String user) {

        this.user = user;

    }

    public String inform() {

        return ip + "/" + user;

    }
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Exam_04> ipInfoList = new ArrayList<>();

        ipInfoList.add(new Exam_04("123.123.123.123", "홍길동"));

        ipInfoList.add(new Exam_04("127.0.0.1", "hi"));

        ipInfoList.add(new Exam_04("117.233.111.222", "고길순"));

        System.out.print("ip 입력 : ");

        String input = sc.next();

        Exam_04 result = null;

        for (int i = 0; i < ipInfoList.size(); i++) {

            Exam_04 info = ipInfoList.get(i);

            String ip = info.getIp();

            if (input.equals(ip)) {

                result = info;

            }

        }

        if (result != null) {

            System.out.println(result.inform());

        } else {

            System.out.println("일치하는 ip 사용자가 없습니다.");


        }
    }
}



