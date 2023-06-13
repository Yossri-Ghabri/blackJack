package com.example.blackjack.blackJack;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardImp implements Card {

    private String value;

    @Override
    public int getPoints() {
        if (value == null || value.equals("")) {
            return 0;
        }
        if (value.equals("A") || value.equals("1")) {
            this.value = "11";
        }
        if (value.equals("K") || value.equals("J") || value.equals("Q") || value.equals("R")) {
            this.value = "10";
        }
        return Integer.parseInt(value);
    }

    @Override
    public String getValue() {
        return value;
    }
}
