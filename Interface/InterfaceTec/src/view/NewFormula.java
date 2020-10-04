package view;

import controllers.FormulaTreatment;
import controllers.TableTreatment;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class NewFormula extends javax.swing.JFrame {

    public NewFormula() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        new_menu = new javax.swing.JButton();
        new_text = new javax.swing.JTextField();
        new_result = new javax.swing.JButton();
        new_propositions = new javax.swing.JPanel();
        new_label_prop = new javax.swing.JLabel();
        new_prop_but_A = new javax.swing.JButton();
        new_prop_but_B = new javax.swing.JButton();
        new_prop_but_C = new javax.swing.JButton();
        new_prop_but_D = new javax.swing.JButton();
        new_prop_but_E = new javax.swing.JButton();
        new_op_but_openpar = new javax.swing.JButton();
        new_op_but_closepar = new javax.swing.JButton();
        new_label_oper = new javax.swing.JLabel();
        new_op_but_not = new javax.swing.JButton();
        new_op_but_or = new javax.swing.JButton();
        new_op_but_and = new javax.swing.JButton();
        new_op_but_APAGAR = new javax.swing.JButton();

        jDialog1.setTitle("Confirmação");
        jDialog1.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clauses");
        setBackground(new java.awt.Color(204, 255, 255));
        setForeground(java.awt.Color.white);
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        new_menu.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        new_menu.setText("< Menu");
        new_menu.setBorder(null);
        new_menu.setBorderPainted(false);
        new_menu.setContentAreaFilled(false);
        new_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_menuActionPerformed(evt);
            }
        });

        new_text.setEditable(false);
        new_text.setBackground(new java.awt.Color(255, 255, 255));
        new_text.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        new_text.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        new_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_textActionPerformed(evt);
            }
        });

        new_result.setBackground(new java.awt.Color(255, 255, 255));
        new_result.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        new_result.setText("Result >");
        new_result.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        new_result.setContentAreaFilled(false);
        new_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_resultActionPerformed(evt);
            }
        });

        new_propositions.setBackground(new java.awt.Color(255, 255, 255));
        new_propositions.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        new_label_prop.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        new_label_prop.setText("Propositions");

        new_prop_but_A.setBackground(new java.awt.Color(255, 255, 255));
        new_prop_but_A.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        new_prop_but_A.setText("A");
        new_prop_but_A.setToolTipText("");
        new_prop_but_A.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        new_prop_but_A.setContentAreaFilled(false);
        new_prop_but_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_prop_but_AActionPerformed(evt);
            }
        });

        new_prop_but_B.setBackground(new java.awt.Color(255, 255, 255));
        new_prop_but_B.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        new_prop_but_B.setText("B");
        new_prop_but_B.setToolTipText("");
        new_prop_but_B.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        new_prop_but_B.setContentAreaFilled(false);
        new_prop_but_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_prop_but_BActionPerformed(evt);
            }
        });

        new_prop_but_C.setBackground(new java.awt.Color(255, 255, 255));
        new_prop_but_C.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        new_prop_but_C.setText("C");
        new_prop_but_C.setToolTipText("");
        new_prop_but_C.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        new_prop_but_C.setContentAreaFilled(false);
        new_prop_but_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_prop_but_CActionPerformed(evt);
            }
        });

        new_prop_but_D.setBackground(new java.awt.Color(255, 255, 255));
        new_prop_but_D.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        new_prop_but_D.setText("D");
        new_prop_but_D.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        new_prop_but_D.setContentAreaFilled(false);
        new_prop_but_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_prop_but_DActionPerformed(evt);
            }
        });

        new_prop_but_E.setBackground(new java.awt.Color(255, 255, 255));
        new_prop_but_E.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        new_prop_but_E.setText("E");
        new_prop_but_E.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        new_prop_but_E.setContentAreaFilled(false);
        new_prop_but_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_prop_but_EActionPerformed(evt);
            }
        });

        new_op_but_openpar.setBackground(new java.awt.Color(255, 255, 255));
        new_op_but_openpar.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        new_op_but_openpar.setText("(");
        new_op_but_openpar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        new_op_but_openpar.setContentAreaFilled(false);
        new_op_but_openpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_op_but_openparActionPerformed(evt);
            }
        });

        new_op_but_closepar.setBackground(new java.awt.Color(255, 255, 255));
        new_op_but_closepar.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        new_op_but_closepar.setText(")");
        new_op_but_closepar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        new_op_but_closepar.setContentAreaFilled(false);
        new_op_but_closepar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_op_but_closeparActionPerformed(evt);
            }
        });

        new_label_oper.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        new_label_oper.setText("Operators");
        new_label_oper.setToolTipText("");

        new_op_but_not.setBackground(new java.awt.Color(255, 255, 255));
        new_op_but_not.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        new_op_but_not.setText("¬");
        new_op_but_not.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        new_op_but_not.setContentAreaFilled(false);
        new_op_but_not.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_op_but_notActionPerformed(evt);
            }
        });

        new_op_but_or.setBackground(new java.awt.Color(255, 255, 255));
        new_op_but_or.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        new_op_but_or.setText("OR");
        new_op_but_or.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        new_op_but_or.setContentAreaFilled(false);
        new_op_but_or.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_op_but_orActionPerformed(evt);
            }
        });

        new_op_but_and.setBackground(new java.awt.Color(255, 255, 255));
        new_op_but_and.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        new_op_but_and.setText("AND");
        new_op_but_and.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        new_op_but_and.setContentAreaFilled(false);
        new_op_but_and.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_op_but_andActionPerformed(evt);
            }
        });

        new_op_but_APAGAR.setBackground(new java.awt.Color(255, 255, 255));
        new_op_but_APAGAR.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        new_op_but_APAGAR.setForeground(new java.awt.Color(255, 0, 0));
        new_op_but_APAGAR.setText("DELETE");
        new_op_but_APAGAR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        new_op_but_APAGAR.setContentAreaFilled(false);
        new_op_but_APAGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_op_but_APAGARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout new_propositionsLayout = new javax.swing.GroupLayout(new_propositions);
        new_propositions.setLayout(new_propositionsLayout);
        new_propositionsLayout.setHorizontalGroup(
            new_propositionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new_propositionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(new_propositionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new_propositionsLayout.createSequentialGroup()
                        .addGroup(new_propositionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(new_propositionsLayout.createSequentialGroup()
                                .addComponent(new_prop_but_A, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(new_prop_but_B, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(new_prop_but_C, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(new_prop_but_D, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(new_prop_but_E, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(new_op_but_openpar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(new_op_but_closepar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(new_label_oper))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(new_propositionsLayout.createSequentialGroup()
                        .addComponent(new_label_prop)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(new_propositionsLayout.createSequentialGroup()
                        .addComponent(new_op_but_not, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(new_op_but_or, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(new_op_but_and, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(new_op_but_APAGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        new_propositionsLayout.setVerticalGroup(
            new_propositionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new_propositionsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(new_label_prop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(new_propositionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_prop_but_A, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_prop_but_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_prop_but_C, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_prop_but_D, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_prop_but_E, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_op_but_openpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_op_but_closepar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(new_label_oper)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(new_propositionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_op_but_not, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_op_but_and, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_op_but_or, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_op_but_APAGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(new_result, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(new_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(new_propositions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(new_text)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(new_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(new_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(new_propositions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(new_result, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void new_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_menuActionPerformed
        new Principal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_new_menuActionPerformed

    private void new_op_but_openparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_op_but_openparActionPerformed
        String texto = new_text.getText();
        new_text.setText(texto + "(");
    }//GEN-LAST:event_new_op_but_openparActionPerformed

    private void new_op_but_closeparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_op_but_closeparActionPerformed
        String texto = new_text.getText();
        new_text.setText(texto + ")");
    }//GEN-LAST:event_new_op_but_closeparActionPerformed

    private void new_op_but_notActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_op_but_notActionPerformed
        String texto = new_text.getText();
        new_text.setText(texto + "¬");
    }//GEN-LAST:event_new_op_but_notActionPerformed

    private void new_op_but_orActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_op_but_orActionPerformed
        String texto = new_text.getText();
        new_text.setText(texto + " OR ");
    }//GEN-LAST:event_new_op_but_orActionPerformed

    private void new_op_but_andActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_op_but_andActionPerformed
        String texto = new_text.getText();
        new_text.setText(texto + " AND ");
    }//GEN-LAST:event_new_op_but_andActionPerformed

    private void new_prop_but_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_prop_but_AActionPerformed
        String texto = new_text.getText();
        new_text.setText(texto + "A");
    }//GEN-LAST:event_new_prop_but_AActionPerformed

    private void new_prop_but_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_prop_but_BActionPerformed
        String texto = new_text.getText();
        new_text.setText(texto + "B");
    }//GEN-LAST:event_new_prop_but_BActionPerformed

    private void new_prop_but_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_prop_but_CActionPerformed
        String texto = new_text.getText();
        new_text.setText(texto + "C");
    }//GEN-LAST:event_new_prop_but_CActionPerformed

    private void new_prop_but_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_prop_but_DActionPerformed
        String texto = new_text.getText();
        new_text.setText(texto + "D");
    }//GEN-LAST:event_new_prop_but_DActionPerformed

    private void new_prop_but_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_prop_but_EActionPerformed
        String texto = new_text.getText();
        new_text.setText(texto + "E");
    }//GEN-LAST:event_new_prop_but_EActionPerformed

    private void new_op_but_APAGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_op_but_APAGARActionPerformed
        String texto = new_text.getText();
        if (texto.length() > 0) {
            texto = texto.substring(0, texto.length() - 1);
        }
        new_text.setText(texto);
    }//GEN-LAST:event_new_op_but_APAGARActionPerformed

    private void new_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_resultActionPerformed

        Object[] options = {"Confirm", "Cancel"};
        UIManager.put("OptionPane.minimumSize", new Dimension(500, 100));
        //UIManager.getDefaults().put("OptionPane.background", new Color(190, 255, 255));
        //UIManager.put("Panel.background", new Color(190, 255, 255));
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                "Arial", Font.BOLD, 18)));

        int o = JOptionPane.showOptionDialog(null, "The formula entered was: " + new_text.getText(), "Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (o == 0) {      
            //getClauses
            String[] Clauses = FormulaTreatment.getClauses(new_text.getText());
            //Clauses + Formulas Header
            String [] tableHeader = TableTreatment.tableHeaderConstructor(Clauses,Clauses);
            //Clauses + Formulas Rows
            String [][] tableRow = TableTreatment.tableRowConstructor(FormulaTreatment.generateFormulaValues(Clauses.length),FormulaTreatment.generateFormulaValues(Clauses.length));
            //Result(tableHeader,tableRows)
            Result resultScreen = new Result(tableHeader, tableRow);
            resultScreen.setVisible(true);
            this.setVisible(false);
        }
        
        //FormulaTreatment.tratarFormula(new_text.getText());                
    }//GEN-LAST:event_new_resultActionPerformed

    private void new_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_textActionPerformed

    }//GEN-LAST:event_new_textActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewFormula().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel new_label_oper;
    private javax.swing.JLabel new_label_prop;
    private javax.swing.JButton new_menu;
    private javax.swing.JButton new_op_but_APAGAR;
    private javax.swing.JButton new_op_but_and;
    private javax.swing.JButton new_op_but_closepar;
    private javax.swing.JButton new_op_but_not;
    private javax.swing.JButton new_op_but_openpar;
    private javax.swing.JButton new_op_but_or;
    private javax.swing.JButton new_prop_but_A;
    private javax.swing.JButton new_prop_but_B;
    private javax.swing.JButton new_prop_but_C;
    private javax.swing.JButton new_prop_but_D;
    private javax.swing.JButton new_prop_but_E;
    private javax.swing.JPanel new_propositions;
    private javax.swing.JButton new_result;
    private javax.swing.JTextField new_text;
    // End of variables declaration//GEN-END:variables
}
