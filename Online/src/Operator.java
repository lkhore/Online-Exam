
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lovekesh
 */
public class Operator extends javax.swing.JFrame {

    int flag=0,flag1=0;
    int max;
    public Operator() {
        initComponents();
          jTextField6.setVisible(false);
          jButton1.setVisible(false);
           try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=connection.start.MyConnection.myConnection();
            Statement st=con.createStatement();

            DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();

            dtm.setRowCount(0);

            String q;
            q = "select * from `ques1`";
            ResultSet rs=st.executeQuery(q);

            while(rs.next())
            {
                //rs.getString(1);
                String s[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)};
                dtm.addRow(s);
                //jButton1.setVisible(false);

            }
        }catch(Exception e){JOptionPane.showMessageDialog(this, e);
        }

    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "QUES", "1", "2", "3", "4", "ANS", "QUENO."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setMinWidth(500);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(500);
        jTable1.getColumnModel().getColumn(1).setMinWidth(150);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
        jTable1.getColumnModel().getColumn(2).setMinWidth(150);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(150);
        jTable1.getColumnModel().getColumn(3).setMinWidth(150);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(150);
        jTable1.getColumnModel().getColumn(4).setMinWidth(150);
        jTable1.getColumnModel().getColumn(4).setMaxWidth(150);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(40);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 51, 102));
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("SELECT ALL QUE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField1.setForeground(new java.awt.Color(51, 51, 255));
        jTextField1.setBounds(110, 10, 190, 30);
        jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField2.setForeground(new java.awt.Color(51, 51, 255));
        jTextField2.setBounds(110, 50, 190, 30);
        jLayeredPane1.add(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField3.setForeground(new java.awt.Color(51, 51, 255));
        jTextField3.setBounds(110, 90, 190, 30);
        jLayeredPane1.add(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField4.setForeground(new java.awt.Color(51, 51, 255));
        jTextField4.setBounds(110, 130, 190, 30);
        jLayeredPane1.add(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("1");
        jLabel1.setBounds(50, 20, 9, 17);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("2");
        jLabel2.setBounds(50, 60, 9, 17);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("3");
        jLabel3.setBounds(50, 100, 9, 17);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("4");
        jLabel4.setBounds(50, 140, 9, 17);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("UPDATE");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField5.setForeground(new java.awt.Color(51, 51, 255));
        jTextField5.setBounds(150, 20, 110, 30);
        jLayeredPane2.add(jTextField5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("ANS IN NO.");
        jLabel5.setBounds(50, 20, 82, 17);
        jLayeredPane2.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField6.setText("jTextField6");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("ADD NEW QUESTION");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 51, 51));
        jButton4.setText("CLEAR");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 51, 51));
        jButton5.setText("DELETE QUESTION");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_button.gif"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(108, 108, 108))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void fun()
     {
         try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=connection.start.MyConnection.myConnection();
            Statement st=con.createStatement();

            DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();

            dtm.setRowCount(0);

            String q;
            q = "select * from `ques1`";
            ResultSet rs=st.executeQuery(q);

            while(rs.next())
            {
                //rs.getString(1);
                String s[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)};
                dtm.addRow(s);
                //jButton1.setVisible(false);

            }
        }catch(Exception e){JOptionPane.showMessageDialog(this, e);
     }
     }
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
                // TODO add your handling code here:
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=connection.start.MyConnection.myConnection();
            Statement st=con.createStatement();

            DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();

            dtm.setRowCount(0);

            String q;
            q = "select * from `ques1`";
            ResultSet rs=st.executeQuery(q);

            while(rs.next())
            {
                //rs.getString(1);
                String s[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)};
                dtm.addRow(s);
                //jButton1.setVisible(false);

            }
        }catch(Exception e){JOptionPane.showMessageDialog(this, e);}

    }//GEN-LAST:event_jButton1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        String que,ans1,ans2,ans3,ans4,ans,quesno;
          try
        {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=connection.start.MyConnection.myConnection();
            Statement st=con.createStatement();
            int row=jTable1.getSelectedRow();
            
            String Tab_click=(jTable1.getModel().getValueAt(row, 6).toString());

            String sql="select * from `ques1` where quesno='"+Tab_click+"'";
            ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {    
                 que=rs.getString("que");
                 ans1=rs.getString("1");
                 ans2=rs.getString("2");
                 ans3=rs.getString("3");
                 ans4=rs.getString("4");
                 ans=rs.getString("ans");
                 quesno=rs.getString("quesno");
               
                jTextArea1.setText(que);
                jTextField1.setText(ans1);
                jTextField2.setText(ans2);
                jTextField3.setText(ans3);
                jTextField4.setText(ans4);
                jTextField5.setText(ans);
                jTextField6.setText(quesno);
                

            }

        }catch(Exception e){e.printStackTrace();}
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        String que,ans1,ans2,ans3,ans4,ans,quesno;
          try{
        Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=connection.start.MyConnection.myConnection();
            Statement st=con.createStatement();
                  ans1=jTextField1.getText();
                  ans2=jTextField2.getText();
                  ans3=jTextField3.getText();
                  ans4=jTextField4.getText();
                
                  ans=jTextField5.getText();
                  int answer=Integer.parseInt(ans);
                  
                    if(answer>4||answer<1)
                    {
                        System.out.println("ans");
                        ans="";
                        JOptionPane.showMessageDialog(this,"the answere is nat a above of 4");
                    }
                   
                  que=jTextArea1.getText();
                      quesno=jTextField6.getText();               
             
            
            String sql="update `ques1` set `que`='"+que+"',`1`='"+ans1+"',`2`='"+ans2+"',`3`='"+ans3+"',`4`='"+ans4+"',`ans`='"+ans+"' where `quesno`='"+quesno+"'";
            
            st.executeUpdate(sql);
              DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
    
              
         dtm.setRowCount(0);
        
           Class.forName("com.mysql.jdbc.Driver");
       
            String q;
            q = "select * from ques1";
            ResultSet rs=st.executeQuery(q);
          
            while(rs.next())
            {
                //rs.getString(1);
                        String s[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)};
                        dtm.addRow(s);
                        //jButton1.setVisible(false);
                        
                }
        
            
            JOptionPane.showMessageDialog(this,"updated!!!!");
        }catch(Exception e){e.printStackTrace();}
          jTextArea1.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
//        jComboBox1.setSelectedIndex(0);
//        jComboBox2.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
 try
        {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=connection.start.MyConnection.myConnection();
            
            Statement st=con.createStatement();
            
        Scanner sc=new Scanner(System.in);
       // String q="insert into student";
       
       
        
//         unm = jTextField2.getText();
//        char ps[]=jPasswordField1.getPassword();
//         upass=new String(ps);
//         adrs=jTextArea1.getText();
//        uid=jTextField3.getText();
        String que=jTextArea1.getText();
        String ans1=jTextField1.getText();
        String ans2=jTextField2.getText();
        String ans3=jTextField3.getText();
        String ans4=jTextField4.getText();
        String ans=jTextField5.getText();
        
        if("".equals(jTextField1.getText()))
           {
        //   JOptionPane.showMessageDialog(this,"username is require"); 
               flag=1;
               flag1++;
           }
            if("".equals(jTextField2.getText()))
           {
//           JOptionPane.showMessageDialog(this,"userid is re"); 
               flag=2;
               flag1++;
           }
             if("".equals(jTextArea1.getText()))
           {
           //JOptionPane.showMessageDialog(this,"adress is re");
               flag=3;flag1++;
           }
            if("".equals(jTextField3.getText()))
           {
//           JOptionPane.showMessageDialog(this,"userid is re"); 
               flag=4;
               flag1++;
           }
            if("".equals(jTextField4.getText()))
           {
//           JOptionPane.showMessageDialog(this,"userid is re"); 
               flag=5;
               flag1++;
           }
            if("".equals(jTextField5.getText()))
           {
//           JOptionPane.showMessageDialog(this,"userid is re"); 
               flag=6;
               flag1++;
           }
              if(flag1==1||flag1==2||flag1==3||flag1==4||flag1==5||flag1==6)
              {
                    if(flag1==6)
                    {
                     JOptionPane.showMessageDialog(this,"all data is is require"); 
               
                    }
                    else
                    {
                        if(flag==1||flag==2||flag==4||flag==5||flag==6)
                        { 
                            JOptionPane.showMessageDialog(this,"answer & right answere is require"); 
                        }
                        else
                        {
                            
                            
                                
                             //  ResultSet rs=
                             JOptionPane.showMessageDialog(this,"QUESION require");
                            
                         }
                     }
              }
              else
              {
                                 try
                                {
                                     ans=jTextField5.getText();
                                     int answer=Integer.parseInt(ans);
                  
                                       if(answer>4||answer<1)
                                        {
                                            System.out.println("ans");
                                            ans="";
                                            
                                        }
//                                       String t="select count(quesno) from ques1";
//                                       ResultSet rs=st.executeQuery(t);
//                                       if(rs.next())
//                                       {
//                                            max=rs.getInt(1);
//                                           //System.out.println("max===="+max);
//                                            max++;
//                                       }
                                       if(!"".equals(ans))
                                       {
                                           String  q="insert into `ques1`(`que`,`1`,`2`,`3`,`4`,`ans`) values('"+que+"','"+ans1+"','"+ans2+"','"+ans3+"','"+ans4+"','"+ans+"')";
                                           st.executeUpdate(q);
                                           con.close();
                                       }
                                       else
                                       {
                                           JOptionPane.showMessageDialog(this,"the answere is nat a above of 4");
                                       }
//                               new Operator().setVisible(true);
//                               this.dispose();
                                        jTextArea1.setText("");
                                        jTextField1.setText("");
                                        jTextField2.setText("");
                                        jTextField3.setText("");
                                        jTextField4.setText("");
                                        jTextField5.setText("");
                                 
                              
                                }catch(Exception e){e.printStackTrace(); }
//                                   Home hm=new Home();
//                                   hm.setVisible(true);
//                                   this.dispose();
                                        
              }
        flag=flag1=0;
        
           Class.forName("com.mysql.jdbc.Driver");
       
            String q;
             DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
    
              
         dtm.setRowCount(0);
            q = "select * from ques1";
            ResultSet rs=st.executeQuery(q);
          
            while(rs.next())
            {
                //rs.getString(1);
                        String s[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)};
                        dtm.addRow(s);
                        //jButton1.setVisible(false);
                        
                }
        }catch(Exception e){
        fun();e.printStackTrace();
        }
                
       
               
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
         jTextArea1.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        
//        ALTER TABLE ques1 DROP COLUMN quesno;
//        ALTER TABLE ques1 ADD COLUMN quesno INT NOT NULL AUTO_INCREMENT PRIMARY KEY;
                try
        {
             Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=connection.start.MyConnection.myConnection();
            Statement st=con.createStatement();    
           String quesno=jTextField6.getText();
            
            String sql="delete from ques1 where quesno='"+quesno+"'";
            JOptionPane.showMessageDialog(this,"row deleted!!!!!!!");
             String sql1="ALTER TABLE ques1 DROP COLUMN quesno";
             String sql2=" ALTER TABLE ques1 ADD COLUMN quesno INT NOT NULL AUTO_INCREMENT PRIMARY KEY";
            st.executeUpdate(sql);
            st.executeUpdate(sql1);
            st.executeUpdate(sql2);
            
            DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
    
         dtm.setRowCount(0);
       
           
        
            String q;
            q = "select * from `ques1`";
            ResultSet rs=st.executeQuery(q);
          
            while(rs.next())
            {
                //rs.getString(1);
                        String s[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)};
                        dtm.addRow(s);
                        //jButton1.setVisible(false);
                        
                }
      }catch(Exception e){JOptionPane.showMessageDialog(this, e);}
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextArea1.setText("");

    }//GEN-LAST:event_jButton5MouseClicked

private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
Admin a=new Admin();
a.setVisible(true);
this.dispose();

}//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(Operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}