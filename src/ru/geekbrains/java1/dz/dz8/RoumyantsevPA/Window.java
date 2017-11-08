package ru.geekbrains.java1.dz.dz8.RoumyantsevPA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window extends JFrame {

    public Window(){
        int cols=3;
        setBounds ( 0 , 0 , cols*100 , cols*100 );

        setDefaultCloseOperation ( WindowConstants . EXIT_ON_CLOSE );
        setResizable(false);

        setTitle ( cols +" в ряд" );
        JButton [] jbs = new JButton [ cols*cols];
        setLayout ( new GridLayout ( cols , cols ));
        for ( int i = 0 ; i < jbs . length ; i ++) {
            jbs [ i ] = new JButton ( " " );
            add ( jbs [ i ]);
        }
        setVisible ( true );
    }
}
