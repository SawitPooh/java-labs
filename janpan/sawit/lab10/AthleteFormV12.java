package janpan.sawit.lab10;
/*
 * This GUI Program AthleteFormV12 will show interface more information than AthleteFormV11.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 17/3/2023
 */

import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.event.*;

//add method getweight to athleteV2
public class AthleteFormV12 extends AthleteFormV11 {
    public AthleteFormV12(String title) {
        super(title);

    }

    public static void createAndShowGUI() {
        AthleteFormV12 athleteV12 = new AthleteFormV12("Athlete Form V13");// declare object to use for instance method
        // cause in this static method can't use.
        athleteV12.addComponents();// call instance method by object
        athleteV12.initValues();
        athleteV12.addMenus();
        athleteV12.addListener();
        athleteV12.selection_list();
        athleteV12.enableKeyboard();
        athleteV12.setFrameFeatures();
    }

    @Override
    public void addListener() {
        super.addListener();
        sortBy_height.addActionListener(this);
        sortBy_name.addActionListener(this);
        sortBy_height_weight.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object srcObject = event.getSource();
        if (srcObject == sortBy_height) {
            compareHeight_athlete();

        } else if (srcObject == sortBy_name) {
            compareName_athlete();
        } else if (srcObject == sortBy_height_weight) {
            compareHeight_Weight_athlete();
        }
    }

    // method compare height
    public void compareHeight_athlete() {
        Collections.sort(athlete_list, new HeightComparator());
        String result_compare_athletes = String.format("There are %s athlete as follows:\n", size_athlete);
        for (int i = 0; i < athlete_list.size(); i++) {
            result_compare_athletes += String.format("%s.%s\n", i + 1, athlete_list.get(i));
        }
        JOptionPane.showMessageDialog(null, result_compare_athletes);
    }

    // method compare height after that will compare weight
    public void compareHeight_Weight_athlete() {
        Collections.sort(athlete_list, new HeightWeightComparator());
        String result_compare_athletes = String.format("There are %s athlete as follows:\n", size_athlete);
        for (int i = 0; i < athlete_list.size(); i++) {
            result_compare_athletes += String.format("%s.%s\n", i + 1, athlete_list.get(i));
        }
        JOptionPane.showMessageDialog(null, result_compare_athletes);
    }

    // compare name to sequnce like A-Z
    public void compareName_athlete() {
        Collections.sort(athlete_list, new NameComparator());
        String result_compare_athletes = String.format("There are %s athletes as follows:\n", size_athlete);
        for (int i = 0; i < athlete_list.size(); i++) {
            result_compare_athletes += String.format("%s.%s\n", i + 1, athlete_list.get(i));
        }
        JOptionPane.showMessageDialog(null, result_compare_athletes);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
