package ch20;
//import는 가져다 써라라는 뜻
import ch18.Book;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("태백산맥1", "조정래"));
        list.add(new Book("태백산맥2", "조정래"));
        list.add(new Book("태백산맥3", "조정래"));
        list.add(new Book("태백산맥4", "조정래"));
        list.add(new Book("태백산맥5", "조정래"));

        //전체 엘리먼트의 갯수는 사이즈라는 메서드를 호출하면 됨
        //arraylist 가 처음에 만들어질때 지정된 용량 만큼 만들어짐
        for(int i=0; i<list.size(); i++) {
            list.get(i).showBookInfo();
        }
    }
}
