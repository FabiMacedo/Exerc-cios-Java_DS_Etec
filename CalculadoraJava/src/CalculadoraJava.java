
import javax.swing.ImageIcon;

public class CalculadoraJava extends javax.swing.JFrame {

    public CalculadoraJava() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/ico_calc.jpg")).getImage());
    }
    
    double valor1 = 0;
    double valor2 = 0;
    String operador = null;
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_four = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        btn_one = new javax.swing.JButton();
        btn_seven = new javax.swing.JButton();
        btn_zero = new javax.swing.JButton();
        btn_eight = new javax.swing.JButton();
        btn_five = new javax.swing.JButton();
        btn_two = new javax.swing.JButton();
        btn_nine = new javax.swing.JButton();
        btn_six = new javax.swing.JButton();
        btn_three = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        btn_divide = new javax.swing.JButton();
        btn_multi = new javax.swing.JButton();
        btn_sub = new javax.swing.JButton();
        btn_sum = new javax.swing.JButton();
        btn_equal = new javax.swing.JButton();
        txt_result = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setMaximumSize(new java.awt.Dimension(350, 450));
        setMinimumSize(new java.awt.Dimension(350, 450));
        setPreferredSize(new java.awt.Dimension(350, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        btn_four.setBackground(new java.awt.Color(247, 205, 84));
        btn_four.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_four.setForeground(new java.awt.Color(72, 70, 92));
        btn_four.setText("4");
        btn_four.setBorder(null);
        btn_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fourActionPerformed(evt);
            }
        });
        getContentPane().add(btn_four);
        btn_four.setBounds(30, 250, 60, 40);

        btn_limpar.setBackground(new java.awt.Color(123, 126, 203));
        btn_limpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_limpar.setForeground(new java.awt.Color(72, 70, 92));
        btn_limpar.setText("Limpar");
        btn_limpar.setBorder(null);
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpar);
        btn_limpar.setBounds(30, 150, 200, 40);

        btn_one.setBackground(new java.awt.Color(247, 205, 84));
        btn_one.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_one.setForeground(new java.awt.Color(72, 70, 92));
        btn_one.setText("1");
        btn_one.setBorder(null);
        btn_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oneActionPerformed(evt);
            }
        });
        getContentPane().add(btn_one);
        btn_one.setBounds(30, 300, 60, 40);

        btn_seven.setBackground(new java.awt.Color(247, 205, 84));
        btn_seven.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_seven.setForeground(new java.awt.Color(72, 70, 92));
        btn_seven.setText("7");
        btn_seven.setBorder(null);
        btn_seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sevenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_seven);
        btn_seven.setBounds(30, 200, 60, 40);

        btn_zero.setBackground(new java.awt.Color(247, 205, 84));
        btn_zero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_zero.setForeground(new java.awt.Color(72, 70, 92));
        btn_zero.setText("0");
        btn_zero.setBorder(null);
        btn_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zeroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_zero);
        btn_zero.setBounds(30, 350, 130, 40);

        btn_eight.setBackground(new java.awt.Color(247, 205, 84));
        btn_eight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_eight.setForeground(new java.awt.Color(72, 70, 92));
        btn_eight.setText("8");
        btn_eight.setBorder(null);
        btn_eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eightActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eight);
        btn_eight.setBounds(100, 200, 60, 40);

        btn_five.setBackground(new java.awt.Color(247, 205, 84));
        btn_five.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_five.setForeground(new java.awt.Color(72, 70, 92));
        btn_five.setText("5");
        btn_five.setBorder(null);
        btn_five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fiveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_five);
        btn_five.setBounds(100, 250, 60, 40);

        btn_two.setBackground(new java.awt.Color(247, 205, 84));
        btn_two.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_two.setForeground(new java.awt.Color(72, 70, 92));
        btn_two.setText("2");
        btn_two.setBorder(null);
        btn_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_twoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_two);
        btn_two.setBounds(100, 300, 60, 40);

        btn_nine.setBackground(new java.awt.Color(247, 205, 84));
        btn_nine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_nine.setForeground(new java.awt.Color(72, 70, 92));
        btn_nine.setText("9");
        btn_nine.setBorder(null);
        btn_nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nineActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nine);
        btn_nine.setBounds(170, 200, 60, 40);

        btn_six.setBackground(new java.awt.Color(247, 205, 84));
        btn_six.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_six.setForeground(new java.awt.Color(72, 70, 92));
        btn_six.setText("6");
        btn_six.setBorder(null);
        btn_six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sixActionPerformed(evt);
            }
        });
        getContentPane().add(btn_six);
        btn_six.setBounds(170, 250, 60, 40);

        btn_three.setBackground(new java.awt.Color(247, 205, 84));
        btn_three.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_three.setForeground(new java.awt.Color(72, 70, 92));
        btn_three.setText("3");
        btn_three.setBorder(null);
        btn_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_threeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_three);
        btn_three.setBounds(170, 300, 60, 40);

        btn_dot.setBackground(new java.awt.Color(247, 205, 84));
        btn_dot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_dot.setForeground(new java.awt.Color(72, 70, 92));
        btn_dot.setText(".");
        btn_dot.setBorder(null);
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dot);
        btn_dot.setBounds(170, 350, 60, 40);

        btn_divide.setBackground(new java.awt.Color(247, 205, 84));
        btn_divide.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_divide.setForeground(new java.awt.Color(72, 70, 92));
        btn_divide.setText("/");
        btn_divide.setBorder(null);
        btn_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divideActionPerformed(evt);
            }
        });
        getContentPane().add(btn_divide);
        btn_divide.setBounds(240, 150, 80, 40);

        btn_multi.setBackground(new java.awt.Color(247, 205, 84));
        btn_multi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_multi.setForeground(new java.awt.Color(72, 70, 92));
        btn_multi.setText("x");
        btn_multi.setBorder(null);
        btn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_multi);
        btn_multi.setBounds(240, 200, 80, 40);

        btn_sub.setBackground(new java.awt.Color(247, 205, 84));
        btn_sub.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_sub.setForeground(new java.awt.Color(72, 70, 92));
        btn_sub.setText("-");
        btn_sub.setBorder(null);
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sub);
        btn_sub.setBounds(240, 250, 80, 40);

        btn_sum.setBackground(new java.awt.Color(247, 205, 84));
        btn_sum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_sum.setForeground(new java.awt.Color(72, 70, 92));
        btn_sum.setText("+");
        btn_sum.setBorder(null);
        btn_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sum);
        btn_sum.setBounds(240, 300, 80, 40);

        btn_equal.setBackground(new java.awt.Color(114, 193, 234));
        btn_equal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_equal.setForeground(new java.awt.Color(72, 70, 92));
        btn_equal.setText("=");
        btn_equal.setBorder(null);
        btn_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalActionPerformed(evt);
            }
        });
        getContentPane().add(btn_equal);
        btn_equal.setBounds(240, 350, 80, 40);

        txt_result.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_result.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(72, 70, 92), new java.awt.Color(72, 70, 92)));
        getContentPane().add(txt_result);
        txt_result.setBounds(30, 90, 290, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_calc.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 350, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_zeroActionPerformed
        txt_result.setText(txt_result.getText() +"0");
    }//GEN-LAST:event_btn_zeroActionPerformed

    private void btn_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oneActionPerformed
        txt_result.setText(txt_result.getText() + "1");
    }//GEN-LAST:event_btn_oneActionPerformed

    private void btn_twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_twoActionPerformed
        txt_result.setText(txt_result.getText() + "2");
    }//GEN-LAST:event_btn_twoActionPerformed

    private void btn_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_threeActionPerformed
        txt_result.setText(txt_result.getText() + "3");
    }//GEN-LAST:event_btn_threeActionPerformed

    private void btn_fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fourActionPerformed
        txt_result.setText(txt_result.getText() + "4");
    }//GEN-LAST:event_btn_fourActionPerformed

    private void btn_fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fiveActionPerformed
        txt_result.setText(txt_result.getText() + "5");
    }//GEN-LAST:event_btn_fiveActionPerformed

    private void btn_sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sixActionPerformed
        txt_result.setText(txt_result.getText() + "6");
    }//GEN-LAST:event_btn_sixActionPerformed

    private void btn_sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sevenActionPerformed
        txt_result.setText(txt_result.getText() + "7");
    }//GEN-LAST:event_btn_sevenActionPerformed

    private void btn_eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eightActionPerformed
        txt_result.setText(txt_result.getText() + "8");
    }//GEN-LAST:event_btn_eightActionPerformed

    private void btn_nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nineActionPerformed
        txt_result.setText(txt_result.getText() + "9");
    }//GEN-LAST:event_btn_nineActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        txt_result.setText(txt_result.getText() + ".");
    }//GEN-LAST:event_btn_dotActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        txt_result.setText("");
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumActionPerformed
        valor1 = Double.parseDouble(txt_result.getText());
        txt_result.setText("");
        operador = "+";
    }//GEN-LAST:event_btn_sumActionPerformed

    private void btn_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalActionPerformed
        valor2 = Double.parseDouble(txt_result.getText());
        
        switch (operador) {
            case "+":
               txt_result.setText(String.valueOf(valor1 + valor2)); 
            break;
            
            case "-":
               txt_result.setText(String.valueOf(valor1 - valor2)); 
            break;
            
            case "*":
               txt_result.setText(String.valueOf(valor1 * valor2)); 
            break;
            
            case "/":
               txt_result.setText(String.valueOf(valor1 / valor2)); 
            break;
            
        }
    }//GEN-LAST:event_btn_equalActionPerformed

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed
        valor1 = Double.parseDouble(txt_result.getText());
        txt_result.setText("");
        operador = "-";
    }//GEN-LAST:event_btn_subActionPerformed

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed
        valor1 = Double.parseDouble(txt_result.getText());
        txt_result.setText("");
        operador = "*";
    }//GEN-LAST:event_btn_multiActionPerformed

    private void btn_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divideActionPerformed
        valor1 = Double.parseDouble(txt_result.getText());
        txt_result.setText("");
        operador = "/";
    }//GEN-LAST:event_btn_divideActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_divide;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_eight;
    private javax.swing.JButton btn_equal;
    private javax.swing.JButton btn_five;
    private javax.swing.JButton btn_four;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_nine;
    private javax.swing.JButton btn_one;
    private javax.swing.JButton btn_seven;
    private javax.swing.JButton btn_six;
    private javax.swing.JButton btn_sub;
    private javax.swing.JButton btn_sum;
    private javax.swing.JButton btn_three;
    private javax.swing.JButton btn_two;
    private javax.swing.JButton btn_zero;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_result;
    // End of variables declaration//GEN-END:variables
}
