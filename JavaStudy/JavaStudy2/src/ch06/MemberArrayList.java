package ch06;

import java.util.ArrayList;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        for(int i = 0; i<arrayList.size(); i++) {
            Member member = arrayList.get(i);
            if(member.getMemberId() == memberId){
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    public void showAllMembers() {

        for(int i = 0; i<arrayList.size(); i++) {
            Member member = arrayList.get(i);
            System.out.println("member = " + member); //toString 호출될 수 있게 구현
        }
    }
}
