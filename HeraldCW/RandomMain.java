package HeraldCW;

import javax.swing.*;
import java.awt.*;

public class RandomMain extends JFrame {
    RandomMain() {
        super( "Random Text Generator" );
        setLayout( new BorderLayout() );
        RandomPanel randomPanel = new RandomPanel();
        add( randomPanel, BorderLayout.CENTER );
        setSize( 450, 450 );
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        setVisible( true );
        setLocationRelativeTo( null );
        setResizable( false );
    }

    public static void main(String[] args) {
        new RandomMain();
    }
}
