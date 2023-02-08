package group1.homewrok.homework2;

public class Array2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int result = 0;
        int [] array = {19,28,30,15,37,92,60,80,27,9};
        int c = array.length;
        for (int i = 0; i < array.length; i++) {
            if(array[i] %2 == 0){
                System.out.print(array[i] + " ");
                a++;
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 != 0){
                System.out.print(array[i] + " ");
                b++;
            }
        }
        System.out.println("Zuyg tveri qanak masivum = " + a);
        System.out.println("Kent tv eri qanak masivum  = " + b);
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.println(result /c );
        System.out.println(array[0] + " " + array[array.length - 1] + " " + array[array.length / 2]);
    }
}
