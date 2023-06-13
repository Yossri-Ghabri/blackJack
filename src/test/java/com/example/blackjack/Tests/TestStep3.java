package com.example.blackjack.Tests;

import com.example.blackjack.blackJack.Card;
import com.example.blackjack.blackJack.CardImp;
import com.example.blackjack.blackJack.Hand;
import com.example.blackjack.blackJack.HandImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStep3 {


    @Test
    public void should_have_blackJack_when_cards_are_ace_and_ten(){
        Card firstCard = new CardImp("A");
        Card secondCard = new CardImp("10");
        Hand hand = new HandImpl(firstCard , secondCard );
        assertEquals(21, hand.getPoints());
        assertTrue(hand.isBlackJack());
        assertFalse(hand.isBusted());
    }

    @Test
    public void should_be_busted_when_score_goes_above_21(){
        Card firstCard = new CardImp("10");
        Card secondCard = new CardImp("J");
        Card thirdCard = new CardImp("2");

        Hand hand = new HandImpl(firstCard , secondCard );
        hand.addCard(thirdCard);
        assertTrue(hand.isBusted());
        assertFalse(hand.isBlackJack());
    }
}
