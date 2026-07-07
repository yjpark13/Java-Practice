package exam_05_28;

public class Exam {
    private String ip;
    private String user;

    public Exam() {}
    public Exam(String ip, String user) {
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
        return ip + "(" + user + ")";
    }

    public static void main(String[] args) {
        Exam[] ii = new Exam[3];
        ii[0] = new Exam("123.541", "홍길동");
        ii[1] = new Exam("123123.123", "hi");
        ii[2] = new Exam("123123.123", "bye");

        for (int i = 0; i < ii.length; i++) {
            System.out.println("ip : " + ii[i].inform());
        }
    }
}
