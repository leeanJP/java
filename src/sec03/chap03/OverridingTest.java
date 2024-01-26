package sec03.chap03;

public class OverridingTest {
    public static void main(String[] args) {
        Person person = new Person();
        Child child = new Child();
        FatMan fat = new FatMan();

        person.eat();
        child.eat();
        fat.eat();
    }
}
    class Person {
        void eat() {
            System.out.println("쩝쩝");
        }
    }

    class Child extends Person {
        protected void eat() {
            System.out.println("쭈압쭈압");
        }
    }

    class FatMan extends Person {
        public void eat() {
            System.out.println("쿰척쿰척");
        }
    }

