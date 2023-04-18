package ch09abstract;

public class ComputerTest {

    public static void main(String[] args) {

        Computer deskTop = new DeskTop();
        deskTop.display();
        deskTop.turnOff(); //turnoff는 오버리이드 했기 떄문에 오버라이드 된 함수가 불린다

        NoteBook myNoteBook = new MyNoteBook(); //마의 노트북은 노트북의 하위클래스이니까 노트북으로도 선언가능
        myNoteBook.display();
        myNoteBook.typing(); // 노트북에서 상속받은 메소드가 나옴


    }
}
