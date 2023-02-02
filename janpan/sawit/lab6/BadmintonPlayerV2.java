package janpan.sawit.lab6;

/*
 * This Program BadmintonPlayerV2 is class that keep method for another class that want to use.
 * This Program BadmintonPlayerV3 extends BadmintonPlayerV2 class.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 2/2/2023
 */
public class BadmintonPlayerV2 extends AthleteV2 {

    public BadmintonPlayerV2(String name, double weight, double height, Gender gender, String nationality,
            String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);// this use attributes from super class.

    }

    @Override // this overwrite method practice from superclass.
    public void practice() {
        System.out.println(name + " runs for 10 km and plays half court singles");// output String.
    }
}
