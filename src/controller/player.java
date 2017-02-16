package controller;

import model.card;
import model.deck;
import java.util.*;

/**
 * Created by ckubec on 12/15/16.
 */
public class player {
    private ArrayList<card> cards;
    private LinkedList<card> coins;

    public player(){
        cards = new ArrayList<>();
        coins = new LinkedList<>();
    }

    public void drawCoin(deck theDeck, deck theDiscard){

        try {
            this.coins.add(theDeck.pop());
        } catch(EmptyStackException e) {
            theDeck.reshuffle(theDiscard);
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public int coinCount(){
        return coins.size();
    }

    public void buy(ArrayList<card> theStation, int card, deck theDiscard, player thePlayer){
        if (payCoins(theStation.get(card).getCost(), theDiscard, thePlayer)){
            cards.add(theStation.get(card));
            theStation.remove(card);
        } else {
            System.out.println("You Broke, get more Moneys");
        }
    }

    private boolean payCoins(int theCost, deck theDiscard, player thePlayer) {
        if(this == thePlayer) {
            if (theCost > coins.size()) {
                return false;
            } else {
                for (int i = 0; i < theCost; i++) {
                    theDiscard.push(coins.poll());
                }
                return true;
            }
        } else {
            if (theCost + 1 > coins.size()) {
                return false;
            } else {
                for (int i = 0; i < theCost; i++) {
                    theDiscard.push(coins.poll());
                }
                thePlayer.coins.push(this.coins.pop());
                return true;
            }
        }
    }

    public String toString(){
        String arsenal = " ";
        for(int i=0; i<cards.size(); i++){
            arsenal += cards.get(i).toString() + " ";
        }
        return arsenal + " Coins: " + coinCount();
    }

}
