package janpan.sawit.lab6;

/*
 * This Program Sprinter is interface class that keep method for another class that want to use.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 2/2/2023
 */
//define interface class.
public interface Sprinter {
    double speed = 0;// attribute in class.

    public double getspeed();// interface method (does not have a body)

    public void setSpeed(double speed);// interface method (does not have a body)
}
