package ch15interface;

public class BookShelfTest {

    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("태박산맥1");
        bookQueue.enQueue("태박산맥2");
        bookQueue.enQueue("태박산맥3");

        System.out.println("bookQueue.deQueue() = " + bookQueue.deQueue());
        System.out.println("bookQueue.deQueue() = " + bookQueue.deQueue());
        System.out.println("bookQueue.deQueue() = " + bookQueue.deQueue());
    }
}
