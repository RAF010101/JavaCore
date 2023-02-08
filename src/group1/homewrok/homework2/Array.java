package group1.homewrok.homework2;

public class Array {
    public static void main(String[] args) {
        int min;
        int max;
        int result = 0;
        int [] array = {10,20,30,40,50,60,110,220};
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Array min element is a " + min);
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Array max element is a " + max);
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.println("Array result is a " + result);
    }
}
