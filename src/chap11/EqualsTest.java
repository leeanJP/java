package chap11;


class Student{
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return  studentId + ", " + studentName;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student std = (Student) obj;
            //재정의한 equals 메소드는 학번이 같으면 true 반환
            if(this.studentId == std.studentId){
                return true;
            }else return false;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return studentId;
    }

}


public class EqualsTest {
    public static void main(String[] args) {
        Student student1 = new Student(100, "이상원");
        Student student2 = student1;
        Student student3 = new Student(100, "이상원");

        System.out.println("student1 의 hashCode값 : " +student1.hashCode());
        System.out.println("student2 의 hashCode값 : " +student2.hashCode());
        System.out.println("student3 의 hashCode값 : " +student3.hashCode());


        System.out.println("student1 의 실제 주소값 : " + System.identityHashCode(student1));
        System.out.println("student2 의 실제 주소값 : " + System.identityHashCode(student2));
        System.out.println("student3 의 실제 주소값 : " + System.identityHashCode(student3));




//        String str1 = new String("abc");
//        String str2 = new String("abc");
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());
//
//        Integer i1 =new Integer(100);
//        Integer i2 =new Integer(100);
//
//        System.out.println(i1.hashCode());
//        System.out.println(i2.hashCode());

//        if(student1 == student2){  // == 연산자로 비교
//            System.out.println("student1 과 student2의 주소가 같습니다.");
//        }else {
//            System.out.println("student1 과 student2의 주소가 다릅니다.");
//        }
//
//        if(student1.equals(student2)){
//            System.out.println("student1 과 student2는 동일합니다.");
//        }else {
//            System.out.println("student1 과 student2는 다릅니다.");
//
//        }
//
//        if(student1 == student3){  // == 연산자로 비교
//            System.out.println("student1 과 student3의 주소가 같습니다.");
//        }else {
//            System.out.println("student1 과 student3의 주소가 다릅니다.");
//        }
//
//        if(student1.equals(student3)){
//            System.out.println("student1 과 student3는 동일합니다.");
//        }else {
//            System.out.println("student1 과 student3는 다릅니다.");
//        }
    }



}
