package group1.chapters.chapter8.box2;

public class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(double len) {
        width = height = depth = len;
    }

    Box() {
        width = 1;
        height = 1;
        depth = 1;

    }

    double volume() {
        return width * height * depth;
    }


}
