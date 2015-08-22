/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.entidade.Calculo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class CalculoDAO extends GenericDAO{
    
    public CalculoDAO(){
        
    }
    
    public List<Calculo> searchCalculo(String mes, String quinzena) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM CALCULO WHERE MES_CALCULO =" +"'"+ mes +"'"+ "AND QUINZENA ="+"'"+ quinzena +"'" + "ORDER BY MES_CALCULO, QUINZENA ASC");
        List<Calculo> toReturn = new LinkedList<Calculo>();
        while(rs.next()){
           toReturn.add(populateCalculo(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public void editCalculo(Calculo ctm) throws  SQLException {
        String query = "UPDATE CALCULO SET " + "MES_CALCULO = ?, QUINZENA = ?, QUANTIDADE_PRODUCAO = ?, QUANTIDADE_ENROLACAO = ?, CALCULO = ?, PASSOU = ? "+ "WHERE ID = ?";
        executeCommand(query, ctm.getMes(), ctm.getQuinzena(), ctm.getQuantidade_producao(), ctm.getQuantidade_enrolacao(), ctm.getCalculo(), ctm.getPassou(), ctm.getId());
    }
    
    public void deleteCalculo(Calculo ctm) throws  SQLException {
        String query = "DELETE FROM CALCULO " + "WHERE ID = ?";
        executeCommand(query, ctm.getId());
    }
    public void addCalculo(Calculo ctm) throws SQLException{
        String query = "INSERT INTO CALCULO " + "(MES_CALCULO, QUINZENA, QUANTIDADE_PRODUCAO, QUANTIDADE_ENROLACAO, CALCULO, PASSOU) "+ "VALUES (?,?,?,?,?,?)";
        executeCommand(query, ctm.getMes(), ctm.getQuinzena(), ctm.getQuantidade_producao(), ctm.getQuantidade_enrolacao(), ctm.getCalculo(), ctm.getPassou());
    }
    
     public Calculo getCalculo(int idCalculo) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM CALCULO WHERE ID = ?", idCalculo);
        Calculo ctm = populateCalculo(rs);
        rs.close();
        return ctm;
    }    
    
    public List<Calculo> getallCalculo() throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM CALCULO ORDER BY MES_CALCULO, QUINZENA ASC");
        List<Calculo> toReturn = new LinkedList<Calculo>();
        while(rs.next()){
           toReturn.add(populateCalculo(rs));
        }
        rs.close();
        return toReturn;
    }

    public static Calculo populateCalculo(ResultSet rs) throws SQLException {
        Calculo toReturn = new Calculo();
        toReturn.setId(rs.getString("id"));
        toReturn.setMes(rs.getString("mes_calculo"));
        toReturn.setQuinzena(rs.getString("quinzena"));
        toReturn.setQuantidade_producao(rs.getString("quantidade_producao"));
        toReturn.setQuantidade_enrolacao(rs.getString("quantidade_enrolacao"));
        toReturn.setCalculo(rs.getString("calculo"));
        toReturn.setPassou(rs.getString("passou"));
        return toReturn;
        
    } 
}
