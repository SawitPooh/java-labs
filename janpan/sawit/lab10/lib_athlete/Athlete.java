package janpan.sawit.lab5;
//import class to use.
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

/*
 * This Program Athlete is class that keep method for another class that want to use.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 1/20/2023
 */

public class Athlete {
    protected String name, nationality, birthdate;
    protected double weight, height;
    protected Gender gender;

    public enum Gender {
        //this method is enum that have two types.it has MALE and FEMALE.
        MALE,
        FEMALE
    }
    
    public Athlete(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        this.name = name;//change instance name to name from parameter.
        this.weight = weight;//change instance weight to weight from parameter.
        this.height = height;//change instance height to height from parameter.
        this.gender = gender;//change instance gender to gender from parameter.
        this.nationality = nationality;//change instance nationality to nationality from parameter.
        this.birthdate = getBirtdate(birthdate);//change instance birthdate to method  getBirtdate.

    }

    public double getHeight() {
        //this method will return type double attribute height. 
        return height;
    }

    public void setHeight(double height) {
        //this method will change current height attribute to new height from parameter.
        this.height = height;
    }

    public String getName() {
        //this method will return type string attribute name. 
        return name;
    }

    public String getBirtdate(String birthdate) {
        //this method use to get datebirth. 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");//this formatter object has pattern dd/MM/yyyy .
        LocalDate date_of_birth = LocalDate.parse(birthdate, formatter);//this parameter birthday will change pattern to yyyy-MM-dd .
        return String.format("%s", date_of_birth);//change date_of_birth to string by format method. 
    }

    public String toString() {
        //this method will return string.
        return String.format("Athlete [%s, %skg, %sm, %s, %s, %s]", name, weight, height, gender, nationality, birthdate);
        //this use Format class .Each attributes must be go after %s. it must have comma with each attributes.After this will change to string and return.
    }

}
