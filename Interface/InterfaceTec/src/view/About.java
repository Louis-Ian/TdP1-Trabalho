package view;

import java.awt.Color;

public class About extends javax.swing.JFrame {

    public About() {
        initComponents();
        setLocationRelativeTo(null);
        Color background = new Color(190, 255, 255);
        this.getContentPane().setBackground(background);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about_menu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        about_text = new javax.swing.JTextPane();
        about_titulo = new javax.swing.JLabel();
        menu_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1366, 768));

        about_menu.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        about_menu.setText("< Menu");
        about_menu.setBorder(null);
        about_menu.setBorderPainted(false);
        about_menu.setContentAreaFilled(false);
        about_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_menuActionPerformed(evt);
            }
        });

        about_text.setEditable(false);
        about_text.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        about_text.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        about_text.setText("Logic Check is a project created by students  from the Federal University of Ceara for the  discipline of Programming Techniques I.");
        jScrollPane2.setViewportView(about_text);

        about_titulo.setBackground(new java.awt.Color(255, 255, 255));
        about_titulo.setFont(new java.awt.Font("Georgia", 2, 100)); // NOI18N
        about_titulo.setText("Logic Check");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(about_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menu_logo)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(254, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(about_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(about_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(about_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_logo))
                .addGap(79, 79, 79)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void about_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_menuActionPerformed
        new Principal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_about_menuActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_menu;
    private javax.swing.JTextPane about_text;
    private javax.swing.JLabel about_titulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel menu_logo;
    // End of variables declaration//GEN-END:variables
}
