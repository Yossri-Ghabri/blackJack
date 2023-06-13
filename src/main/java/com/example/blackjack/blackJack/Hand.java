package com.example.blackjack.blackJack;

public interface Hand {
    public void addCard(Card card);
    public boolean isBusted();
    public boolean isBlackJack();
    public int getPoints();
}
