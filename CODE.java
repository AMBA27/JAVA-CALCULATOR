package Class.Cal;
import javax.script.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator extends javax.swing.JFrame {
private String Text = "";
private int x, y, $x, $y;
    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Bar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Stringer = new javax.swing.JTextField();
        One = new javax.swing.JButton();
        Two = new javax.swing.JButton();
        Three = new javax.swing.JButton();
        Four = new javax.swing.JButton();
        Five = new javax.swing.JButton();
        Six = new javax.swing.JButton();
        Seven = new javax.swing.JButton();
        Eigth = new javax.swing.JButton();
        Nine = new javax.swing.JButton();
        Zero = new javax.swing.JButton();
        Dot = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Divided = new javax.swing.JButton();
        Equal = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        Times = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Clear = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Java Calculattor Version 1 by M.A Reyes");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Bar.setBackground(new java.awt.Color(255, 255, 255));
        Bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarMouseDragged(evt);
            }
        });
        Bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Java Calculator");

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Exit.setText("X");
        Exit.setBorder(null);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BarLayout = new javax.swing.GroupLayout(Bar);
        Bar.setLayout(BarLayout);
        BarLayout.setHorizontalGroup(
            BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BarLayout.setVerticalGroup(
            BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Stringer.setEditable(false);
        Stringer.setBackground(new java.awt.Color(255, 255, 255));
        Stringer.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stringer.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Stringer, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Stringer, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        One.setBackground(new java.awt.Color(255, 255, 255));
        One.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        One.setText("1");
        One.setBorderPainted(false);
        One.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneActionPerformed(evt);
            }
        });

        Two.setBackground(new java.awt.Color(255, 255, 255));
        Two.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Two.setText("2");
        Two.setBorderPainted(false);
        Two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoActionPerformed(evt);
            }
        });

        Three.setBackground(new java.awt.Color(255, 255, 255));
        Three.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Three.setText("3");
        Three.setBorderPainted(false);
        Three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeActionPerformed(evt);
            }
        });

        Four.setBackground(new java.awt.Color(255, 255, 255));
        Four.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Four.setText("4");
        Four.setBorderPainted(false);
        Four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourActionPerformed(evt);
            }
        });

        Five.setBackground(new java.awt.Color(255, 255, 255));
        Five.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Five.setText("5");
        Five.setBorderPainted(false);
        Five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveActionPerformed(evt);
            }
        });

        Six.setBackground(new java.awt.Color(255, 255, 255));
        Six.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Six.setText("6");
        Six.setBorderPainted(false);
        Six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixActionPerformed(evt);
            }
        });

        Seven.setBackground(new java.awt.Color(255, 255, 255));
        Seven.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Seven.setText("7");
        Seven.setBorderPainted(false);
        Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenActionPerformed(evt);
            }
        });

        Eigth.setBackground(new java.awt.Color(255, 255, 255));
        Eigth.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Eigth.setText("8");
        Eigth.setBorderPainted(false);
        Eigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EigthActionPerformed(evt);
            }
        });

        Nine.setBackground(new java.awt.Color(255, 255, 255));
        Nine.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Nine.setText("9");
        Nine.setBorderPainted(false);
        Nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineActionPerformed(evt);
            }
        });

        Zero.setBackground(new java.awt.Color(255, 255, 255));
        Zero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Zero.setText("0");
        Zero.setBorderPainted(false);
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroActionPerformed(evt);
            }
        });

        Dot.setBackground(new java.awt.Color(255, 255, 255));
        Dot.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Dot.setText(".");
        Dot.setBorderPainted(false);
        Dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DotActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(28, 124, 238));

        Divided.setBackground(new java.awt.Color(255, 255, 255));
        Divided.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Divided.setText("/");
        Divided.setBorderPainted(false);
        Divided.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividedActionPerformed(evt);
            }
        });

        Equal.setBackground(new java.awt.Color(255, 255, 255));
        Equal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Equal.setText("=");
        Equal.setBorderPainted(false);
        Equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualActionPerformed(evt);
            }
        });

        Minus.setBackground(new java.awt.Color(255, 255, 255));
        Minus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Minus.setText("-");
        Minus.setBorderPainted(false);
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });

        Plus.setBackground(new java.awt.Color(255, 255, 255));
        Plus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Plus.setText("+");
        Plus.setBorderPainted(false);
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });

        Times.setBackground(new java.awt.Color(255, 255, 255));
        Times.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Times.setText("x");
        Times.setBorderPainted(false);
        Times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Times, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Divided, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Plus)
                .addGap(18, 18, 18)
                .addComponent(Minus)
                .addGap(18, 18, 18)
                .addComponent(Times)
                .addGap(18, 18, 18)
                .addComponent(Divided)
                .addGap(18, 18, 18)
                .addComponent(Equal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(28, 124, 238));

        Clear.setBackground(new java.awt.Color(255, 255, 255));
        Clear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Clear.setText("CE");
        Clear.setBorderPainted(false);
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(255, 255, 255));
        Back.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Back.setText("Del");
        Back.setBorderPainted(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear)
                    .addComponent(Back))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Four)
                                .addGap(18, 18, 18)
                                .addComponent(Five)
                                .addGap(18, 18, 18)
                                .addComponent(Six))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Dot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Zero))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Seven)
                                        .addGap(18, 18, 18)
                                        .addComponent(Eigth)))
                                .addGap(18, 18, 18)
                                .addComponent(Nine))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(One)
                                .addGap(18, 18, 18)
                                .addComponent(Two)
                                .addGap(18, 18, 18)
                                .addComponent(Three)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(One)
                            .addComponent(Two)
                            .addComponent(Three))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Four)
                            .addComponent(Five)
                            .addComponent(Six))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Seven)
                            .addComponent(Eigth)
                            .addComponent(Nine))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Zero)
                            .addComponent(Dot)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(400, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneActionPerformed
        Text += "1";
        Stringer.setText(Text);
    }//GEN-LAST:event_OneActionPerformed

    private void TwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoActionPerformed
        Text += "2";
        Stringer.setText(Text);
    }//GEN-LAST:event_TwoActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        Text += "+";
        Stringer.setText(Text);
    }//GEN-LAST:event_PlusActionPerformed

    private void ThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeActionPerformed
        Text += "3";
        Stringer.setText(Text);
    }//GEN-LAST:event_ThreeActionPerformed

    private void FourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourActionPerformed
        Text += "4";
        Stringer.setText(Text);
    }//GEN-LAST:event_FourActionPerformed

    private void FiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveActionPerformed
        Text += "5";
        Stringer.setText(Text);
    }//GEN-LAST:event_FiveActionPerformed

    private void SixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixActionPerformed
        Text += "6";
        Stringer.setText(Text);
    }//GEN-LAST:event_SixActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        Text += "-";
        Stringer.setText(Text);
    }//GEN-LAST:event_MinusActionPerformed

    private void SevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenActionPerformed
        Text += "7";
        Stringer.setText(Text);
    }//GEN-LAST:event_SevenActionPerformed

    private void EigthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EigthActionPerformed
        Text += "8";
        Stringer.setText(Text);
    }//GEN-LAST:event_EigthActionPerformed

    private void NineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NineActionPerformed
        Text += "9";
        Stringer.setText(Text);
    }//GEN-LAST:event_NineActionPerformed

    private void ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroActionPerformed
        Text += "0";
        Stringer.setText(Text);
    }//GEN-LAST:event_ZeroActionPerformed

    private void TimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimesActionPerformed
        Text += "*";
        Stringer.setText(Text);
    }//GEN-LAST:event_TimesActionPerformed

    private void DividedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividedActionPerformed
        Text += "/";
        Stringer.setText(Text);
    }//GEN-LAST:event_DividedActionPerformed

    private void EqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualActionPerformed
        try {
            ScriptEngineManager x = new ScriptEngineManager();
            ScriptEngine $x = x.getEngineByName("JavaScript");

            if(Text.contains(".")) {
                double y = ((Number)$x.eval(Text)).doubleValue();
            
                String z = String.format("" + y);
                Stringer.setText(z);
            }
            else {
                int y = ((Number)$x.eval(Text)).intValue();
            
                String z = String.format("" + y);
                Stringer.setText(z);
            }
        }
        catch(Exception a) {
            
        }
    }//GEN-LAST:event_EqualActionPerformed

    private void DotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DotActionPerformed
        Text += ".";
        Stringer.setText(Text);
    }//GEN-LAST:event_DotActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        Text = "";
        Stringer.setText(Text);
    }//GEN-LAST:event_ClearActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        
    }//GEN-LAST:event_BackActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        WindowEvent close = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(close);
    }//GEN-LAST:event_ExitActionPerformed

    private void BarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarMousePressed
        x = evt.getX();
        y = evt.getY();
        
    }//GEN-LAST:event_BarMousePressed

    private void BarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarMouseDragged
        $x = evt.getXOnScreen();
        $y = evt.getYOnScreen();
        
        
        this.setLocation($x - x, $y - y);
    }//GEN-LAST:event_BarMouseDragged

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JPanel Bar;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Divided;
    private javax.swing.JButton Dot;
    private javax.swing.JButton Eigth;
    private javax.swing.JButton Equal;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Five;
    private javax.swing.JButton Four;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Nine;
    private javax.swing.JButton One;
    private javax.swing.JButton Plus;
    private javax.swing.JButton Seven;
    private javax.swing.JButton Six;
    private javax.swing.JTextField Stringer;
    private javax.swing.JButton Three;
    private javax.swing.JButton Times;
    private javax.swing.JButton Two;
    private javax.swing.JButton Zero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
