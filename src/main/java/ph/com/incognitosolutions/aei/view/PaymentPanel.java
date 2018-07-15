/*
 * INCOGNITO CONFIDENTIAL 
 * 
 * [2018] Incognito Solutions 
 * All Rights Reserved.
 * 
 * NOTICE:  All information contained herein is, and remains
 * the property of Incognito Solutions and its client.
 * The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated
 * and its client and may be covered by U.S. and Foreign Patents
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Incognito Solutions.
 */
package ph.com.incognitosolutions.aei.view;

/**
 *
 * @author loretizoj
 */
public class PaymentPanel extends javax.swing.JPanel {

    /**
     * Creates new form PaymentPanel
     */
    public PaymentPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPayment = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        tfBankName = new javax.swing.JTextField();
        lblBank = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        rbCheque = new javax.swing.JRadioButton();
        rbCash = new javax.swing.JRadioButton();
        lblChequeNo = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lblDueDate = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblAmount = new javax.swing.JLabel();
        tfChequeNo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lblClientName = new javax.swing.JLabel();
        tfClientName = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblStatus = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        tfAmount = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPayment.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        headerPayment.setForeground(new java.awt.Color(102, 102, 102));
        headerPayment.setText("Payment Information");
        add(headerPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        lblType.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblType.setForeground(new java.awt.Color(102, 102, 102));
        lblType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblType.setText("Pay Type:");
        lblType.setPreferredSize(new java.awt.Dimension(43, 25));
        add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, -1));

        tfBankName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tfBankName.setForeground(new java.awt.Color(255, 153, 51));
        tfBankName.setBorder(null);
        add(tfBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 500, -1));

        lblBank.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblBank.setForeground(new java.awt.Color(102, 102, 102));
        lblBank.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBank.setText("Bank Name:");
        lblBank.setPreferredSize(new java.awt.Dimension(43, 25));
        add(lblBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, -1));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 500, -1));

        rbCheque.setBackground(new java.awt.Color(255, 255, 255));
        rbCheque.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        rbCheque.setForeground(new java.awt.Color(255, 153, 51));
        rbCheque.setSelected(true);
        rbCheque.setText("Cheque");
        rbCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChequeActionPerformed(evt);
            }
        });
        add(rbCheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, 30));

        rbCash.setBackground(new java.awt.Color(255, 255, 255));
        rbCash.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        rbCash.setForeground(new java.awt.Color(255, 153, 51));
        rbCash.setText("Cash");
        rbCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCashActionPerformed(evt);
            }
        });
        add(rbCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, 30));

        lblChequeNo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblChequeNo.setForeground(new java.awt.Color(102, 102, 102));
        lblChequeNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblChequeNo.setText("Cheque No:");
        lblChequeNo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblChequeNo.setPreferredSize(new java.awt.Dimension(43, 25));
        add(lblChequeNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 90, -1));

        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 220, -1));

        lblDueDate.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblDueDate.setForeground(new java.awt.Color(102, 102, 102));
        lblDueDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDueDate.setText("Due Date:");
        lblDueDate.setPreferredSize(new java.awt.Dimension(43, 25));
        add(lblDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 90, -1));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 220, -1));

        lblAmount.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(102, 102, 102));
        lblAmount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAmount.setText("Amount:");
        lblAmount.setPreferredSize(new java.awt.Dimension(43, 25));
        add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, -1));

        tfChequeNo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tfChequeNo.setForeground(new java.awt.Color(255, 153, 51));
        tfChequeNo.setBorder(null);
        add(tfChequeNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 220, -1));

        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 220, -1));

        lblClientName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblClientName.setForeground(new java.awt.Color(102, 102, 102));
        lblClientName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblClientName.setText("Client Name:");
        lblClientName.setPreferredSize(new java.awt.Dimension(43, 25));
        add(lblClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 90, -1));

        tfClientName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tfClientName.setForeground(new java.awt.Color(255, 153, 51));
        tfClientName.setBorder(null);
        add(tfClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 220, -1));

        jSeparator8.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 220, -1));

        lblStatus.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(102, 102, 102));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStatus.setText("Status:");
        lblStatus.setPreferredSize(new java.awt.Dimension(43, 25));
        add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 90, -1));

        jSeparator9.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 220, -1));

        tfAmount.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tfAmount.setForeground(new java.awt.Color(255, 153, 51));
        tfAmount.setBorder(null);
        add(tfAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 220, -1));

        btnBrowse.setBackground(new java.awt.Color(255, 255, 255));
        btnBrowse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/com/incognitosolutions/gui/icons/userSearch.png"))); // NOI18N
        add(btnBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 30, 20));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 236, 220, -1));

        btnCancel.setBackground(java.awt.Color.red);
        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/com/incognitosolutions/gui/icons/cancel.png"))); // NOI18N
        btnCancel.setText(" Cancel");
        btnCancel.setMinimumSize(new java.awt.Dimension(95, 30));
        btnCancel.setPreferredSize(new java.awt.Dimension(95, 30));
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 110, 30));

        btnSave.setBackground(new java.awt.Color(0, 204, 0));
        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/com/incognitosolutions/gui/icons/save.png"))); // NOI18N
        btnSave.setText(" Save");
        btnSave.setPreferredSize(new java.awt.Dimension(95, 30));
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void rbChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChequeActionPerformed
        if(rbCheque.isSelected()){
        }
    }//GEN-LAST:event_rbChequeActionPerformed

    private void rbCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCashActionPerformed
        if(rbCash.isSelected()){
            
        }
    }//GEN-LAST:event_rbCashActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel headerPayment;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblBank;
    private javax.swing.JLabel lblChequeNo;
    private javax.swing.JLabel lblClientName;
    private javax.swing.JLabel lblDueDate;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblType;
    private javax.swing.JRadioButton rbCash;
    private javax.swing.JRadioButton rbCheque;
    private javax.swing.JTextField tfAmount;
    private javax.swing.JTextField tfBankName;
    private javax.swing.JTextField tfChequeNo;
    private javax.swing.JTextField tfClientName;
    // End of variables declaration//GEN-END:variables
}