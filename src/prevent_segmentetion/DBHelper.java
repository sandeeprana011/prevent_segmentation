/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prevent_segmentetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A bean class to hand with Database
 * 
 * 
 * @author rana
 */
public class DBHelper {

    
    //jdbc:mysql://localhost:3306/pre_seg
    //com.mysql.jdbc.Driver
    private Connection con;
    public Statement st;
    
    
    /**
     * Default Constructor to initialize DBHelper Class
     */
    public DBHelper() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pre_seg","root","");
            st=con.createStatement();
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * @return the instance of Connection
     */
    public Connection getCon() {
        return con;
    }

    /**
     * Returns an Instance of Statement
     * @return the st
     */
    public Statement getSt() {
        return st;
    }
    
    
    
}
