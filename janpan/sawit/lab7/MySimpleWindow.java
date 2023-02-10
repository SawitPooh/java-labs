package janpan.sawit.lab7;

//import class to use.
import java.awt.BorderLayout;
import javax.swing.*;

/*
 * This GUI Program MySimpleWindow will show GUI button that has cancel, reset, submit button .
 * author: Sawit Janpan id:653040463-7 sec:2 date: 10/2/2023
 */

// This class inherits all properties from Frame.
public class MySimpleWindow extends JFrame {
    protected JButton cancelButton;// use protected for subclass to reuse.
    protected JPanel mainPanel, buttonPanel;
    JButton cancel_button;
    JButton reset_button;// Declare instance attribute to use.
    JButton submit_button;
    JPanel button_panel;

    public MySimpleWindow(String title) {
        super(title);// use superclass title name from jframe.
    }
    //this method will create gui.
    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");//declare object to use for instance method cause in this static method can't use.
        msw.addComponents();// call instance method by object
        msw.setFrameFeatures();
    }

    // this method will get components.
    public void addComponents() {
        button_panel = new JPanel();
        cancel_button = new JButton("Cancel");
        reset_button = new JButton("Reset");// use instance button to call name that button.
        submit_button = new JButton("Submit");
        button_panel.add(cancel_button);
        button_panel.add(submit_button);// panel add button.
        button_panel.add(reset_button);
        this.add(button_panel, BorderLayout.SOUTH);// use this cause extend from Jframe and this class is subclass.
    }

    // this method will set to window.
    public void setFrameFeatures() {
        this.pack();// pack them with proper size.
        this.setLocationRelativeTo(null);// set location to output this program.
        this.setVisible(true);// set true for we can see output.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// if you click exit it will close.
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();// run method.
            }
        });
    }
}