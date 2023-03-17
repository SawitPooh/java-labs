package janpan.sawit.lab10;
/*
 * This Program HeightWeightComparator is class that keep method forcompare height and weight.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 17/3/2023
 */
import java.util.Comparator;
import janpan.sawit.lab6.AthleteV2;

public class HeightWeightComparator implements Comparator<AthleteV2> {
    @Override
    public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
        Double height1 = athlete1.getHeight();
        Double height2 = athlete2.getHeight();
        Double weight1 = athlete1.getWeight();
        Double weight2 = athlete2.getWeight();
        if (height1 > height2) {
            return 1;
        } else if (height1 < height2) {
            return -1;
        } else {
            if (weight1 > weight2) {
                return 1;
            } else if (weight1 < weight2) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
