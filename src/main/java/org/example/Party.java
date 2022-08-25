package org.example;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class Party

{
    //Lista gosci
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer,Guest> phoneToGuest = new HashMap<>();
    Scanner scanner = new Scanner(System.in); // zeby pobrac imie goscia

    // metoda ktora dodoaje uzytkownikow do listy
    //void zwraca , void oznacza  ze nie zwarca zadnego typu

    public void addGuest () // ta metoda jestt publiczna zeby dodoawac z listy innych uzytkownikow
            // void bo nasza metoda nic nie zwraca ona ma tylko dodawac
    {
        System.out.println("Podaj imie goscia");
        String name = scanner.nextLine();

        System.out.println("Podaj preferowany posilek");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu goscia");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Czy jest veganinem");
        String isVeganString = scanner.nextLine();

        boolean isVegan;
        if(isVeganString.equals("Y")) {

            isVegan=true;

        } else
        {
            isVegan=false;

        }

        // majac juz to tworze obiekt klasy guest

        Guest guest = new Guest(name, meal,phoneNumber,isVegan);


        meals.add(meal);
        phoneToGuest.put(phoneNumber, guest);
guests.add(guest);


    }

    //metoda ktora wyswietli posilki

    public void displayMeals()
    {
        for(String meal : meals)
        {
System.out.println(meal);

        }

    }

    //metoda ktora wyszuka gosci po numerze telefonu

    public void dispalyGuestByPhoneNumber()
    {
        System.out.println("Podaj numer telefonu");
        Integer phoneNumber=Integer.valueOf(scanner.nextLine());
        phoneToGuest.get(phoneNumber);
        Guest guest=phoneToGuest.get(phoneNumber);

        guest.dispalyGuestInformation();

    }

    // metoda ktora zwraca liste gosci

    public void  displayGuest()
    {
    for(Guest guest:guests)
    {
        guest.dispalyGuestInformation();
    }

    }
    
}
