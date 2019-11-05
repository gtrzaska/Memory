package memorki;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Grzegorz Trzaska
 */
public class JFPlansza extends javax.swing.JFrame {

    /**
     * Tworzenie klasy JFPlansza
     */
    public JFPlansza() {

        this.TabImg1 = new String[]{"im1", "im2", "im3", "im4", "im5", "im6", "im7", "im0", "im1", "im2", "im3", "im4", "im5", "im6", "im7", "im0"};

        this.TabImg3 = new String[]{"im1", "im2", "im3", "im4", "im5", "im6", "im7", "im0", "im8", "im9", "im10", "im11", "im12", "im15", "im14", "im1", "im2", "im3", "im4", "im5", "im6", "im7", "im8", "im9", "im10", "im11", "im12", "im15", "im14", "im0"};
        this.TabImg2 = new String[]{"im1", "im2", "im3", "im4", "im5", "im6", "im7", "im0", "im8", "im9", "im10", "im11", "im8", "im9", "im10", "im11", "im1", "im2", "im3", "im4", "im5", "im6", "im7", "im0"};
        initComponents();
        CreateLabels();
        timer01.scheduleAtFixedRate(task, new Date(), 1000);
    }
    /**
     * liczba zaznaczonych kart, gdy jest równa 2 uruchamia sie funkcja
     * sprawdzająca czy mamy parę
     */
    int lklik = 0;
    JLabel[] l2labels = new JLabel[2];
    /**
     * Ilość par
     */
    int ileKart = JFMenu.IleKart;
    /**
     * nazwa gracza
     */
    String pName = JFMenu.P1name;
    /**
     * Ilość znalezionych par
     */
    int pkt = 0;
    /**
     * tablica zawierająca karty
     */
    JLabel[][] labels = new JLabel[6][6];
    /**
     * Tablica zawierająca obrazki kart dla poziomu łatwego
     */
    String[] TabImg1;
    /**
     * Tablica zawierająca obrazki kart dla poziomu sredniego
     */
    String[] TabImg2;
    /**
     * Tablica zawierająca obrazki kart dla poziomu trudnego
     */
    String[] TabImg3;
    /**
     * minuta rozgrywki
     */
    int min = 0;
     /**
     * sekundy
     */
    int sek = 0;
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            Timer1();
        }
    };
    Timer timer01 = new Timer();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LbTimer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 51));
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(750, 850));
        setSize(new java.awt.Dimension(750, 850));

        LbTimer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(LbTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(463, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LbTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(800, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("frame");
    }// </editor-fold>//GEN-END:initComponents
     /**
     * minuty w postaci napisu
     */
    String smin;
     /**
     * sekundy w postaci napisu
     */
    String ssek;

    /**
     * Liczenie czasu gry
     */
    private void Timer1() {

        sek++;
        if (sek >= 60) {
            min++;
            sek = 0;
        }
        if (sek < 10) {
            ssek = "0" + sek;
        } else {
            ssek = "" + sek;
        }
        if (min < 10) {
            smin = "0" + min;
        } else {
            smin = "" + min;
        }
        LbTimer.setText("Time: "+smin + ":" + ssek);
    }

    /**
     * Tworzenie kart
     */
    private void CreateLabels() {
        int p = 0;
        int x1 = 0, y1 = 0;
        switch (ileKart) {
            case 8:
                x1 = 4;
                y1 = 4;
                Collections.shuffle(Arrays.asList(TabImg1));
                setSize(new java.awt.Dimension(750, 850));
                break;
            case 12:
                x1 = 6;
                y1 = 4;
                Collections.shuffle(Arrays.asList(TabImg2));
                setSize(new java.awt.Dimension(1100, 850));
                break;
            case 15:
                x1 = 6;
                y1 = 5;
                Collections.shuffle(Arrays.asList(TabImg3));
                setSize(new java.awt.Dimension(1100, 1000));
                break;
            default:
                break;
        }
        String[][] TabPlansza = new String[y1 + 1][x1 + 1];
        for (int i = 0; i < (y1); i++) {
            for (int j = 0; j < (x1); j++) {

                labels[i][j] = new JLabel("L-" + i + "-" + j);
                labels[i][j].setIcon(new ImageIcon(getClass().getResource("/memorki/img/img1.png")));
                labels[i][j].setBounds(150 * j + 25 * (j + 1), 150 * i + 25 * (i + 1) + 50, 150, 150);
                add(labels[i][j]);
                switch (ileKart) {
                    case 8:
                        TabPlansza[i][j] = TabImg1[p];
                        break;
                    case 12:
                        TabPlansza[i][j] = TabImg2[p];
                        break;
                    case 15:
                        TabPlansza[i][j] = TabImg3[p];
                        break;
                    default:
                        break;
                }
                p++;
                labels[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                       
                        System.out.println("11111");
                        if (lklik != 2) {
                            System.out.println("222");
                            String[] name1 = e.getSource().toString().split(",");
                             System.out.println(e.getSource().toString());
                             
                            String[] name2 = name1[17].split("-");
                            int x = Integer.parseInt(String.valueOf(name2[1]));
                            int y = Integer.parseInt(String.valueOf(name2[2]));
                                
                            if (new ImageIcon(getClass().getResource("img/img1.png")).toString().equals(labels[x][y].getIcon().toString())) {
                                System.out.println(x + "   " + y + " " + TabPlansza[x][y]);
                                labels[x][y].setIcon(new ImageIcon(getClass().getResource("img/" + TabPlansza[x][y] + ".PNG")));
                                l2labels[lklik] = labels[x][y];
                                lklik++;

                                if (lklik == 2) {
                                    new Thread() {
                                        @Override
                                        public void run() {
                                            try {
                                                this.sleep(550);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                            if (Check() == 0) {
                                                Hidei();
                                            }
                                        }
                                    }.start();
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    /**
     * Zakrywanie kart
     */
    private void Hidei() {
        l2labels[1].setIcon(new ImageIcon(getClass().getResource("/memorki/img/img1.png")));
        l2labels[0].setIcon(new ImageIcon(getClass().getResource("/memorki/img/img1.png")));
        lklik = 0;
    }

    /**
     * Sprawdzanie czy odkryte karty są takie same
     *
     * @return zwraca 1 gdy karty są takie same lub 0 gsy są różne
     */
    private int Check() {
        if (l2labels[1].getIcon().toString().equals(l2labels[0].getIcon().toString())) {
            pkt++;
            lklik = 0;
            if (pkt == ileKart) {
                System.out.println("koniec " + smin + ":" + ssek);
                try {
                    zapis();
                } catch (IOException ex) {
                    Logger.getLogger(JFPlansza.class.getName()).log(Level.SEVERE, null, ex);
                }
                JFWynik wyniki = null;
                try {
                    wyniki = new JFWynik();
                } catch (IOException ex) {
                    Logger.getLogger(JFPlansza.class.getName()).log(Level.SEVERE, null, ex);
                }
                LbTimer.setVisible(false);
                wyniki.setVisible(true);
            }
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Dopisanie wyniku do pliku
     *
     * @throws java.io.FileNotFoundException
     */
    public void zapis() throws FileNotFoundException, IOException {
        int czas = min * 60 + sek;
        Writer zapis = new BufferedWriter(new FileWriter("wyniki.txt", true));
        zapis.append(System.lineSeparator() + pName + "," + ileKart + "," + czas);
        zapis.close();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPlansza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPlansza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPlansza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPlansza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPlansza().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbTimer;
    // End of variables declaration//GEN-END:variables
}
