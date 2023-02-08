package group1.chapters.chapter3;

public class LifeTime {
    public static void main(String[] args) {
       int y = 100;
       int x = -1;
        for (int i = 0; i < 3; i++) {
            System.out.println("x is a " + x);
            System.out.println(" y is a" + y);
        }
    }
}
