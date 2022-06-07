/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.manutencaodesktop;

import com.utfpr.manutencaodesktop.machines.MachinesForm;
import com.utfpr.manutencaodesktop.machines.MachinesView;
import com.utfpr.manutencaodesktop.mantainer.MantainerForm;
import com.utfpr.manutencaodesktop.mantainer.MantainersView;
import com.utfpr.manutencaodesktop.orders.Order;
import com.utfpr.manutencaodesktop.orders.OrderDAO;
import com.utfpr.manutencaodesktop.orders.OrderForm;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author leona
 */
public class Dashboard extends javax.swing.JFrame {

    public ArrayList<Order> orders;
    public boolean isFinishedFilter;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        isFinishedFilter = false;
        initComponents();
        this.filterButton.setSelected(this.allFilterButton.getModel(), true);
        getOrders();
        createList();
    }
    
    public void update() {
        getOrders();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filterButton = new javax.swing.ButtonGroup();
        newOrderQuickButton = new javax.swing.JButton();
        orderList = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        allFilterButton = new javax.swing.JRadioButton();
        openFilterButton = new javax.swing.JRadioButton();
        closedFilterButton = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        menuBar = new javax.swing.JMenuBar();
        mantainersButton = new javax.swing.JMenu();
        newMantainerButton = new javax.swing.JMenuItem();
        openMantainerButton = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard de manutenção");

        newOrderQuickButton.setText("Nova Ordem");
        newOrderQuickButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderQuickButtonActionPerformed(evt);
            }
        });

        orderList.setViewportView(jList1);

        filterButton.add(allFilterButton);
        allFilterButton.setText("Todas");
        allFilterButton.setActionCommand("");
        allFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allFilterButtonActionPerformed(evt);
            }
        });

        filterButton.add(openFilterButton);
        openFilterButton.setText("Abertas");
        openFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFilterButtonActionPerformed(evt);
            }
        });

        filterButton.add(closedFilterButton);
        closedFilterButton.setText("Finalizadas");
        closedFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closedFilterButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.setMaximumSize(new java.awt.Dimension(70, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(66, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtrar:");

        filterButton.add(jRadioButton1);
        jRadioButton1.setText("Atrasadas");
        jRadioButton1.setToolTipText("");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        mantainersButton.setText("Manutentores");

        newMantainerButton.setText("Novo");
        newMantainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMantainerButtonActionPerformed(evt);
            }
        });
        mantainersButton.add(newMantainerButton);

        openMantainerButton.setText("Abrir Existente");
        openMantainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMantainerButtonActionPerformed(evt);
            }
        });
        mantainersButton.add(openMantainerButton);

        menuBar.add(mantainersButton);

        jMenu1.setText("Máquinas");

        jMenuItem1.setText("Adicionar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir existentes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newOrderQuickButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(allFilterButton)
                                    .addComponent(openFilterButton))
                                .addGap(0, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(closedFilterButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orderList, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newOrderQuickButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderList, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(allFilterButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(openFilterButton)
                        .addGap(5, 5, 5)
                        .addComponent(closedFilterButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newOrderQuickButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderQuickButtonActionPerformed
        // TODO add your handling code here:
        OrderForm telaOrderForm = new OrderForm();
        telaOrderForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newOrderQuickButtonActionPerformed

    private void openMantainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMantainerButtonActionPerformed
        // TODO add your handling code here:
        MantainersView telaMantainersView = new MantainersView();
        telaMantainersView.setVisible(true);
    }//GEN-LAST:event_openMantainerButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        MachinesForm machinesForm = new MachinesForm();
        machinesForm.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        MachinesView machinesView = new MachinesView();
        machinesView.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        getOrders();
        createList();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void openFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFilterButtonActionPerformed
        // TODO add your handling code here:
        this.isFinishedFilter = false;
        getOrdersFiltered();
        createList();
    }//GEN-LAST:event_openFilterButtonActionPerformed

    private void closedFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closedFilterButtonActionPerformed
        // TODO add your handling code here:
        this.isFinishedFilter = true;
        getOrdersFiltered();
        createList();
    }//GEN-LAST:event_closedFilterButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        OrderForm telaOrderForm = new OrderForm(this.jList1.getSelectedValue());
        telaOrderForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void newMantainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMantainerButtonActionPerformed
        // TODO add your handling code here:
        MantainerForm telaMantainer = new MantainerForm();
        telaMantainer.setVisible(true);
    }//GEN-LAST:event_newMantainerButtonActionPerformed

    private void allFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allFilterButtonActionPerformed
        getOrders();
        createList();
    }//GEN-LAST:event_allFilterButtonActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        getOrdersByDate();
        createList();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
    
    private void getOrdersFiltered() {
        OrderDAO orderDAO = new OrderDAO();
        orders = orderDAO.localizarFiltro(this.isFinishedFilter);
    }
    
    public void getOrders() {
        OrderDAO orderDAO = new OrderDAO();
        orders = orderDAO.localizarTodas();
    }
    
    public void getOrdersByDate() {
        OrderDAO orderDAO = new OrderDAO();
        orders = orderDAO.localizarAtrasadas();
    }

    public void createList() {
        DefaultListModel listModel = new DefaultListModel();
        this.orders.forEach(order -> {
            listModel.addElement(order);
        });
        this.jList1.setModel(listModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton allFilterButton;
    private javax.swing.JRadioButton closedFilterButton;
    private javax.swing.ButtonGroup filterButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<Order> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JMenu mantainersButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newMantainerButton;
    private javax.swing.JButton newOrderQuickButton;
    private javax.swing.JRadioButton openFilterButton;
    private javax.swing.JMenuItem openMantainerButton;
    private javax.swing.JScrollPane orderList;
    // End of variables declaration//GEN-END:variables
}