package janpan.sawit.lab5;

//import class to use.
import java.time.LocalDate;
import java.time.Period;

/*
 * This program BadmintonPlayer extends Athlete class.
 * This class keep method for another class that want to use.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 1/20/2023
 */

public class BadmintonPlayer extends Athlete {
    static String sport = "Badminton";
    private double racketLength;
    private int worldRanking;

    public BadmintonPlayer(String name, double weight, double height, Gender gender, String nationality, String birthdate, double racketLength, int worldRanking) {
        //this method must have constructure becuase extend Athlete class  and take input cuurent parameter.
        super(name, weight, height, gender, nationality, birthdate);//this use attributes from super class. 
        this.racketLength = racketLength;//change instance racketLength to racketLength from parameter.
        this.worldRanking = worldRanking;//change instance worldRanking to worldRanking from parameter.
    }

    public static String getSport() {
        //this method will return type string attribute sport. 
        return sport;
    }

    public void compareAge(Athlete athlete) {
        //this method use for calculate age and compare two age.
        LocalDate athlete_birthdate = LocalDate.parse(athlete.birthdate);
        //the parse() method obtains an instance of LocalDate from a text string such as 1992-08-11  
        LocalDate ratchanok_birthdate = LocalDate.parse(birthdate);
        int year_apart = Period.between(athlete_birthdate, ratchanok_birthdate).getYears();
        //Period.between is method to compare two of ages and output ages that difference. 
        System.out.println(athlete.name + " is " + year_apart + " years older than " + name);
    }

    @Override//this overwrite method toString from class Athlete.
    public String toString() {
        //this method will return string.
        return String.format("%s, %skg, %sm, %s, %s, %s, %s, %scm, rank:%s", name, weight, height, gender, nationality, birthdate, sport, racketLength, worldRanking);
        //this use Format class .Each attributes must be go after %s. it must have comma with each attributes.After this will change to string and return.
        //%skg kg after s% is SI unit. example output is 1 kg.
    }
}
