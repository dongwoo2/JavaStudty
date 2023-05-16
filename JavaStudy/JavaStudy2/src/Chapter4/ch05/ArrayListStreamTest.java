package Chapter4.ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();
        sList.add("Toma1");
        sList.add("Toma22");
        sList.add("Toma333");

        Stream<String> stream = sList.stream();
        stream.forEach(s->System.out.println(s));

        sList.stream().sorted().forEach(s->System.out.println(s));
        sList.stream().map(s -> s.length()).forEach(n -> System.out.println("n = " + n));
        sList.stream().filter(s -> s.length() >=6).forEach(s -> System.out.println("s = " + s));
    }
}
