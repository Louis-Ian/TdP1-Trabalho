package view;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_titulo = new javax.swing.JLabel();
        menu_new_form = new javax.swing.JButton();
        menu_load_form = new javax.swing.JButton();
        menu_about = new javax.swing.JButton();
        menu_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logic Check");
        setBackground(new java.awt.Color(204, 255, 255));
        setResizable(false);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menu_new_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menu_load_form, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(172, 172, 172)
                        .addComponent(menu_about, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(menu_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(menu_logo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(menu_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(menu_new_form, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menu_load_form, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menu_about, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JLabel menu_logo;
    private javax.swing.JButton menu_new_form;
    private javax.swing.JLabel menu_titulo;
    // End of variables declaration//GEN-END:variables
}
