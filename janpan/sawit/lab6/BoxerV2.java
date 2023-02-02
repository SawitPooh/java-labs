package janpan.sawit.lab6;

/*
 * This Program BoxerV2 is class that keep method for another class that want to use.
 * This Program BoxerV2  extends AthleteV2 class.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 2/2/2023
 */
public class BoxerV2 extends AthleteV2 {

    public BoxerV2(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);// this use attributes from super class.

    }

    @Override // this overwrite method practice from class AthleteV2.
    public void practice() {
        System.out.println(name + " runs for 10 km and swings arms");// output String.
    }
}
