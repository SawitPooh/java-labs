package janpan.sawit.lab8;
//import to use
import java.awt.*;
import javax.swing.*;
import janpan.sawit.lab7.AthleteFormV3;
// change AthleteFormV2 protected panel attribute.//Mysimplewindow fix button_panel//mainpanel doesnt use 

/*
 * This GUI Program AthleteFormV4 will show interface to type text more information than AthleteFormV3.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 17/2/2023
 */

public class AthleteFormV4 extends AthleteFormV3 {
    protected JLabel hobbies, year_experience;
    protected JCheckBox reading, gardening, watching_movies, shopping, others;
    protected JPanel checkBoxLabel_Panel, checkBoxGroupbut_Panel, maincheckBox_Panel, info_hobbies_Panel, slider_Panel,
            button_year_Panel;
    protected ButtonGroup group_hobbies;
    protected JSlider slider_number;
    // declare instance variable

    public AthleteFormV4(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV4 athleteV4 = new AthleteFormV4("Athlete Form V4");// declare object to use for instance method
                                                                       // cause in this static method can't use.
        athleteV4.addComponents();// call instance method by object
        athleteV4.addMenus();
        athleteV4.setFrameFeatures();
    }

    @Override//Overwrite method
    public void addComponents() {
        super.addComponents();// from super class
        //delcare before use 
        checkBoxLabel_Panel = new JPanel();
        checkBoxGroupbut_Panel = new JPanel();
        maincheckBox_Panel = new JPanel();
        info_hobbies_Panel = new JPanel();
        slider_Panel = new JPanel();
        button_year_Panel = new JPanel();

        hobbies = new JLabel("Hobbies :");
        year_experience = new JLabel("Year of experience in this sport:");
        reading = new JCheckBox("Reading", false);
        gardening = new JCheckBox("Gardenning", false);
        watching_movies = new JCheckBox("Watching Movies", true);
        shopping = new JCheckBox("Shopping", false);
        others = new JCheckBox("Others", false);
        //panel add item
        checkBoxLabel_Panel.add(hobbies);
        checkBoxGroupbut_Panel.add(reading);
        checkBoxGroupbut_Panel.add(gardening);
        checkBoxGroupbut_Panel.add(watching_movies);
        checkBoxGroupbut_Panel.add(shopping);
        checkBoxGroupbut_Panel.add(others);
        group_hobbies = new ButtonGroup();
        group_hobbies.add(reading);
        group_hobbies.add(gardening);
        group_hobbies.add(watching_movies);
        group_hobbies.add(shopping);
        group_hobbies.add(others);
        maincheckBox_Panel.setLayout(new BorderLayout(0, 0));
        maincheckBox_Panel.add(checkBoxLabel_Panel, BorderLayout.WEST);
        maincheckBox_Panel.add(checkBoxGroupbut_Panel, BorderLayout.SOUTH);//mange layout
        
        slider_number = new JSlider(0, 20, 0);
        slider_number.setLabelTable(slider_number.createStandardLabels(5));
        slider_number.setMajorTickSpacing(5);
        slider_number.setMinorTickSpacing(1);
        slider_number.setPaintTicks(true);
        slider_number.setPaintLabels(true);
        slider_Panel.setLayout(new BorderLayout(0, 0));
        slider_Panel.add(year_experience, BorderLayout.NORTH);
        slider_Panel.add(slider_number, BorderLayout.CENTER);
        //
        info_hobbies_Panel.setLayout(new BorderLayout());
        info_hobbies_Panel.add(mainInfo_panel, BorderLayout.NORTH);
        info_hobbies_Panel.add(maincheckBox_Panel, BorderLayout.CENTER);
        //
        main_panel.setLayout(new BorderLayout());
        main_panel.add(info_hobbies_Panel, BorderLayout.NORTH);
        main_panel.add(grid_panel, BorderLayout.CENTER);// manage layout by borderlayout.
        //
        button_year_Panel.setLayout(new BorderLayout());
        button_year_Panel.add(slider_Panel, BorderLayout.NORTH);
        button_year_Panel.add(button_panel, BorderLayout.CENTER);
        //set slider and button component to main panel
        main_panel.add(button_year_Panel, BorderLayout.SOUTH);
        this.add(main_panel);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();// run method.
            }
        });
    }
}
