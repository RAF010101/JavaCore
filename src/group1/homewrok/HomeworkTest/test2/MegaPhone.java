package group1.homewrok.HomeworkTest.test2;

import java.util.Scanner;

public class MegaPhone {
    public static void main(String[] args) {
        MegaPhone1 phone = new MegaPhone1();
        Scanner scanner =new Scanner(System.in);
        int operator = 0;
        int unknown = 100;
        System.out.println("Please input replenish price");
        phone.replenish = scanner.nextLine();
        if (Integer.parseInt(phone.replenish)>= 1000) {
            for (int i = 0; i < Integer.parseInt(phone.replenish)/ 100; i++) {
                operator++;
            }
            unknown = operator +Integer.parseInt(phone.replenish);
        }
        System.out.println(unknown);
    }
}
