package janpan.sawit.lab10;
/*
 * This GUI Program AthleteFormV11 will show interface more information than AthleteFormV10.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 17/3/2023
 */

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import janpan.sawit.lab9.AthleteFormV10;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import janpan.sawit.lab5.Athlete;
import janpan.sawit.lab5.Athlete.Gender;
import janpan.sawit.lab6.AthleteV2;

public class AthleteFormV11 extends AthleteFormV10 {
    protected JMenu data, sort;
    protected JMenuItem add, display, clear, search, sortBy_name, sortBy_height, sortBy_height_weight;
    protected AthleteV2 athleteV2;// "Manee", 50.0, 170.0, Athlete.Gender.FEMALE, "Thai","01/01/2000"
    protected String name_athletestr, weight_athletestr, height_athletestr, gender_athletestr,
            birth_athletestr, nation_athletestr, add_athlete;
    protected Double weight_athleteDouble, height_athleteDouble;
    protected Gender gender_athlete;
    protected ArrayList<AthleteV2> athlete_list;
    protected int size_athlete;

    public AthleteFormV11(String title) {
        super(title);
        athlete_list = new ArrayList<AthleteV2>();
    }

    public static void createAndShowGUI() {
        AthleteFormV11 athleteV11 = new AthleteFormV11("Athlete Form V11");// declare object to use for instance method
        // cause in this static method can't use.
        athleteV11.addComponents();// call instance method by object

        athleteV11.initValues();
        athleteV11.addMenus();
        athleteV11.addListener();
        athleteV11.selection_list();
        athleteV11.enableKeyboard();
        athleteV11.setFrameFeatures();
    }

    @Override
    public void addMenus() {
        // add component in menu
        super.addMenus();
        data = new JMenu("Data");
        data.setFont(new Font("Serif", Font.BOLD, 14));
        sort = new JMenu("Sort");
        sort.setForeground(color_menuitem);

        add = new JMenuItem("Add");
        add.setForeground(color_menuitem);

        display = new JMenuItem("Display");
        display.setForeground(color_menuitem);

        clear = new JMenuItem("Clear");
        clear.setForeground(color_menuitem);

        search = new JMenuItem("Search");
        search.setForeground(color_menuitem);

        sortBy_name = new JMenuItem("BY Name");
        sortBy_name.setForeground(color_menuitem);

        sortBy_height = new JMenuItem("By Height");
        sortBy_height.setForeground(color_menuitem);

        sortBy_height_weight = new JMenuItem("By Height and Weight");
        sortBy_height_weight.setForeground(color_menuitem);

        data.add(add);
        data.add(display);
        data.add(clear);
        data.add(search);
        data.add(sort);

        sort.add(sortBy_name);
        sort.add(sortBy_height);
        sort.add(sortBy_height_weight);

        menubar.add(data);
    }

    @Override
    public void addListener() {
        super.addListener();
        add.addActionListener(this);
        display.addActionListener(this);
        clear.addActionListener(this);
        search.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object srcObject = event.getSource();
        if (srcObject == add) {
            addAthlete();
        } else if (srcObject == display) {
            display_athlete();
        } else if (srcObject == clear) {
            clear_athlete();
        } else if (srcObject == search) {
            search_athlete();
        }
    }

    // method add value from add
    public void addAthlete() {
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
        athlete_list.add(athleteV2);
        size_athlete = athlete_list.size();
        for (int i = 0; i < size_athlete; i++) {
            add_athlete = String.format("%s", athlete_list.get(i));
        }
        JOptionPane.showMessageDialog(null, add_athlete);
    }

    // display method will display that you add
    public void display_athlete() {
        String result_one_athlete = "";
        if (athlete_list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "There is no athlete in list");
        } else if (size_athlete == 1) {
            for (int i = 0; i < size_athlete; i++) {
                result_one_athlete += String.format("There is one athlete as follows:\n %s.%s", i + 1,
                        athlete_list.get(i));
            }
            JOptionPane.showMessageDialog(null, result_one_athlete);
        } else if (size_athlete > 1) {
            String result_more_athletes = String.format("There are %s athletes as follows:\n", size_athlete);
            for (int i = 0; i < size_athlete; i++) {
                result_more_athletes += String.format("%s.%s\n", i + 1, athlete_list.get(i));
            }
            JOptionPane.showMessageDialog(null, result_more_athletes);
        }

    }

    // clear info in list athlete
    public void clear_athlete() {
        athlete_list.removeAll(athlete_list);
    }

    public void search_athlete() {
        String search_athlete = JOptionPane.showInputDialog(null, "Please enter athlete name:");
        if (search_athlete != null) {
            String search_result = "";
            for (int i = 0; i < size_athlete; i++) {
                if (search_athlete.equals(athlete_list.get(i).getName())) {
                    search_result = String.format("%s is found\n", athlete_list.get(i));
                } else {
                    search_result = String.format("Athlete %s is not found\n", search_athlete);
                }
            }
            JOptionPane.showMessageDialog(null, search_result);
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
