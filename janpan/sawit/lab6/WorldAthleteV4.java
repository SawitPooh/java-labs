package janpan.sawit.lab6;

//import class to use.
import java.util.*;
import janpan.sawit.lab5.*;

/*
 * This Program  WorldAthleteV4 will call method with other class and use method that class.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 2/2/2023
 */

public class WorldAthleteV4 {
    public static void main(String[] args) {
        BadmintonPlayerV3 akane = new BadmintonPlayerV3("Akane Yamaguchi", 55, 1.68, Athlete.Gender.FEMALE, "Japan",
                "05/02/1997");
        BadmintonPlayerV3 ratchanok = new BadmintonPlayerV3("Ratchanok Intanon", 55, 1.68, Athlete.Gender.FEMALE,
                "Thai", "05/02/1995");
        akane.setWorldRanking(1);
        ratchanok.setWorldRanking(6);
        akane.setSpeed(4);
        ratchanok.setSpeed(6);
        ArrayList<BadmintonPlayerV3> badmintonPlayers = new ArrayList<BadmintonPlayerV3>();
        badmintonPlayers.add(akane);
        badmintonPlayers.add(ratchanok);
        for (BadmintonPlayerV3 badmintonPlayer : badmintonPlayers) {
            System.out.println(badmintonPlayer);
        }

    }
}
