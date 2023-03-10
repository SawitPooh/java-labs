package janpan.sawit.lab7;

//import class to use.
import javax.swing.*;
import java.awt.*;

/*
 * This GUI Program AthleteForm will show interface to type text about information athlete .
 * What to fill in this program? you have to fill name, weight, height, birth, gender .
 * author: Sawit Janpan id:653040463-7 sec:2 date: 10/2/2023
 */

//this class is sublass from  MySimpleWindow .
public class AthleteForm extends MySimpleWindow {
    protected JPanel mainInfo_panel,gender_panel;// use protected for subclass to reuse.
    protected JLabel name, weight, height, birth, gender;
    protected JTextField name_field, weight_field, height_field, birth_field;// Declare instance attribute to use.
    protected JRadioButton male, female;
    protected ButtonGroup group_gender;
    

    public AthleteForm(String title) {
        super(title);// use superclass title name from MySimpleWindow .

    }

    @Override // Overwrite method from superclass.
    // this method will get components.
    public void addComponents() {
        super.addComponents();// use method from superlcass.
        this.name = new JLabel("Name : ");
        this.weight = new JLabel("Weight : ");
        this.height = new JLabel("Height : ");// declare instance attribute for label.
        this.birth = new JLabel("Date of Birth(dd-mm-yyyy) : ");
        this.gender = new JLabel("Gender : ");
        this.name_field = new JTextField(15);
        this.weight_field = new JTextField(15);// in textfeild it has 15 gap at first output.
        this.height_field = new JTextField(15);
        this.birth_field = new JTextField(15);
        mainInfo_panel = new JPanel();
        mainInfo_panel.add(name);// panel add label.
        mainInfo_panel.add(name_field);// panel add TextField.
        mainInfo_panel.add(weight);
        mainInfo_panel.add(weight_field);
        mainInfo_panel.add(height);
        mainInfo_panel.add(height_field);
        mainInfo_panel.add(birth);
        mainInfo_panel.add(birth_field);
        mainInfo_panel.add(gender);
        male = new JRadioButton("Male");//JRadioButton in this program it has two gender to choose.
        female = new JRadioButton("Female");
        group_gender = new ButtonGroup();//use for allow a user to choose only one radio button at a time.
        group_gender.add(male);//add each gender to group.
        group_gender.add(female);
        gender_panel = new JPanel();//declare to use panel.
        gender_panel.add(male);// panel add JRadioButton.
        gender_panel.add(female);
        mainInfo_panel.add(gender_panel);
        mainInfo_panel.setLayout(new GridLayout(5, 2));//The GridLayout class is a layout manager that lays out a container's components in a rectangular grid. 
        this.add(mainInfo_panel);

    }
    //this method will create gui.
    public static void createAndShowGUI() {
        AthleteForm msw = new AthleteForm("Athlete Form");// declare object to use for instance method cause in this static method can't use.
        msw.addComponents();// call instance method by object
        msw.setFrameFeatures();

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();// run method.
            }
        });
    }
}
