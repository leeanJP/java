package chap04;

import java.util.Scanner;

public class PhoneManager {
    private Scanner scanner;
    private Phone[] p;

    public PhoneManager() {
        scanner = new Scanner(System.in);
    }

    private void read() {
        System.out.print("인원수>>");
        int n = scanner.nextInt();

        p = new Phone[n]; // n 명을 저장할 배열 선언
        for (int i = 0; i < p.length; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
            String name = scanner.next();
            String tel = scanner.next();
            p[i] = new Phone(name, tel);
        }

        System.out.println("저장되었습니다...");
    }

    private String search(String name) {
        for (int i = 0; i < p.length; i++) {
            if (p[i].getName().equals(name))
                return p[i].getTel();
        }
        return null;
    }

    public void run() {
        read();
        while (true) {
            System.out.print("검색할 이름>>");
            String name = scanner.next();
            if (name.equals("exit")){
                break;
            }
            String tel = search(name);
            if (tel == null){
                System.out.println(name + " 이 없습니다.");
            }
            else{
                System.out.println(name + "의 번호는 " + tel + " 입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다...");
    }

    public static void main(String[] args) {
        new PhoneManager().run();
    }
}
