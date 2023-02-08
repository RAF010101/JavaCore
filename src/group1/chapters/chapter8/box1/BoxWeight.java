package group1.chapters.chapter8.box1;

public class BoxWeight extends Box {
     double weight;
    BoxWeight (double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
    double volume (){
        return width * height * depth;
    }
}
