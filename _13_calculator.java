class Calculator extends javax.swing.JFrame {

    public Calculator() {
      initComponents();
      setTitle("Calculator");
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
      jLabel1 = new javax.swing.JLabel();
      mainText = new javax.swing.JLabel();
      firstNumberLabel = new javax.swing.JLabel();
      secondNumberLabel = new javax.swing.JLabel();
      box1 = new javax.swing.JTextField();
      box2 = new javax.swing.JTextField();
      addBtn = new javax.swing.JButton();
      subBtn = new javax.swing.JButton();
      mulBtn = new javax.swing.JButton();
      divBtn = new javax.swing.JButton();
      resultLabel = new javax.swing.JLabel();
      jLabel1.setText("jLabel1");
      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      mainText.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
      mainText.setText("Calculator");
      firstNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      firstNumberLabel.setText("Enter First Number");
      secondNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      secondNumberLabel.setText("Enter Second Number");
      box2.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            box2ActionPerformed(evt);
          }
        }
      );
      addBtn.setText("ADD");
      addBtn.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            addBtnActionPerformed(evt);
          }
        }
      );
      subBtn.setText("SUB");
      subBtn.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            subBtnActionPerformed(evt);
          }
        }
      );
      mulBtn.setText("MULT");
      mulBtn.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            mulBtnActionPerformed(evt);
          }
        }
      );
      divBtn.setText("DIV");
      divBtn.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            divBtnActionPerformed(evt);
          }
        }
      );
      resultLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
      resultLabel.setText("Result");
      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
        getContentPane()
      );
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
        layout
          .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(
            javax.swing.GroupLayout.Alignment.TRAILING,
            layout
              .createSequentialGroup()
              .addGroup(
                layout
                  .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(
                    layout
                      .createSequentialGroup()
                      .addContainerGap()
                      .addComponent(
                        secondNumberLabel,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        187,
                        javax.swing.GroupLayout.PREFERRED_SIZE
                      )
                      .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED
                      )
                      .addComponent(
                        box2,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        138,
                        Short.MAX_VALUE
                      )
                  )
                  .addGroup(
                    layout
                      .createSequentialGroup()
                      .addGap(32, 32, 32)
                      .addComponent(firstNumberLabel)
                      .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                      )
                      .addComponent(box1)
                  )
              )
              .addGap(63, 63, 63)
          )
          .addGroup(
            layout
              .createSequentialGroup()
              .addGroup(
                layout
                  .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(
                    layout
                      .createSequentialGroup()
                      .addGap(96, 96, 96)
                      .addComponent(mainText)
                  )
                  .addGroup(
                    layout
                      .createSequentialGroup()
                      .addContainerGap()
                      .addComponent(addBtn)
                      .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                      )
                      .addComponent(subBtn)
                      .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                      )
                      .addComponent(mulBtn)
                      .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                      )
                      .addComponent(divBtn)
                  )
                  .addGroup(
                    layout
                      .createSequentialGroup()
                      .addGap(116, 116, 116)
                      .addComponent(resultLabel)
                  )
              )
              .addContainerGap(
                javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE
              )
          )
      );
      layout.setVerticalGroup(
        layout
          .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(
            layout
              .createSequentialGroup()
              .addContainerGap()
              .addComponent(mainText)
              .addGap(44, 44, 44)
              .addGroup(
                layout
                  .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(firstNumberLabel)
                  .addComponent(
                    box1,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                  )
              )
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addGroup(
                layout
                  .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(secondNumberLabel)
                  .addComponent(
                    box2,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    25,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                  )
              )
              .addGap(32, 32, 32)
              .addGroup(
                layout
                  .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(addBtn)
                  .addComponent(subBtn)
                  .addComponent(mulBtn)
                  .addComponent(divBtn)
              )
              .addGap(18, 18, 18)
              .addComponent(resultLabel)
              .addContainerGap(28, Short.MAX_VALUE)
          )
      );
      pack();
    }
    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {} //GEN-FIRST:event_box2ActionPerformed
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_addBtnActionPerformed
      int n1 = Integer.parseInt(box1.getText());
      int n2 = Integer.parseInt(box2.getText());
      int sum = n1 + n2;
      String result = Integer.toString(sum);
      resultLabel.setText(result);
    }
    private void subBtnActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_subBtnActionPerformed
      int n1 = Integer.parseInt(box1.getText());
      int n2 = Integer.parseInt(box2.getText());
      int sum = n1 - n2;
      String result = Integer.toString(sum);
      resultLabel.setText(result);
    } 
    private void mulBtnActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_mulBtnActionPerformed
      int n1 = Integer.parseInt(box1.getText());
      int n2 = Integer.parseInt(box2.getText());
      int sum = n1 * n2;
      String result = Integer.toString(sum);
      resultLabel.setText(result);
    } 
    private void divBtnActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_divBtnActionPerformed
      Float n1 = Float.parseFloat(box1.getText());
      Float n2 = Float.parseFloat(box2.getText());
      Float sum = n1 / n2;
      String result = Float.toString(sum);
      resultLabel.setText(result);
    } 
  
    public static void main(String args[]) {
      try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
          if ("Nimbus".equals(info.getName())) {
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
          }
        }
      } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      java.awt.EventQueue.invokeLater(
        new Runnable() {
          public void run() {
            new Calculator().setVisible(true);
          }
        }
      );
    }
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField box1;
    private javax.swing.JTextField box2;
    private javax.swing.JButton divBtn;
    private javax.swing.JLabel firstNumberLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mainText;
    private javax.swing.JButton mulBtn;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel secondNumberLabel;
    private javax.swing.JButton subBtn;
  }