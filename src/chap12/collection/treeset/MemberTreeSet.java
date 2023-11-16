package chap12.collection.treeset;

import chap12.collection.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>();
    }

    //회원 추가
    public void addMember(Member member){
        treeSet.add(member);
    }
    //회원 삭제
    public boolean removeMember(int memberId){
        Iterator<Member> ir = treeSet.iterator();

        while (ir.hasNext()){
            Member member = ir.next();
            int tempId = member.getMemberId();

            if(tempId == memberId){
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + " 가 존재하지 않습니다.");
        return false;
    }


    //회원 전체 보기
    public void showAllMember(){
        for(Member member : treeSet){
            System.out.println(member);
        }
        System.out.println();
    }


}
