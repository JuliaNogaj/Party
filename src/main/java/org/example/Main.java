package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue= true; // Ta petla sie wykonuje

       Party party = new Party();

       // Pętla
        while (shouldContinue) {

            System.out.println("Wybierz opcje ");
            System.out.println("1. Wyswietl gosci");
            System.out.println("2. Dodaj goscia ");
            System.out.println("3 . Wyswietl potrawy ");
            System.out.println(" 4. Znajdz po numerze telefonu");
            System.out.println("5.Wyjscie");

        int userChoice = scanner.nextInt(); // zeby wybrac numer
        switch(userChoice) // przełącz
        {
            // Klasa main gdzie wywoluje metody
            case 1 -> party.displayGuest();
            case 2 -> party.addGuest();
            case 3 -> party.displayMeals();
            case 4 -> party.dispalyGuestByPhoneNumber();
            case 5 -> shouldContinue = false; // Ustawiamy na false bo chcemy ze jak wybierzemy piątkę zeby ta pętla się wykonywala


        }

        }
    }
}