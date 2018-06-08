package HeraldCW;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorDisplay extends JFrame implements ActionListener {
    private JPanel colorDisplay;
    private JPanel enterDisplay;
    private JPanel buttonDisplay;
    private JButton displayColorButton;
    private JTextField redTextField;
    private JTextField greenTextField;
    private JTextField blueTextField;

    ColorDisplay() {
        super( "Display color " );
        setLayout( new BorderLayout() );
        colorDisplay = new JPanel();
        colorDisplay.setBackground( Color.WHITE );
        colorDisplay.setPreferredSize( new Dimension( 500, 180 ) );
        colorDisplay.setBorder( new LineBorder( Color.blue, 1, true ) );

        add( colorDisplay, BorderLayout.NORTH );

        enterDisplay = new JPanel( null );
        enterDisplay.setBackground( new Color( 235, 230, 230 ) );
        JLabel red = new JLabel( "Red" );
        red.setFont( new Font( "Arial", Font.BOLD, 20 ) );
        red.setBounds( 50, 20, 80, 50 );
        enterDisplay.add( red );

        redTextField = new JTextField();
        redTextField.setBounds( 35, 70, 80, 30 );
        enterDisplay.add( redTextField );

        greenTextField = new JTextField();
        greenTextField.setBounds( 190, 70, 80, 30 );
        enterDisplay.add( greenTextField );

        JLabel green = new JLabel( "Green" );
        green.setFont( new Font( "Arial", Font.BOLD, 20 ) );
        green.setBounds( 200, 20, 80, 50 );
        enterDisplay.add( green );

        JLabel blue = new JLabel( "Blue" );
        blue.setFont( new Font( "Arial", Font.BOLD, 20 ) );
        blue.setBounds( 375, 20, 80, 50 );
        enterDisplay.add( blue );

        blueTextField = new JTextField();
        blueTextField.setBounds( 365, 70, 80, 30 );
        enterDisplay.add( blueTextField );
        enterDisplay.setBorder( new LineBorder( Color.red, 1, true ) );


        buttonDisplay = new JPanel( new FlowLayout() );
        buttonDisplay.setBackground( new Color( 25, 220, 220 ) );
        buttonDisplay.setBorder( new LineBorder( Color.GREEN, 1, true ) );
        buttonDisplay.setBorder( new EmptyBorder( 30, 10, 30, 10 ) );

        displayColorButton = new JButton( "Click me" );
        displayColorButton.addActionListener( this );
        displayColorButton.setBackground( Color.white );
        displayColorButton.setForeground( Color.orange );
        displayColorButton.setFont( new Font( "Fira Code", Font.BOLD, 25 ) );
        buttonDisplay.add( displayColorButton );
        add( buttonDisplay, BorderLayout.SOUTH );


        add( enterDisplay, BorderLayout.CENTER );
        setSize( 500, 500 );
        setVisible( true );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLocationRelativeTo( null );
        setResizable( false );
    }

    public boolean checkIntegerOnly(String colorName) {
        if (colorName.length() <= 0) {
            JOptionPane.showMessageDialog( getContentPane(), "No input in text box", "No input", JOptionPane.INFORMATION_MESSAGE );
            return false;
        }
        for (char a : colorName.toCharArray()) {
            if (Character.isLetter( a ) || Character.isWhitespace( a )) {
                JOptionPane.showMessageDialog( getContentPane(), "Invalid input ", "Bro !! check it out ", JOptionPane.ERROR_MESSAGE );
                return false;
            }
        }
        return true;
    }

    public void displayColorAccordingInput(String red, String green, String blue) {
        if (checkIntegerOnly( red ) && checkIntegerOnly( green ) && checkIntegerOnly( blue )) {
            try {
                int intRed = Integer.valueOf( red );
                int intGreen = Integer.parseInt( green );
                int intBlue = Integer.parseInt( blue );
                if ((intRed >= 0 && intRed <= 255) && (intGreen >= 0 && intGreen <= 255) && (intBlue >= 0 && intBlue <= 255)) {

                    colorDisplay.setBackground( new Color( intRed, intGreen, intBlue ) );
                } else {
                    JOptionPane.showMessageDialog( getContentPane(), "Invalid input in the text box", "Invalid input bro !! ", JOptionPane.ERROR_MESSAGE );
                }


            } catch (Exception e) {
                JOptionPane.showMessageDialog( getContentPane(), "Some thing is wrong ", "User !! check it out ", JOptionPane.ERROR_MESSAGE );
            }
        } else {
//            JOptionPane.showMessageDialog( getContentPane(), "Invalid input ", "Vai !! check it out ", JOptionPane.ERROR_MESSAGE );
        }
    }


    public static void main(String[] args) {
        new ColorDisplay();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == displayColorButton) {
            displayColorAccordingInput( redTextField.getText().trim(), greenTextField.getText().trim(), blueTextField.getText().trim() );
        }
    }
}
