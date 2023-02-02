package janpan.sawit.lab6;

/*
 * This Program BadmintonPlayable is interface class that keep method for another class that want to use.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 2/2/2023
 */
//define interface class.
interface BadmintonPlayable {
    double racketLength = 0;// attribute in class.
    int worldRanking = 0;// attribute in class.

    public double getRacketLength();// interface method (does not have a body)

    public void setRacketLength(double racketLength);// interface method (does not have a body)

    public int getWorldRanking();// interface method (does not have a body)

    public void setWorldRanking(int worldRanking);// interface method (does not have a body)
}
