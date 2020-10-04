package view;

import java.io.File;
import javax.swing.JFileChooser;

public class LoadTable extends javax.swing.JFrame {

    public LoadTable() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        load_menu = new javax.swing.JButton();
        Load_text_table = new javax.swing.JTextField();
        load_search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Load Table");
        setBackground(new java.awt.Color(204, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        load_menu.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        load_menu.setText("< Menu");
        load_menu.setBorder(null);
        load_menu.setBorderPainted(false);
        load_menu.setContentAreaFilled(false);
        load_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_menuActionPerformed(evt);
            }
        });

        Load_text_table.setEditable(false);
        Load_text_table.setBackground(new java.awt.Color(255, 255, 255));
        Load_text_table.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        Load_text_table.setText(" Add TXT File");
        Load_text_table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Load_text_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_text_tableActionPerformed(evt);
            }
        });

        load_search.setBackground(new java.awt.Color(255, 255, 255));
        load_search.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        load_search.setText("Search >");
        load_search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        load_search.setContentAreaFilled(false);
        load_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Load_text_table, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(load_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(521, 521, 521)
                            .addComponent(load_search, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(load_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Load_text_table, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(load_search, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void load_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_menuActionPerformed
        new Principal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_load_menuActionPerformed

    private void load_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_searchActionPerformed
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i = file.showSaveDialog(null);
        if (i == 1) {
            Load_text_table.setText("");
        } else {
            File arquivo = file.getSelectedFile();

            //arquivo.getPath() o caminho para o arquivo escolhido
            Load_text_table.setText(arquivo.getPath());
        }
    }//GEN-LAST:event_load_searchActionPerformed

    private void Load_text_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_text_tableActionPerformed
    }//GEN-LAST:event_Load_text_tableActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Load_text_table;
    private javax.swing.JButton load_menu;
    private javax.swing.JButton load_search;
    // End of variables declaration//GEN-END:variables
}
