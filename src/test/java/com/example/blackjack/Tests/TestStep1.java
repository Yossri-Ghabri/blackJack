package com.example.blackjack.Tests;

import com.example.blackjack.blackJack.Card;
import com.example.blackjack.blackJack.CardImp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestStep1 {

    @Test
    public void should_value_two_when_card_display_two() {
        Card card = new CardImp("2");
        assertEquals(2, card.getPoints());
        //assertTrue(2 == card.getPoints());
    }

    @Test
    public void should_value_seven_when_card_display_seven() {
        Card card = new CardImp("7");
        assertEquals(7, card.getPoints());
        //assertEquals(7, card.getPoints());
    }

    @Test
    public void should_value_ten_when_card_display_ten() {
        Card card = new CardImp("10");
        assertEquals(10, card.getPoints());
        //  assertEquals(11, card.getPoints());
    }



    @Test
    public void should_value_eleven_when_card_display_one() {
        Card card = new CardImp("1");
        assertEquals(11, card.getPoints());
    }


    @Test
    public void should_value_ten_when_card_display_J() {
        Card card = new CardImp("J");
        assertEquals(10, card.getPoints());
    }

    @Test
    public void should_value_ten_when_card_display_Q() {
        Card card = new CardImp("Q");
        assertEquals(10, card.getPoints());
    }

    @Test
    public void should_value_ten_when_card_display_king() {
        Card card = new CardImp("K");
        assertEquals(10, card.getPoints());
    }

    @Test
    public void should_value_eleven_when_card_display_ace() {
        Card card = new CardImp("A");
        assertEquals(11, card.getPoints());
    }

    @Test
    public void should_throw_arguments_when_card_unknown(){
        Card card = new CardImp("R");
        assertEquals(10, card.getPoints());
    }


}
