package janpan.sawit.lab8;
//import class to use.
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;

/*
 * This GUI Program AthleteFormV7 will show interface to type text more information than AthleteFormV6.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 17/2/2023
 */

public class AthleteFormV7 extends AthleteFormV6 {
    protected ReadImage readImage;
    protected JPanel readImage_panel;
    public AthleteFormV7(String title) {
        super(title);//call super to use title

    }
    public static void createAndShowGUI() {
        AthleteFormV7 athleteV7 = new AthleteFormV7("Athlete Form V7");// declare object to use for instance method
                                                                       // cause in this static method can't use.
        athleteV7.addComponents();// call instance method by object
        athleteV7.addMenus();
        athleteV7.setFrameFeatures();

    }
    @Override//Overwrite
    public void addComponents(){
        super.addComponents();//call super class
        readImage =new ReadImage();
        readImage_panel =new JPanel();

        readImage_panel.add(readImage);//add readimage to panel
        readImage_panel.setPreferredSize(new Dimension(500,100));//set size
        readImage_panel.setLayout(new GridLayout());

        main_panel.setLayout(new BorderLayout());
        main_panel.add(info_hobbies_olympicSymbol_Panel, BorderLayout.NORTH);
        main_panel.add(grid_panel, BorderLayout.CENTER);// manage layout by borderlayout.

        button_year_Panel.setLayout(new BorderLayout());
        button_year_Panel.add(slider_Panel, BorderLayout.NORTH);
        button_year_Panel.add(readImage_panel, BorderLayout.WEST);//add readImage panel to panel that have button and year slider.
        button_year_Panel.add(button_panel, BorderLayout.SOUTH);

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
