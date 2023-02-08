package group1.homewrok.homework6;

public class Array {
    private int[] array = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};

    void arrayMax() {
        System.out.println("MAX");
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    void arrayMin() {
        System.out.println("Min");
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    void arrayMaxSort() {
        System.out.println("Max of Sort");
        int count;
        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    count ++;
                }

            }
        } while (count > 0);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void arrayMinSort() {
        System.out.println("Min of Sort");
        int count;
        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]){
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    count++;
                }
            }
        } while (count > 0);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
