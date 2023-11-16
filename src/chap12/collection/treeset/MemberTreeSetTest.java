package chap12.collection.treeset;

import chap12.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member1 = new Member(1003,"강감찬");
        Member member2 = new Member(1002,"이순신");
        Member member3 = new Member(1001,"홍길동");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);

        memberTreeSet.showAllMember();

        Member member4 = new Member(1003 , "을지문덕");
        memberTreeSet.addMember(member4);

        memberTreeSet.showAllMember();




    }


}
