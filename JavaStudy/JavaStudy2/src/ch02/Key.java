package ch02;

public class Key {
    public int number;

    public Key(int number) {   // 생성자
        this.number = number;
    }
    @Override    // Object 의 equals() 재정의
    public boolean equals(Object obj) {
        if(obj instanceof Key) {                     // Key 타입과 같다면
            Key compareKey = (Key) obj;              // 강제 타입 변환
            if(this.number == compareKey.number) {  // number 필드 값이 같으면 true
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode() {
        return number;
    }
}