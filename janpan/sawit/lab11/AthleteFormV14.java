package janpan.sawit.lab11;

/*
 * This GUI Program AthleteFormV14 will write hobbies text file for you.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 24/3/2023
 */

//import class to use 
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import janpan.sawit.lab10.AthleteFormV13;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//change code in AthleteFormV13 in check_athlete method 
//edit code from AthleteFormV9 Jmenuitem because it has dialog.
public class AthleteFormV14 extends AthleteFormV13 {
    protected JFileChooser fileChooser;
    protected File file;
    protected String[] split_hobbies;
    protected String joined_hobbies;
    protected FileReader reader;
    protected BufferedReader bufferreader;
    protected FileWriter writer;
    protected long selectedCount;

    public AthleteFormV14(String tilte) {
        super(tilte);
    }

    public static void createAndShowGUI() {
        AthleteFormV14 athleteV14 = new AthleteFormV14("Athlete Form V14");// declare object to use for instance method
        // cause in this static method can't use.
        athleteV14.addComponents();// call instance method by object
        athleteV14.initValues();
        athleteV14.addMenus();
        athleteV14.addListener();
        athleteV14.selection_list();
        athleteV14.enableKeyboard();
        athleteV14.setFrameFeatures();
    }

    @Override // Overwrite method
    public void addComponents() {
        super.addComponents();
        reading.setSelected(true);
        shopping.setSelected(true);
    }

    // method write file hobbies
    public void writeToFile() {
        get_hobbies();
        try {
            writer = new FileWriter(file); // create a FileWriter object
            selectedCount = hobbies_list.stream().filter(JCheckBox::isSelected).count();// check how many select that
                                                                                        // you select
            if (selectedCount == 1) {
                for (JCheckBox checkbox : hobbies_list) {
                    if (checkbox.isSelected()) {
                        writer.write(name_field.getText() + " has a hobby as " + checkbox.getText());
                    }
                }
            } else if (selectedCount > 1) {
                List<String> hobbyNames = new ArrayList<>();
                for (JCheckBox checkbox : hobbies_list) {
                    if (checkbox.isSelected()) {
                        hobbyNames.add(checkbox.getText());
                    }
                }
                joined_hobbies = String.join(", ", hobbyNames);
                writer.write(name_field.getText() + " has hobbies as " + joined_hobbies);
            } else {
                writer.write(name_field.getText() + " does not have any hobby");
            }
            writer.close(); // close the writer
        } catch (IOException ex1) {
            ex1.printStackTrace(System.err);
        }
    }

    // method read file hobbies
    public void readFromFile() {
        try {
            reader = new FileReader(file);
            bufferreader = new BufferedReader(reader);
            String line = "";
            String content = "";
            while ((line = bufferreader.readLine()) != null) {
                content += line + "\n";
            }
            bio_textarea.setText(content);
            bufferreader.close();
            reader.close();
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }
    }

    @Override // listener and will action method
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        fileChooser = new JFileChooser();
        if (event.getSource() == openItem) {
            int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile();
                readFromFile();
            } else {
                JOptionPane.showMessageDialog(null, "Open file canceled by the user");
            }
        } else if (event.getSource() == saveItem) {
            int returnVal = fileChooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile();
                writeToFile();
                if (selectedCount <= 1) {
                    JOptionPane.showMessageDialog(null, "Saving a hobby in file " + file.getAbsolutePath());
                } else if (selectedCount > 1) {
                    JOptionPane.showMessageDialog(null, "Saving a hobbies in file " + file.getAbsolutePath());
                }

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
