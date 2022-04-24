package day_42;

public class WarmUp {
    public static void main(String[] args) {
        System.out.println("---------push up started---------");
         for(int i=1; i<=10; i++) {
             System.out.print(" Push up " + i);


             try {
                 Thread.sleep(1500);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }

         }

        System.out.println("\n--------push up finished-----------");

        //Do 30 push-ups and try pausing 1.5 seconds in each

    }  
}