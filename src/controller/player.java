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

    public void player(){
        cards = new ArrayList<>();
        coins = new LinkedList<>();
    }

    public void drawCoin(deck theDeck){
        coins.add(theDeck.pop());
    }

    public int coinCount(){
        return coins.size();
    }

    public boolean payCoins(int theCost, deck theDiscard) {
        if (theCost > coins.size()) {
            return false;
        } else {
            for (int i=0; i<theCost; i++) {
                theDiscard.push(coins.poll());
            }
            return true;
        }
    }

}
