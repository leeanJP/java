package sec03.chap04;

public class PlayerTest {
    public static void main(String[] args) {

        Player player01 = new Player("Bill Gates", 85, "programmer"); // 하나의 객체 생성
        Player player02 = new Player("Elon musk", 100, "Super Rich"); // 하나의 객체 생성

        player01.sayHi();

        System.out.println(player01.health);
        player01.takeHit();
        System.out.println(player01.health);
    }

    //1. 캡슐화  Encapsulation
    //데이터와 데이터를 활용하는 함수를 캡슐 안에 숨겨두는걸 의미한다.
    // java class

    // 함수나 메소드가 파라메터를 가질 필요가없다.
    // this 키워드로 직접 데이터에 엑세스 가능

    //캡슐화를 통해서 표시할 속성과 숨길 속성을 정할 수 있다.
    //private public

    //데이터 ,class 안에 있는 해당 데이터를 이욯하는 함수를 감싸는 것
    //데이터를 노출할 지 숨길지 결정할 수 있다.

    //2. 상속 Inheritance
    //부모 클래스 //자식 클래스

    //자식 클래스는 부모 상속 받은 필드(변수) , 메소드
    //다단계 상속 이라 함
    //다중상속 java 불가능함


    //3. 추상화 Abstraction

    //스티어링 휠, 페달, 버튼 등등
    //인터페이스를 사용함
    //자동차를 구현할 때 세부정보는 그 제조사만 알고 있음
    //운전자는 자동차의 세부정보를 몰라도 운전할 수있다.
    //Scanner 클래스를 사용해 봤는데
    //기능적인 부분들만 알고 세부구현 정보는 전혀모름

    //자동차의 제조방법이 달라진다고 해서 운전방법이 달라지는건 아님


    //4. 다형성 Polymorphism 多形性
    //꼴이 여러개다
    // 상속받은 클래스에 따라서 여러가지 형태로 구현된다.
    //person class
    //sayHi
    //korean class extends person
    //한국말로 할듯?
    //Japanes clsss extends person
    //일본말로 할듯





}
