package group1.homewrok.homework3;

public class CharArray2 {
    public static void main(String[] args) {
        char ch1 [] = {' ',' ',' ',' ','b','a','r',' ','e','v',' ',' ',' '};
        for (int i = 0; i < ch1.length; i++) {
            System.out.print(ch1[i]);
        }
        System.out.println();
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ' '){
                System.out.print(ch1[i]);
            }
        }
    }
}
