package view;

import java.awt.Color;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        Color background = new Color(190, 255, 255);
        this.getContentPane().setBackground(background);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_titulo = new javax.swing.JLabel();
        menu_new_form = new javax.swing.JButton();
        menu_load_form = new javax.swing.JButton();
        menu_about = new javax.swing.JButton();
        menu_logo = new javax.swing.JLabel();
        menu_load_table = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setSize(new java.awt.Dimension(1366, 768));

        menu_titulo.setBackground(new java.awt.Color(255, 255, 255));
        menu_titulo.setFont(new java.awt.Font("Georgia", 2, 100)); // NOI18N
        menu_titulo.setText("Logic Check");

        menu_new_form.setBackground(new java.awt.Color(190, 255, 255));
        menu_new_form.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        menu_new_form.setText("New Formula");
        menu_new_form.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        menu_new_form.setContentAreaFilled(false);
        menu_new_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_new_formActionPerformed(evt);
            }
        });

        menu_load_form.setBackground(new java.awt.Color(255, 255, 255));
        menu_load_form.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        menu_load_form.setText("Load Formula");
        menu_load_form.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        menu_load_form.setContentAreaFilled(false);
        menu_load_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_load_formActionPerformed(evt);
            }
        });

        menu_about.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        menu_about.setForeground(new java.awt.Color(51, 102, 255));
        menu_about.setText("About");
        menu_about.setBorder(null);
        menu_about.setBorderPainted(false);
        menu_about.setContentAreaFilled(false);
        menu_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_aboutActionPerformed(evt);
            }
        });

        menu_logo.setBackground(new java.awt.Color(190, 255, 255));

        menu_load_table.setBackground(new java.awt.Color(255, 255, 255));
        menu_load_table.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        menu_load_table.setText("Load Table");
        menu_load_table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        menu_load_table.setContentAreaFilled(false);
        menu_load_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_load_tableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(menu_about, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(menu_logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menu_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_load_table, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(menu_new_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menu_load_form, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menu_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_logo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(menu_new_form, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu_load_form, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu_load_table, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(menu_about, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_aboutActionPerformed
        new About().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu_aboutActionPerformed

    private void menu_load_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_load_formActionPerformed
        new LoadFormula().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu_load_formActionPerformed

    private void menu_new_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_new_formActionPerformed
        new NewFormula().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu_new_formActionPerformed

    private void menu_load_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_load_tableActionPerformed
        new LoadTable().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu_load_tableActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton menu_about;
    private javax.swing.JButton menu_load_form;
    private javax.swing.JButton menu_load_table;
    private javax.swing.JLabel menu_logo;
    private javax.swing.JButton menu_new_form;
    private javax.swing.JLabel menu_titulo;
    // End of variables declaration//GEN-END:variables
}
