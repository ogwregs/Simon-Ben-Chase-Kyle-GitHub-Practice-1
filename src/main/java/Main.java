// main for jokebot

public class Main {


    public static void knockKnock() {
        System.out.println("Knock Knock.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Whose there?");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Your mother. Go to sleep.");
    }

    public static void knickKnack() {
        System.out.println("Why is 6 afraid of 7");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Because 7, 8, 9");
        System.out.println("Why was 10 afraid?");
        try {
            Thread.sleep(2750);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Because its between 9/11.")
    }
}
    public static void main(String[] args) {
        // Add code to print "Hello, world!" here
        System.out.println("Hello, world!");
        knockKnock();
    }


}
