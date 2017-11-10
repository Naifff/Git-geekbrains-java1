package ru.geekbrains.java1.dz.dz8.RoumyantsevPA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Window extends JFrame {

    public Window() {
        int cols = 3;
        setBounds(0, 0, cols * 100, cols * 100);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
//        int pWin = 0;
//        int sWin = 0;
//        setTitle(cols + " в ряд    И:" + pWin + " ИИ:" + sWin);
        setTitle(cols + " в ряд");
        //  JPanel pan = new JPanel();

        JButton[] jbs = new JButton[cols * cols];
        setLayout(new GridLayout(cols, cols));
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton(" ");
            add(jbs[i]);
        }
        //  pan.setVisible(false);
        //  add(pan);
        int i = 0;
        //  for (int i = 0; i < jbs.length; i++) {
        for (JButton jb : jbs
                ) {


            jb.addMouseListener(new MouseAdapter() {
                int i = 0;
              //  int pWin=0;
              //  int sWin=0;
                @Override
                public void mouseReleased(MouseEvent e) {

                    if (jbs[0].getText().equals("Y")||jbs[3].getText().equals("T")) {
                        jbs[0].setText(" ");
                        jbs[1].setText(" ");
                        jbs[2].setText(" ");
                        jbs[3].setText(" ");
                        jbs[4].setText(" ");
                        jbs[5].setText(" ");
                        jbs[6].setText(" ");
                        jbs[7].setText(" ");
                        jbs[8].setText(" ");
                        i++;
                    }
                    // System.out.println("MousePos: " + e.getX() + " " + e.getY()+"    ");
                    if (jb.getText().equals(" ") && i == 0) {
                        jb.setText("X");
                        if (testWin(jbs, "X")) {
                            jbs[0].setText("Y");
                            jbs[1].setText("O");
                            jbs[2].setText("U");
                            jbs[3].setText(" ");
                            jbs[4].setText(" ");
                            jbs[5].setText(" ");
                            jbs[6].setText("W");
                            jbs[7].setText("I");
                            jbs[8].setText("N");
//                            pWin++;
//                            setTitle(cols + " в ряд    И:" + pWin + " ИИ:" + sWin);
                        }else{
                            int turn=aiTurn(jbs);
                            if (turn!=-1){jbs[turn].setText("O");}
                            else{
                                jbs[0].setText(" ");
                                jbs[1].setText(" ");
                                jbs[2].setText(" ");
                                jbs[3].setText("T");
                                jbs[4].setText("I");
                                jbs[5].setText("E");
                                jbs[6].setText(" ");
                                jbs[7].setText(" ");
                                jbs[8].setText(" ");

                            }
                        }


                    }
//                    else if (jb.getText().equals("X")) {
//                        jb.setText("O");
//                    } else if (jb.getText().equals("O") && i == 0) {
//                        jb.setText(" ");
//                    }
//                    System.out.println(jb);
                    if (testWin(jbs, "O")) {
                        jbs[0].setText("Y");
                        jbs[1].setText("O");
                        jbs[2].setText("U");
                        jbs[3].setText("L");
                        jbs[4].setText("O");
                        jbs[5].setText(" ");
                        jbs[6].setText(" ");
                        jbs[7].setText("S");
                        jbs[8].setText("E");
//                        sWin++;
//                        setTitle(cols + " в ряд    И:" + pWin + " ИИ:" + sWin);
                    }

                      i=0;
                }
            });
        }
        // }

        setVisible(true);
    }

    static boolean testWin(JButton[] jbs, String c) {
        if (
                jbs[0].getText().equals(c) && jbs[1].getText().equals(c) && jbs[2].getText().equals(c) ||
                        jbs[3].getText().equals(c) && jbs[4].getText().equals(c) && jbs[5].getText().equals(c) ||
                        jbs[6].getText().equals(c) && jbs[7].getText().equals(c) && jbs[8].getText().equals(c) ||
                        jbs[0].getText().equals(c) && jbs[3].getText().equals(c) && jbs[6].getText().equals(c) ||
                        jbs[1].getText().equals(c) && jbs[4].getText().equals(c) && jbs[7].getText().equals(c) ||
                        jbs[2].getText().equals(c) && jbs[5].getText().equals(c) && jbs[8].getText().equals(c) ||
                        jbs[0].getText().equals(c) && jbs[4].getText().equals(c) && jbs[8].getText().equals(c) ||
                        jbs[2].getText().equals(c) && jbs[4].getText().equals(c) && jbs[6].getText().equals(c)


                ) {
            return true;
        }
        return false;

    }


    public static int aiTurn( JButton[] jbs) {
        Random rnd = new Random();
        if (jbs[4].getText().equals(" ")) {
            return 4;
        } else if (jbs[0].getText().equals(" ") && jbs[1].getText().equals(" ") && jbs[2].getText().equals(" ") &&
                jbs[3].getText().equals(" ") && jbs[4].getText().equals("X") && jbs[5].getText().equals(" ") &&
                jbs[6].getText().equals(" ") && jbs[7].getText().equals(" ") && jbs[8].getText().equals(" ")


                ) {
            switch (rnd.nextInt(4)) {
                case 0:
                    return 0;

                case 1:
                    return 2;

                case 2:
                    return 6;

                default:
                    return 8;
            }
        } else if

                 (
                jbs[0].getText().equals(" ") && jbs[1].getText().equals("O") && jbs[2].getText().equals("O") ||
                        jbs[0].getText().equals(" ") && jbs[3].getText().equals("O") && jbs[6].getText().equals("O") ||
                        jbs[0].getText().equals(" ") && jbs[4].getText().equals("O") && jbs[8].getText().equals("O")

                ) {
            return 0;
        } else if (
                jbs[1].getText().equals(" ") && jbs[0].getText().equals("O") && jbs[2].getText().equals("O") ||
                        jbs[1].getText().equals(" ") && jbs[4].getText().equals("O") && jbs[7].getText().equals("O")//||
            //  jbs[1].getText().equals(" ") && jbs[4].getText().equals("X") && jbs[8].getText().equals("X")

                ) {
            return 1;
        } else if (
                jbs[2].getText().equals(" ") && jbs[0].getText().equals("O") && jbs[1].getText().equals("O") ||
                        jbs[2].getText().equals(" ") && jbs[4].getText().equals("O") && jbs[6].getText().equals("O") ||
                        jbs[2].getText().equals(" ") && jbs[5].getText().equals("O") && jbs[8].getText().equals("O")

                ) {
            return 2;
        } else if (
                jbs[3].getText().equals(" ") && jbs[0].getText().equals("O") && jbs[6].getText().equals("O") ||
                        jbs[3].getText().equals(" ") && jbs[4].getText().equals("O") && jbs[5].getText().equals("O")//||
            //jbs[4].getText().equals(" ") && jbs[4].getText().equals("X") && jbs[8].getText().equals("X")

                ) {
            return 3;
        } else if (
                jbs[4].getText().equals(" ") && jbs[0].getText().equals("O") && jbs[8].getText().equals("O") ||
                        jbs[4].getText().equals(" ") && jbs[2].getText().equals("O") && jbs[6].getText().equals("O") ||
                        jbs[4].getText().equals(" ") && jbs[1].getText().equals("O") && jbs[7].getText().equals("O") ||
                        jbs[4].getText().equals(" ") && jbs[3].getText().equals("O") && jbs[5].getText().equals("O")

                ) {
            return 4;
        } else if (
                jbs[5].getText().equals(" ") && jbs[2].getText().equals("O") && jbs[8].getText().equals("O") ||
                        jbs[5].getText().equals(" ") && jbs[3].getText().equals("O") && jbs[4].getText().equals("O")//||
            // jbs[5].getText().equals(" ") && jbs[4].getText().equals("X") && jbs[8].getText().equals("X")

                ) {
            return 5;
        } else if (
                jbs[6].getText().equals(" ") && jbs[4].getText().equals("O") && jbs[2].getText().equals("O") ||
                        jbs[6].getText().equals(" ") && jbs[0].getText().equals("O") && jbs[3].getText().equals("O") ||
                        jbs[6].getText().equals(" ") && jbs[7].getText().equals("O") && jbs[8].getText().equals("O")

                ) {
            return 6;
        } else if (
                jbs[7].getText().equals(" ") && jbs[1].getText().equals("O") && jbs[4].getText().equals("O") ||
                        jbs[7].getText().equals(" ") && jbs[8].getText().equals("O") && jbs[6].getText().equals("O")//||
            //  jbs[7].getText().equals(" ") && jbs[4].getText().equals("X") && jbs[8].getText().equals("X")

                ) {
            return 7;
        } else if (
                jbs[8].getText().equals(" ") && jbs[2].getText().equals("O") && jbs[5].getText().equals("O") ||
                        jbs[8].getText().equals(" ") && jbs[0].getText().equals("O") && jbs[4].getText().equals("O") ||
                        jbs[8].getText().equals(" ") && jbs[7].getText().equals("O") && jbs[6].getText().equals("O")

                ) {
            return 8;
        }else if



                (
                jbs[0].getText().equals(" ") && jbs[1].getText().equals("X") && jbs[2].getText().equals("X") ||
                        jbs[0].getText().equals(" ") && jbs[3].getText().equals("X") && jbs[6].getText().equals("X") ||
                        jbs[0].getText().equals(" ") && jbs[4].getText().equals("X") && jbs[8].getText().equals("X")

                ) {
            return 0;
        } else if (
                jbs[1].getText().equals(" ") && jbs[0].getText().equals("X") && jbs[2].getText().equals("X") ||
                        jbs[1].getText().equals(" ") && jbs[4].getText().equals("X") && jbs[7].getText().equals("X")//||
            //  jbs[1].getText().equals(" ") && jbs[4].getText().equals("X") && jbs[8].getText().equals("X")

                ) {
            return 1;
        } else if (
                jbs[2].getText().equals(" ") && jbs[0].getText().equals("X") && jbs[1].getText().equals("X") ||
                        jbs[2].getText().equals(" ") && jbs[4].getText().equals("X") && jbs[6].getText().equals("X") ||
                        jbs[2].getText().equals(" ") && jbs[5].getText().equals("X") && jbs[8].getText().equals("X")

                ) {
            return 2;
        } else if (
                jbs[3].getText().equals(" ") && jbs[0].getText().equals("X") && jbs[6].getText().equals("X") ||
                        jbs[3].getText().equals(" ") && jbs[4].getText().equals("X") && jbs[5].getText().equals("X")//||
            //jbs[4].getText().equals(" ") && jbs[4].getText().equals("X") && jbs[8].getText().equals("X")

                ) {
            return 3;
        } else if (
                jbs[4].getText().equals(" ") && jbs[0].getText().equals("X") && jbs[8].getText().equals("X") ||
                        jbs[4].getText().equals(" ") && jbs[2].getText().equals("X") && jbs[6].getText().equals("X") ||
                        jbs[4].getText().equals(" ") && jbs[1].getText().equals("X") && jbs[7].getText().equals("X") ||
                        jbs[4].getText().equals(" ") && jbs[3].getText().equals("X") && jbs[5].getText().equals("X")

                ) {
            return 4;
        } else if (
                jbs[5].getText().equals(" ") && jbs[2].getText().equals("X") && jbs[8].getText().equals("X") ||
                        jbs[5].getText().equals(" ") && jbs[3].getText().equals("X") && jbs[4].getText().equals("X")//||
            // jbs[5].getText().equals(" ") && jbs[4].getText().equals("X") && jbs[8].getText().equals("X")

                ) {
            return 5;
        } else if (
                jbs[6].getText().equals(" ") && jbs[4].getText().equals("X") && jbs[2].getText().equals("X") ||
                        jbs[6].getText().equals(" ") && jbs[0].getText().equals("X") && jbs[3].getText().equals("X") ||
                        jbs[6].getText().equals(" ") && jbs[7].getText().equals("X") && jbs[8].getText().equals("X")

                ) {
            return 6;
        } else if (
                jbs[7].getText().equals(" ") && jbs[1].getText().equals("X") && jbs[4].getText().equals("X") ||
                        jbs[7].getText().equals(" ") && jbs[8].getText().equals("X") && jbs[6].getText().equals("X")//||
            //  jbs[7].getText().equals(" ") && jbs[4].getText().equals("X") && jbs[8].getText().equals("X")

                ) {
            return 7;
        } else if (
                jbs[8].getText().equals(" ") && jbs[2].getText().equals("X") && jbs[5].getText().equals("X") ||
                        jbs[8].getText().equals(" ") && jbs[0].getText().equals("X") && jbs[4].getText().equals("X") ||
                        jbs[8].getText().equals(" ") && jbs[7].getText().equals("X") && jbs[6].getText().equals("X")

                ) {
            return 8;
        } else if (
                jbs[8].getText().equals(" ") && jbs[2].getText().equals("O") && jbs[4].getText().equals("X")  ||
                        jbs[8].getText().equals(" ") && jbs[6].getText().equals("O") && jbs[4].getText().equals("X")

                ) {
            return 8;
        } else if (
                jbs[2].getText().equals(" ") && jbs[0].getText().equals("O") && jbs[4].getText().equals("X")  ||
                        jbs[2].getText().equals(" ") && jbs[8].getText().equals("O") && jbs[4].getText().equals("X")

                ) {
            return 2;
        }else  if(jbs[1].getText().equals(" ") && jbs[4].getText().equals("O") && jbs[2].getText().equals("X")&& jbs[6].getText().equals("X")){
            return 1;
        }



        int counter = 0;
        for (int i = 0; i < jbs.length; i++) {
            if (jbs[i].getText().equals("X")) {
                counter++;
            }
        }
        if (counter == 5) {
            return -1;
        }
        for (int i = 0;i< jbs.length; i++) {
            if (jbs[i].getText().equals(" ")) {
                return i;
            }
        }
return -1;

    }}