package janpan.sawit.lab6;

//import class to use.
import janpan.sawit.lab5.Athlete;

/*
 * This Program AthleteV2 is class that keep method for another class that want to use.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 2/2/2023
 */
public class AthleteV2 extends Athlete {

    public AthleteV2(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);// this use attributes from super class.

    }

    public void practice() {
        System.out.println(name + "runs for 10 km");// output String.
    }
}
