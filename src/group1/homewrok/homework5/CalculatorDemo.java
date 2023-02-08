package group1.homewrok.homework5;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double c;
        System.out.println("Divide");
        c = calculator.divide(49,7);
        System.out.println(c);
        System.out.println("Addition");
        c =  calculator.addition(10,10);
        System.out.println(c);
        System.out.println("Deduction");
        c =  calculator.deduction(20,10);
        System.out.println(c);
        System.out.println("Multiplication");
        c = calculator.Multiplication(5,6);
        System.out.println(c);
    }
}
