package group1.chapters.chapter8.box2;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2= new BoxWeight(2,3,4,0.076);
        BoxWeight mybox3 = new BoxWeight(3,2);
        BoxWeight myclone = new BoxWeight(mybox1);
        BoxWeight mycube = new BoxWeight();
        double vol;
        vol = mybox1.volume();
        System.out.println("mybox 1 vol " + vol);
        System.out.println("mybox 1 weight" + mybox1.weight);
        vol = mybox2.volume();
        System.out.println("mybox 2 vol " + vol);
        System.out.println("mybox 2 weight " + mybox2.weight);
        vol = mybox3.volume();
        System.out.println("mybox 3 vol "+ vol);
        System.out.println("mybox 3 weight " + mybox3.weight);
        vol = myclone.volume();
        System.out.println("myclone vol " + vol);
        System.out.println("myclone weight " + myclone.weight);
        vol = mycube.volume();
        System.out.println("mycube vol " + vol);
        System.out.println("mycube weight" + mycube.weight);
    }
}
