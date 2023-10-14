/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.project;

/**
 *
 * @author naifk
 */
import java.sql.Statement;
import java.sql.*;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class sale extends javax.swing.JPanel {

    public static String barcode_c="0";
    public static String cus_id="0";
    public sale() {
        initComponents();
        data_load();
    }

    public void data_load()
    {
        //customer load
        try{
            Statement s=db.mycon().createStatement();
            ResultSet rs=s.executeQuery("Select * from customer");
            Vector v=new Vector();
            while(rs.next())
            {
                v.add(rs.getString("customer_name"));
                DefaultComboBoxModel com=new   DefaultComboBoxModel(v); 
                com_cus.setModel(com);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
            
        }
        //load product
       
        try{
            Statement s=db.mycon().createStatement();
            ResultSet rs=s.executeQuery("Select * from product");
            Vector v=new Vector();
            while(rs.next())
            {
                v.add(rs.getString("product_name"));
                DefaultComboBoxModel com=new   DefaultComboBoxModel(v); 
                com_pro.setModel(com);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
            
        }
        //load last invoice number
        try{
            Statement s=db.mycon().createStatement();
            ResultSet rs=s.executeQuery("Select * from extra where exid=1");
            if(rs.next()){
                inid.setText(rs.getString("val"));
            }
        }
        catch(SQLException e){
            System.out.println(e);
                    
            
        }
        //plus new invoice
        int i=Integer.valueOf(inid.getText());
        i++;
        inid.setText(String.valueOf(i));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inid = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        u_price = new javax.swing.JLabel();
        com_cus = new javax.swing.JComboBox<>();
        com_pro = new javax.swing.JComboBox<>();
        p_qty = new javax.swing.JTextField();
        tot_price = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        br_code = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        paid_amt = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        bill_tot = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        balence = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tot_qty = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("INVOICE NO :");

        inid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inid.setText("01");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inid)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inid))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Product :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Customer :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Qty :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Unit Price :");

        u_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        u_price.setText("00.00 ");

        com_cus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        com_cus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        com_cus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_cusActionPerformed(evt);
            }
        });

        com_pro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        com_pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        com_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_proActionPerformed(evt);
            }
        });

        p_qty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p_qty.setText("0");
        p_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                p_qtyKeyReleased(evt);
            }
        });

        tot_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tot_price.setText("00.00 ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Total Price :");

        br_code.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        br_code.setText("Total Price :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(com_cus, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(com_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(u_price, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tot_price, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(br_code, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(tot_price)
                        .addComponent(br_code))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(u_price)
                        .addComponent(com_cus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(com_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(p_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INID", "Name", "Bar Code", "Qty", "Unit Price", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Paid Ammount :");

        paid_amt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paid_amt.setText("0");
        paid_amt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paid_amtKeyReleased(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bill_tot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bill_tot.setText("00.00");
        bill_tot.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Total Ammount :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Balence&Due :");

        balence.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        balence.setText("00.00");
        balence.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bill_tot, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(balence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bill_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balence, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Total Qty:");

        tot_qty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tot_qty.setText("00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paid_amt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tot_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paid_amt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tot_qty))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Add to Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Remove All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Pay&Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void com_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_proActionPerformed
        // TODO add your handling code here:
        String name=com_pro.getSelectedItem().toString();
        try
        {
            Statement s=db.mycon().createStatement();
            ResultSet rs=s.executeQuery("SELECT bar_code,price FROM product WHERE product_name='"+name+"'");
            if(rs.next()){
                u_price.setText(rs.getString("price"));
                br_code.setText(rs.getString("bar_code"));
            }
            pro_tot_cal();
           
                
        }
        catch(SQLException e)
        {
            System.out.println(e);
              
        }
    }//GEN-LAST:event_com_proActionPerformed

    private void p_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p_qtyKeyReleased
        // TODO add your handling code here:
        pro_tot_cal(); 
    }//GEN-LAST:event_p_qtyKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // ADD TO CART
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
            Vector v=new Vector();
            v.add(inid.getText());//INID ID
            v.add(com_pro.getSelectedItem().toString());//product name
            v.add(br_code.getText());//barcode
            v.add(p_qty.getText()); // p qty
            v.add(u_price.getText());// UNIT PRICE
            v.add(tot_price.getText());//TOT PRICE
            
            dt.addRow(v);
            cart_total();
            tot();
            
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Selected REMOVE
        try{
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
            int rw=jTable1.getSelectedRow();
            dt.removeRow(rw);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
            
        }
        cart_total();
         tot();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // remove all
         DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
         dt.setRowCount(0);
         cart_total();
          tot();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void paid_amtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paid_amtKeyReleased
        tot();
        
    }//GEN-LAST:event_paid_amtKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Pay and print send data to database
        try{
            //`cartid``inid``product_name``bar_code``qty``unit_price``total_price`
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
            int rc=dt.getRowCount();
            for(int i=0;i<rc;i++)
            {
                String inid=dt.getValueAt(i, 0).toString(); //in id
                String P_name=dt.getValueAt(i, 1).toString();//Product Name
                String bar_code=dt.getValueAt(i, 2).toString(); //bar code
                String qty=dt.getValueAt(i, 3).toString();//qty
                String un_price=dt.getValueAt(i, 4).toString(); //unit id
                String tot_price=dt.getValueAt(i, 5).toString();//tot price
                
                Statement s=db.mycon().createStatement();
                //cart db
                s.executeUpdate("INSERT INTO cart (inid, product_name, bar_code, qty, unit_price, total_price) VALUES ('"+inid+"','"+P_name+"','"+bar_code+"','"+qty+"','"+un_price+"','"+tot_price+"')");
               } 
              JOptionPane.showMessageDialog(null,"Data Saved");
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
        try{
            String inv_id=inid.getText();
            String cname=com_cus.getSelectedItem().toString();
            String totqty=tot_qty.getText();
            String tot_bill=bill_tot.getText();
            String bal=balence.getText();
            
            //paid status check
            Double tot=Double.valueOf(bill_tot.getText());
            Double pid=Double.valueOf(paid_amt.getText());
            String status=null;
            if(pid.equals(0.0)){
                status="Unpaid";
                
            }
            else if(tot>pid)
            {
                 status="Partial";
                
            }
             else if(tot<=pid)
            {
                 status="Paid";
                
            }
            
             //sales db
                 //`saleid`, `inid`, `cid`, `customer_name`, `total_qty`, `total_bill`, `status`, `balence`
                 Statement ss=db.mycon().createStatement();
                 ss.executeUpdate("INSERT INTO sales (inid, cid, customer_name, total_qty, total_bill, status, balence) VALUES ('"+inv_id+"','"+cus_id+"','"+cname+"','"+totqty+"','"+tot_bill+"','"+status+"','"+bal+"')");
            
        }
        catch(SQLException e)
        {
              System.out.println(e);
            
        }
        // save invoice id
        try{
            String id=inid.getText();
            Statement s=db.mycon().createStatement();
            s.executeUpdate("UPDATE extra SET val='"+id+"' where exid= 1");
            
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void com_cusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_cusActionPerformed
        // GET CID
        String name=com_cus.getSelectedItem().toString();
        try
        {
            Statement s=db.mycon().createStatement();
            ResultSet rs=s.executeQuery("SELECT cid,customer_name FROM customer WHERE customer_name='"+name+"'");
            if(rs.next()){
                cus_id=(rs.getString("cid"));
                
            }
       
           
                
        }
        catch(SQLException e)
        {
            System.out.println(e);
              
        }
        
    }//GEN-LAST:event_com_cusActionPerformed
    public void pro_tot_cal(){
         //product calculation
            Double qt=Double.valueOf(p_qty.getText());
            Double price=Double.valueOf(u_price.getText());
            //Double tot;
           Double tot=qt*price;
            tot_price.setText(String.valueOf(tot));
        
    }
    public void cart_total()
    {
        int numofrow=jTable1.getRowCount();
        double total=0;
        for(int i=0;i<numofrow;i++){
            double value=Double.valueOf(jTable1.getValueAt(i, 5).toString());
            total+=value;
            
        }
        bill_tot.setText(Double.toString(total));
        //tot_qty
        int numofrows=jTable1.getRowCount();
        double totals=0;
        for(int i=0;i<numofrows;i++){
            double values=Double.valueOf(jTable1.getValueAt(i, 3).toString());
            totals+=values;
        }
        tot_qty.setText(Double.toString(totals));
            
    }
    public void tot()
    {
        // paid ammount
        Double paid=Double.valueOf(paid_amt.getText());
        Double tot=Double.valueOf(bill_tot.getText());
        Double due;
        due=paid-tot;
        balence.setText(String.valueOf(due));
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balence;
    private javax.swing.JLabel bill_tot;
    private javax.swing.JLabel br_code;
    private javax.swing.JComboBox<String> com_cus;
    private javax.swing.JComboBox<String> com_pro;
    private javax.swing.JLabel inid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField p_qty;
    private javax.swing.JTextField paid_amt;
    private javax.swing.JLabel tot_price;
    private javax.swing.JLabel tot_qty;
    private javax.swing.JLabel u_price;
    // End of variables declaration//GEN-END:variables
}
