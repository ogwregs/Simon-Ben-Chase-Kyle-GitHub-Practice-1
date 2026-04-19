// main for jokebot

public class Main {

    public static void knockKnock(){
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


    public static void main(String[] args) {
        // Add code to print "Hello, world!" here
        System.out.println("Hello, world!");
        knockKnock();
    }
}
