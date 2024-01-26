package chap05;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone phone = new Phone();
        SmartPhone smartPhone = new SmartPhone("이재필");

        smartPhone.turnOn();

        smartPhone.internetSearch();

        smartPhone.turnOff();


    }
}
