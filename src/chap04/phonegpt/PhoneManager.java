package chap04.phonegpt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneManager {
    private List<Phone> phoneList;

    public PhoneManager() {
        phoneList = new ArrayList<>();
    }

    public void addPhone(String name, String tel) {
        Phone phone = new Phone(name, tel);
        phoneList.add(phone);
    }

    public void searchPhone(String name) {
        for (Phone phone : phoneList) {
            if (phone.getName().equals(name)) {
                System.out.println("전화번호: " + phone.getTel());
                return;
            }
        }
        System.out.println("해당하는 이름의 전화번호를 찾을 수 없습니다.");
    }

    public static void main(String[] args) {
        PhoneManager phoneManager = new PhoneManager();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("1. 전화번호 추가");
            System.out.println("2. 전화번호 검색");
            System.out.println("3. 종료");
            System.out.print("원하는 작업을 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            switch (choice) {
                case 1:
                    System.out.print("이름을 입력하세요: ");
                    String name = scanner.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String tel = scanner.nextLine();

                    phoneManager.addPhone(name, tel);
                    break;
                case 2:
                    System.out.print("검색할 이름을 입력하세요: ");
                    String searchName = scanner.nextLine();
                    phoneManager.searchPhone(searchName);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                    break;
            }
        }

        scanner.close();
    }
}