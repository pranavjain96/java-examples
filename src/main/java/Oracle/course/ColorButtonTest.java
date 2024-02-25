package Oracle.course;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Required import statement.
import java.awt.Color;

public class ColorButtonTest extends JFrame implements ActionListener{

    // Instance variable
    JButton jbtSubmit;

    // Constructor
    public ColorButtonTest(){
        // Instantiate JButton object
        jbtSubmit = new JButton("Submit");

        // Add actionListener for button
        jbtSubmit.addActionListener(this);

        // Instantiate Color object
        //Color color = new Color(255,255,0);

        // Set background colour of object
        //jbtSubmit.setBackground(color);
        jbtSubmit.setBackground(Color.YELLOW);

        // Add button to frame - it will be placed in the centre
        add(jbtSubmit);
    }// constructor

    public static void main (String[] args){
        // Create an object from the class.
        ColorButtonTest cb = new ColorButtonTest();

        // Set frame attributes
        cb.setSize(200,200);
        cb.setLocationRelativeTo(null);
        cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the frame
        cb.setVisible(true);

    }// main

    // Event Handling Method
    public void actionPerformed(ActionEvent e){
        // There is only GUI component on the frame.
        // There is no ambiguity as to which component
        // generated the event.
        System.out.println("Button clicked");
    }
} //class