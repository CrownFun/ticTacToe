package main;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class TicTacToe extends javax.swing.JFrame {

    private int totalRowA = 0;
    private int totalRowB = 0;
    private int totalRowC = 0;
    private int totalRow1 = 0;
    private int totalRow2 = 0;
    private int totalRow3 = 0;
    private int totalRightToLeftDiagonal = 0;
    private int totalLeftToRightDiagonal = 0;

    public TicTacToe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelA1 = new javax.swing.JTextField();
        labelB1 = new javax.swing.JTextField();
        labelC1 = new javax.swing.JTextField();
        labelA2 = new javax.swing.JTextField();
        labelB2 = new javax.swing.JTextField();
        labelC2 = new javax.swing.JTextField();
        labelA3 = new javax.swing.JTextField();
        labelB3 = new javax.swing.JTextField();
        labelC3 = new javax.swing.JTextField();
        labelTotalRow3 = new javax.swing.JLabel();
        labelTotalRightToLeftDiagional = new javax.swing.JLabel();
        labelTotalRow2 = new javax.swing.JLabel();
        labelTotalRow1 = new javax.swing.JLabel();
        labelTotalRowA = new javax.swing.JLabel();
        labelTotalRowB = new javax.swing.JLabel();
        labelTotalRowC = new javax.swing.JLabel();
        labelTotalLeftToRightDiagonal = new javax.swing.JLabel();
        buttonNewGame = new javax.swing.JButton();
        buttonAboutProgram = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        labelA1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelA1.setForeground(new java.awt.Color(0, 0, 0));
        labelA1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelA1.setBorder(null);
        labelA1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labelA1KeyReleased(evt);
            }
        });
        jPanel2.add(labelA1);
        labelA1.setBounds(40, 40, 70, 40);

        labelB1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelB1.setForeground(new java.awt.Color(0, 0, 0));
        labelB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelB1.setBorder(null);
        labelB1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labelB1KeyReleased(evt);
            }
        });
        jPanel2.add(labelB1);
        labelB1.setBounds(120, 40, 70, 40);

        labelC1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelC1.setForeground(new java.awt.Color(0, 0, 0));
        labelC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelC1.setBorder(null);
        labelC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelC1ActionPerformed(evt);
            }
        });
        labelC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labelC1KeyReleased(evt);
            }
        });
        jPanel2.add(labelC1);
        labelC1.setBounds(200, 40, 70, 40);

        labelA2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelA2.setForeground(new java.awt.Color(0, 0, 0));
        labelA2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelA2.setBorder(null);
        labelA2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labelA2KeyReleased(evt);
            }
        });
        jPanel2.add(labelA2);
        labelA2.setBounds(40, 90, 70, 40);

        labelB2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelB2.setForeground(new java.awt.Color(0, 0, 0));
        labelB2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelB2.setBorder(null);
        labelB2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labelB2KeyReleased(evt);
            }
        });
        jPanel2.add(labelB2);
        labelB2.setBounds(120, 90, 70, 40);

        labelC2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelC2.setForeground(new java.awt.Color(0, 0, 0));
        labelC2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelC2.setBorder(null);
        labelC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labelC2KeyReleased(evt);
            }
        });
        jPanel2.add(labelC2);
        labelC2.setBounds(200, 90, 70, 40);

        labelA3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelA3.setForeground(new java.awt.Color(0, 0, 0));
        labelA3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelA3.setBorder(null);
        labelA3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labelA3KeyReleased(evt);
            }
        });
        jPanel2.add(labelA3);
        labelA3.setBounds(40, 140, 70, 40);

        labelB3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelB3.setForeground(new java.awt.Color(0, 0, 0));
        labelB3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelB3.setBorder(null);
        labelB3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labelB3KeyReleased(evt);
            }
        });
        jPanel2.add(labelB3);
        labelB3.setBounds(120, 140, 70, 40);

        labelC3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelC3.setForeground(new java.awt.Color(0, 0, 0));
        labelC3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelC3.setBorder(null);
        labelC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labelC3KeyReleased(evt);
            }
        });
        jPanel2.add(labelC3);
        labelC3.setBounds(200, 140, 70, 40);

        labelTotalRow3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(labelTotalRow3);
        labelTotalRow3.setBounds(290, 130, 60, 20);
        labelTotalRow3.setVisible(false);

        labelTotalRightToLeftDiagional.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(labelTotalRightToLeftDiagional);
        labelTotalRightToLeftDiagional.setBounds(290, 170, 60, 20);
        labelTotalRightToLeftDiagional.setVisible(false);

        labelTotalRow2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(labelTotalRow2);
        labelTotalRow2.setBounds(290, 90, 60, 20);
        labelTotalRow2.setVisible(false);

        labelTotalRow1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(labelTotalRow1);
        labelTotalRow1.setBounds(290, 50, 60, 20);
        labelTotalRow1.setVisible(false);

        labelTotalRowA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(labelTotalRowA);
        labelTotalRowA.setBounds(50, 10, 60, 20);
        labelTotalRowA.setVisible(false);

        labelTotalRowB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(labelTotalRowB);
        labelTotalRowB.setBounds(130, 10, 60, 20);
        labelTotalRowB.setVisible(false);

        labelTotalRowC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(labelTotalRowC);
        labelTotalRowC.setBounds(210, 10, 60, 20);
        labelTotalRowC.setVisible(false);

        labelTotalLeftToRightDiagonal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(labelTotalLeftToRightDiagonal);
        labelTotalLeftToRightDiagonal.setBounds(290, 10, 60, 20);
        labelTotalLeftToRightDiagonal.setVisible(false);

        buttonNewGame.setText("Nowa Gra");
        buttonNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewGameActionPerformed(evt);
            }
        });
        jPanel2.add(buttonNewGame);
        buttonNewGame.setBounds(50, 270, 120, 30);

        buttonAboutProgram.setText("Info");
        buttonAboutProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAboutProgramActionPerformed(evt);
            }
        });
        jPanel2.add(buttonAboutProgram);
        buttonAboutProgram.setBounds(380, 270, 60, 30);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 50));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(190, 40, 10, 140);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jSeparator2.setMinimumSize(new java.awt.Dimension(50, 50));
        jSeparator2.setOpaque(true);
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(40, 80, 230, 10);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jSeparator3.setMinimumSize(new java.awt.Dimension(50, 50));
        jSeparator3.setOpaque(true);
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(40, 130, 230, 10);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jSeparator4.setMinimumSize(new java.awt.Dimension(50, 50));
        jSeparator4.setOpaque(true);
        jSeparator4.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(110, 40, 10, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startNewGame() {
        labelTotalRow1.setText("");
        labelTotalRow2.setText("");
        labelTotalRow3.setText("");
        labelTotalRowA.setText("");
        labelTotalRowB.setText("");
        labelTotalRowC.setText("");
        labelTotalLeftToRightDiagonal.setText("");
        labelTotalRightToLeftDiagional.setText("");
        labelA1.setText("");
        labelA2.setText("");
        labelA3.setText("");
        labelB1.setText("");
        labelB2.setText("");
        labelB3.setText("");
        labelC1.setText("");
        labelC2.setText("");
        labelC3.setText("");
        totalRow1 = 0;
        totalRow2 = 0;
        totalRow3 = 0;
        totalRowA = 0;
        totalRowB = 0;
        totalRowC = 0;
        totalRightToLeftDiagonal = 0;
        totalLeftToRightDiagonal = 0;
        labelA1.setEnabled(true);
        labelB1.setEnabled(true);
        labelC1.setEnabled(true);
        labelA2.setEnabled(true);
        labelB2.setEnabled(true);
        labelC2.setEnabled(true);
        labelA3.setEnabled(true);
        labelB3.setEnabled(true);
        labelC3.setEnabled(true);
    }

    private void putValueA1() throws NumberFormatException, HeadlessException {
        if (!labelA1.getText().equals("o") && !labelA1.getText().equals("x")) {
            putIncorrectvalue();
            labelA1.setText("");
        } else {

            if (labelA1.getText().equals("x")) {
                totalRowA += 1;
                totalRow1 += 1;
                totalRightToLeftDiagonal += 1;
            } else if (labelA1.getText().equals("o")) {
                totalRowA += 7;
                totalRow1 += 7;
                totalRightToLeftDiagonal += 7;
            }

            labelTotalRow1.setText(String.valueOf(totalRow1));
            labelTotalRowA.setText(String.valueOf(totalRowA));
            labelTotalRightToLeftDiagional.setText(String.valueOf(totalRightToLeftDiagonal));

            if (Integer.valueOf(labelTotalRowA.getText()) == 3 || Integer.valueOf(labelTotalRow1.getText()) == 3 || Integer.valueOf(labelTotalRightToLeftDiagional.getText()) == 3) {
                PlayerXWin();

            } else if (Integer.valueOf(labelTotalRowA.getText()) == 21 || Integer.valueOf(labelTotalRow1.getText()) == 21 || Integer.valueOf(labelTotalRightToLeftDiagional.getText()) == 21) {
                playerOWin();

            } else {
                labelA1.setEnabled(false);
            }
        }
    }

    private void putValueB1() throws HeadlessException, NumberFormatException {
        if (!labelB1.getText().equals("o") && !labelB1.getText().equals("x")) {
            putIncorrectvalue();
            labelB1.setText("");
        } else {
            if (labelB1.getText().equals("x")) {
                totalRowB += 1;
                totalRow1 += 1;

            } else if (labelB1.getText().equals("o")) {
                totalRowB += 7;
                totalRow1 += 7;
            }

            labelTotalRow1.setText(String.valueOf(totalRow1));
            labelTotalRowB.setText(String.valueOf(totalRowB));
            if (Integer.valueOf(labelTotalRowB.getText()) == 3 || Integer.valueOf(labelTotalRow1.getText()) == 3) {
                PlayerXWin();
            } else if (Integer.valueOf(labelTotalRowB.getText()) == 21 || Integer.valueOf(labelTotalRow1.getText()) == 21) {
                playerOWin();
            } else {
                labelB1.setEnabled(false);
            }
        }
    }

    private void putValueC1() throws NumberFormatException, HeadlessException {
        if (!labelC1.getText().equals("o") && !labelC1.getText().equals("x")) {
            putIncorrectvalue();
            labelC1.setText("");
        } else {
            if (labelC1.getText().equals("x")) {
                totalRowC += 1;
                totalRow1 += 1;
                totalLeftToRightDiagonal += 1;
            } else if (labelC1.getText().equals("o")) {
                totalRowC += 7;
                totalRow1 += 7;
                totalLeftToRightDiagonal += 7;

            }

            labelTotalRow1.setText(String.valueOf(totalRow1));
            labelTotalRowC.setText(String.valueOf(totalRowC));
            labelTotalLeftToRightDiagonal.setText(String.valueOf(totalLeftToRightDiagonal));

            if (Integer.valueOf(labelTotalRowC.getText()) == 3 || Integer.valueOf(labelTotalRow1.getText()) == 3 || Integer.valueOf(labelTotalLeftToRightDiagonal.getText()) == 3) {
                PlayerXWin();
            } else if (Integer.valueOf(labelTotalRowC.getText()) == 21 || Integer.valueOf(labelTotalRow1.getText()) == 21 || Integer.valueOf(labelTotalLeftToRightDiagonal.getText()) == 21) {
                playerOWin();
            } else {
                labelC1.setEnabled(false);
            }

        }
    }

    private void putValueA2() throws NumberFormatException, HeadlessException {
        if (!labelA2.getText().equals("o") && !labelA2.getText().equals("x")) {
            putIncorrectvalue();
            labelA2.setText("");
        } else {
            if (labelA2.getText().equals("x")) {
                totalRowA += 1;
                totalRow2 += 1;

            } else {
                totalRowA += 7;
                totalRow2 += 7;
            }
            labelTotalRowA.setText(String.valueOf(totalRowA));
            labelTotalRow2.setText(String.valueOf(totalRow2));
            if (Integer.valueOf(labelTotalRowA.getText()) == 3 || Integer.valueOf(labelTotalRow2.getText()) == 3) {
                PlayerXWin();
            } else if (Integer.valueOf(labelTotalRowA.getText()) == 21 || Integer.valueOf(labelTotalRow2.getText()) == 21) {
                playerOWin();
            } else {
                labelA2.setEnabled(false);
            }
        }
    }

    private void putValueB2() throws NumberFormatException, HeadlessException {
        if (!labelB2.getText().equals("o") && !labelB2.getText().equals("x")) {
            putIncorrectvalue();
            labelB2.setText("");
        } else {
            if (labelB2.getText().equals("x")) {
                totalRowB += 1;
                totalRow2 += 1;
                totalRightToLeftDiagonal += 1;
                totalLeftToRightDiagonal += 1;
            } else {
                totalRowB += 7;
                totalRow2 += 7;
                totalRightToLeftDiagonal += 7;
                totalLeftToRightDiagonal += 7;
            }
            labelTotalRowB.setText(String.valueOf(totalRowB));
            labelTotalRow2.setText(String.valueOf(totalRow2));
            labelTotalLeftToRightDiagonal.setText(String.valueOf(totalLeftToRightDiagonal));
            labelTotalRightToLeftDiagional.setText(String.valueOf(totalRightToLeftDiagonal));

            if (Integer.valueOf(labelTotalRowB.getText()) == 3 || Integer.valueOf(labelTotalRow2.getText()) == 3 || Integer.valueOf(labelTotalLeftToRightDiagonal.getText()) == 3 || Integer.valueOf(labelTotalRightToLeftDiagional.getText()) == 3) {
                PlayerXWin();
            } else if (Integer.valueOf(labelTotalRowB.getText()) == 21 || Integer.valueOf(labelTotalRow2.getText()) == 21 || Integer.valueOf(labelTotalLeftToRightDiagonal.getText()) == 21 || Integer.valueOf(labelTotalRightToLeftDiagional.getText()) == 6) {
                playerOWin();
            } else {
                labelB2.setEnabled(false);
            }
        }
    }

    private void putValueC2() throws NumberFormatException, HeadlessException {
        if (!labelC2.getText().equals("o") && !labelC2.getText().equals("x")) {
            putIncorrectvalue();
            labelC2.setText("");
        } else {
            if (labelC2.getText().equals("x")) {
                totalRowC += 1;
                totalRow2 += 1;
            } else {
                totalRowC += 7;
                totalRow2 += 7;
            }
            labelTotalRowC.setText(String.valueOf(totalRowC));
            labelTotalRow2.setText(String.valueOf(totalRow2));

            if (Integer.valueOf(labelTotalRowC.getText()) == 3 || Integer.valueOf(labelTotalRow2.getText()) == 3) {
                PlayerXWin();
            } else if (Integer.valueOf(labelTotalRowC.getText()) == 21 || Integer.valueOf(labelTotalRow2.getText()) == 21) {
                playerOWin();
            } else {
                labelC2.setEnabled(false);
            }
        }
    }

    private void putValueA3() throws NumberFormatException, HeadlessException {
        if (!labelA3.getText().equals("o") && !labelA3.getText().equals("x")) {
            putIncorrectvalue();
            labelA3.setText("");
        } else {
            if (labelA3.getText().equals("x")) {
                totalRowA += 1;
                totalRow3 += 1;
                totalLeftToRightDiagonal += 1;
            } else {
                totalRowA += 7;
                totalRow3 += 7;
                totalLeftToRightDiagonal += 7;
            }
            labelTotalRowA.setText(String.valueOf(totalRowA));
            labelTotalRow3.setText(String.valueOf(totalRow3));
            labelTotalLeftToRightDiagonal.setText(String.valueOf(totalLeftToRightDiagonal));

            if (Integer.valueOf(labelTotalRowA.getText()) == 3 || Integer.valueOf(labelTotalRow3.getText()) == 3 || Integer.valueOf(labelTotalLeftToRightDiagonal.getText()) == 3) {
                PlayerXWin();
            } else if (Integer.valueOf(labelTotalRowA.getText()) == 21 || Integer.valueOf(labelTotalRow3.getText()) == 21 || Integer.valueOf(labelTotalLeftToRightDiagonal.getText()) == 21) {
                playerOWin();
            } else {
                labelA3.setEnabled(false);
            }

        }
    }

    private void putValueB3() throws HeadlessException, NumberFormatException {
        if (!labelB3.getText().equals("o") && !labelB3.getText().equals("x")) {
            putIncorrectvalue();
            labelB3.setText("");
        } else {
            if (labelB3.getText().equals("x")) {
                totalRowB += 1;
                totalRow3 += 1;
            } else {
                totalRowB += 7;
                totalRow3 += 7;
            }

            labelTotalRowB.setText(String.valueOf(totalRowB));
            labelTotalRow3.setText(String.valueOf(totalRow3));

            if (Integer.valueOf(labelTotalRowB.getText()) == 3 || Integer.valueOf(labelTotalRow3.getText()) == 3) {
                PlayerXWin();
            } else if (Integer.valueOf(labelTotalRowB.getText()) == 21 || Integer.valueOf(labelTotalRow3.getText()) == 21) {
                playerOWin();
            } else {
                labelB3.setEnabled(false);
            }
        }
    }

    private void putValueC3() throws HeadlessException, NumberFormatException {
        if (!labelC3.getText().equals("o") && !labelC3.getText().equals("x")) {
            putIncorrectvalue();
            labelC3.setText("");
        } else {
            if (labelC3.getText().equals("x")) {
                totalRowC += 1;
                totalRow3 += 1;
                totalRightToLeftDiagonal += 1;
            } else {
                totalRowC += 7;
                totalRow3 += 7;
                totalRightToLeftDiagonal += 7;
            }

            labelTotalRowC.setText(String.valueOf(totalRowC));
            labelTotalRow3.setText(String.valueOf(totalRow3));
            labelTotalRightToLeftDiagional.setText(String.valueOf(totalRightToLeftDiagonal));

            if (Integer.valueOf(labelTotalRowC.getText()) == 3 || Integer.valueOf(labelTotalRow3.getText()) == 3 || Integer.valueOf(labelTotalRightToLeftDiagional.getText()) == 3) {
                PlayerXWin();
            } else if (Integer.valueOf(labelTotalRowC.getText()) == 21 || Integer.valueOf(labelTotalRow3.getText()) == 21 || Integer.valueOf(labelTotalRightToLeftDiagional.getText()) == 21) {
                playerOWin();
            } else {
                labelC3.setEnabled(false);
            }
        }
    }

    private void putIncorrectvalue() throws HeadlessException {
        JOptionPane.showMessageDialog(null, "Nie poprawna wartosć! -  wpisz X lub O ", "Błąd", JOptionPane.WARNING_MESSAGE);
    }

    private void playerOWin() throws HeadlessException {
        JOptionPane.showMessageDialog(null, "\"O\" wygrywa!");
        startNewGame();
    }

    private void PlayerXWin() throws HeadlessException {
        JOptionPane.showMessageDialog(null, "\"X\" wygrywa!");
        startNewGame();
    }

    private void AboutProgram() throws HeadlessException {
        JOptionPane.showMessageDialog(null, "Program \"Kołko i Krzyżyk\" - popularna gra strategiczna  polegająca na wstawianiu symbolu \"O\" lub \"X\"\n"
                + "w pole gry o wymiarach 3x3 dążąc do zajęcia trzech pól w jednej linii.\n\nAutor: Grzegorz Filewicz,\n"
                + "Lublin, 20.12.2017r.   ");
    }

    public void exitProgram() throws HeadlessException {
        int exit = JOptionPane.showConfirmDialog(rootPane, "Czy napewno chcesz wyjść?", "Notatnik", JOptionPane.YES_NO_OPTION);
        if (exit == JOptionPane.YES_OPTION) {
            this.dispose();

        } else if (exit == JOptionPane.NO_OPTION) {
        }
    }

    private void buttonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewGameActionPerformed
        startNewGame();
    }//GEN-LAST:event_buttonNewGameActionPerformed


    private void labelA1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelA1KeyReleased
        putValueA1();
    }//GEN-LAST:event_labelA1KeyReleased

    private void labelB1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelB1KeyReleased
        putValueB1();
    }//GEN-LAST:event_labelB1KeyReleased

    private void labelC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelC1KeyReleased
        putValueC1();
    }//GEN-LAST:event_labelC1KeyReleased

    private void labelA2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelA2KeyReleased
        putValueA2();
    }//GEN-LAST:event_labelA2KeyReleased

    private void labelB2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelB2KeyReleased
        putValueB2();
    }//GEN-LAST:event_labelB2KeyReleased

    private void labelC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelC2KeyReleased
        putValueC2();
    }//GEN-LAST:event_labelC2KeyReleased

    private void labelA3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelA3KeyReleased
        putValueA3();
    }//GEN-LAST:event_labelA3KeyReleased

    private void labelB3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelB3KeyReleased
        putValueB3();
    }//GEN-LAST:event_labelB3KeyReleased

    private void labelC3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelC3KeyReleased
        putValueC3();
    }//GEN-LAST:event_labelC3KeyReleased

    private void labelC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelC1ActionPerformed

    private void buttonAboutProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAboutProgramActionPerformed
        AboutProgram();
    }//GEN-LAST:event_buttonAboutProgramActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exitProgram();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAboutProgram;
    private javax.swing.JButton buttonNewGame;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField labelA1;
    private javax.swing.JTextField labelA2;
    private javax.swing.JTextField labelA3;
    private javax.swing.JTextField labelB1;
    private javax.swing.JTextField labelB2;
    private javax.swing.JTextField labelB3;
    private javax.swing.JTextField labelC1;
    private javax.swing.JTextField labelC2;
    private javax.swing.JTextField labelC3;
    private javax.swing.JLabel labelTotalLeftToRightDiagonal;
    private javax.swing.JLabel labelTotalRightToLeftDiagional;
    private javax.swing.JLabel labelTotalRow1;
    private javax.swing.JLabel labelTotalRow2;
    private javax.swing.JLabel labelTotalRow3;
    private javax.swing.JLabel labelTotalRowA;
    private javax.swing.JLabel labelTotalRowB;
    private javax.swing.JLabel labelTotalRowC;
    // End of variables declaration//GEN-END:variables
}
