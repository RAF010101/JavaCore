package group1.chapters.chapter8.testA;

public class SimpleIntherance {
    public static void main(String[] args) {
        A superOb  = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Coдepжимoe объекта superOb :");
        superOb.showij();
        subOb.i = 7;
        subOb.j = 8;
        subOb.k =9;
        System.out.println("Coдepжимoe объекта subOb:");
        subOb.sum();
    }
}
