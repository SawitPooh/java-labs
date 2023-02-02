package janpan.sawit.lab6;

public class FootballerV2 extends AthleteV2 {

    public FootballerV2(String name, double weight, double height, Gender gender, String nationality,
            String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);// this use attributes from super class.

    }

    @Override // this overwrite method practice from class AthleteV2.
    public void practice() {
        System.out.println(name + " runs for 10 km and catches a football");// output String.
    }
}
