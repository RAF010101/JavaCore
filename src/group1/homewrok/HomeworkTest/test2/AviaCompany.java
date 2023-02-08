package group1.homewrok.HomeworkTest.test2;

public class AviaCompany {
    public static void main(String[] args) {
        int ticket;
        int mil = 0;
        ticket = 500;
        for (int i = 0; i <ticket / 20; i++) {
            mil++;
        }
        System.out.println("Passenger have another " + mil + " mil bonus");
    }
}
