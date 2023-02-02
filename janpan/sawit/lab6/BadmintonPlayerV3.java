package janpan.sawit.lab6;

/*
 * This Program BadmintonPlayerV3 is class that keep method for another class that want to use.
 * This Program BadmintonPlayerV3 extends BadmintonPlayerV2 class and implements BadmintonPlayable,Sprinter class.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 2/2/2023
 */
public class BadmintonPlayerV3 extends BadmintonPlayerV2 implements BadmintonPlayable, Sprinter {
    protected int worldRanking;
    protected double racketLength, speed;

    public BadmintonPlayerV3(String name, double weight, double height, Gender gender, String nationality,
            String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);// this use attributes from super class.

    }

    public double getspeed() {
        // this method will return type double attribute speed.
        return speed;
    }

    public int getWorldRanking() {
        // this method will return type int attribute worldRanking.
        return worldRanking;
    }

    public double getRacketLength() {
        // this method will return type double attribute racketLength.
        return racketLength;
    }

    public void setSpeed(double speed) {
        // this method will change current attribute to new attribute from parameter.
        this.speed = speed;
    }

    public void setWorldRanking(int worldRanking) {
        // this method will change current attribute to new attribute from parameter.
        this.worldRanking = worldRanking;
    }

    public void setRacketLength(double racketLength) {
        // this method will change current attribute to new attribute from parameter.
        this.racketLength = racketLength;
    }

    @Override // this overwrite method practice from superclass.
    public String toString() {
        // this method will return string.
        return String.format(
                "Athlete [%s, %skg, %sm, %s, %s, %s]\n%s is a Badminton player whose world ranking is %s and has sprint speed as %s",
                name, weight, height, gender, nationality,
                birthdate, name, worldRanking, speed);
        // this use Format class .Each attributes must be go after %s. it must have
        // comma with each attributes.After this will change to string and return.
    }

}
