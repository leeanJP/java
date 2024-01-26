package sec03.chap04;

public class Entrepreneur {

    private String firstName;
    private String lastName;
    private String company;
    private int shares;

    public Entrepreneur(String firstName, String lastName, String company, int shares){
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.shares = shares;
    }

    public String getFirstName(){
        return this.firstName;
    }

}
