package chap12.collection.hashset;

import chap12.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이지원");
        Member memberKim = new Member(1002, "김민정");
        Member memberSon = new Member(1003, "손흥민");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberSon);
        memberHashSet.showAllMember();

        System.out.println("======================");
        Member memberHong = new Member(1003, "홍길동");
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllMember();




    }
}
