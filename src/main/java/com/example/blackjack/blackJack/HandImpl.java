package com.example.blackjack.blackJack;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class HandImpl implements Hand {

    private Card firstCard;
    private Card secondCard;
    private List<Card> listCards;

    public HandImpl(Card firstCard, Card secondCard) {
        this.firstCard = firstCard;
        this.secondCard = secondCard;
        listCards =  new ArrayList<>();
        listCards.add(firstCard);
        listCards.add(secondCard);
    }

    @Override
    public void addCard(Card card) {
        listCards.add(card);
    }

    @Override
    public boolean isBusted() {
        if(getPoints()>21){
            return true;
        }else
        return false;
    }

    @Override
    public boolean isBlackJack() {
        if(getPoints()==21|| listCards.size()==2){
            return true;
        }else return false;
    }

    @Override
    public int getPoints() {
        if(firstCard==null || secondCard==null){
            return 0;
        }

        var sum = listCards.stream().map(e-> e.getPoints())
                .mapToInt(Integer::intValue).sum();
        return sum;
    }
}
