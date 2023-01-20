package janpan.sawit.lab5;

/*
 * This program Boxer extends Athlete class.
 * This class keep method for another class that want to use.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 1/20/2023
 */

public class Boxer extends Athlete {
    static String sport = "Boxing";
    private String division, golveSize;

    public Boxer(String name, double weight, double height, Gender gender, String nationality, String birthdate, String division, String golveSize) {
        //this method must have constructure becuase extend Athlete class  and take input cuurent parameter.
        super(name, weight, height, gender, nationality, birthdate);//this use attributes from super class. 
        this.division = division;//change instance division to division from parameter.
        this.golveSize = golveSize;//change instance golveSize to golveSize from parameter.
    }

    @Override//this overwrite method toString from class Athlete.
    public String toString() {
        //this method will return string.
        return String.format("%s, %skg, %sm, %s, %s, %s, %s, %s, %s", name, weight, height, gender, nationality, birthdate, sport, division, golveSize);
        //this use Format class .Each attributes must be go after %s. it must have comma with each attributes.After this will change to string and return.
        //%skg kg after s% is SI unit. example output is 1 kg.
    }
}