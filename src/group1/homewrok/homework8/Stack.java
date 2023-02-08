package group1.homewrok.homework8;

public class Stack {
    private char [] ch1  = new char[50];
    private int tos = - 1;
    void push (char item){
        if (tos  > ch1.length - 1){
            System.out.println("Wrong Index");
        }
        ch1[++tos] = item;
    }
    char  pop (){
        if (tos < 0){
            System.out.println("No elements");
            return 'x';
        }
        return ch1[tos--];
    }

}
