package group1.homewrok.homework2;

public class Figure {
    public static void main(String[] args) {
        System.out.println("START 1 FIGURE");
        for (int i = 0; i < 4; i++) {
            for (int j = 10; j > 5; j--) {
                System.out.print("  ");

            }
            for (int o = 0; o < i; o++) {
                System.out.print("  ");

            }
            for (int p = 4; p > i; p--) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println("FINISH 1 FIGURE");
        System.out.println();
        System.out.println("START FIGURE 2");
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j >i ; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println("FINISH FIGURE 2");
    }
}
