package main;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person extends Address {

private String name;

private Date dateOfBirth;

private int day, month, year;
private Calendar bday;


    public Person(String name, String street,  int day, int month, int year){
        super(street);

        this.name = name;
        this.street = street;

        this.bday = Calendar.getInstance();

        this.year = year;

        this.bday.set(year,month,day);
    }

    public String getName(){
        return name;
    }

    public int getyear(){
        return  year;
    }


}
