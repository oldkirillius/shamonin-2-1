package main;

import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        final int numppl =4;

        String street1 = "Rymskoho-Korsakova";
        String street2 = "Kharkivska";


        Person[] pers = new Person[numppl];

        pers[0] = new Person("Kiril", street1, 30, 07, 1999);
        pers[1] = new Person("Max", street1, 05, 11, 1985);
        pers[2] = new Person("Den", street1, 12, 10, 1777);
        pers[3] = new Person("Aliona", street2, 01, 12, 2001);

        FileWriter file = new FileWriter("result.txt",true);

        Scanner sc = new Scanner(System.in);
        System.out.println("Имя для поиска:");
        String finduser = new String(sc.nextLine());

        //поиск человека

        for (int i = 0; i<pers.length; i++){
            if (finduser.equals(pers[i].getName()) == true){
                System.out.println("User " + pers[i].getName() + " found");
                file.write("User " + pers[i].getName() + " found" + "\n");

            }
        }

        // поиск человека по адресу
        System.out.println("Адрес для поиска:");
        String finduseraddr = new String(sc.nextLine());
        for (int i = 0; i<pers.length; i++){
            if (finduseraddr.equals(pers[i].getStreet()) == true){
                System.out.println("User " + pers[i].getName() + " found");
                file.write("User " + pers[i].getName() + " found" + "\n");

            }
        }
int a1 = pers[0].getyear(), a2 = pers[0].getyear();
        int b1 = 0, b2 = 0;
        // Самый старый
        for (int i =0; i<pers.length;i++)
            for (int j =0; j<pers.length;j++){
            if (pers[i].getyear() < pers[j].getyear()) b1 = i;
            if (pers[i].getyear() > pers[j].getyear()) b2 = i;

        }
System.out.println("Самый старый + " + pers[b2]);
            System.out.println( "Самый молодой + " + pers[b1]);

        //человек на 1 улице
        for(int i = 0;i<pers.length;  i++ ){

            for(int j = 0;j<pers.length;  j++ ){
                if (pers[i].getStreet() == pers[j].getStreet() & pers[i].getName() != pers[j].getName())
                    System.out.println("Людина " + pers[i].getName() + " живуть разом з "+pers[j].getName());
                file.write ("Людина " + pers[i].getName() + " живуть разом з "+pers[j].getName() + "\n");
            }
        }
    }
}
