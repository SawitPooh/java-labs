package janpan.sawit.lab11;

/*
 * This GUI Program AthleteFormV15 will write hobbies to text file and years experience and athlete to binary file for you.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 24/3/2023
 */

//import class to use 
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import janpan.sawit.lab5.Athlete;
import janpan.sawit.lab6.AthleteV2;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//Change class AthleteV2 and its parent (Athlete) to implement java.io.Serializable 
//Remove or Comment out DateTimeFormatter formatter from class instance attributes

public class AthleteFormV16 extends AthleteFormV15 {
    protected String result_fileAthlete;

    public AthleteFormV16(String tilte) {
        super(tilte);

    }

    public static void createAndShowGUI() {
        AthleteFormV16 athleteV16 = new AthleteFormV16("Athlete Form V16");// declare object to use for instance method
        // cause in this static method can't use.
        athleteV16.addComponents();// call instance method by object
        athleteV16.initValues();
        athleteV16.addMenus();
        athleteV16.addListener();
        athleteV16.selection_list();
        athleteV16.enableKeyboard();
        athleteV16.setFrameFeatures();
    }

    // method read binary athlete
    public void read_athlete_FromFile() {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            AthleteV2 athlete = (AthleteV2) ois.readObject();
            result_fileAthlete = String.format("\n%s", athlete);
            bio_textarea.append(result_fileAthlete);
            ois.close();
            fis.close();
        } catch (ClassNotFoundException ex3) {
            ex3.printStackTrace(System.err);
        } catch (Exception ex2) {
            ex2.printStackTrace(System.err);
        }
    }

    // method write binary athlete
    public void write_athlete_ToFile(AthleteV2 athlete) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(athlete);
            oos.close();
            fos.close();
        } catch (Exception ex1) {
            ex1.printStackTrace(System.err);
        }
    }

    // this method will get value to use for write method
    public void add_Athlete_forFile() {
        super.getValues();
        name_athletestr = name_field.getText();
        weight_athletestr = weight_field.getText();
        weight_athleteDouble = Double.parseDouble(weight_athletestr);
        height_athletestr = height_field.getText();
        height_athleteDouble = Double.parseDouble(height_athletestr);
        gender_athletestr = result_gender;
        if (gender_athletestr.equals("Male")) {
            gender_athlete = Athlete.Gender.MALE;
        } else {
            gender_athlete = Athlete.Gender.FEMALE;
        }
        nation_athletestr = String.format("%s ", nationbox.getSelectedItem());
        birth_athletestr = birth_field.getText();
        athleteV2 = new AthleteV2(name_athletestr, weight_athleteDouble, height_athleteDouble, gender_athlete,
                nation_athletestr, birth_athletestr);
    }

    @Override // listener and will action method
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        if (event.getSource() == openItem) {
            int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile();
                read_athlete_FromFile();
            } else {
                JOptionPane.showMessageDialog(null, "Open file canceled by the user");
            }
        } else if (event.getSource() == saveItem) {
            int returnVal = fileChooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(null, "Saving athlete in file " + file.getAbsolutePath());
                add_Athlete_forFile();
                write_athlete_ToFile(athleteV2);

            } else {
                JOptionPane.showMessageDialog(null, "Save command canceled");
            }
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
