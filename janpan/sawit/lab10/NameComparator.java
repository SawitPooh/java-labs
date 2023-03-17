package janpan.sawit.lab10;
/*
 * This Program NameComparator is class that keep method for compare name.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 17/3/2023
 */
import java.util.Comparator;
import janpan.sawit.lab6.AthleteV2;

public class NameComparator implements Comparator<AthleteV2> {
    @Override
    public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
        int nameCompare1 = athlete1.getName().compareTo(athlete2.getName());// sequence from name1 - name2
        if (nameCompare1 > 0) {
            return 1;
        } else if (nameCompare1 < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
