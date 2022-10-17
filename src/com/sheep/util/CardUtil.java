package com.sheep.util;

import com.sheep.model.Card;

import java.util.Random;

/*
    common methods for card class
 */
public class CardUtil {
    public static Random random = new Random();
    public static String[] cardNames = {
            "刷子", "剪刀", "叉子", "手套", "水桶",
            "火", "玉米", "球", "瓶子", "白菜",
            "稻草", "肉腿", "胡萝卜", "苹果", "铃铛",
            "青草"
    };

    // get brand name randomly each time
    public static String getCardName() {
        int randomIndex = random.nextInt(cardNames.length);
        return cardNames[randomIndex];
    }

    // contruct array of randomly generated cards
    public static Card[] buildCards(Integer capacity){
        // construct all cards in current layer
        Card[] cards = new Card[capacity];

        // every 3 same cards put together will be eliminated
        // if the array capacity is not a multiple of 3, there will be out of bound error
        for (int i = 0; i < cards.length; i = i + 3) {

            String randomBrandName = getCardName();

            Card card1 = new Card(randomBrandName);
            Card card2 = new Card(randomBrandName);
            Card card3 = new Card(randomBrandName);

            cards[i] = card1;
            cards[i + 1] = card2;
            cards[i + 2] = card3;
        }

        // randomly swap the positions of the cards
        for (int i = 0; i < cards.length; i++) {
            Card card = cards[i];
            int randomIndex = random.nextInt(cards.length);
            Card swapedCard = cards[randomIndex];
            Card temp = card;
            cards[i] = swapedCard;
            cards[randomIndex] = temp;
        }

        return cards;
    }
}
