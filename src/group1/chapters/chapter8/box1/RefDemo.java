package group1.chapters.chapter8.box1;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(3,5,7,8.37);
        Box plainbox = new Box();
        double vol;
        vol = boxWeight.volume();
        System.out.println("Oбъeм weightbox равен: " + vol);
        System.out.println("Вес boxWeight " +boxWeight.weight );
        plainbox = boxWeight;
        vol = plainbox.vol();
        System.out.println("Oбъeм plainbox равен: " + vol);
    }
}
