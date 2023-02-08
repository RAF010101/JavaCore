package group1.homewrok.homework4;

public class CharArray {
    public static void main(String[] args) {
        char ch1[] = {' ', ' ', 'j', ' ', 'a', ' ', 'v', 'a', ' ', ' '};
        int a = 1;
        int b = 0;
        for (int i = 0; i < ch1.length - 1; i++) {
            if (ch1[i] == ' ') {
                a++;
            }
            break;
        }
        for (int i = ch1.length - 1; i > 0; i--) {
            if (ch1[i] == ' ') {
                b++;
            }
            break;
        }
        for (int i = a; i < ch1.length - 1 - b; i++) {
            System.out.print(ch1[i]);

        }
    }
}
