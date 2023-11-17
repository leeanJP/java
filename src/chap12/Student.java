package chap12;

import java.util.Objects;

public class Student {

    String id;
    String name;

    public Student(String id ,String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student std){
            if(this.id == std.id){
                return true;
            }else return false;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return  Integer.parseInt(id);
    }


    @Override
    public String toString() {
        return id + ": " +name;
    }
}
