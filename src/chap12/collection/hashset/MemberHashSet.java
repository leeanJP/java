package chap12.collection.hashset;

import chap12.collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member>  hashSet; // hashset선언

    public MemberHashSet(){
        hashSet = new HashSet<Member>();  //hashset 생성
    }

    //회원 추가
    public void addMember(Member member){
        hashSet.add(member);
    }
    //회원 삭제
    public boolean removeMember(int memberId){
        Iterator<Member> ir = hashSet.iterator(); //iterator 활용해 순회

        while(ir.hasNext()){
            Member member = ir.next(); //회원을 하나씩 가져옴
            int tempId = member.getMemberId();
            if(tempId == memberId){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "아이디가 존재하지 않습니다.");
        return false;
    }
    //회원 전체보기
    public void showAllMember(){
        for(Member member : hashSet){
            System.out.println(member);
        }

    }


}
