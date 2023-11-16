package chap12.map.hashmap;

import chap05.Practice5_3;
import chap12.collection.Member;
import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<Integer, Member>();
    }

    //회원 추가
    public void addMember(Member member){
        //key value 쌍으로 추가
        hashMap.put(member.getMemberId(), member);
    }
    //회원 삭제
    public boolean removeMember(int memberId){
        //hashMap에 매개변수로 받은 키 값인 회원 아이디가 있다면 삭제
        if(hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
            return true;
        }
        System.out.println(memberId+" 가 존재하지 않습니다.");
        return false;
    }
    //회원 전체 보기
    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        System.out.println(hashMap.keySet());
        while (ir.hasNext()){  //다음 키가 있으면
            int key = ir.next();  // key값을 가져와서
                                  // key로 value 값 가져오기
            Member member = hashMap.get(key);
            System.out.println(member);

        }
        System.out.println();
    }

}
