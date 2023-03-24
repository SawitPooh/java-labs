package janpan.sawit.lab11;
/*
 * This GUI Program AthleteFormV15 will write hobbies to text file and years experience to binary file for you.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 24/3/2023
 */

//import class to use 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class AthleteFormV15 extends AthleteFormV14 {
    // declare datatype for reuse code
    protected ArrayList<String> activities;
    protected FileInputStream fis;
    protected FileOutputStream fos;
    protected ObjectInputStream ois;
    protected ObjectOutputStream oos;
    protected String years_experience_str;

    public AthleteFormV15(String tilte) {
        super(tilte);

    }

    public static void createAndShowGUI() {
        AthleteFormV15 athleteV15 = new AthleteFormV15("Athlete Form V15");// declare object to use for instance method
        // cause in this static method can't use.
        athleteV15.addComponents();// call instance method by object
        athleteV15.initValues();
        athleteV15.addMenus();
        athleteV15.addListener();
        athleteV15.selection_list();
        athleteV15.enableKeyboard();
        athleteV15.setFrameFeatures();
    }

    // method write binary years
    public void write_binaryfile() {
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            years_experience_str = String.format("%s", slider_number.getValue());
            if (slider_number.getValue() <= 1) {
                oos.writeUTF(name_field.getText() + " has " + years_experience_str + " year of experiences");
            } else {
                oos.writeUTF(name_field.getText() + " has " + years_experience_str + " years of experiences");
            }
            oos.close();
            fos.close();
        } catch (Exception ex1) {
            ex1.printStackTrace(System.err);
        }
    }

    // method read binary years
    public void read_binaryfile() {
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            bio_textarea.append(ois.readUTF());
            ois.close();
            fis.close();
        } catch (Exception ex2) {
            ex2.printStackTrace(System.err);
        }
    }

    @Override // listener and will action method
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        if (event.getSource() == openItem) {
            int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile();
                read_binaryfile();
            } else {
                JOptionPane.showMessageDialog(null, "Open file canceled by the user");
            }
        } else if (event.getSource() == saveItem) {
            int returnVal = fileChooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(null, "Saving experiences year in file " + file.getAbsolutePath());
                write_binaryfile();
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
