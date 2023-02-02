package janpan.sawit.lab6;

//import class to use.
import java.util.ArrayList;

/*
 * This Program AFFChampionship is class that keep method for another class that want to use.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 2/2/2023
 */
public class AFFChampionship extends Competition {
    protected String teamA, teamB;

    public AFFChampionship(String name, String teamA, String teamB) {
        this.name = super.name_get(name);// change instance variable to variable from parameter and use attributes from super class.
        this.teamA = super.region_get(teamA);// change instance variable to variable from parameter and use attributes from super class.
        this.teamB = super.region_get(teamB);// change instance variable to variable from parameter and use attributes from super class.
    }

    public void setDescription() {
        // void method
    }

    public void setSponsorship(ArrayList<String> sponsors) {
        // this method will ouput string from array sponsors by sequence position and output it.
        int num_size = sponsors.size();
        if (num_size == 1) {
            for (String i : sponsors) {
                System.out.println(i + " is a sponsor of AFF 2022");
            }
        } else {
            System.out.print("Sponsors of AFF 2020 are " + sponsors);
            System.out.println();
        }
    }

    public void setPlaces(ArrayList<String> places) {
        // this method will output place that set to play.
        System.out.println(name + " plays at these stadiums \n" + places);

    }

    public String toString() {
        // this method will return string.
        return name + " in the final round was the game between " + teamA + " vs " + teamB + ".";
    }

}
