package HeraldCW;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomPanel extends JPanel implements ActionListener {
    private Random random = new Random();
    private JButton randomTextGeneratorButton;
    private JLabel randomTextLabel;
    private JPanel panelButton;
    private JPanel panelText;

    public RandomPanel() {
        setLayout( new BorderLayout() );
        panelButton = new JPanel( new FlowLayout() );
        panelButton.setBorder( new EmptyBorder( 30, 10, 30, 10 ) );
        panelText = new JPanel( new BorderLayout() );
        panelText.setBackground( Color.WHITE );

        randomTextGeneratorButton = new JButton( "Click me" );
        randomTextGeneratorButton.setBackground( Color.white );
        randomTextGeneratorButton.setForeground( Color.RED );
        randomTextGeneratorButton.addActionListener( this );
        randomTextGeneratorButton.setFont( new Font( "Calibri body", Font.BOLD, 25 ) );
        randomTextLabel = new JLabel( "Click the button" );
        randomTextLabel.setForeground( new Color( 33, 203, 123 ) );
        randomTextLabel.setHorizontalAlignment( SwingConstants.CENTER );
        randomTextLabel.setFont( new Font( "Times New Roman", Font.BOLD, 45 ) );
        randomTextLabel.setVerticalAlignment( SwingConstants.CENTER );
        panelText.setBorder( new LineBorder( Color.BLUE, 2, true ) );
        panelText.add( randomTextLabel );
        panelButton.add( randomTextGeneratorButton );
        add( panelButton, BorderLayout.SOUTH );
        add( panelText, BorderLayout.CENTER );
    }

    public void setRandomTextGeneratorButtonFunction() {
        randomTextLabel.setText( String.valueOf( random.nextInt( 100 ) + 1 ) );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == randomTextGeneratorButton) {
            setRandomTextGeneratorButtonFunction();
        }
    }
}
