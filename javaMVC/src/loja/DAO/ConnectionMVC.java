/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuário
 */
public class ConnectionMVC {
    
public Connection getConnection  (){
        
        Connection connection = null;
    
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
         
        } catch (ClassNotFoundException e ) {
            
            e.printStackTrace();
            
            
        }
        
        try {
                       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc2?useSSL=false","root", "123456");
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return connection;
        
    }
    
    
    
}
