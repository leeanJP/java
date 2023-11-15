package chap07;

import java.util.ArrayList;

public class DogTest {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("개1", "치와와"));
        dogs.add(new Dog("개2", "도베르만"));
        dogs.add(new Dog("개3", "세퍼드"));
        dogs.add(new Dog("개4", "푸들"));
        dogs.add(new Dog("개5", "스피츠"));

        for(int i =0; i< dogs.size(); i++){
            System.out.println(dogs.get(i).showDogInfo());
        }
        System.out.println("================");
        for(Dog dog : dogs){
            System.out.println(dog.showDogInfo());
        }


    }
}
