package br.com.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Israel
 */
public abstract class GenericDAO {
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/controle", "root", "jesus");
            return con;
            
        } catch (Exception ex) {
            Logger.getLogger(GenericDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }       
    }
    
    public Statement getStatement() throws SQLException{
        return getConnection().createStatement();
    }
    
    public PreparedStatement getStatement(String st) 
            throws SQLException {
        return getConnection().prepareStatement(st);
    }
    
    public ResultSet executeQuery(String query,Object... params) throws SQLException {
        PreparedStatement ps = getStatement(query);
        for (int i = 0; i < params.length; i++) {
            ps.setObject(i+1, params[i]);
        }
        return ps.executeQuery();
    }
    
    public Object executeCommand (String query, Object... params) throws SQLException{
        PreparedStatement ps = getStatement(query);
        for(int i = 0; i < params.length; i++){
            ps.setObject(i + 1, params[i]);
        }
        return ps.executeUpdate();
    }
    
    public Integer getNextId(String tableName) throws SQLException {
        ResultSet rs = executeQuery("select MAX(ID) from "+tableName);
        rs.next();
        Object result = rs.getObject(1);
        if (result == null) {
            rs.close();
            return 1;
        } else {
            return ((Integer)result)+1;
        }
    }
    
}
