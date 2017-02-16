package model;

import java.util.Collections;
import java.util.Stack;

/**
 * Created by ckubec on 12/15/16.
 */
public class deck extends Stack<card> {

    public deck(){

    }

    public void shuffle(){
        Collections.shuffle(this);
    }

    public void reshuffle(deck theDiscard){
        while(theDiscard.size() > 0){
            this.push(theDiscard.pop());
        }
        this.shuffle();
    }


}
