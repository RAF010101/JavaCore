package group1.homewrok.homework7;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;


    void push(int item) {
        if (size == array.length - 1) {
            extand();
        }
        array[size] = item;
        size++;
    }

    int pop() {
        if (size < 0) {
            System.out.println("No elements");
            return -1;
        }
        size--;
        return array[size];

    }

    private void extand() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    //ջնջել մասիվի index-երորդ էլեմենտը
//եթե չկա նման ինդեքսով էլեմենտ, տպել, որ չկա նման էլեմենտ
    public void deleteByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("Wrong Index");
        }
        for (int i = 0; i < size; i++) {
            if (array[i] != array[index]) {
                System.out.print(array[i] + " ");
            }
        }
    }

    //տրված value-ն դնելու ենք տրված index-ով էլեմենտի տեղը։
//Հին արժեքը կկորի
//եթե նման ինդեքսով էլեմենտ չկա, գրում ենք որ չկա։
    public void set(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Wrong Index");
        } else {
            array[index] = value;
        }

    }

    //ավելացնել տրված value-ն տրված ինդեքսում, իսկ էղած էլեմենտները մի հատ աջ տանել։
//Եթե չկա նման ինդեքս, տպել որ չկա
    public int add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Wrong Index");
            return -1;
        }
        return array[index] = value;
    }

    //Վերադարձնել true եթե տրված value-ն կա մեր մասիվի մեջ, եթե ոչ false
    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    //Վերադարձնել տրված value-ի ինդեքսը, եթե շատ կա տվյալ թվից, վերադարձնել առաջին ինդեքսը։
//եթե չկա, -1
    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return array[i];
            }
        }
        return -1;
    }

    public void get() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
