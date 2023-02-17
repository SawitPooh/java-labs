package janpan.sawit.lab8;
//import class to use 
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/*
 * This GUI Program AthleteFormV6 will show interface to type text more information than AthleteFormV5.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 17/2/2023
 */

public class AthleteFormV6 extends AthleteFormV5 {
    protected OlympicSymbol olympicSymbol;
    protected JPanel olympicSymbol_panel, info_hobbies_olympicSymbol_Panel;
    //declare instance variable.
    public AthleteFormV6(String title) {
        super(title);//call super to use title
    }

    public static void createAndShowGUI() {
        AthleteFormV6 athleteV6 = new AthleteFormV6("Athlete Form V6");// declare object to use for instance method
                                                                            // cause in this static method can't use.
        athleteV6.addComponents();// call instance method by object
        athleteV6.addMenus();
        athleteV6.setFrameFeatures();

    }

    @Override
    public void addComponents() {
        super.addComponents();//call super class to use.

        olympicSymbol = new OlympicSymbol();//declare them before use
        olympicSymbol_panel = new JPanel();
        info_hobbies_olympicSymbol_Panel = new JPanel();

        olympicSymbol_panel.add(olympicSymbol);//add draw olympicSymbol in panel
        olympicSymbol_panel.setPreferredSize(new Dimension(200, 100));//set size
        olympicSymbol_panel.setLayout(new GridLayout());

        main_panel.setLayout(new BorderLayout());
        info_hobbies_olympicSymbol_Panel.setLayout(new BorderLayout());
        info_hobbies_olympicSymbol_Panel.add(olympicSymbol_panel, BorderLayout.NORTH);
        info_hobbies_olympicSymbol_Panel.add(info_hobbies_Panel, BorderLayout.CENTER);

        main_panel.setLayout(new BorderLayout());
        main_panel.add(info_hobbies_olympicSymbol_Panel, BorderLayout.NORTH);
        main_panel.add(grid_panel, BorderLayout.CENTER);// manage layout by borderlayout.
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
