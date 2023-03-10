package janpan.sawit.lab9;

/*
 * This GUI Program AthleteFormV10 will show interface more information than AthleteFormV9.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 10/3/2023
 */

//change lab7 AthleteFormV3 add list string sport 

//import class to use 
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class AthleteFormV10 extends AthleteFormV9 implements ChangeListener {
    protected String result_slider;
    protected String result_sport = "Selected sport are ";
    protected ListSelectionListener listSelectionListener;

    public AthleteFormV10(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV10 athleteV10 = new AthleteFormV10("Athlete Form V10");// declare object to use for instance method
        // cause in this static method can't use.
        athleteV10.addComponents();// call instance method by object
        athleteV10.initValues();
        athleteV10.addMenus();
        athleteV10.addListener();
        athleteV10.selection_list();
        athleteV10.enableKeyboard();
        athleteV10.setFrameFeatures();

    }

    @Override // add listener method
    public void addListener() {
        // this method keep variable that add listener
        super.addListener();
        slider_number.addChangeListener(this);
    }

    @Override // method listener from Changelistener
    public void stateChanged(ChangeEvent e) {
        // this method use for run event
        JSlider source = (JSlider) e.getSource();
        boolean adjust = source.getValueIsAdjusting();
        if (source == slider_number) {
            if (!adjust) {
                result_slider = "# of experience years is ";
                int value = source.getValue();
                JOptionPane.showMessageDialog(null, result_slider + value);
            }
        }
    }

    @Override // reset method
    public void handleResetButton() {
        // remove listener because if not Jpanel will output when tou reset
        slider_number.removeChangeListener(this);
        sport_Jlist.removeListSelectionListener(listSelectionListener);
        // call super class
        super.handleResetButton();
        // add them after cause you can use object continue after reset
        slider_number.addChangeListener(this);
        selection_list();
    }

    // this method will select from sport list
    public void selection_list() {
        listSelectionListener = new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                sport_Jlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                boolean adjust = e.getValueIsAdjusting();
                if (!adjust) {
                    String add_sport = "";
                    JList sport_Jlist = (JList) e.getSource();
                    int selections[] = sport_Jlist.getSelectedIndices();
                    Object selectionValues[] = sport_Jlist.getSelectedValues();
                    for (int i = 0, n = selections.length; i < n; i++) {
                        add_sport += String.format("%s ", selectionValues[i]);
                    }
                    JOptionPane.showMessageDialog(null, result_sport + add_sport);
                }
            }
        };
        sport_Jlist.addListSelectionListener(listSelectionListener);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
