package group1.chapters.chapter3;

public class Light {
    public static void main(String[] args) {
        int lightspeed =  186000;
        long days;
        long seconds;
        long distance;
        days = 1000;
        seconds = days  * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.println("IN days" + days);
        System.out.println("Light is going");
        System.out.println(distance + " mil");
    }
}
