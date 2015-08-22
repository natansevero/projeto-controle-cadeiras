/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.entidade.Cadeiras;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Aluno
 */
public class CadeirasDAO extends GenericDAO {
    
    public CadeirasDAO() {
    }
    
    public List<Cadeiras> searchCadeiras(String id_enrolador, String mes_enrolacao, String quinzena) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM CADEIRAS WHERE ID_ENROLADOR ="+ "'" + id_enrolador + "'" + "AND MES_ENROLACAO =" +"'"+ mes_enrolacao +"'"+ "AND QUINZENA ="+"'"+ quinzena +"'"+"ORDER BY MES_ENROLACAO, DATA_ENROLACAO ASC");
        List<Cadeiras> toReturn = new LinkedList<Cadeiras>();
        while(rs.next()){
           toReturn.add(populateCadeiras(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public void editCadeiras(Cadeiras ctm) throws  SQLException {
        String query = "UPDATE CADEIRAS SET " + "ID_ENROLADOR = ?, MES_ENROLACAO = ?, DATA_ENROLACAO = ?, QUINZENA = ?, GRANDE = ?, PEQUENA = ?, PARADINHA = ?"+ "WHERE ID = ?";
        executeCommand(query, ctm.getId_enrolador(), ctm.getMes_enrolacao(), ctm.getData_enrolacao(), ctm.getQuinzena(), ctm.getGrande(), ctm.getPequena(), ctm.getParadinha(), ctm.getId());
    }
    
    public void deleteCadeiras(Cadeiras ctm) throws SQLException {
        String query = "DELETE FROM CADEIRAS " + "WHERE ID = ?";
        executeCommand(query, ctm.getId());
    }
    
    public void addCadeiras(Cadeiras ctm) throws SQLException{
        String query = "INSERT INTO CADEIRAS " + "(ID_ENROLADOR, MES_ENROLACAO, DATA_ENROLACAO, QUINZENA, GRANDE, PEQUENA, PARADINHA) "+ "VALUES (?,?,?,?,?,?,?)";
        executeCommand(query, ctm.getId_enrolador(), ctm.getMes_enrolacao(), ctm.getData_enrolacao(), ctm.getQuinzena(), ctm.getGrande(), ctm.getPequena(), ctm.getParadinha());
    }
    
    public Cadeiras getCadeiras(int idCadeiras) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM CADEIRAS WHERE ID = ?", idCadeiras);
        Cadeiras ctm = populateCadeiras(rs);
        rs.close();
        return ctm;
    }
    
    
    public List<Cadeiras> getallCadeiras() throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM CADEIRAS ORDER BY MES_ENROLACAO, DATA_ENROLACAO ASC");
        List<Cadeiras> toReturn = new LinkedList<Cadeiras>();
        while(rs.next()){
           toReturn.add(populateCadeiras(rs));
        }
        rs.close();
        return toReturn;
    }

    public static Cadeiras populateCadeiras(ResultSet rs) throws SQLException {
        Cadeiras toReturn = new Cadeiras();
        toReturn.setId(rs.getString("id"));
        toReturn.setId_enrolador(rs.getString("id_enrolador"));
        toReturn.setMes_enrolacao(rs.getString("mes_enrolacao"));
        toReturn.setData_enrolacao(rs.getString("data_enrolacao"));
        toReturn.setQuinzena(rs.getString("quinzena"));
        toReturn.setGrande(rs.getString("grande"));
        toReturn.setPequena(rs.getString("pequena"));
        toReturn.setParadinha(rs.getString("paradinha"));
        return toReturn;
        
    } 
    
}
