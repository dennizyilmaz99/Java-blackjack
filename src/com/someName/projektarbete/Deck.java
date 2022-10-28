package com.someName.projektarbete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private final List<Card> deckList = new ArrayList<>(52);


    public List<Card> generateDeck() {

        final int[]


        final String[] cardSymbols = {
                " of Hearts ♥",      " of Spades ♤",
                " of Diamonds ♢ ",   " of Clubs ♧" };

        final String[] cardValues = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace" };

        for (String cardSymbol : cardSymbols) {

            for (String cardValue : cardValues) {
                Card card = new Card();
                card.setCardSymbol(cardSymbol);
                card.setCardValue(cardValue);
                deckList.add(card);
            }
            Collections.shuffle(deckList);
        }

        return deckList;
    }
}
