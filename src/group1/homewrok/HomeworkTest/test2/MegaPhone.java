package group1.homewrok.HomeworkTest.test2;

public class MegaPhone {
    public static void main(String[] args) {
        int replenish = 0;
        int operator = 0;
        int unknown = 100;
        replenish = 1200;
        if (replenish >= 1000) {
            for (int i = 0; i < replenish / 100; i++) {
                operator++;
            }
            unknown = operator + replenish;
        }
        System.out.println(unknown);
    }
}
