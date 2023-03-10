package janpan.sawit.lab9;

/*
 * This GUI Program AthleteFormV9 will show interface  more information than AthleteFormV8.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 10/3/2023
 */

//import class to use
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.*;

//change Jcheckbox from lab8 AthleteFormV4 for choose  multiple select
public class AthleteFormV9 extends AthleteFormV8 implements ItemListener {
    protected String result_nation, result_menu;// declare String variable to keep value

    public AthleteFormV9(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV9 athleteV9 = new AthleteFormV9("Athlete Form V9");// declare object to use for instance method //
                                                                       // cause in this static method can't use.
        athleteV9.addComponents();// call instance method by object
        athleteV9.initValues();
        athleteV9.addMenus();
        athleteV9.addListener();
        athleteV9.setFrameFeatures();
        athleteV9.enableKeyboard();

    }

    @Override // add listener method
    public void addListener() {
        // this method keep variable that add listener
        super.addListener();
        name_field.addActionListener(this);
        weight_field.addActionListener(this);
        height_field.addActionListener(this);
        birth_field.addActionListener(this);
        male.addItemListener(this);
        female.addItemListener(this);
        nationbox.addItemListener(this);
        reading.addItemListener(this);
        gardening.addItemListener(this);
        watching_movies.addItemListener(this);
        shopping.addItemListener(this);
        others.addItemListener(this);

    }

    @Override // reset method
    public void handleResetButton() {
        // remove listener because if not Jpanel will output when tou reset
        reading.removeItemListener(this);
        gardening.removeItemListener(this);
        watching_movies.removeItemListener(this);
        shopping.removeItemListener(this);
        others.removeItemListener(this);
        // call super class
        super.handleResetButton();
        // add them after cause you can use object continue after reset
        reading.addItemListener(this);
        gardening.addItemListener(this);
        watching_movies.addItemListener(this);
        shopping.addItemListener(this);
        others.addItemListener(this);

    }

    @Override // method listener from actionPerform
    public void actionPerformed(ActionEvent event) {
        // this method use for run event
        super.actionPerformed(event);// call super class
        Object srcObject = event.getSource();
        if (srcObject == name_field) {
            String name_change = "Name is changed to " + name_field.getText();
            JOptionPane.showMessageDialog(null, name_change);// show message dialog
        } else if (srcObject == weight_field) {
            String weight_change = "Weight is changed to " + weight_field.getText();
            JOptionPane.showMessageDialog(null, weight_change);
        } else if (srcObject == height_field) {
            String height_change = "Height is changed to " + height_field.getText();
            JOptionPane.showMessageDialog(null, height_change);
        } else if (srcObject == birth_field) {
            String birth_change = "Date of birth is changed to " + birth_field.getText();
            JOptionPane.showMessageDialog(null, birth_change);
        }

        if (srcObject == newItem) {
            result_menu = "You click menu ";
            JOptionPane.showMessageDialog(null, result_menu + newItem.getText());
        } else if (srcObject == saveItem) {
            result_menu = "You click menu ";
            JOptionPane.showMessageDialog(null, result_menu + saveItem.getText());
        } else if (srcObject == openItem) {
            result_menu = "You click menu ";
            JOptionPane.showMessageDialog(null, result_menu + openItem.getText());// open japanel that you click
        } else if (srcObject == exit) {
            this.dispose();// exit
        }

    }

    // this mehod will set mnemonic key for menuitem
    public void setMAKeys(JMenuItem menu, int mKey, int aKey, ActionListener listener) {
        menu.setMnemonic(mKey);
        menu.setAccelerator(KeyStroke.getKeyStroke(aKey, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        menu.addActionListener(this);
    }

    // this method to set keyboard to use
    public void enableKeyboard() {
        file.setMnemonic(KeyEvent.VK_F);
        setMAKeys(newItem, KeyEvent.VK_N, KeyEvent.VK_N, this);
        setMAKeys(openItem, KeyEvent.VK_O, KeyEvent.VK_O, this);
        setMAKeys(saveItem, KeyEvent.VK_S, KeyEvent.VK_S, this);
        setMAKeys(exit, KeyEvent.VK_Q, KeyEvent.VK_Q, this);
    }

    @Override // method listener from itemlistener
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        int select = e.getStateChange();
        if (source == male) {
            if (select == ItemEvent.SELECTED) {
                result_gender = male.getText();
                String selected_gender = result_gender + " is selected";
                JOptionPane.showMessageDialog(null, selected_gender);
            }
        } else if (source == female) {
            if (select == ItemEvent.SELECTED) {
                result_gender = female.getText();
                String selected_gender = result_gender + " is selected";
                JOptionPane.showMessageDialog(null, selected_gender);
            }
        }

        if (source == nationbox) {
            if (select == ItemEvent.SELECTED) {
                result_nation = "Nationality is changed to " + (String) e.getItem();
                JOptionPane.showMessageDialog(null, result_nation);
            }
        }
        if (source == reading) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        result_hobbies = reading.getText();
                        String selected_hobbies = result_hobbies + " is also your hobby";
                        JOptionPane.showMessageDialog(null, selected_hobbies);
                    } else {
                        result_hobbies = reading.getText();
                        String selected_hobbies = result_hobbies + " is no longer your hobby";
                        JOptionPane.showMessageDialog(null, selected_hobbies);
                    }
                }
            });
        }
        if (source == gardening) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        result_hobbies = gardening.getText();
                        String selected_hobbies = result_hobbies + " is also your hobby";
                        JOptionPane.showMessageDialog(null, selected_hobbies);
                    } else {
                        result_hobbies = gardening.getText();
                        String selected_hobbies = result_hobbies + " is no longer your hobby";
                        JOptionPane.showMessageDialog(null, selected_hobbies);
                    }
                }
            });
        } else if (source == watching_movies) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        result_hobbies = watching_movies.getText();
                        String selected_hobbies = result_hobbies + " is also your hobby";
                        JOptionPane.showMessageDialog(null, selected_hobbies);
                    } else {
                        result_hobbies = watching_movies.getText();
                        String selected_hobbies = result_hobbies + " is no longer your hobby";
                        JOptionPane.showMessageDialog(null, selected_hobbies);
                    }
                }
            });
        } else if (source == shopping) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        result_hobbies = shopping.getText();
                        String selected_hobbies = result_hobbies + " is also your hobby";
                        JOptionPane.showMessageDialog(null, selected_hobbies);
                    } else {
                        result_hobbies = shopping.getText();
                        String selected_hobbies = result_hobbies + " is no longer your hobby";
                        JOptionPane.showMessageDialog(null, selected_hobbies);
                    }
                }
            });
        } else if (source == others) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        result_hobbies = others.getText();
                        String selected_hobbies = result_hobbies + " is also your hobby";
                        JOptionPane.showMessageDialog(null, selected_hobbies);
                    } else {
                        result_hobbies = others.getText();
                        String selected_hobbies = result_hobbies + " is no longer your hobby";
                        JOptionPane.showMessageDialog(null, selected_hobbies);
                    }
                }
            });
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
