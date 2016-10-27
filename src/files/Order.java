package files;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.sun.glass.events.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oroni
 */
public class Order extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    int choice;  ///choice for combo box
    int item_to_sell = -1; //increment sales

    public Order() {
        initComponents();
        choice();
        retreve();
        String a = "sellno" + jTextField3.getText();
        new SellTable().createtable(a);
        retreve("sellno" + jTextField3.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cmbsearch = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txttableno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Order"));

        cmbsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Type", "Price", "Weight" }));
        cmbsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsearchActionPerformed(evt);
            }
        });

        jLabel2.setText("Search");

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        jButton4.setText("Retrieve");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(cmbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbsearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button-synchronize_basic_red.png"))); // NOI18N
        jButton3.setText("Change Order");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button-shuffle_blue.png"))); // NOI18N
        jButton1.setText("Place Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Table No");

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Digital-7", 1, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Total");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jButton10.setText("Cancel");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setText("Remove");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(txttableno))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttableno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Sell no.");

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setText("Available Items");

        jLabel4.setText("Orders");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsearchActionPerformed
        choice();
    }//GEN-LAST:event_cmbsearchActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        //For enter key to work to select from table
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String name = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            float price = Float.parseFloat(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            float buy_price = Float.parseFloat(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
            String type = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();

            if (SearchExist(name, price + "", "sellno" + jTextField3.getText())) {

                new SellTable().update("sellno" + jTextField3.getText(), name, price);
                retreve("sellno" + jTextField3.getText());
                jTextField2.setText(total("sellno" + jTextField3.getText()) + "/=");

            } ////before experimenting
            else if (new SellTable().add("sellno" + jTextField3.getText(), name, price, " 2%", buy_price, type)) {
                item_to_sell++;
                retreve("sellno" + jTextField3.getText());
                jTextField2.setText(total("sellno" + jTextField3.getText()) + "/=");
                System.out.println(item_to_sell);

            } else {
                JOptionPane.showMessageDialog(null, "problem");
            }
        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String qua = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();

        if (Integer.parseInt(qua) == 0) {
            JOptionPane.showMessageDialog(null, "Out Of Stock", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else if (Integer.parseInt(qua) <= 5) {
            JOptionPane.showMessageDialog(null, "Stock is Low", "Warning", JOptionPane.INFORMATION_MESSAGE);
            String name = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            float price = Float.parseFloat(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            float buy_price = Float.parseFloat(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
            String type = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();

            if (SearchExist(name, price + "", "sellno" + jTextField3.getText())) {

                int sellquantity = getQua(name, price + "", "sellno" + jTextField3.getText());

                if (sellquantity < Integer.parseInt(qua)) {/// checking if sell quantity gets bigger than product quntity
                    new SellTable().update("sellno" + jTextField3.getText(), name, price);
                    retreve("sellno" + jTextField3.getText());
                    jTextField2.setText(total("sellno" + jTextField3.getText()) + "/=");

                } else {
                    JOptionPane.showMessageDialog(null, "no stock left");

                }
            } ////before experimenting
            else if (new SellTable().add("sellno" + jTextField3.getText(), name, price, " 2%", buy_price, type)) {
                item_to_sell++;
                retreve("sellno" + jTextField3.getText());
                jTextField2.setText(total("sellno" + jTextField3.getText()) + "/=");
                System.out.println(item_to_sell);

            } else {
                JOptionPane.showMessageDialog(null, "shida");
            }
        } else {
            String name = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            float price = Float.parseFloat(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            float buy_price = Float.parseFloat(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
            String type = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();

            if (SearchExist(name, price + "", "sellno" + jTextField3.getText())) {

                int sellquantity = getQua(name, price + "", "sellno" + jTextField3.getText());

                if (sellquantity < Integer.parseInt(qua)) {/// checking if sell quantity gets bigger than product quntity
                    new SellTable().update("sellno" + jTextField3.getText(), name, price);
                    retreve("sellno" + jTextField3.getText());
                    jTextField2.setText(total("sellno" + jTextField3.getText()) + "/=");

                } else {
                    JOptionPane.showMessageDialog(null, "no stock left");

                }
            } ////before experimenting
            else if (new SellTable().add("sellno" + jTextField3.getText(), name, price, " 2%", buy_price, type)) {
                item_to_sell++;
                retreve("sellno" + jTextField3.getText());
                jTextField2.setText(total("sellno" + jTextField3.getText()) + "/=");
                System.out.println(item_to_sell);

            } else {
                JOptionPane.showMessageDialog(null, "problem");
            }
        }    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyPressed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        DefaultTableModel dm = new StockUpdater().search(choice, txtsearch.getText());
        jTable1.setModel(dm);

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String qua = jTable1.getValueAt(0, 2).toString();

                if (Integer.parseInt(qua) == 0) {
                    JOptionPane.showMessageDialog(null, "Out Of Stock", "Warning", JOptionPane.INFORMATION_MESSAGE);
                } else if (Integer.parseInt(qua) <= 5) {
                    JOptionPane.showMessageDialog(null, "Stock is Low", "Warning", JOptionPane.INFORMATION_MESSAGE);
                    String name = jTable1.getValueAt(0, 1).toString();
                    float price = Float.parseFloat(jTable1.getValueAt(0, 3).toString());
                    float buy_price = Float.parseFloat(jTable1.getValueAt(0, 6).toString());
                    String type = jTable1.getValueAt(0, 4).toString();

                    if (SearchExist(name, price + "", "sellno" + jTextField3.getText())) {

                        int sellquantity = getQua(name, price + "", "sellno" + jTextField3.getText());

                        if (sellquantity < Integer.parseInt(qua)) {/// checking if sell quantity gets bigger than product quntity
                            new SellTable().update("sellno" + jTextField3.getText(), name, price);
                            retreve("sellno" + jTextField3.getText());
                            jTextField2.setText(total("sellno" + jTextField3.getText()) + "/=");

                        } else {
                            JOptionPane.showMessageDialog(null, "no stock left");

                        }
                    } ////before experimenting
                    else if (new SellTable().add("sellno" + jTextField3.getText(), name, price, " 2%", buy_price, type)) {
                        item_to_sell++;
                        retreve("sellno" + jTextField3.getText());
                        jTextField2.setText(total("sellno" + jTextField3.getText()) + "/=");
                        System.out.println(item_to_sell);

                    } else {
                        JOptionPane.showMessageDialog(null, "problem");
                    }
                } else {
                    String name = jTable1.getValueAt(0, 1).toString();
                    float price = Float.parseFloat(jTable1.getValueAt(0, 3).toString());
                    float buy_price = Float.parseFloat(jTable1.getValueAt(0, 6).toString());
                    String type = jTable1.getValueAt(0, 4).toString();

                    if (SearchExist(name, price + "", "sellno" + jTextField3.getText())) {

                        int sellquantity = getQua(name, price + "", "sellno" + jTextField3.getText());

                        if (sellquantity < Integer.parseInt(qua)) {/// checking if sell quantity gets bigger than product quntity
                            new SellTable().update("sellno" + jTextField3.getText(), name, price);
                            retreve("sellno" + jTextField3.getText());
                            jTextField2.setText(total("sellno" + jTextField3.getText()) + "/=");

                        } else {
                            JOptionPane.showMessageDialog(null, "no stock left");

                        }
                    } ////before experimenting
                    else if (new SellTable().add("sellno" + jTextField3.getText(), name, price, " 2%", buy_price, type)) {
                        item_to_sell++;
                        retreve("sellno" + jTextField3.getText());
                        jTextField2.setText(total("sellno" + jTextField3.getText()) + "/=");
                        System.out.println(item_to_sell);

                    } else {
                        JOptionPane.showMessageDialog(null, "problem");
                    }

                }
                txtsearch.setText("");
            } catch (Exception e) {

            }

        }

        if (txtsearch.getText().equalsIgnoreCase("")) {
            retreve();
        }
    }//GEN-LAST:event_txtsearchKeyReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(new SellTable().dropTable("sellno"+jTextField3.getText())){
            String a = "sellno"+jTextField3.getText();
            new SellTable().createtable(a);
            retreve(a);
            jTextField2.setText(total("sellno"+jTextField3.getText())+"");
            JOptionPane.showMessageDialog(null, "Sell Canceled");
        }
        else{
            JOptionPane.showMessageDialog(null, "problem cancelling");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        try{
            int index = jTable2.getSelectedRow();
            String id =jTable2.getValueAt(index,0).toString();
            String qua =jTable2.getValueAt(index,3).toString();
            String perprice =jTable2.getValueAt(index,2).toString();
            if(Integer.parseInt(qua)==1){
                if(new SellTable().delete(id,"sellno"+jTextField3.getText())){
                    item_to_sell--;
                    retreve("sellno"+jTextField3.getText());
                    jTextField2.setText(total("sellno"+jTextField3.getText())+"/=");
                }
            }
            else if(Integer.parseInt(qua)!=1){
                if(new SellTable().updateSell("sellno"+jTextField3.getText(),id,perprice)){
                    item_to_sell--;
                    retreve("sellno"+jTextField3.getText());
                    jTextField2.setText(total("sellno"+jTextField3.getText())+"/=");
                }

            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Select first to remove");
        }

        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String place ="INSERT INTO `orderplace`(`orderid`, `tablenumber`, `item`, `quantity`, `status`, `price`)"
        + " VALUES (?,?,?,?,?,?)";
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbsearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txttableno;
    // End of variables declaration//GEN-END:variables
public void choice() {
        choice = cmbsearch.getSelectedIndex();

    }

    public void retreve() {
        DefaultTableModel dm = new StockUpdater().getData();

        jTable1.setModel(dm);

    }

    public void retreve(String a) {
        DefaultTableModel dm = new SellTable().getData(a);

        jTable2.setModel(dm);

    }
//search in the sell table

    public boolean SearchExist(String name, String price, String a) {

        String sql1 = "SELECT * FROM " + a + " WHERE name ='" + name + "'AND perprice='" + price + "'";

        try {

            con = (Connection) Allconnection.Allconnection();

            Statement s = (Statement) con.createStatement();

            //s.setString(1,name);
            ResultSet rs = s.executeQuery(sql1);

            while (rs.next()) {

                return true;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    //get sell quantity
    public int getQua(String name, String price, String a) {

        String sql1 = "SELECT * FROM " + a + " WHERE name ='" + name + "'AND perprice='" + price + "'";

        String st;
        int qua = 0;
        try {

            con = (Connection) Allconnection.Allconnection();

            Statement s = (Statement) con.createStatement();

            //s.setString(1,name);
            rs = s.executeQuery(sql1);

            while (rs.next()) {

                String quantity = rs.getString(3);

                qua = Integer.parseInt(quantity);

                return qua;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return qua;
    }

    public float total(String a) {

        float total = 0;

        String sql = "SELECT price FROM " + a;

        try {
            con = (Connection) Allconnection.Allconnection();

            Statement s = (Statement) con.prepareStatement(sql);

            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {

                String price = rs.getString(1);

                total = total + Float.parseFloat(price);

                //System.out.println(total);
            }

            return total;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return total;

    }

    public void dropprevious() {

        int num = Integer.parseInt(jTextField3.getText());
        String ab = "sellno" + num;

        String sql1 = "SELECT * FROM information_schema.tables WHERE table_schema = 'Pointofsale' AND table_name = '" + ab + "' LIMIT 1";

        try {
            con = (Connection) Allconnection.Allconnection();
            Statement s = (Statement) con.prepareStatement(sql1);

            ResultSet rs = s.executeQuery(sql1);

            if (rs.next()) {
                if (new SellTable().dropTable(ab)) {

                    System.out.println("droped table " + ab);
                } else {
                    JOptionPane.showMessageDialog(null, "problem cancelling");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void updateOrderStatus() {
        String status = "Placed";
        String query = "UPDATE `Pointofsale`.`orderplace` SET status='" + status + "'";
        try {
            ps = con.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);

        }

    }
}
