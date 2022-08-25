package org.example;

public class Guest

{
private String name;
private String meal;
private int phoneNumber;
private boolean isVegan;

//Chcemy aby jak podamy goscia od razu nam się wyświetlalo co chce jesc czy jest weganienm itd wiec dlatego daje konstruktor

    public Guest(String name, String meal, int phoneNumber, boolean isVegan)
    {
        this.name=name;
        this.meal=meal;
        this.phoneNumber=phoneNumber;
        this.isVegan=isVegan;


    }

    //potrzebujemy tez opcji pobrania informacji o naszym gosciu czyli getery

    public String getName()
    {
        return name;

    }
    public String getMeal()
    {
        return meal;

    }


    public int getPhoneNumber()
    {
       return phoneNumber;

    }

    public boolean isVegan()
    {
        return isVegan;

    }
    public void dispalyGuestInformation()
    {
        System.out.println("Imie" + name);
        System.out.println("Preferowany posilek " + meal);
        System.out.println("Numer telefonu" + phoneNumber);
        String isVeganString= isVegan ?"tak":"nie";
        System.out.println("Weganin" + isVeganString);


    }

}
