package chap05;

public class AbstractExam {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog()); //자동 타입 변환
        animalSound(new Cat());

    }
    public static void animalSound(Animal animal){
        animal.sound();
    }

}
