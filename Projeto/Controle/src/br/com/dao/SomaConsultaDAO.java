/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.entidade.SomaConsulta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class SomaConsultaDAO extends GenericDAO {
    
    public SomaConsultaDAO() {
    } 
    
     public void addSoma(SomaConsulta ctm) throws SQLException{
        String query = "INSERT INTO SOMA " + "(ID_ENROLADOR, MES_ENROLACAO, QUINZENA, SOMA) "+ "VALUES (?,?,?,?)";
        executeCommand(query, ctm.getId_enrolador(), ctm.getMes_enrolacao(), ctm.getQuinzena(), ctm.getSoma());
     }
    
    public void editSoma(SomaConsulta ctm) throws  SQLException {
        String query = "UPDATE SOMA SET " + "ID_ENROLADOR = ?, MES_ENROLACAO = ?, QUINZENA = ?, SOMA = ? "+ "WHERE ID = ?";
        executeCommand(query, ctm.getId_enrolador(), ctm.getMes_enrolacao(), ctm.getQuinzena(), ctm.getSoma(), ctm.getId());
    }
    
    public void deleteSoma(SomaConsulta ctm) throws SQLException{
        String query = "DELETE FROM SOMA " + "WHERE ID = ?";
        executeCommand(query, ctm.getId());
    }
    
    public List<SomaConsulta> searchSoma(String id_enrolador, String mes_enrolacao, String quinzena) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM SOMA GROUP BY ID_ENROLADOR, MES_ENROLACAO, QUINZENA HAVING ID_ENROLADOR = "+ "'" + id_enrolador + "'" + "AND MES_ENROLACAO = " +"'"+ mes_enrolacao +"'"+ "AND QUINZENA ="+"'"+ quinzena +"'"+"ORDER BY ID_ENROLADOR, MES_ENROLACAO ASC");
        List<SomaConsulta> toReturn = new LinkedList<SomaConsulta>();
        while(rs.next()){
           toReturn.add(populateSomaConsulta(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public SomaConsulta getSomaConsulta(int idSomaConsulta) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM SOMA WHERE ID = ?", idSomaConsulta);
        SomaConsulta ctm = populateSomaConsulta(rs);
        rs.close();
        return ctm;
    }
    
      public List<SomaConsulta> getallSomaConsulta() throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM SOMA ORDER BY ID_ENROLADOR, MES_ENROLACAO ASC");
        List<SomaConsulta> toReturn = new LinkedList<SomaConsulta>();
        while(rs.next()){
           toReturn.add(populateSomaConsulta(rs));
        }
        rs.close();
        return toReturn;
    }
   
    
    public static SomaConsulta populateSomaConsulta(ResultSet rs) throws SQLException {
        SomaConsulta toReturn = new SomaConsulta();
        toReturn.setId(rs.getString("id"));
        toReturn.setId_enrolador(rs.getString("id_enrolador"));
        toReturn.setMes_enrolacao(rs.getString("mes_enrolacao"));        
        toReturn.setQuinzena(rs.getString("quinzena"));
        toReturn.setSoma(rs.getString("soma"));
        return toReturn;
    }
    
}
