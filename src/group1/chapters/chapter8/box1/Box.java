package group1.chapters.chapter8.box1;

public class Box {
    double width;
    double height;
    double depth;
    Box (Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.height;
    }
    Box (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box (){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box (double len){
        width = height = depth = len;
    }
   double vol (){
        return width * height * depth;
   }

}
