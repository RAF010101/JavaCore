package group1.chapters.chapter8.testA2;

public class Access {
    public static void main(String[] args) {
        B subOb  = new B();
        subOb.setIJ(10,20);
        System.out.println("Sum = " +subOb.sum());
    }
}
