package view;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class Result extends javax.swing.JFrame {

    public Result() {
        initComponents();
        ajustComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        load_menu = new javax.swing.JButton();
        result_save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Results");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        load_menu.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        load_menu.setText("< Back");
        load_menu.setBorder(null);
        load_menu.setBorderPainted(false);
        load_menu.setContentAreaFilled(false);
        load_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_menuActionPerformed(evt);
            }
        });

        result_save.setBackground(new java.awt.Color(255, 255, 255));
        result_save.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        result_save.setText("Save >");
        result_save.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        result_save.setContentAreaFilled(false);
        result_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(load_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(509, 509, 509)
                .addComponent(result_save, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(result_save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(load_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(415, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajustComponents() {
        
        //iniciando a tela para tabela dinâmica
        ScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        
        Table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Table.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        
        //valores da tabela
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"V", "V", "V", "?", "?", "?", "?"},
                {"V", "V", "F", "?", "?", "?", "?"},
                {"V", "F", "V", "?", "?", "?", "?"},
                {"V", "F", "F", "?", "?", "?", "?"},
                {"F", "V", "V", "?", "?", "?", "?"},
                {"F", "V", "F", "?", "?", "?", "?"},
                {"F", "F", "V", "?", "?", "?", "?"},
                {"F", "F", "F", "?", "?", "?", "?"}
            },
            new String [] {
                "TESTE", "B", "C", "P1", "P2", "P3", "P4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        Table.setEnabled(false);
        Table.setGridColor(new java.awt.Color(0, 0, 0));
        ScrollPane1.setViewportView(Table);
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(load_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(509, 509, 509)
                        .addComponent(result_save, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(result_save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(load_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        
        
        
        
        
        
        Table.setRowHeight(40);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < Table.getModel().getColumnCount(); i++) {
            Table.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
            Table.getColumnModel().getColumn(i).setHeaderRenderer(centerRenderer);
            Table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
        
        
    }

    private void load_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_menuActionPerformed
        new NewFormula().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_load_menuActionPerformed

    private void result_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result_saveActionPerformed
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i = file.showSaveDialog(null);

        // i = 1 se o usuario clicou em cancelar
        if (i == 1) {
        } else {
            File arquivo = file.getSelectedFile();
            File diretorio = file.getCurrentDirectory();

            // diretorio.getPath()  RETORNA O DIRETORIO QUE O USUARIO ESCOLHEU PARA SALVAR
            JOptionPane.showMessageDialog(null, diretorio.getPath());

            //file.getName(arquivo)  RETORNA O NOME QUE O USUARIO DIGITOU PARA O ARQUIVO
            JOptionPane.showMessageDialog(null, file.getName(arquivo));

        }
    }//GEN-LAST:event_result_saveActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }
    
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane ScrollPane1;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton load_menu;
    private javax.swing.JButton result_save;
    // End of variables declaration//GEN-END:variables
}
