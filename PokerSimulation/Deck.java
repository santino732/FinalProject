package PokerSimulation;

import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> cards;
   
    public Deck(){
        cards = new ArrayList<>();
        for (int i = 0; i <=13; i++){
            for(int j = 1; j <=4; j++){
                cards.add(new Card(i,j));
            }
        }
       
    }

	public Card draw(int index) {
		 Card temp = cards.get(index);
	      return cards.get(index);
	}
}