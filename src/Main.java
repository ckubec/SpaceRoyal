import controller.player;
import model.*;

import java.io.Console;
import java.util.Scanner;

public class Main {
    private static String ADMIRAL = "If there are more than 4 cards on the draw pile when it becomes your turn, you receive two credits";
    private static String ENTERTAINER = "If there are no cards on the draw pile when it becomes your turn, you receive one credit";
    private static String MERCHANT = "You receive a discount of one credit on all purchases";
    private static String FIGHTER_PILOT = "You receive one extra credit when a Fighter docks";
    private static String CARRIER_PILOT = "You receive one extra credit when a Carrier docks";
    private static String DESTROYER_PILOT = "You receive one extra credit when a Destroyer docks";
    private static String DREADNOUGHT_PILOT = "You receive one extra credit when a Dreadnought docks";
    private static String BOMBER_PILOT = "You receive one extra credit when a Bomber docks";
    private static String TROOPER = "You own one defense point";
    private static String GENERAL = "You own two defense points";
    private static String MINER = "You own one crystal mine";
    private static String SCIENTIST = "You own one research lab";
    private static String COLONIST = "You own one colony";
    private static String SCOUNDREL = "You own one colony OR one research lab OR one crystal mine";
    private static String DEFENSE_TARIFF = "If you possess more than 11 credits you must discard half of your credits," +
            " rounded down. The person(s) who has the most Defense receives 1 credit";
    private static String POINTS_TARIFF = "If you possess more than 11 credits you must discard half of your credits," +
            " rounded down. The person(s) who has the least Points receives 1 credit";




    public static void main(String[] args) {
        deck myDeck;
        deck discard;
        player players[];
	// write your code here
        myDeck = new deck();
        //myDeck.push(new unit());
        myDeck = populate(myDeck);
        myDeck.shuffle();
        //System.out.println("How Many ")
        //while(){

        //}
        System.out.println("How many players will be playing: ");
        Scanner scan = new Scanner(System.in);
        int result = scan.nextInt();
        while(result < 2 || result > 5) {
            System.out.println("Enter a number between 2 and 5: ");
            result = scan.nextInt();
        }

        players = new player[result];
        for(int i = 0; i<result; i++){
            players[i] = new player();
            for(int j=0; j<3; j++)
                players[i].drawCoin(myDeck);
        }

        System.out.println(result);
        /*for (int i=0; i<119; i++)
            System.out.println(myDeck.pop());       */
    }

    private static deck populate(deck theDeck) {

        //chancellors
        for (int i = 0; i < 4; i++) {
            theDeck.push(new unit(8, 0, "Chancellor", "Take one extra action per turn."));
        }

        //admirals
        theDeck.push(new unit(9, 3, "Admiral", ADMIRAL));
        theDeck.push(new unit(9, 3, "Admiral", ADMIRAL));
        theDeck.push(new unit(7, 2, "Admiral", ADMIRAL));
        theDeck.push(new unit(7, 2, "Admiral", ADMIRAL));
        theDeck.push(new unit(7, 2, "Admiral", ADMIRAL));
        theDeck.push(new unit(5, 1, "Admiral", ADMIRAL));

        //entertainer
        theDeck.push(new unit(9, 3, "Entertainer", ENTERTAINER));
        theDeck.push(new unit(7, 2, "Entertainer", ENTERTAINER));
        theDeck.push(new unit(7, 2, "Entertainer", ENTERTAINER));
        theDeck.push(new unit(7, 2, "Entertainer", ENTERTAINER));
        theDeck.push(new unit(5, 1, "Entertainer", ENTERTAINER));

        //merchant
        theDeck.push(new unit(9, 3, "Merchant", MERCHANT));
        theDeck.push(new unit(9, 3, "Merchant", MERCHANT));
        theDeck.push(new unit(7, 2, "Merchant", MERCHANT));
        theDeck.push(new unit(7, 2, "Merchant", MERCHANT));

        //pilot (yellow fighter)
        theDeck.push(new unit(3, 1, "Fighter Pilot", FIGHTER_PILOT));
        theDeck.push(new unit(5, 2, "Fighter Pilot", FIGHTER_PILOT));

        //pilot (blue destroyer)
        theDeck.push(new unit(3, 1, "Destroyer Pilot", DESTROYER_PILOT));
        theDeck.push(new unit(5, 2, "Destroyer Pilot", DESTROYER_PILOT));

        //pilot (green bomber)
        theDeck.push(new unit(3, 1, "Bomber Pilot", BOMBER_PILOT));
        theDeck.push(new unit(3, 1, "Bomber Pilot", BOMBER_PILOT));

        //pilot (red carrier)
        theDeck.push(new unit(3, 1, "Carrier Pilot", CARRIER_PILOT));
        theDeck.push(new unit(3, 1, "Carrier Pilot", CARRIER_PILOT));

        //pilot (black dreadnought)
        theDeck.push(new unit(3, 1, "Dreadnought Pilot", DREADNOUGHT_PILOT));
        theDeck.push(new unit(3, 1, "Dreadnought Pilot", DREADNOUGHT_PILOT));

        //pooper trooper
        for (int i = 0; i < 7; i++){
            theDeck.push(new unit(3, 1, "Trooper", TROOPER));
        }
        theDeck.push(new unit(5, 2, "Trooper", TROOPER));
        theDeck.push(new unit(5, 2, "Trooper", TROOPER));
        theDeck.push(new unit(7, 3, "Trooper", TROOPER));

        //general
        theDeck.push(new unit(5, 1, "General", GENERAL));
        theDeck.push(new unit(7, 2, "General", GENERAL));
        theDeck.push(new unit(9, 3, "General", GENERAL));

        //miner, colonist, scientist
        for (int i = 0; i < 5; i++) {
            theDeck.push(new unit(4, 1, "Miner", MINER));
            theDeck.push(new unit(4, 1, "Scientist", SCIENTIST));
            theDeck.push(new unit(4, 1, "Colonist", COLONIST));
        }

        //scoundrel
        for (int i = 0; i < 3; i++) {
            theDeck.push(new unit(6, 1, "Scoundrel", SCOUNDREL));
        }

        //fighter yellow
        theDeck.push(new ship("Yellow", "Fighter", 1, 1));
        theDeck.push(new ship("Yellow", "Fighter", 1, 1));
        theDeck.push(new ship("Yellow", "Fighter", 1, 1));
        theDeck.push(new ship("Yellow", "Fighter", 1, 1));
        theDeck.push(new ship("Yellow", "Fighter", 2, 2));
        theDeck.push(new ship("Yellow", "Fighter", 2, 2));
        theDeck.push(new ship("Yellow", "Fighter", 2, 2));
        theDeck.push(new ship("Yellow", "Fighter", 3, 4));
        theDeck.push(new ship("Yellow", "Fighter", 3, 4));
        theDeck.push(new ship("Yellow", "Fighter", 3, 4));

        //destroyer blue
        theDeck.push(new ship("Blue", "Destroyer", 1, 1));
        theDeck.push(new ship("Blue", "Destroyer", 1, 1));
        theDeck.push(new ship("Blue", "Destroyer", 1, 1));
        theDeck.push(new ship("Blue", "Destroyer", 2, 1));
        theDeck.push(new ship("Blue", "Destroyer", 2, 2));
        theDeck.push(new ship("Blue", "Destroyer", 2, 2));
        theDeck.push(new ship("Blue", "Destroyer", 3, 2));
        theDeck.push(new ship("Blue", "Destroyer", 3, 5));
        theDeck.push(new ship("Blue", "Destroyer", 3, 5));
        theDeck.push(new ship("Blue", "Destroyer", 4, 5));

        //bomber green
        theDeck.push(new ship("Green", "Bomber", 1, 1));
        theDeck.push(new ship("Green", "Bomber", 1, 1));
        theDeck.push(new ship("Green", "Bomber", 1, 1));
        theDeck.push(new ship("Green", "Bomber", 1, 1));
        theDeck.push(new ship("Green", "Bomber", 2, 3));
        theDeck.push(new ship("Green", "Bomber", 2, 3));
        theDeck.push(new ship("Green", "Bomber", 3, 3));
        theDeck.push(new ship("Green", "Bomber", 3, 5));
        theDeck.push(new ship("Green", "Bomber", 3, 5));
        theDeck.push(new ship("Green", "Bomber", 4, 5));

        //carrier red
        theDeck.push(new ship("Red", "Carrier", 1, 1));
        theDeck.push(new ship("Red", "Carrier", 1, 1));
        theDeck.push(new ship("Red", "Carrier", 1, 1));
        theDeck.push(new ship("Red", "Carrier", 2, 3));
        theDeck.push(new ship("Red", "Carrier", 2, 3));
        theDeck.push(new ship("Red", "Carrier", 2, 3));
        theDeck.push(new ship("Red", "Carrier", 3, 6));
        theDeck.push(new ship("Red", "Carrier", 3, 6));
        theDeck.push(new ship("Red", "Carrier", 3, 999));
        theDeck.push(new ship("Red", "Carrier", 4, 999));

        //dreadnought black
        theDeck.push(new ship("Black", "Dreadnought", 1, 2));
        theDeck.push(new ship("Black", "Dreadnought", 1, 2));
        theDeck.push(new ship("Black", "Dreadnought", 1, 2));
        theDeck.push(new ship("Black", "Dreadnought", 2, 4));
        theDeck.push(new ship("Black", "Dreadnought", 2, 4));
        theDeck.push(new ship("Black", "Dreadnought", 2, 4));
        theDeck.push(new ship("Black", "Dreadnought", 3, 7));
        theDeck.push(new ship("Black", "Dreadnought", 3, 7));
        theDeck.push(new ship("Black", "Dreadnought", 3, 999));
        theDeck.push(new ship("Black", "Dreadnought", 4, 999));

        //tariff
        theDeck.push(new tariff("Points", POINTS_TARIFF));
        theDeck.push(new tariff("Points", POINTS_TARIFF));
        theDeck.push(new tariff("Defense", DEFENSE_TARIFF));
        theDeck.push(new tariff("Defense", DEFENSE_TARIFF));

        //voyage
        theDeck.push(new voyage("Lab", new unit[]{new unit(4, 1, "Scientist", SCIENTIST), new unit(4, 1, "Scientist", SCIENTIST)}, 4, 2));

        theDeck.push(new voyage("Colony", new unit[]{new unit(4, 1, "Colonist", COLONIST), new unit(4, 1, "Colonist", COLONIST)}, 4, 2));

        theDeck.push(new voyage("Mine", new unit[]{new unit(4, 1, "Miner", MINER), new unit(4, 1, "Miner", MINER)}, 4, 2));

        theDeck.push(new voyage("Mining Colony", new unit[]{new unit(4, 1, "Miner", MINER), new unit(4, 1, "Miner", MINER), new unit(4, 1, "Colonist", COLONIST)}, 6, 3));

        theDeck.push(new voyage("Research Colony", new unit[]{new unit(4, 1, "Scientist", SCIENTIST), new unit(4, 1, "Scientist", SCIENTIST), new unit(4, 1, "Colonist", COLONIST)}, 6, 3));
        return theDeck;
    }
}
