package janpan.sawit.lab8;

//import class to use.
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.*;
/*
 * This Program  ReadImage will import picture to UI for another class.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 17/2/2023
 */

public class ReadImage extends JPanel {
    protected BufferedImage img;
    protected String filename = "C:/Users/zzz/en811302/sawit-4637-java-labs/janpan/sawit/lab8/Image/Athlete.png";// setpath
    
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public ReadImage() {
        try {
            img = ImageIO.read(new File(filename));
            
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }
}
