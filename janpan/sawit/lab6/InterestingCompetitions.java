package janpan.sawit.lab6;

//import class to use.
import java.util.ArrayList;

/*
 * This Program  InterestingCompetitions will call method with other class and use method that class.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 2/2/2023
 */
public class InterestingCompetitions {
    public static void main(String[] args) {
        AFFChampionship aff2022 = new AFFChampionship("AFF 2022", "Thailand", "Vietnam");
        AFFChampionship aff2020 = new AFFChampionship("AFF 2020", "Thailand", "Indonesia");
        System.out.println(aff2020);
        System.out.println(aff2022);

        ArrayList<String> places = new ArrayList<String>();
        places.add("Hanoi");
        places.add("Bankok");
        aff2022.setPlaces(places);
        ArrayList<String> sponsors = new ArrayList<String>();
        sponsors.add("Mitsubishi Electronics");
        aff2022.setSponsorship(sponsors);

        places.remove("Hanoi");
        places.add("Kallang");
        aff2020.setPlaces(places);
        sponsors.remove("Mitsubishi Electronics");
        sponsors.add("Suzuki");
        sponsors.add("Yanmar");
        aff2020.setSponsorship(sponsors);
    }
}
