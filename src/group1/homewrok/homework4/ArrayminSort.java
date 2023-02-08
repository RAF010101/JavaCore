package group1.homewrok.homework4;

public class ArrayminSort {
    public static void main(String[] args) {
        int[] array = {43, 55, 5, -9, 0, 12};
        int count;
        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    count++;

                }
            }
        }while (count > 0) ;
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
