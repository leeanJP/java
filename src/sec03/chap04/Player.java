package sec03.chap04;

public class Player {

    String name;
    String skill;
    int health;
    int exp;

    //생성자 오버로딩
    //생성자는 여러개를 만들 수 있고 대신 만든 생성자는 파라미터가 달라야한다.
    //생성자의 목적은 객체 생성 시 초기화
    public Player (String name, int health , String skill){
        this.name = name;
        this.health = health;
        this.skill = skill;

    }


    void sayHi() {
        System.out.println("안녕 나는 " + this.name);
    }

    void takeHit() {
        this.health = this.health -1;
    }
}
