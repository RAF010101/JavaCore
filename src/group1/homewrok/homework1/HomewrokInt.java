package group1.homewrok.homework1;

public class HomewrokInt {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
       if (a > b){
           System.out.println(a);
       }else System.out.println(b);
        for (int i = a; i <= b ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        if (a == b){
            System.out.println("A = B");
        }else System.out.println("A != B");
    }
}
