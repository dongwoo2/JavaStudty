package ch06;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHone = new Member(1004, "홍방장");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberKang);
        memberArrayList.addMember(memberHone);

        memberArrayList.showAllMembers();
        memberArrayList.removeMember(memberHone.getMemberId());
        memberArrayList.showAllMembers();
    }
}
