package group1.chapters.chapter2;

public class BlockTest {
    public static void main(String[] args) {
        int y = 20;
        for (int i = 0; i < 10; i++) {
            System.out.println("Значение: " + i);
            System.out.println("Значение: " + y);
            y = y - 2;
        }
    }
}
