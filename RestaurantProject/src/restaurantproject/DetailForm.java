/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;

import OrderMenu.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import restaurantproject.CreatAccount;
import restaurantproject.OrderMeal;
import restaurantproject.Pay;

/**
 *
 * @author Jalyway
 */
public class DetailForm extends javax.swing.JFrame {
    
    JLabel lb[] = new JLabel[5];
    JLabel pr[] = new JLabel[5];
    JLabel totoal[] = new JLabel[5];
    int Method;
    int waitTime = (int)((Math.random()*1000)%26+5);

    /**
     * Creates new form Meal
     */
    public DetailForm() {
        initComponents();
    }

    public DetailForm(int method) throws FileNotFoundException, IOException {
        initComponents();

        this.Method = method;
        int k = 0;
        lb[0] = F1;
        lb[1] = F2;
        lb[2] = F3;
        lb[3] = F4;
        lb[4] = F5;

        pr[0] = price1;
        pr[1] = price2;
        pr[2] = price3;
        pr[3] = price4;
        pr[4] = price5;

        totoal[0] = st1;
        totoal[1] = st2;
        totoal[2] = st3;
        totoal[3] = st4;
        totoal[4] = st5;
        FileReader fr;

        fr = new FileReader("F:\\program\\Netbeans\\RestaurantProject\\Detail.txt");
        BufferedReader br = new BufferedReader(fr);
        String line, tempstring;
        String[] tempArray = new String[3];
        ArrayList myList = new ArrayList();
        boolean check = false;

        int i = 0;
        while ((line = br.readLine()) != null) {
            //br.readLine()是指讀取txt檔的每一行資料,把讀到的資料存到line
            //再將line丟給tempstring去儲存
            tempstring = line;

            //因為我這個test檔的資料格式是-->一行有3個字串，用兩個空白鍵隔開，
            //tempstring.split("\\s") 會依照空白鍵來切割,剛好切三個,所以這邊我的tempArray的大小才會宣告3
            tempArray = tempstring.split("\\s");

            //這邊就是按照順序,一行一行的儲存到動態陣列裡面
            for (i = 0; i < tempArray.length; i++) {
                myList.add(tempArray[i]);
            }
        }
        for (int j = 0; j < myList.size() - 1; j = j + 3) {
            System.out.println(Integer.valueOf(myList.get(j + 2).toString()));
            if (Integer.valueOf(myList.get(j + 2).toString()) != 0) {
                lb[k].setText(myList.get(j).toString());
                pr[k].setText(myList.get(j + 1).toString() + "X" + myList.get(j + 2).toString());
                totoal[k].setText(String.valueOf(Integer.valueOf(myList.get(j + 2).toString()) * Integer.valueOf(myList.get(j + 1).toString())));
                k++;
            }
        }
        jLabel12.setText(jLabel12.getText() + myList.get(myList.size() - 1));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        F1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        price1 = new javax.swing.JLabel();
        st1 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        price2 = new javax.swing.JLabel();
        st2 = new javax.swing.JLabel();
        F3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        price3 = new javax.swing.JLabel();
        st3 = new javax.swing.JLabel();
        F4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        price4 = new javax.swing.JLabel();
        st4 = new javax.swing.JLabel();
        F5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        price5 = new javax.swing.JLabel();
        st5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        jLabel1.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("餐點明細");
        jPanel1.add(jLabel1);

        jLabel13.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        jLabel13.setText("名稱：             價格($)    小計");
        jPanel1.add(jLabel13);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.GridLayout(6, 2, 10, 0));

        F1.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        jPanel2.add(F1);

        price1.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N

        st1.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(price1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(st1)
                .addGap(33, 33, 33))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price1)
                    .addComponent(st1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jPanel2.add(jPanel10);

        F2.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        jPanel2.add(F2);

        price2.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N

        st2.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(price2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(st2)
                .addGap(32, 32, 32))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price2)
                    .addComponent(st2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.add(jPanel8);

        F3.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        jPanel2.add(F3);

        price3.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N

        st3.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(price3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(st3)
                .addGap(32, 32, 32))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price3)
                    .addComponent(st3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.add(jPanel11);

        F4.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        jPanel2.add(F4);

        price4.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N

        st4.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(price4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(st4)
                .addGap(33, 33, 33))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price4)
                    .addComponent(st4)))
        );

        jPanel2.add(jPanel13);

        F5.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        jPanel2.add(F5);

        price5.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N

        st5.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(price5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(st5)
                .addGap(33, 33, 33))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price5)
                    .addComponent(st5)))
        );

        jPanel2.add(jPanel12);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        jLabel12.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        jLabel12.setText("總計：");
        jPanel3.add(jLabel12);

        jPanel2.add(jPanel3);

        jButton1.setText("確定");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel2.add(jPanel4);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        if(Method == 0){
            JOptionPane.showMessageDialog(null, "預計送達時間："+waitTime+"(min)\n"+"店家地址：320桃園市中壢區中華路一段450號\n"+"店家電話：02-2822-5252", "點餐成功", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "預計取餐時間："+waitTime+"(min)", "點餐成功", JOptionPane.INFORMATION_MESSAGE);
        }
        Home home=new Home();
        home.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DetailForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new DetailForm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F3;
    private javax.swing.JLabel F4;
    private javax.swing.JLabel F5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel price3;
    private javax.swing.JLabel price4;
    private javax.swing.JLabel price5;
    private javax.swing.JLabel st1;
    private javax.swing.JLabel st2;
    private javax.swing.JLabel st3;
    private javax.swing.JLabel st4;
    private javax.swing.JLabel st5;
    // End of variables declaration//GEN-END:variables

}