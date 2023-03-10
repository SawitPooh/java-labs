package janpan.sawit.lab8;

import javax.swing.*;
import java.awt.*;

//Change from lab7
//change label from Athleteform to protected.
//change label from AthletefromV2 to protected.
//change textfeild from Athletefrom to protected.
//add jlist to AthleteFormV2 type protected.
//change textarea from AthletefromV2 to protected.
//change button from Athleteform to protcted.
//remove some component that not use in Mysamplewindow.

/*
 * This GUI Program AthleteFormV5 will show interface to type text more information than AthleteFormV4.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 17/2/2023
 */

public class AthleteFormV5 extends AthleteFormV4 {
    protected Color color_textfeild, color_sportlist, color_textarea, color_menuitem;

    public AthleteFormV5(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV5 athleteV5 = new AthleteFormV5("Athlete Form V5");// declare object to use for instance method
                                                                       // cause in this static method can't use.
        athleteV5.addComponents();// call instance method by object
        athleteV5.addMenus();
        athleteV5.setFrameFeatures();

    }

    @Override
    public void addComponents() {
        super.addComponents();// call super class
        // setbackgroud all textfeild.
        color_textfeild = new Color(167, 59, 36);
        name_field.setBackground(color_textfeild);
        weight_field.setBackground(color_textfeild);
        height_field.setBackground(color_textfeild);
        birth_field.setBackground(color_textfeild);
        // set font all label
        name.setFont(new Font("Serif", Font.BOLD, 14));
        weight.setFont(new Font("Serif", Font.BOLD, 14));
        height.setFont(new Font("Serif", Font.BOLD, 14));
        birth.setFont(new Font("Serif", Font.BOLD, 14));
        gender.setFont(new Font("Serif", Font.BOLD, 14));
        nationality.setFont(new Font("Serif", Font.BOLD, 14));
        sport.setFont(new Font("Serif", Font.BOLD, 14));
        bio.setFont(new Font("Serif", Font.BOLD, 14));
        hobbies.setFont(new Font("Serif", Font.BOLD, 14));
        year_experience.setFont(new Font("Serif", Font.BOLD, 14));
        // set color at text in Jlist.
        color_sportlist = new Color(35, 45, 222);
        sport_Jlist.setForeground(color_sportlist);
        //
        color_textarea = new Color(200, 200, 200);
        bio_textarea.setBackground(color_textarea);
        // set font and tool tip.
        cancel_button.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 16));
        reset_button.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 16));
        submit_button.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 16));
        cancel_button.setToolTipText("Press the cancel button to cancel this form");
        reset_button.setToolTipText("Press the reset button to reset this form");
        submit_button.setToolTipText("Press the submit button to submit this form");
    }

    @Override
    public void addMenus() {
        super.addMenus();
        file.setFont(new Font("Serif", Font.BOLD, 14));
        config.setFont(new Font("Serif", Font.BOLD, 14));
        color_menuitem = new Color(6, 57, 112);
        // set color to menu item.
        newItem.setForeground(color_menuitem);
        openItem.setForeground(color_menuitem);
        saveItem.setForeground(color_menuitem);
        exit.setForeground(color_menuitem);

        color.setForeground(color_menuitem);
        size.setForeground(color_menuitem);

        red.setForeground(color_menuitem);
        green.setForeground(color_menuitem);
        blue.setForeground(color_menuitem);
        num16.setForeground(color_menuitem);
        num20.setForeground(color_menuitem);
        num24.setForeground(color_menuitem);
        // set color to menu item.
        //set tool tip.
        file.setToolTipText("To create new, open, save form or exit");
        config.setToolTipText("To configure size and color of a component");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();// run method.
            }
        });
    }
}
