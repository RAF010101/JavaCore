package group1.chapters.chapter8.box1;

public class BoxWeightTest {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен: " + vol);
        System.out.println("Weight MYBOX1: " + mybox1.weight);
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен: " + vol);
        System.out.println("Weight mybox2: " + mybox2.weight);
    }
}
