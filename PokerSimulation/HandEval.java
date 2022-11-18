package PokerSimulation;

import java.util.ArrayList;
import java.util.Random;

public class HandEval
{
    private ArrayList<Card> hand = new ArrayList<>();
    private Deck deck = new Deck();
   
    public void draw(){
        Random rng = new Random(52);
        int decksRandomCard = rng.nextInt(52);
        Card singleCard = deck.draw(decksRandomCard);
        hand.add(singleCard);
    }
   
    public void drawhand(){
        for(int i = 0; i < 5; i++){
            draw();
        }
    }
   
    public boolean isPair(ArrayList<Card> hand){
       //logic to determine pair
        return true;
    }
}