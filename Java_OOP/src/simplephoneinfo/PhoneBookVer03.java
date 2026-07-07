package simplephoneinfo;

public class PhoneBookVer03 {
    public static void main(String[] args) {
        PhoneBookManager manager = new PhoneBookManager();

        while (true) {
            MenuViewer.showMenu();

            int choice = MenuViewer.keyboard.nextInt();
            MenuViewer.keyboard.nextLine();

            switch (choice) {
                case 1 -> manager.inputData();
                case 2 -> manager.searchData();
                case 3 -> manager.deleteData();
                case 4 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 선택입니다.");
            }

            System.out.println();
        }
    }
}