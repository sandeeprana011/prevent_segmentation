/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prevent_segmentetion.admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import prevent_segmentetion.DBHelper;

/**
 * Admin Login screen UI and Backend working.
 * 
 * @author rana
 */
public class admin extends javax.swing.JFrame {

    String removeUsername = null;
    String manageUser = null;

    String fileSep;
    String homeDirectory;
    File file_dir;
    
    /**
     * Default constructor.
     * Creates new form admin
     */
    public admin() {
        initComponents();
        homeDirectory=System.getProperty("user.home");
        fileSep=System.getProperty("file.separator");
        
        DefaultMutableTreeNode sup = new DefaultMutableTreeNode("admin");
        file_dir = new File(homeDirectory+fileSep+"project_segmentation"+fileSep);
        

        autoTree(sup, file_dir);

        jTree_Admin.setModel(new DefaultTreeModel(sup));
        hidelayeredPanes();
        jLayeredPane_Home.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
 
    
    }

    
    /**
     * Autotree function to create a File manager like structure of Files..BAsically it shows the files in a Tree View
     * @param addNode To add a New Node to the current parent node
     * @param file Home Directory of the User account
     */
    
    public void autoTree(DefaultMutableTreeNode addNode, File file) {

        File[] file_arr = file.listFiles();

        for (File f : file_arr) {
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(f.getName());
            addNode.add(node);
            if (f.isDirectory()) {
                autoTree(node, f);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form..
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_AddUser = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_Dial_add_Username = new javax.swing.JTextField();
        jTextField_Dial_add_Password = new javax.swing.JTextField();
        jTextField_Dial_add_LastName = new javax.swing.JTextField();
        jTextField_Dial_add_city = new javax.swing.JTextField();
        jTextField_Dial_add_Address = new javax.swing.JTextField();
        jTextField_Dial_add_country = new javax.swing.JTextField();
        jTextField_Dial_add_Email = new javax.swing.JTextField();
        jTextField_Dial_add_FirstName = new javax.swing.JTextField();
        jTextField_Dial_add_Mobile = new javax.swing.JTextField();
        jTextField_Dial_add_Pincode = new javax.swing.JTextField();
        jButton_Dial_add_Register = new javax.swing.JButton();
        jButton_Dial_add_Cancel = new javax.swing.JButton();
        jDialog_LayPaneRemove_UserDetail = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField_LPRem_Dial_Username = new javax.swing.JTextField();
        jTextField_LPRem_Dial_Password = new javax.swing.JTextField();
        jTextField_LPRem_Dial_FirstName = new javax.swing.JTextField();
        jTextField_LPRem_Dial_LastName = new javax.swing.JTextField();
        jTextField_LPRem_Dial_Mobile = new javax.swing.JTextField();
        jTextField_LPRem_Dial_Email = new javax.swing.JTextField();
        jTextField_LPRem_Dial_Address = new javax.swing.JTextField();
        jTextField_LPRem_Dial_City = new javax.swing.JTextField();
        jTextField_LPRem_Dial_Country = new javax.swing.JTextField();
        jTextField_LPRem_Dial_Pincode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jDialog_FileChooser = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLayeredPane_Home = new javax.swing.JLayeredPane();
        jButton_AddUser = new javax.swing.JButton();
        jButton_ManageUser = new javax.swing.JButton();
        jButton_RemoveUser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree_Admin = new javax.swing.JTree();
        jButton_RefreshTree = new javax.swing.JButton();
        jButton_DownloadData = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLayeredPane_RemoveUser = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree_LayPane_RemoveUser = new javax.swing.JTree();
        jButton_Dial_Remove_User = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("Add User :");

        jLabel2.setText("City :");

        jLabel3.setText("Password :");

        jLabel4.setText("Address :");

        jLabel7.setText("Username :");

        jLabel8.setText("First Name :");

        jLabel5.setText("Country :");

        jLabel6.setText("Email :");

        jLabel9.setText("Last Name :");

        jLabel10.setText("Mobile :");

        jLabel11.setText("Pincode :");

        jTextField_Dial_add_Username.setPreferredSize(new java.awt.Dimension(100, 27));

        jTextField_Dial_add_Password.setPreferredSize(new java.awt.Dimension(100, 27));

        jTextField_Dial_add_LastName.setPreferredSize(new java.awt.Dimension(100, 27));

        jTextField_Dial_add_city.setPreferredSize(new java.awt.Dimension(100, 27));

        jTextField_Dial_add_Address.setPreferredSize(new java.awt.Dimension(100, 27));

        jTextField_Dial_add_country.setPreferredSize(new java.awt.Dimension(100, 27));

        jTextField_Dial_add_Email.setPreferredSize(new java.awt.Dimension(100, 27));

        jTextField_Dial_add_FirstName.setPreferredSize(new java.awt.Dimension(100, 27));

        jTextField_Dial_add_Mobile.setPreferredSize(new java.awt.Dimension(100, 27));
        jTextField_Dial_add_Mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Dial_add_MobileActionPerformed(evt);
            }
        });

        jTextField_Dial_add_Pincode.setPreferredSize(new java.awt.Dimension(100, 27));

        jButton_Dial_add_Register.setText("Register");
        jButton_Dial_add_Register.setPreferredSize(new java.awt.Dimension(100, 27));
        jButton_Dial_add_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Dial_add_RegisterActionPerformed(evt);
            }
        });

        jButton_Dial_add_Cancel.setText("Cancel");
        jButton_Dial_add_Cancel.setPreferredSize(new java.awt.Dimension(100, 27));
        jButton_Dial_add_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Dial_add_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog_AddUserLayout = new javax.swing.GroupLayout(jDialog_AddUser.getContentPane());
        jDialog_AddUser.getContentPane().setLayout(jDialog_AddUserLayout);
        jDialog_AddUserLayout.setHorizontalGroup(
            jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_AddUserLayout.createSequentialGroup()
                .addGroup(jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_AddUserLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1))
                    .addGroup(jDialog_AddUserLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jDialog_AddUserLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Dial_add_Pincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_AddUserLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Dial_add_Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_AddUserLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Dial_add_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDialog_AddUserLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Dial_add_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDialog_AddUserLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Dial_add_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDialog_AddUserLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Dial_add_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDialog_AddUserLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Dial_add_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDialog_AddUserLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Dial_add_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_AddUserLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Dial_add_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_AddUserLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(47, 47, 47)
                                    .addComponent(jTextField_Dial_add_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDialog_AddUserLayout.createSequentialGroup()
                                .addComponent(jButton_Dial_add_Register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Dial_add_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jDialog_AddUserLayout.setVerticalGroup(
            jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_AddUserLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_Dial_add_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Dial_add_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Dial_add_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Dial_add_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Dial_add_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_Dial_add_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_Dial_add_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Dial_add_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_Dial_add_Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField_Dial_add_Pincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jDialog_AddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Dial_add_Register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Dial_add_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jLabel12.setText("Username :");

        jLabel13.setText("Password :");

        jLabel15.setText("First Name :");

        jLabel16.setText("Pincode :");

        jLabel17.setText("Last Name :");

        jLabel18.setText("Mobile :");

        jLabel19.setText("Email :");

        jLabel20.setText("City :");

        jLabel21.setText("Address :");

        jLabel22.setText("Country :");

        jTextField_LPRem_Dial_Username.setEditable(false);
        jTextField_LPRem_Dial_Username.setBackground(new java.awt.Color(255, 255, 204));
        jTextField_LPRem_Dial_Username.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTextField_LPRem_Dial_Username.setForeground(new java.awt.Color(51, 102, 0));
        jTextField_LPRem_Dial_Username.setPreferredSize(new java.awt.Dimension(170, 27));

        jTextField_LPRem_Dial_Password.setEditable(false);
        jTextField_LPRem_Dial_Password.setBackground(new java.awt.Color(255, 255, 204));
        jTextField_LPRem_Dial_Password.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTextField_LPRem_Dial_Password.setForeground(new java.awt.Color(51, 102, 0));
        jTextField_LPRem_Dial_Password.setPreferredSize(new java.awt.Dimension(170, 27));

        jTextField_LPRem_Dial_FirstName.setEditable(false);
        jTextField_LPRem_Dial_FirstName.setBackground(new java.awt.Color(255, 255, 204));
        jTextField_LPRem_Dial_FirstName.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTextField_LPRem_Dial_FirstName.setForeground(new java.awt.Color(51, 102, 0));
        jTextField_LPRem_Dial_FirstName.setPreferredSize(new java.awt.Dimension(170, 27));

        jTextField_LPRem_Dial_LastName.setEditable(false);
        jTextField_LPRem_Dial_LastName.setBackground(new java.awt.Color(255, 255, 204));
        jTextField_LPRem_Dial_LastName.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTextField_LPRem_Dial_LastName.setForeground(new java.awt.Color(51, 102, 0));
        jTextField_LPRem_Dial_LastName.setPreferredSize(new java.awt.Dimension(170, 27));

        jTextField_LPRem_Dial_Mobile.setEditable(false);
        jTextField_LPRem_Dial_Mobile.setBackground(new java.awt.Color(255, 255, 204));
        jTextField_LPRem_Dial_Mobile.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTextField_LPRem_Dial_Mobile.setForeground(new java.awt.Color(51, 102, 0));
        jTextField_LPRem_Dial_Mobile.setPreferredSize(new java.awt.Dimension(170, 27));

        jTextField_LPRem_Dial_Email.setEditable(false);
        jTextField_LPRem_Dial_Email.setBackground(new java.awt.Color(255, 255, 204));
        jTextField_LPRem_Dial_Email.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTextField_LPRem_Dial_Email.setForeground(new java.awt.Color(51, 102, 0));
        jTextField_LPRem_Dial_Email.setPreferredSize(new java.awt.Dimension(170, 27));

        jTextField_LPRem_Dial_Address.setEditable(false);
        jTextField_LPRem_Dial_Address.setBackground(new java.awt.Color(255, 255, 204));
        jTextField_LPRem_Dial_Address.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTextField_LPRem_Dial_Address.setForeground(new java.awt.Color(51, 102, 0));
        jTextField_LPRem_Dial_Address.setPreferredSize(new java.awt.Dimension(170, 27));

        jTextField_LPRem_Dial_City.setEditable(false);
        jTextField_LPRem_Dial_City.setBackground(new java.awt.Color(255, 255, 204));
        jTextField_LPRem_Dial_City.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTextField_LPRem_Dial_City.setForeground(new java.awt.Color(51, 102, 0));
        jTextField_LPRem_Dial_City.setPreferredSize(new java.awt.Dimension(170, 27));

        jTextField_LPRem_Dial_Country.setEditable(false);
        jTextField_LPRem_Dial_Country.setBackground(new java.awt.Color(255, 255, 204));
        jTextField_LPRem_Dial_Country.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTextField_LPRem_Dial_Country.setForeground(new java.awt.Color(51, 102, 0));
        jTextField_LPRem_Dial_Country.setPreferredSize(new java.awt.Dimension(170, 27));

        jTextField_LPRem_Dial_Pincode.setEditable(false);
        jTextField_LPRem_Dial_Pincode.setBackground(new java.awt.Color(255, 255, 204));
        jTextField_LPRem_Dial_Pincode.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTextField_LPRem_Dial_Pincode.setForeground(new java.awt.Color(51, 102, 0));
        jTextField_LPRem_Dial_Pincode.setPreferredSize(new java.awt.Dimension(170, 27));

        jButton1.setText("Ok");
        jButton1.setPreferredSize(new java.awt.Dimension(170, 27));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setText("User Detail :");

        javax.swing.GroupLayout jDialog_LayPaneRemove_UserDetailLayout = new javax.swing.GroupLayout(jDialog_LayPaneRemove_UserDetail.getContentPane());
        jDialog_LayPaneRemove_UserDetail.getContentPane().setLayout(jDialog_LayPaneRemove_UserDetailLayout);
        jDialog_LayPaneRemove_UserDetailLayout.setHorizontalGroup(
            jDialog_LayPaneRemove_UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_LPRem_Dial_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_LPRem_Dial_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_LPRem_Dial_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_LPRem_Dial_Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_LPRem_Dial_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_LPRem_Dial_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_LPRem_Dial_Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(50, 50, 50)
                                .addComponent(jTextField_LPRem_Dial_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_LPRem_Dial_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_LPRem_Dial_Pincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jDialog_LayPaneRemove_UserDetailLayout.setVerticalGroup(
            jDialog_LayPaneRemove_UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel14)
                .addGap(28, 28, 28)
                .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField_LPRem_Dial_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField_LPRem_Dial_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField_LPRem_Dial_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField_LPRem_Dial_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField_LPRem_Dial_Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField_LPRem_Dial_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField_LPRem_Dial_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField_LPRem_Dial_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField_LPRem_Dial_Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog_LayPaneRemove_UserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField_LPRem_Dial_Pincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jDialog_FileChooserLayout = new javax.swing.GroupLayout(jDialog_FileChooser.getContentPane());
        jDialog_FileChooser.getContentPane().setLayout(jDialog_FileChooserLayout);
        jDialog_FileChooserLayout.setHorizontalGroup(
            jDialog_FileChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_FileChooserLayout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialog_FileChooserLayout.setVerticalGroup(
            jDialog_FileChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_FileChooserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(0, 204, 204));

        jButton_AddUser.setBackground(new java.awt.Color(0, 102, 102));
        jButton_AddUser.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jButton_AddUser.setForeground(new java.awt.Color(204, 255, 255));
        jButton_AddUser.setText("Add User");
        jButton_AddUser.setToolTipText("");
        jButton_AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddUserActionPerformed(evt);
            }
        });

        jButton_ManageUser.setBackground(new java.awt.Color(0, 102, 102));
        jButton_ManageUser.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jButton_ManageUser.setForeground(new java.awt.Color(204, 255, 255));
        jButton_ManageUser.setText("Delete Data");
        jButton_ManageUser.setToolTipText("Edit");
        jButton_ManageUser.setPreferredSize(new java.awt.Dimension(184, 55));
        jButton_ManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ManageUserActionPerformed(evt);
            }
        });

        jButton_RemoveUser.setBackground(new java.awt.Color(255, 0, 51));
        jButton_RemoveUser.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 36)); // NOI18N
        jButton_RemoveUser.setForeground(new java.awt.Color(255, 204, 204));
        jButton_RemoveUser.setText("Remove User");
        jButton_RemoveUser.setToolTipText("");
        jButton_RemoveUser.setPreferredSize(new java.awt.Dimension(184, 55));
        jButton_RemoveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemoveUserActionPerformed(evt);
            }
        });

        jTree_Admin.setBackground(new java.awt.Color(204, 255, 255));
        jTree_Admin.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jTree_Admin.setForeground(new java.awt.Color(204, 0, 0));
        jScrollPane1.setViewportView(jTree_Admin);

        jButton_RefreshTree.setText("Refresh Tree");
        jButton_RefreshTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RefreshTreeActionPerformed(evt);
            }
        });

        jButton_DownloadData.setBackground(new java.awt.Color(0, 102, 102));
        jButton_DownloadData.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jButton_DownloadData.setForeground(new java.awt.Color(204, 255, 255));
        jButton_DownloadData.setText("Download File");
        jButton_DownloadData.setToolTipText("Edit");
        jButton_DownloadData.setPreferredSize(new java.awt.Dimension(184, 55));
        jButton_DownloadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DownloadDataActionPerformed(evt);
            }
        });

        jButton4.setText("Log Out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane_HomeLayout = new javax.swing.GroupLayout(jLayeredPane_Home);
        jLayeredPane_Home.setLayout(jLayeredPane_HomeLayout);
        jLayeredPane_HomeLayout.setHorizontalGroup(
            jLayeredPane_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane_HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_ManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_DownloadData, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(816, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane_HomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane_HomeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jLayeredPane_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton_AddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_RemoveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(jLayeredPane_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton_RefreshTree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(544, Short.MAX_VALUE)))
        );
        jLayeredPane_HomeLayout.setVerticalGroup(
            jLayeredPane_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane_HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addGap(99, 99, 99)
                .addComponent(jButton_ManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton_DownloadData, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
            .addGroup(jLayeredPane_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane_HomeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jLayeredPane_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jLayeredPane_HomeLayout.createSequentialGroup()
                            .addComponent(jButton_AddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(290, 290, 290)
                            .addComponent(jButton_RemoveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton_RefreshTree)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane_Home.setLayer(jButton_AddUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane_Home.setLayer(jButton_ManageUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane_Home.setLayer(jButton_RemoveUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane_Home.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane_Home.setLayer(jButton_RefreshTree, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane_Home.setLayer(jButton_DownloadData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane_Home.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTree_LayPane_RemoveUser.setBackground(new java.awt.Color(153, 255, 255));
        jTree_LayPane_RemoveUser.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTree_LayPane_RemoveUser.setForeground(new java.awt.Color(0, 102, 102));
        jScrollPane2.setViewportView(jTree_LayPane_RemoveUser);

        jButton_Dial_Remove_User.setBackground(new java.awt.Color(255, 0, 0));
        jButton_Dial_Remove_User.setFont(new java.awt.Font("DejaVu Sans", 1, 48)); // NOI18N
        jButton_Dial_Remove_User.setForeground(new java.awt.Color(255, 255, 204));
        jButton_Dial_Remove_User.setText("Remove User");
        jButton_Dial_Remove_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Dial_Remove_UserActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("DejaVu Sans", 1, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 204));
        jButton2.setText("Cancel");
        jButton2.setPreferredSize(new java.awt.Dimension(110, 27));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 51));
        jButton3.setFont(new java.awt.Font("DejaVu Sans", 1, 48)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 204));
        jButton3.setText("User Details");
        jButton3.setPreferredSize(new java.awt.Dimension(110, 27));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane_RemoveUserLayout = new javax.swing.GroupLayout(jLayeredPane_RemoveUser);
        jLayeredPane_RemoveUser.setLayout(jLayeredPane_RemoveUserLayout);
        jLayeredPane_RemoveUserLayout.setHorizontalGroup(
            jLayeredPane_RemoveUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane_RemoveUserLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jLayeredPane_RemoveUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Dial_Remove_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jLayeredPane_RemoveUserLayout.setVerticalGroup(
            jLayeredPane_RemoveUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane_RemoveUserLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jLayeredPane_RemoveUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jLayeredPane_RemoveUserLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton_Dial_Remove_User, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        jLayeredPane_RemoveUser.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane_RemoveUser.setLayer(jButton_Dial_Remove_User, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane_RemoveUser.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane_RemoveUser.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(jLayeredPane_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane_RemoveUser))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane_RemoveUser))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * This function is used to make addUser-screen Visible.
     * @param evt 
     */
    
    private void jButton_AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddUserActionPerformed
        // TODO add your handling code here:
        jDialog_AddUser.setVisible(true);
        jDialog_AddUser.setSize(500, 500);
        jDialog_AddUser.setDefaultCloseOperation(2);

    }//GEN-LAST:event_jButton_AddUserActionPerformed

    
    /**
     * 
     * @param evt 
     */
    private void jTextField_Dial_add_MobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Dial_add_MobileActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_Dial_add_MobileActionPerformed

    
    /**
     * Basically this Function is used to Register a new User.It inserts new data into the Database "pre_seg" having user details.
     * @param evt 
     */
    private void jButton_Dial_add_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Dial_add_RegisterActionPerformed
        // TODO add your handling code here:

        String Username = jTextField_Dial_add_Username.getText();
        String Password = jTextField_Dial_add_Password.getText();
        String Address = jTextField_Dial_add_Address.getText();
        String City = jTextField_Dial_add_city.getText();
        String Country = jTextField_Dial_add_country.getText();
        String Email = jTextField_Dial_add_Email.getText();
        String FirstName = jTextField_Dial_add_FirstName.getText();
        String LastName = jTextField_Dial_add_LastName.getText();
        String Mobile = jTextField_Dial_add_Mobile.getText();
        String Pincode = jTextField_Dial_add_Pincode.getText();

        if (!Username.equals("") && !Password.equals("") && !Address.equals("") && !City.equals("") && !Country.equals("") && !Email.equals("") && !FirstName.equals("") && !LastName.equals("") && !Mobile.equals("") && !Pincode.equals("")) {

            try {
                DBHelper help = new DBHelper();
                PreparedStatement preState = help.getCon().prepareStatement("INSERT INTO PROFILE VALUES(?,?,?,?,?,?,?,?,?,?)");
                preState.setString(1, Username);
                preState.setString(2, Password);
                preState.setString(3, Address);
                preState.setString(4, City);
                preState.setString(5, Country);
                preState.setString(6, Email);
                preState.setString(7, FirstName);
                preState.setString(8, LastName);
                preState.setString(9, Mobile);
                preState.setString(10, Pincode);
                preState.execute();

                File file = new File(String.valueOf(file_dir) + Username + "");
                if (file.mkdir()) {
                    File file_DOCX = new File(String.valueOf(file_dir) + Username + "/DOCX");
                    File file_TXT = new File(String.valueOf(file_dir) + Username + "/TXT");
                    File file_XLSX = new File(String.valueOf(file_dir) + Username + "/XLSX");
                    File file_PPTX = new File(String.valueOf(file_dir) + Username + "/PPTX");
                    if (file_DOCX.mkdir() && file_PPTX.mkdir() && file_XLSX.mkdir() && file_TXT.mkdir()) {
                        JOptionPane.showMessageDialog(null, "Subfolders added successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error in creating sub folders.Please create them manually.inside " + String.valueOf(file_dir) + Username +File.separator );
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Autogenerated folders can't be generated Please create them Manually....inside " + "\"/home/rana/project_segmentetion/\"" + " must be named as \"" + Username + "\"");
                }
                JOptionPane.showMessageDialog(null, "User Added Successfully.");

                jDialog_AddUser.dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fields can't be empty");
        }

        DefaultMutableTreeNode sup = new DefaultMutableTreeNode("admin");
        File file_dir = new File(homeDirectory+fileSep+"project_segmentation"+fileSep);

        autoTree(sup, file_dir);

        jTree_Admin.setModel(new DefaultTreeModel(sup));

    }//GEN-LAST:event_jButton_Dial_add_RegisterActionPerformed

    /**
     * This function is used to Refresh the File tree.
     * @param evt 
     */
    
    
    private void jButton_RefreshTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RefreshTreeActionPerformed
        // TODO add your handling code here:

        DefaultMutableTreeNode sup = new DefaultMutableTreeNode("admin");
        File file_dir = new File(homeDirectory+fileSep+"project_segmentation"+fileSep);

        autoTree(sup, file_dir);

        jTree_Admin.setModel(new DefaultTreeModel(sup));


    }//GEN-LAST:event_jButton_RefreshTreeActionPerformed

    /**
     *  Working:
     *  forend:-Removes a user.
     *  Backend:-Removes user data from Database and Deletes all associated files.
     * 
     * @param evt 
     */
    private void jButton_RemoveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemoveUserActionPerformed
        try {
            // TODO add your handling code here:

            DefaultMutableTreeNode admin = new DefaultMutableTreeNode("User's List");
            DBHelper help = new DBHelper();
            ResultSet rst = help.st.executeQuery("select USERNAME from PROFILE");
            while (rst.next()) {
                DefaultMutableTreeNode userNode = new DefaultMutableTreeNode(rst.getString(1));
                admin.add(userNode);
            }
            jTree_LayPane_RemoveUser.setModel(new DefaultTreeModel(admin));

            jTree_LayPane_RemoveUser.addTreeSelectionListener(new TreeSelectionListener() {

                @Override
                public void valueChanged(TreeSelectionEvent e) {
                    String h = e.getPath().toString();
                    h = h.replace("[", " ");
                    h = h.replace("]", " ");
                    h = h.replace("User's List", " ");
                    h = h.replace(",", " ");
                    h = h.replace(" ", "");
                    removeUsername = h;

                }
            });

        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        hidelayeredPanes();
        jLayeredPane_RemoveUser.setVisible(true);


    }//GEN-LAST:event_jButton_RemoveUserActionPerformed
    
    /**
     * Makes JlayeredPanels of "Home and Remove User" Invisible
     */
    public void hidelayeredPanes() {
        jLayeredPane_Home.setVisible(false);
        jLayeredPane_RemoveUser.setVisible(false);
    }
    
    
    
    /**
     * Disposes AddUser Dialogue
     * @param evt 
     */
    private void jButton_Dial_add_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Dial_add_CancelActionPerformed
        // TODO add your handling code here:
        jDialog_AddUser.dispose();
    }//GEN-LAST:event_jButton_Dial_add_CancelActionPerformed

    
    /**
     * Hides Layered Pane and Makes "Home Layered Pane" Visible
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        hidelayeredPanes();
        jLayeredPane_Home.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    /**
     * REmoves Users from Database
     * @param evt 
     */
    private void jButton_Dial_Remove_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Dial_Remove_UserActionPerformed
//         TODO add your handling code here:
        if (removeUsername != null) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you really wants to remove the User " + removeUsername);

            if (choice == 0) {
                try {
                    DBHelper help = new DBHelper();

                    int status = help.st.executeUpdate("DELETE FROM pre_seg.PROFILE WHERE USERNAME = '" + removeUsername + "'");
                    File file = new File(String.valueOf(file_dir) + removeUsername + "");
                    JOptionPane.showMessageDialog(null, file.toString());

                    int choiceDataDelete = JOptionPane.showConfirmDialog(null, "Delete data related to user " + removeUsername + "");
                    if (choiceDataDelete == 0) {
                        delDir(file);
                        file.delete();
                    }
//                    JOptionPane.showMessageDialog(null, file+"--------"+i);
                    jButton_RemoveUserActionPerformed(evt);
                    removeUsername = null;

                } catch (SQLException ex) {
                    Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a Username to Remove user.");
        }

    }//GEN-LAST:event_jButton_Dial_Remove_UserActionPerformed
    /**
     * Method "delDir" is too Destructive Use carefully.
     *
     * @param file is a Path to delete.
     *
     *
     */
    public void delDir(File file) {

        if (file.isDirectory()) {

            File[] fileArr = file.listFiles();
            if (fileArr.length == 0) {
                file.delete();

            }
            for (File subFile : fileArr) {
                if (subFile.isDirectory()) {
                    delDir(subFile);

                }
                if (subFile.isFile()) {
                    subFile.delete();

                }

            }
        } else {
            file.delete();
        }

    }


    
    /**
     * Returns user details
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (removeUsername != null) {
            DBHelper help = new DBHelper();
            try {
                ResultSet rst = help.st.executeQuery("SELECT * FROM PROFILE WHERE USERNAME='" + removeUsername + "'");
                while (rst.next()) {
                    jTextField_LPRem_Dial_Username.setText(rst.getString("USERNAME"));
                    jTextField_LPRem_Dial_Password.setText(rst.getString("PASSWORD"));
                    jTextField_LPRem_Dial_FirstName.setText(rst.getString("FIRST_NAME"));
                    jTextField_LPRem_Dial_LastName.setText(rst.getString("LAST_NAME"));
                    jTextField_LPRem_Dial_Mobile.setText(rst.getString("MOBILE"));
                    jTextField_LPRem_Dial_Email.setText(rst.getString("EMAIL"));
                    jTextField_LPRem_Dial_Country.setText(rst.getString("COUNTRY"));
                    jTextField_LPRem_Dial_Pincode.setText(rst.getString("PINCODE"));
                    jTextField_LPRem_Dial_Address.setText(rst.getString("ADDRESS"));
                    jTextField_LPRem_Dial_City.setText(rst.getString("CITY"));
//                    removeUsername=null;
                }

            } catch (SQLException ex) {
                Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
            }

            jDialog_LayPaneRemove_UserDetail.setVisible(true);
            jDialog_LayPaneRemove_UserDetail.setSize(384, 474);
            jDialog_LayPaneRemove_UserDetail.setResizable(false);
//       removeUsername=null;

        } else {
            JOptionPane.showMessageDialog(null, "Please select user to View Details.");

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    /**
     * Disposes UserDetail Layered Pane Object
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        removeUsername = "";
        removeUsername = null;

        jDialog_LayPaneRemove_UserDetail.dispose();

        jButton_RemoveUserActionPerformed(evt);

    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    /**
     * Manage Users Layered Pane
     * @param evt 
     */
    private void jButton_ManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ManageUserActionPerformed
        // TODO add your handling code here:
        jTree_Admin.addTreeSelectionListener(new TreeSelectionListener() {

            @Override
            public void valueChanged(TreeSelectionEvent e) {
                String h = e.getPath().toString();
                h = h.replace("[", "");
                h = h.replace("]", "");
                h = h.replace("admin", " ");
                h = h.replace(",", "/");
                h = h.replace(" ", "");
                manageUser = h;

            }
        });
        if (manageUser != null && manageUser != "admin") {
            int sta = JOptionPane.showConfirmDialog(null, "Do you want to delete \"" + manageUser + "\".");
            if (sta == 0) {
                File file = new File(String.valueOf(file_dir) + manageUser + "");
                File[] fileArr = file.listFiles();
                JOptionPane.showMessageDialog(null, file.toString());

                char[] cha = file.toString().toCharArray();
                if (cha.length > 32) {
                    delDir(file);
                    file.delete();
                    jButton_RefreshTreeActionPerformed(evt);
//                    JOptionPane.showMessageDialog(null, cha.length);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select user again/");
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a file or folder.");

        }


    }//GEN-LAST:event_jButton_ManageUserActionPerformed

    
    /**
     * Function to Perform Download selected file from the JTree
     * @param evt 
     */
    
    private void jButton_DownloadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DownloadDataActionPerformed
        // TODO add your handling code here:
        jTree_Admin.addTreeSelectionListener(new TreeSelectionListener() {

            @Override
            public void valueChanged(TreeSelectionEvent e) {
                String h = e.getPath().toString();
                h = h.replace("[", "");
                h = h.replace("]", "");
                h = h.replace("admin", "");
                h = h.replace(",", "/");
                h = h.replace("/ ", "/");
                h = h.replace(" ", " ");
                manageUser = h;

            }
        });
        if (manageUser != null && manageUser != "admin") {
//            int sta = JOptionPane.showConfirmDialog(null, "Do you want to delete \""+manageUser+"\".");
//            if (sta == 0) {
            
            
            File file = new File(String.valueOf(file_dir) + manageUser + "");
            if (!file.isDirectory()) {
                int k=JOptionPane.showConfirmDialog(null, "Download selected file?");
                if(k==0){
                BufferedReader in = null;
                BufferedWriter out = null;
                try {
                    FileReader fileRead = null;
                    FileWriter fileWrite = null;
                    in = new BufferedReader(new FileReader(file));
                    
                    int i;
                    File f = jFileChooser1.getSelectedFile();
                    String downFolder=homeDirectory+fileSep+"project_segmentation"+fileSep+"Downloads";
                    File create = new File(downFolder + file.getName());
                    create.createNewFile();
                    out = new BufferedWriter(new FileWriter(downFolder+ file.getName()));
                    
                    while ((i = in.read()) != -1) 
                    {
                        out.write(i);
                    }
                    JOptionPane.showMessageDialog(null, "File Downloaded successfully!"+" in Folder   \""+downFolder+"\" File Name \""+file.getName()+"\"");

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        in.close();
                        out.close();
                    } catch (IOException ex) {
                        Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                }else{
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Directory Download functionality not available Right Now.");
                JOptionPane.showMessageDialog(null, file);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a file or folder.");

        }


    }//GEN-LAST:event_jButton_DownloadDataActionPerformed

    
    /**
     * Disposes current object and instantiate a new Object of loginStart.This will result in a Login/Logout concept.
     * @param evt 
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        prevent_segmentetion.Prevent_Segmentetion pr=new prevent_segmentetion.Prevent_Segmentetion();
        pr.loginStart();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_AddUser;
    private javax.swing.JButton jButton_Dial_Remove_User;
    private javax.swing.JButton jButton_Dial_add_Cancel;
    private javax.swing.JButton jButton_Dial_add_Register;
    private javax.swing.JButton jButton_DownloadData;
    private javax.swing.JButton jButton_ManageUser;
    private javax.swing.JButton jButton_RefreshTree;
    private javax.swing.JButton jButton_RemoveUser;
    private javax.swing.JDialog jDialog_AddUser;
    private javax.swing.JDialog jDialog_FileChooser;
    private javax.swing.JDialog jDialog_LayPaneRemove_UserDetail;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane_Home;
    private javax.swing.JLayeredPane jLayeredPane_RemoveUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_Dial_add_Address;
    private javax.swing.JTextField jTextField_Dial_add_Email;
    private javax.swing.JTextField jTextField_Dial_add_FirstName;
    private javax.swing.JTextField jTextField_Dial_add_LastName;
    private javax.swing.JTextField jTextField_Dial_add_Mobile;
    private javax.swing.JTextField jTextField_Dial_add_Password;
    private javax.swing.JTextField jTextField_Dial_add_Pincode;
    private javax.swing.JTextField jTextField_Dial_add_Username;
    private javax.swing.JTextField jTextField_Dial_add_city;
    private javax.swing.JTextField jTextField_Dial_add_country;
    private javax.swing.JTextField jTextField_LPRem_Dial_Address;
    private javax.swing.JTextField jTextField_LPRem_Dial_City;
    private javax.swing.JTextField jTextField_LPRem_Dial_Country;
    private javax.swing.JTextField jTextField_LPRem_Dial_Email;
    private javax.swing.JTextField jTextField_LPRem_Dial_FirstName;
    private javax.swing.JTextField jTextField_LPRem_Dial_LastName;
    private javax.swing.JTextField jTextField_LPRem_Dial_Mobile;
    private javax.swing.JTextField jTextField_LPRem_Dial_Password;
    private javax.swing.JTextField jTextField_LPRem_Dial_Pincode;
    private javax.swing.JTextField jTextField_LPRem_Dial_Username;
    private javax.swing.JTree jTree_Admin;
    private javax.swing.JTree jTree_LayPane_RemoveUser;
    // End of variables declaration//GEN-END:variables
}
