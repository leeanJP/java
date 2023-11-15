package chap12.collection.arraylist;

import chap12.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrList = new MemberArrayList();

        //새로운 회원 인스턴스 생성
        Member memberLee = new Member(1001,"이지원");
        Member memberKim = new Member(1002,"김민수");
        Member memberSon = new Member(1003,"손흥민");
        Member memberHong = new Member(1004,"홍박사");

        //ArrayList 회원 추가
        memberArrList.addMember(memberLee);
        memberArrList.addMember(memberLee);
        memberArrList.addMember(memberKim);
        memberArrList.addMember(memberSon);
        memberArrList.addMember(memberHong);

        //전체 회원 출력
        memberArrList.showAllMember();
        //손흥민 삭제
        memberArrList.removeMember(memberLee.getMemberId());
        memberArrList.removeMember(memberSon.getMemberId());
        Member memberNa = new Member(1005, "나영석");
        memberArrList.insertMember(memberNa, 2);


        //삭제 후 전체 회원 출력
        memberArrList.showAllMember();



    }
}
