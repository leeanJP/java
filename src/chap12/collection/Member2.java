package chap12.collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
    private int memberId;
    private String memberName;

    public Member2(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public int hashCode(){
        return memberId;  //hashCode()메서드가
    }                     //memberId를 리턴하도록 재정의

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member2){
            Member2 member = (Member2) obj;
            //매개변수로 받은 회원ID 자신의 회원 ID와 같으면
            //true 반환
            if(this.memberId == member.memberId){
                return  true;
            }else return false;
        }
        return false;
    }

    @Override
    public String toString(){
        return memberName + "회원님의 아이디는 " + memberId + "입니다.";
    }

    //추가한 회원 아이디와 매개변수로 받은 회원 아이디를 비교

    public int compare(Member2 mem1 , Member2 mem2){
        return mem1.getMemberId() - mem2.getMemberId();
    }
}
