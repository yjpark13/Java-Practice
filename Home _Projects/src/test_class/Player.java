package test_class;

public class Player {

    private String nickname;
    private int level;

    public Player(String nickname, int level) {

        this.nickname = nickname;
        this.level = level;
    }

    public void levelUp() {

        level++;
    }

    public void showPlayerInfo() {

        System.out.println("닉네임 : " + nickname);
        System.out.println("레벨 : " + level);
    }

    public static void main(String[] args) {

        Player p1 = new Player("용가리", 1);

        p1.levelUp();
        p1.levelUp();


        p1.showPlayerInfo();
    }
}