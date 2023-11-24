
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AwtGuiExample 
{
public static void main(String[] args) 
{
Frame F1= new Frame ("Awt GUI example");
Panel P1= new Panel (new CardLayout (3,1));
Label namelabel= new Label("Your Name:"); 
Label classlabel= new Label("Your class");
JRadioButton X2= new JRadioButton("M(AII"); 
JRadioButton r3= new JRadioButton("MCA III");
JRadioButton r4 = new JRadioButton("MCAI"); 
Label hobbies = new Label("Your Hobbies"); 
JCheckBox J1= new JCheckBox("music"); 
JCheckBox J2= new JCheckBox("Dance");
 JCheckBox J3= new JCheckBox("Sports");
JTextField t= new JTextField(" Name: .......,Class:....... ,Hobbies:.....");
 F1.setSize(300, 150);
F1.setVisible(true);
}
}