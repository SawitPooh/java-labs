package janpan.sawit.lab9;

/*
 * This GUI Program AthleteFormV8 will show interface  more information than AthleteFormV6.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 10/3/2023
 */

//import class to use
import javax.swing.JCheckBox;
import javax.swing.SwingUtilities;
import janpan.sawit.lab8.AthleteFormV6;
import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Change name_feild to name_field in AthleteForm for correct word.
//delete group hobbies from lab8 AthleteformV4
public class AthleteFormV8 extends AthleteFormV6 implements ActionListener {
    protected String resultTxt, result_gender, result_hobbies;
    protected ArrayList<JCheckBox> hobbies_arraylist;
    protected List<JCheckBox> hobbies_list;

    public AthleteFormV8(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV8 athleteV8 = new AthleteFormV8("Athlete Form V8");// declare object to use for instance method
                                                                       // cause in this static method can't use.
        athleteV8.addComponents();// call instance method by object
        athleteV8.initValues();
        athleteV8.addMenus();
        athleteV8.addListener();
        athleteV8.setFrameFeatures();
    }

    // init value method
    public void initValues() {
        // set background color
        name_field.setBackground(Color.pink);
        weight_field.setBackground(Color.pink);
        height_field.setBackground(Color.pink);
        birth_field.setBackground(Color.pink);
        // set text in field
        name_field.setText("Manee");
        weight_field.setText("50");
        height_field.setText("170");
        birth_field.setText("01/01/2000");
        // set first display gender to female
        female.setSelected(true);
        // set value slider to 10
        slider_number.setValue(10);
    }

    // add listener method
    public void addListener() {
        // this method keep variable that add listener
        submit_button.addActionListener(this);
        cancel_button.addActionListener(this);
        reset_button.addActionListener(this);
    }

    @Override // method listener from actionPerform
    public void actionPerformed(ActionEvent event) {
        // this method use for run event
        Object srcObject = event.getSource();// object that have event
        if (srcObject == submit_button) {
            handleSubmitButton();
        } else if (srcObject == cancel_button) {
            handleCancelButton();
        } else if (srcObject == reset_button) {
            handleResetButton();
        }
    }

    // submit method
    public void handleSubmitButton() {
        getValues();// call method to use
        bio_textarea.setText(resultTxt);
        bio_textarea.setEditable(false);
    }

    // cancel method
    public void handleCancelButton() {
        // set background color to field
        name_field.setBackground(color_textfeild);
        weight_field.setBackground(color_textfeild);
        height_field.setBackground(color_textfeild);
        birth_field.setBackground(color_textfeild);
        // set text to void
        name_field.setText("");
        weight_field.setText("");
        height_field.setText("");
        birth_field.setText("");
        // clear select from gender
        group_gender.clearSelection();// clear select gender jradio
        // set bio area to void
        bio_textarea.setText("");
        // slider set value
        slider_number.setValue(0);

    }

    // reset method
    public void handleResetButton() {
        // set background color
        name_field.setBackground(Color.white);
        weight_field.setBackground(Color.white);
        height_field.setBackground(Color.white);
        birth_field.setBackground(Color.white);
        // set text to void
        name_field.setText("");
        weight_field.setText("");
        height_field.setText("");
        birth_field.setText("");
        // bio set text to void
        bio_textarea.setText("");
        // gender clear selected
        group_gender.clearSelection();
        // call method cancel_select_hobbies
        cancel_select_hobbies();
        // set nation to null
        nationbox.setSelectedItem(null);
        // clear sportJlist that selected
        sport_Jlist.clearSelection();
        // slider set value to 0
        slider_number.setValue(0);
    }

    // this method will get value from object that you type in this program
    public String getValues() {
        String name_dis = "Name: " + name_field.getText();
        String weight_dis = "\nWeight: " + weight_field.getText();
        String height_dis = "\nHeight: " + height_field.getText();
        String datebirth_dis = "\nDate of birth: " + birth_field.getText();
        String gender_dis = "\nGender: ";
        if (male.isSelected()) {
            result_gender = male.getText();
        } else if (female.isSelected()) {
            result_gender = female.getText();
        }
        String hobbies_dis = "\nHobbies: ";
        get_hobbies();// call method get_hobbies
        String nationality_dis = "\nNationality: ";
        Object nationality_value = nationbox.getSelectedItem();
        String sport_dis = "\nSport: ";
        List<String> sport_value = sport_Jlist.getSelectedValuesList();
        String experience_years_dis = "\nExperience years: ";
        int experience_years_value = slider_number.getValue();
        resultTxt = name_dis + weight_dis + height_dis + datebirth_dis + gender_dis + result_gender + hobbies_dis
                + result_hobbies + nationality_dis + nationality_value + sport_dis + sport_value + experience_years_dis
                + experience_years_value;
        return resultTxt;// result text that will be output to bio area
    }

    // this method get hobbies that you select
    public String get_hobbies() {
        hobbies_list = Arrays.asList(reading, gardening, watching_movies, shopping, others);
        hobbies_arraylist = new ArrayList<JCheckBox>(hobbies_list);
        result_hobbies = "";
        for (JCheckBox checkBox : hobbies_list) {
            if (checkBox.isSelected()) {
                result_hobbies += checkBox.getText() + " ";
            }
        }
        return result_hobbies;// result hobbies that tou select
    }

    // this method will deselect hobbies
    public void cancel_select_hobbies() {
        hobbies_list = Arrays.asList(reading, gardening, watching_movies, shopping, others);
        hobbies_arraylist = new ArrayList<JCheckBox>(hobbies_list);
        for (JCheckBox checkBox : hobbies_list) {// for each checkbox in list will run
            boolean boolean_checkbox = checkBox.isSelected();// boolean checkbox that select
            if (boolean_checkbox) {
                checkBox.setSelected(!boolean_checkbox);// if true that will deselect
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();// run method.
            }
        });
    }
}
