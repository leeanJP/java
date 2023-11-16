package chap12.map.treemap;

import chap12.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();
        Member member1 = new Member(1003,"강감찬");
        Member member2 = new Member(1002,"이순신");
        Member member3 = new Member(1001,"홍길동");
        Member member4 = new Member(1004,"김민정");

        memberTreeMap.addMember(member1);
        memberTreeMap.addMember(member2);
        memberTreeMap.addMember(member3);
        memberTreeMap.addMember(member4);

        memberTreeMap.showAllMember();
        memberTreeMap.removeMember(1004);
        memberTreeMap.showAllMember();



    }
}
