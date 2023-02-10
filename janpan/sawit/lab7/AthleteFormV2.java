package janpan.sawit.lab7;

//import class to use.
import javax.swing.*;
import java.awt.*;

/*
 * This GUI Program AthleteFormV2 will show interface to type text more information than AthleteForm.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 10/2/2023
 */

//this class is sublass from  AthleteForm .
public class AthleteFormV2 extends AthleteForm {
    JLabel nationality, sport, bio;
    JPanel main_panel, nation_panel, bio_panel, sport_panel, moreInfo_panel, grid_panel;// Declare instance attribute to use.
    JComboBox nationbox;
    JTextArea bio_textarea;
    JScrollPane bio_ScrollPane;

    public AthleteFormV2(String title) {
        super(title);// use superclass title name from AthleteFormV2.
    }

    public static void createAndShowGUI() {
        AthleteFormV2 msw = new AthleteFormV2("Athlete Form V2");// declare object to use for instance method cause in this static method can't use.
        msw.addComponents();// call instance method by object
        msw.setFrameFeatures();
    }

    @Override//Overwrite method
    //this will addcomponent.
    public void addComponents() {
        super.addComponents();//use method from super class.
        main_panel = new JPanel();
        sport_panel = new JPanel();// declare instance attribute for panel.
        nation_panel = new JPanel();
        moreInfo_panel = new JPanel();
        bio_panel = new JPanel();
        grid_panel = new JPanel();

        this.nationality = new JLabel("Nationality :");
        this.sport = new JLabel("Sport :");// declare instance attribute for label.
        this.bio = new JLabel("Bio :");

        nation_panel.add(nationality);
        String nationalities[] = { "American", "Chinese", "Indonesia", "Japanese", "Thai", "Vietnamese" };//add list to combobox
        JComboBox nationbox = new JComboBox(nationalities);
        nationbox.setSelectedIndex(4);//set at first out put will see list[4]
        nation_panel.add(nationbox);
        nation_panel.setLayout(new GridLayout(1, 1));

        DefaultListModel<String> sport_list = new DefaultListModel<>();//use jlist to A component that displays a list of objects and allows the user to select one or more items.
        sport_list.addElement("Badminton");
        sport_list.addElement("Boxing");//add element to list
        sport_list.addElement("Football");
        sport_list.addElement("Runing");

        JList<String> sport_Jlist = new JList<>(sport_list);//add list to Jlist
        sport_Jlist.setSelectedIndex(2);//set at first out put will see list[2]
        sport_panel.add(sport);
        sport_panel.add(sport_Jlist);
        sport_panel.setLayout(new GridLayout(1, 1));//manage layout

        bio_panel.setLayout(new BorderLayout(0, 0));
        bio_panel.add(bio, BorderLayout.NORTH);
        bio_textarea = new JTextArea();
        bio_textarea.setLineWrap(true);//wrapped by word.
        bio_ScrollPane = new JScrollPane(bio_textarea);//can scroll vertical.
        bio_panel.add(bio_ScrollPane, BorderLayout.CENTER);//manage layout

        moreInfo_panel.setLayout(new BorderLayout(0, 7));
        moreInfo_panel.add(nation_panel, BorderLayout.NORTH);//manage layout
        moreInfo_panel.add(sport_panel, BorderLayout.CENTER);

        grid_panel.setLayout(new GridLayout(2, 1));
        grid_panel.add(moreInfo_panel);
        grid_panel.add(bio_panel);

        main_panel.setLayout(new BorderLayout());
        main_panel.add(mainInfo_panel, BorderLayout.NORTH);
        main_panel.add(grid_panel, BorderLayout.CENTER);//manage layout by borderlayout.
        main_panel.add(button_panel, BorderLayout.SOUTH);
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
