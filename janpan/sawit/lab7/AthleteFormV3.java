package janpan.sawit.lab7;

//import class to use.
import javax.swing.*;

/*
 * This GUI Program AthleteFormV3 will show interface to type text more information than AthleteFormV2.
 * This program add function menubar.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 10/2/2023
 */

//this class is sublass from  AthleteFormV2 .
public class AthleteFormV3 extends AthleteFormV2 {
    JMenuBar menubar;
    JMenu file, config, color, size;
    JMenuItem newItem, openItem, saveItem, red, exit, green, blue, num16, num20, num24;// Declare instance attribute use.
    ImageIcon newIcon, openIcon, saveIcon;

    public AthleteFormV3(String title) {
        super(title);// use superclass title name from AthleteFormV2.
    }

    public static void createAndShowGUI() {
        AthleteFormV3 athleteV3 = new AthleteFormV3("Athlete Form V3");// declare object to use for instance method
                                                                       // cause in this static method can't use.
        athleteV3.addComponents();// call instance method by object
        athleteV3.addMenus();
        athleteV3.setFrameFeatures();
    }

    // this method will add menus to gui.
    public void addMenus() {
        menubar = new JMenuBar();// declare instance attribute for JMenuBar.
        file = new JMenu("File");// declare instance attribute for JMenu.
        newItem = new JMenuItem("New");// declare instance attribute for JMenuItem.
        newIcon = new ImageIcon(getClass().getResource("../lab7/Iconpicture/New-icon.png"));// get icon picture from
                                                                                            // directory.
        newItem.setIcon(newIcon);// set item has icon picture.

        openItem = new JMenuItem("Open");
        openIcon = new ImageIcon(getClass().getResource("../lab7/Iconpicture/Open-icon.png"));
        openItem.setIcon(openIcon);

        saveItem = new JMenuItem("Save");
        saveIcon = new ImageIcon(getClass().getResource("../lab7/Iconpicture/Save-icon.png"));
        saveItem.setIcon(saveIcon);
        exit = new JMenuItem("Exit");
        file.add(newItem);
        file.add(openItem);
        file.add(saveItem);
        file.add(exit);

        config = new JMenu("Config");// declare instance attribute for JMenu.
        color = new JMenu("Color");
        size = new JMenu("Size");
        red = new JMenuItem("Red");// declare instance attribute for JMenuItem.
        green = new JMenuItem("Green");
        blue = new JMenuItem("Blue");
        num16 = new JMenuItem("16");
        num20 = new JMenuItem("20");
        num24 = new JMenuItem("24");
        color.add(red);
        color.add(green);
        color.add(blue);// add item into submenu.
        size.add(num16);
        size.add(num20);
        size.add(num24);
        config.add(color);// add submenu into menu.
        config.add(size);
        menubar.add(file);// add menu into menubar.
        menubar.add(config);
        this.setJMenuBar(menubar);// set menubar to window output.
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();// run method.
            }
        });
    }
}
