package group1.homewrok.HomeworkTest.test2;

import java.util.Scanner;

public class AviaCompany {
    public static void main(String[] args) {
        AviaCompany1 avia  = new AviaCompany1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input ticket price");
        avia.ticket = scanner.nextLine();
        int mil = 0;
        Integer.parseInt(avia.ticket);
        for (int i = 0; i <Integer.parseInt(avia.ticket) / 20; i++) {
            mil++;
        }
        System.out.println("Passenger have another " + mil + " mil bonus");
        System.out.println("Good Bye");
    }
}
