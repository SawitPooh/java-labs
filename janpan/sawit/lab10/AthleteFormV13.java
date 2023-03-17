package janpan.sawit.lab10;
///////// HAVE  TWO TIME DIALOG  WHEN ADD ///////////
/*
 * This GUI Program AthleteFormV12 will show interface more information than AthleteFormV11.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 17/3/2023
 */
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import janpan.sawit.lab5.Athlete;
import janpan.sawit.lab6.AthleteV2;

public class AthleteFormV13 extends AthleteFormV12 {
    public AthleteFormV13(String tilte) {
        super(tilte);
    }

    public static void createAndShowGUI() {
        AthleteFormV12 athleteV13 = new AthleteFormV13("Athlete Form V13");// declare object to use for instance method
        // cause in this static method can't use.
        athleteV13.addComponents();// call instance method by object
        athleteV13.initValues();
        athleteV13.addMenus();
        athleteV13.addListener();
        athleteV13.selection_list();
        athleteV13.enableKeyboard();
        athleteV13.setFrameFeatures();
    }

    @Override
    public void addAthlete() {
        super.getValues();
        name_athletestr = name_field.getText();
        gender_athletestr = result_gender;
        if (gender_athletestr.equals("Male")) {
            gender_athlete = Athlete.Gender.MALE;
        } else {
            gender_athlete = Athlete.Gender.FEMALE;
        }
        nation_athletestr = String.format("%s ", nationbox.getSelectedItem());
        birth_athletestr = birth_field.getText();
        try {
            weight_athletestr = weight_field.getText();
            weight_athleteDouble = Double.parseDouble(weight_athletestr);
            if (weight_athleteDouble <= 0.0) {
                JOptionPane.showMessageDialog(null, "Weight should be greater than 0");
            } else if (weight_athleteDouble > 200.0) {
                JOptionPane.showMessageDialog(null, "Weight should be less than 200.0");
            }
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Please enter valid number of height");
        }
        try {
            height_athletestr = height_field.getText();
            height_athleteDouble = Double.parseDouble(height_athletestr);
            if (height_athleteDouble <= 0.0) {
                JOptionPane.showMessageDialog(null, "Height should be greater than 0");
            } else if (height_athleteDouble > 300.0) {
                JOptionPane.showMessageDialog(null, "Height should be less than 300.0");
            }

        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Please enter valid number of height");
        }
        athleteV2 = new AthleteV2(name_athletestr, weight_athleteDouble, height_athleteDouble, gender_athlete,
                nation_athletestr, birth_athletestr);
        athlete_list.add(athleteV2);
        size_athlete = athlete_list.size();
        for (int i = 0; i < size_athlete; i++) {
            add_athlete = String.format("%s", athlete_list.get(i));
        }
        JOptionPane.showMessageDialog(null, add_athlete);

    }

    @Override // method listener from actionPerform
    public void actionPerformed(ActionEvent event) {
        // this method use for run event
        Object srcObject = event.getSource();
        if ((srcObject == weight_field) || (srcObject == height_field)) {
            if (srcObject == weight_field) {
                try {
                    weight_athletestr = weight_field.getText();
                    weight_athleteDouble = Double.parseDouble(weight_athletestr);
                    if (weight_athleteDouble <= 0.0) {
                        JOptionPane.showMessageDialog(null, "Weight should be greater than 0");
                    } else if (weight_athleteDouble > 200.0) {
                        JOptionPane.showMessageDialog(null, "Weight should be less than 200.0");
                    } else {
                        super.actionPerformed(event);// call super class
                    }
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(null, "Please enter valid number of weight");
                }
            } else if (srcObject == height_field) {
                try {
                    height_athletestr = height_field.getText();
                    height_athleteDouble = Double.parseDouble(height_athletestr);
                    if (height_athleteDouble <= 0.0) {
                        JOptionPane.showMessageDialog(null, "Height should be greater than 0");
                    } else if (height_athleteDouble > 300.0) {
                        JOptionPane.showMessageDialog(null, "Height should be less than 300.0");
                    } else {
                        super.actionPerformed(event);// call super class
                    }
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(null, "Please enter valid number of height");
                }
            }
        } else {
            super.actionPerformed(event);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }
}
