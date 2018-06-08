package HeraldCW;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhoneApp {
    private int number = 1;
    private JFrame frame;
    private JTextField phoneTextField;
    private String runningNumber = "";
    private boolean isCalling = false;
    private JButton[][] buttons = new JButton[4][3];

    public PhoneApp() {
        frame = new JFrame();
        frame.setTitle( "Phone App" );
        JPanel phonePanel = new JPanel( new BorderLayout() );
        phonePanel.setBorder( new LineBorder( Color.BLUE, 1, true ) );
        JPanel mainPanel = new JPanel( new BorderLayout() );
        JPanel phoneNumberPanel = new JPanel( new GridLayout( 4, 3 ) );
        phoneTextField = new JTextField();
        phoneTextField.setToolTipText( "Enter your number here....." );
        phoneTextField.setFont( new Font( "Arial", Font.BOLD, 28 ) );

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setBackground( Color.WHITE );
                buttons[i][j].setForeground( Color.BLACK );
                buttons[i][j].setFont( new Font( "Arial", Font.PLAIN, 21 ) );
                buttons[i][j].setText( ((String.valueOf( number++ ))) );
                buttons[i][j].setBackground( Color.WHITE );
                buttons[i][j].setBorder( new LineBorder( Color.BLUE, 1, true ) );
                buttons[i][j].setVisible( true );
//                if (buttons[i][j].isSelected()) {
////                    buttons[i][j].setBackground( Color.GRAY );
////                    buttons[i][j].setForeground( Color.white );
////                }
                phoneNumberPanel.add( buttons[i][j] );
            }
        }
        buttons[3][0].setText( "Clear" );
        buttons[3][0].addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isCalling) {
                    phoneTextField.setText( "" );
                    runningNumber = "";
                } else {
                    JOptionPane.showMessageDialog( frame, "Phone is currently calling", "Call", JOptionPane.ERROR_MESSAGE );
                }
            }
        } );

        buttons[3][1].setText( String.valueOf( 0 ) );
        buttons[3][2].setText( "Call" );
        buttons[3][2].addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (phoneTextField.getText().length() <= 10) {
                    JOptionPane.showMessageDialog( frame, "I think number has 10 digit.\nTry again. :)  ", "Oops ", JOptionPane.ERROR_MESSAGE );

                }
                if (phoneTextField.getText().length() >= 10 && !isCalling) {
                    if (validNumber( phoneTextField.getText() )) {
                        phoneTextField.setText( "Calling... " + phoneTextField.getText() );
                        buttons[3][2].setText( "Hang up" );
                        isCalling = true;
                        phoneTextField.setEditable( false );
                    }
                } else if (isCalling && buttons[3][2].getText().equals( "Hang up" )) {
                    buttons[3][2].setText( "Call" );
                    buttons[3][2].setEnabled( true );
                    phoneTextField.setEditable( true );
                    phoneTextField.setText( "" );
                    isCalling = false;
                    runningNumber = "";
                }
            }
        } );

        mainPanel.setPreferredSize( new Dimension( 400, 400 ) );
        phoneNumberPanel.setPreferredSize( new Dimension( 300, 293 ) );
        phonePanel.setPreferredSize( new Dimension( 200, 90 ) );
        phonePanel.add( phoneTextField, BorderLayout.CENTER );
        mainPanel.add( phoneNumberPanel, BorderLayout.SOUTH );
        mainPanel.add( phonePanel, BorderLayout.NORTH );
        frame.add( mainPanel );

        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        frame.setVisible( true );
        frame.setSize( 420, 420 );
        frame.setLocationRelativeTo( null );
        frame.setResizable( false );

    }

    public boolean validNumber(String number) {
        for (char a : number.toCharArray()) {
            if (!Character.isDigit( a )) {
                JOptionPane.showMessageDialog( frame, "Number shouldn't be Letter. ", "Error ", JOptionPane.ERROR_MESSAGE );
                return false;
            }
        }
        return true;
    }


    private void call() {

        buttons[0][0].addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numPressed( buttons[0][0].getText() );
            }
        } );
        buttons[3][1].addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numPressed( buttons[3][1].getText() );
            }
        } );
        buttons[0][1].addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numPressed( buttons[0][1].getText() );
            }
        } );
        buttons[0][2].addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numPressed( buttons[0][2].getText() );
            }
        } );
        buttons[1][0].addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numPressed( buttons[1][0].getText() );
            }
        } );
        buttons[1][1].addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numPressed( buttons[1][1].getText() );
            }
        } );
        buttons[1][2].addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numPressed( buttons[1][2].getText() );
            }
        } );
        buttons[2][0].addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numPressed( buttons[2][0].getText() );
            }
        } );
        buttons[2][1].addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numPressed( buttons[2][1].getText() );
            }
        } );
        buttons[2][2].addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numPressed( buttons[2][2].getText() );
            }
        } );
    }

    public void numPressed(String number) {
        runningNumber += number;
        phoneTextField.setText( runningNumber );

    }
    public static void main(String[] args) {
        PhoneApp a = new PhoneApp();
        a.call();
    }
}
