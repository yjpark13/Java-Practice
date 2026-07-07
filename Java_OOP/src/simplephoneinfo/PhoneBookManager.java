package simplephoneinfo;

public class PhoneBookManager {
    private PhoneInfo[] phoneBook;
    private int cnt;

    public PhoneBookManager() {
        phoneBook = new PhoneInfo[100];
        cnt = 0;
    }

    public void inputData() {
        System.out.println("데이터 입력을 시작합니다.");

        System.out.print("이름 : ");
        String name = MenuViewer.keyboard.nextLine();

        System.out.print("전화번호 : ");
        String phoneNumber = MenuViewer.keyboard.nextLine();

        System.out.print("생년월일 : ");
        String birthday = MenuViewer.keyboard.nextLine();

        phoneBook[cnt] = new PhoneInfo(name, phoneNumber, birthday);
        cnt++;

        System.out.println("데이터의 입력이 완료되었습니다.");
    }

    public void searchData() {
        System.out.println("데이터 검색을 시작합니다.");

        System.out.print("이름 : ");
        String name = MenuViewer.keyboard.nextLine();

        int index = searchIndex(name);

        if (index < 0) {
            System.out.println("해당 데이터가 존재하지 않습니다.");
        } else {
            phoneBook[index].showPhoneInfo();
            System.out.println("데이터의 검색이 완료되었습니다.");
        }
    }

    public void deleteData() {
        System.out.println("데이터 삭제를 시작합니다.");

        System.out.print("이름 : ");
        String name = MenuViewer.keyboard.nextLine();

        int index = searchIndex(name);

        if (index < 0) {
            System.out.println("해당 데이터가 존재하지 않습니다.");
        } else {
            for (int i = index; i < cnt - 1; i++) {
                phoneBook[i] = phoneBook[i + 1];
            }

            phoneBook[cnt - 1] = null;
            cnt--;

            System.out.println("데이터의 삭제가 완료되었습니다.");
        }
    }

    private int searchIndex(String name) {
        for (int i = 0; i < cnt; i++) {
            if (phoneBook[i].getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }
}