package chap05;

public interface RemoteControl {
    //인터페이스 멤버의 종류
    //인터페이스에서 선언된 필드는 모두 public static final 의 특성을 갖고 있음
    //public 상수 필드
    //타입 변수명 = 값;
    //상수는 대문자로 작성하고 단어 사이에는 _를 사용하는것이 관례다.
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    //public 추상 메소드
    //인터페이스 추상메소드는 기본적으로 public 접근 제한을 갖기 때문에
    //구현클래스에서 재정의 되는 메소드는 항상 public 접근 지정자를 갖는다!


    void turnOn();
    void turnOff();
    void setVolume(int volume);
    //public 디폴트 메소드
    //완전한 실행 코드를 가지는 디폴트 메소드를 선언할 수 있다.
    public default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리 합니다.");
        }else {
            System.out.println("무음 해제 합니다.");

        }
    }

    //public 정적 메소드

    //private 메소드
    //private 정적 메소드

}
