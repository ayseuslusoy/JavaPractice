package day_42;

public class Throws {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-------test1 started---------");
        for (int i = 0; i <= 5; i++) {
            System.out.print(" Hello "+i);
            Thread.sleep(1500);
        }
            System.out.println("\n-------test1 completed--------");

    }

}
