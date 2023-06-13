package com.example.blackjack.Tests;

import com.example.blackjack.blackJack.Card;
import com.example.blackjack.blackJack.CardImp;
import com.example.blackjack.blackJack.Hand;
import com.example.blackjack.blackJack.HandImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestStep2 {

    @Test
    public void should_value_four_points_when_cards_are_two_and_two(){
        Card firstCard = new CardImp("2");
        Card secondCard = new CardImp("2");
        Hand hand = new HandImpl(firstCard,secondCard);
        assertEquals(4, hand.getPoints());
      //  assertTrue(4 == hand.getPoints());
    }

    @Test
    public void should_value_have_fourteen_points_when_cards_are_eight_and_six(){
        Card firstCard = new CardImp("8");
        Card secondCard = new CardImp("6");
        Hand hand = new HandImpl(firstCard,secondCard);
        assertEquals(14, hand.getPoints());
        //  assertTrue(4 == hand.getPoints());
    }


    @Test
    public void should_value_nineteen_fourteen_points_when_cards_are_eight_and_six_and_five(){
        Card firstCard = new CardImp("8");
        Card secondCard = new CardImp("6");
        Card thirdCard = new CardImp("5");

        Hand hand = new HandImpl(firstCard,secondCard);
        hand.addCard(thirdCard);
        assertEquals(19, hand.getPoints());
        //  assertTrue(4 == hand.getPoints());
    }

    @Test
    public void should_value_seventeen_points_when_cards_are_four_and_five_and_two_and_six(){
        Card firstCard = new CardImp("4");
        Card secondCard = new CardImp("5");
        Card thirdCard = new CardImp("2");
        Card fourthCard = new CardImp("6");

        Hand hand = new HandImpl(firstCard,secondCard);
        hand.addCard(thirdCard);
        hand.addCard(fourthCard);
        assertEquals(17, hand.getPoints());
        //  assertTrue(4 == hand.getPoints());
    }
}
