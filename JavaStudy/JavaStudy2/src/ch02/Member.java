package ch02;
public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override    // Object의 equals() 메소드 오버라이딩
    public boolean equals(Object obj) {
        if(obj instanceof Member) {         // 매개값 obj가 Member 타입인지 확인
            Member member = (Member) obj;   // Member 타입으로 강제 타입 변환
            if(id.equals(member.id)) {      // id 필드 값이 동일한지 검사, 동일하다면 true 리턴
                return true;
            }
        }
        return false;   // 매개값 obj가 Member 타입이 아니거나 id 필드값이 다른경우 false
    }
}