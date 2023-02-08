package group1.homewrok.homework3;

public class CharArray {
    public static void main(String[] args) {
        char [] ch1 = {'j','a','v','a','l','o','v','e','o'};
        char c = 'o';
        int p = 0;
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == c){
                p ++;
            }
        }
        System.out.println("ch1 array have a " + p + " o");
        System.out.println(ch1[ch1.length /2] + " " + ch1[ch1.length/2 + 1]);
    }
}
