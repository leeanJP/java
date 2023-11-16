package chap12.map.treemap;

import chap12.collection.Member;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member>();
    }

    //회원 추가
    public void addMember(Member member){
        treeMap.put(member.getMemberId(), member);

    }
    //회원 삭제
    public boolean removeMember(int memberId){
        if(treeMap.containsKey(memberId)){
            treeMap.remove(memberId);
            return  true;
        }
        System.out.println(memberId+" 가 존재하지 않습니다");
        return false;
    }

    //회원 전체보기
    public void showAllMember(){
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while (ir.hasNext()){
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
