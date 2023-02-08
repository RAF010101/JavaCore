package group1.homewrok.homework1;

public class Figure {
    public static void main(String[] args) {
        System.out.println("Figure 1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println("Finish");
        System.out.println("Figure 2");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println("Finish");
        System.out.println("Figure 3");

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");

            }
            for (int k = 0; k <= i; k++) {

                System.out.print("* ");


            }
            System.out.println();
        }

    }
}
