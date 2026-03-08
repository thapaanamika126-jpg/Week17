import javax.swing.*;

/**
 * Write a description of class IDCardWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IDCardWindow extends JFrame
{
    public IDCardWindow(Student student)
    {
        setTitle("Student ID Card Preview");

        JLabel label = new JLabel(student.getFormattedDetails());
        add(label);

        setSize(450,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}