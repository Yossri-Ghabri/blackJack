package com.example.blackjack.Tests;

import com.example.blackjack.blackJack.Card;
import com.example.blackjack.blackJack.CardImp;
import com.example.blackjack.blackJack.Hand;
import com.example.blackjack.blackJack.HandImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStep4 {

    @Test
    public void should_be_have_fifteen_when_cards_are_ten_and_four_nad_ace() {
        Card  firstCard = new CardImp("10");
        Card  secondCard = new CardImp("4");
        Card  thirdCard = new CardImp("A");

        Hand hand = new HandImpl(firstCard ,secondCard);
        hand.addCard(thirdCard);
       assertEquals(15, hand.getPoints());
      //  assertTrue(15 == hand.getPoints());
        assertFalse(hand.isBlackJack());
        assertTrue(hand.isBusted());
    }



    @Test
    public void should_be_have_twenty_two_and_busted_when_cards_are_ten_and_four_and_seven_nad_ace() {
        Card  firstCard = new CardImp("10");
        Card  secondCard = new CardImp("4");
        Card  thirdCard = new CardImp("7");
        Card  fourthCard = new CardImp("A");

        Hand hand = new HandImpl(firstCard ,secondCard);
        hand.addCard(thirdCard);
        hand.addCard(fourthCard);

    //    assertEquals(22, hand.getPoints());
        //   assertTrue(15 == hand.getPoints());
        assertFalse(hand.isBlackJack());
        assertTrue(hand.isBusted());
    }



    @Test
    public void should_be_have_twelve_when_hand_already_contains_ace() {
        Card  firstCard = new CardImp("A");
        Card  secondCard = new CardImp("6");
        Card  thirdCard = new CardImp("4");
        Card  lastCard = new CardImp("A");

        Hand hand = new HandImpl(firstCard ,secondCard);
        hand.addCard(thirdCard);
        hand.addCard(lastCard);

      //  assertEquals(12, hand.getPoints());
        //   assertTrue(15 == hand.getPoints());
        assertFalse(hand.isBlackJack());
        assertTrue(hand.isBusted());
    }
}
