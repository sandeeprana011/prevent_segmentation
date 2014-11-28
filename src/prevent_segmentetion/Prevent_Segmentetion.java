/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prevent_segmentetion;

import javax.swing.JOptionPane;

/**
 *
 * @author rana
 */
public class Prevent_Segmentetion {

    
    
    login_Screen login;
    /**
     * Execution starts from this class
     * UI Look and Feel can be managed here.
     * Nimbus is theme is being used.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
            
        }
        Prevent_Segmentetion pre=new Prevent_Segmentetion();
            pre.loginStart();
        
    }
    
    /**
     * Instanciate the User Login Screen
     */
    public void loginStart(){
        login = new login_Screen();
        login.setVisible(true);
        login.setSize(366,260);
        login.setResizable(false);
        login.setDefaultCloseOperation(2);
    }

}
