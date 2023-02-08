package group1.chapters.chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d  = 323.142;
        System.out.println("Int cast in double");
        i = (int) d;
        System.out.println("d and i" + d  + " " + d);
        System.out.println("Doiuble cast in byte d");
        b =  (byte) d;
        System.out.println("d and b " +d + " " + b);
    }
}
