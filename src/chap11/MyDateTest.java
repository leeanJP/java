package chap11;

class Date{
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public  boolean equals(Object obj){
        if(obj instanceof Date date){
            //Date date = (Date)obj;
            return (this.day == date.day && this.month == date.month && this.year == date.year);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return day  + month * 100 + year * 10000;
    }


}
public class MyDateTest {
    public static void main(String[] args) {
        Date date1 = new Date(16,11,2023);
        Date date2 = new Date(16,11,2023);
        Date date3 = new Date(17,11,2023);

        System.out.println(date1.equals(date2));

        System.out.println("date1 해시코드값" + date1.hashCode());
        System.out.println("date2 해시코드값" + date2.hashCode());
        System.out.println("date3 해시코드값" + date3.hashCode());

        System.out.println("date1 의 실제 주소값 : " + System.identityHashCode(date1));
        System.out.println("date2 의 실제 주소값 : " + System.identityHashCode(date2));
    }
}
