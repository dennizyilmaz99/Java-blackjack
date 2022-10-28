package com.someName.projektarbete;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String player;
        int betDollar;
        int choice;
        int hit = 1;
        int stand = 2;

        System.out.println("Hello and welcome to the finest Blackjack game in the city!");
        System.out.println("First of all what is your name champ?");
        player = scanner.nextLine();

        System.out.println("That's a great name just like our new champ!");
        System.out.println();
        System.out.println("Okey now! You have 1000$ to play with. How much do you want to bet? PS. You can only bet from 2$ to 500$");
        betDollar = scanner.nextInt();
        if (betDollar > 500){
            System.out.println("Your bet can't be more than 500$");
        }
        if (betDollar < 2){
            System.out.println("Your bet can't be less than 2$");
        } else {
            System.out.println();
            System.out.println("Congrats champ!, you have now " + betDollar + "$");
        }
        System.out.println("The game starts now! Good luck champ!");
        System.out.println();
        System.out.println("The dealer gave you:");

        Deck deckTemplate = new Deck();

        List<Card> deckOfCards = deckTemplate.generateDeck();
        List<Card> totalOfCards = deckOfCards;

        System.out.println(deckOfCards.get(1));
        System.out.println(deckOfCards.get(2));
        System.out.println("Your hand is: "  );

        System.out.println();
        System.out.println("Do you want to (1)Hit or (2)Stand?");
        choice = scanner.nextInt();
        if (choice == hit) {
            System.out.println("The dealer has given you " + deckOfCards.get(3));
        } else if (choice == stand) {
            System.out.println("You chose to stand");
        } else {
            System.out.println("Please choose a number between 1 or 2");
        }
        System.out.println("You have now ");

    }
}
