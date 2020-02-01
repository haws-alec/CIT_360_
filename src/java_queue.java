import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class java_queue {
    public static void main(String[] args) {
        List < Integer > deck = Arrays.asList(1, 1, 11, 11, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int max = 51;
        int min = 0;


        Queue < Double > theDeck = new LinkedList < > ();

        for (int count = 0; count <= 25; count++) {
            int cardNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
            int deal = deck.get(cardNumber);
            theDeck.add((double) deal);
        }

        //System.out.println(theDeck);
        List < Double > dealerHand = new ArrayList < > ();
        double dealerDraw1 = theDeck.remove();
        dealerHand.add(dealerDraw1);
        double dealerDraw2 = theDeck.remove();
        dealerHand.add(dealerDraw2);

        List < Double > playerHand = new ArrayList < > ();
        double playerDraw1 = theDeck.remove();
        playerHand.add(playerDraw1);
        double playerDraw2 = theDeck.remove();
        playerHand.add(playerDraw2);
        double playerTotal = playerHand.get(0) + playerHand.get(1);
        double dealerTotal = dealerHand.get(0) + dealerHand.get(1);


        System.out.println("\nThe dealer has " + dealerHand.get(0) + " and " + dealerHand.get(1));
        System.out.println("The total in the dealer's hand is " + dealerTotal);
        System.out.println("\nYou have " + playerHand.get(0) + " and " + playerHand.get(1));
        System.out.println("The total of your hand is " + playerTotal);


        if (dealerTotal > playerTotal) {
            System.out.println("\nSorry, the house wins.");
        } else {
            System.out.println("\nCongrats, you win!");
        }
        System.out.println("\nGoodbye.");


    }
}