package firstswingtest;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Represents a window whose ContentPane has the FlowLayout layout manager.
 * 
 * @author Ivo Ferro
 */
public class FlowLayoutWindow extends JFrame {

    /**
     * The window with in pixels.
     */
    private static final int WINDOW_WITH = 400;

    /**
     * The window height in pixels.
     */
    private static final int WINDOW_HEIGHT = 200;

    /**
     * Constructs a FlowLayoutWindow instance.
     *
     * @param title The title of the window.
     */
    public FlowLayoutWindow(String title) {
        super(title);

        getContentPane().setBackground(Color.cyan);

        FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 20, 30);
        setLayout(fl);

        createComponents();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WINDOW_WITH, WINDOW_HEIGHT);
        setVisible(true);
    }

    /**
     * Create and add components to the window.
     */
    private void createComponents() {
        JButton bt1 = new JButton("One");
        JButton bt2 = new JButton("Two");
        JButton bt3 = new JButton("Three");
        JButton bt4 = new JButton("Four");
        JButton bt5 = new JButton("Five");
        JButton bt6 = new JButton("Six");
        JButton bt7 = new JButton("Seven");
        
        ArrayList<JButton> buttons = new ArrayList<>();
        buttons.add(bt1);
        buttons.add(bt2);
        buttons.add(bt3);
        buttons.add(bt4);
        buttons.add(bt5);
        buttons.add(bt6);
        buttons.add(bt7);
        for (JButton button : buttons) {
            button.setPreferredSize(new Dimension(100, 30));
        }
        
        
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        add(bt6);
        add(bt7);
    }   

    /**
     * To test the FlowLayoutWindow.
     *
     * @param args The command line parameters.
     */
    public static void main(String[] args) {

        FlowLayoutWindow window = new FlowLayoutWindow("Layout manager: FlowLayout");
        
    }
}

