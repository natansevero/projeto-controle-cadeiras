/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.entidade.Enroladores;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class EnroladoresDAO extends GenericDAO {
    
    public EnroladoresDAO() {
    }  
    
    public void deleteEnroladores(Enroladores ctm) throws SQLException{
        String query = "DELETE FROM ENROLADOR " + "WHERE ID_ENROLADOR = ?";
        executeCommand(query, ctm.getId_enrolador());
    }
    
    public void editEnroladores(Enroladores ctm) throws SQLException{
        String query = "UPDATE ENROLADOR SET " + "NOME_ENROLADOR = ?"+ "WHERE ID_ENROLADOR = ?";
        executeCommand(query, ctm.getNome_enrolador(), ctm.getId_enrolador());
    }
    
    public void addEnroladores(Enroladores ctm) throws SQLException{
        String query = "INSERT INTO ENROLADOR " + "(NOME_ENROLADOR) "+ "VALUES (?)";
        executeCommand(query, ctm.getNome_enrolador());
    }
    
    public Enroladores getEnroladores(int idEnroladores) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM ENROLADOR WHERE ID_ENROLADOR = ?", idEnroladores);
        Enroladores ctm = populateEnroladores(rs);
        rs.close();
        return ctm;
    }
    
    public List<Enroladores> getallEnroladores() throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM ENROLADOR");
        List<Enroladores> toReturn = new LinkedList<Enroladores>();
        while(rs.next()){
           toReturn.add(populateEnroladores(rs));
        }
        rs.close();
        return toReturn;
    }

    public static Enroladores populateEnroladores(ResultSet rs) throws SQLException {
        Enroladores toReturn = new Enroladores();
        toReturn.setId_enrolador(rs.getString("id_enrolador"));
        toReturn.setNome_enrolador(rs.getString("nome_enrolador"));
        return toReturn;
        
    }
}
 