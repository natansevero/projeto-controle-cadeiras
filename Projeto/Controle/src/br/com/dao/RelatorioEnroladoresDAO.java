/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.entidade.RelatorioEnroladores;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class RelatorioEnroladoresDAO extends GenericDAO{
    
    public RelatorioEnroladoresDAO() {
    } 
    public List<RelatorioEnroladores> searchRelatorioEnroladores(String mes_enrolacao, String quinzena)throws SQLException{
        ResultSet rs = executeQuery("SELECT MES_ENROLACAO, QUINZENA, SUM(GRANDE), SUM(PEQUENA), SUM(PARADINHA) FROM CADEIRAS GROUP BY MES_ENROLACAO, QUINZENA HAVING MES_ENROLACAO = "+ "'" + mes_enrolacao + "'" + "AND QUINZENA ="+"'"+ quinzena +"'");
        List<RelatorioEnroladores> toReturn = new LinkedList<RelatorioEnroladores>();
        while(rs.next()){
           toReturn.add(populateRelatotioEnroladores(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<RelatorioEnroladores> loadTableEnroladores() throws SQLException{
        List<RelatorioEnroladores> toReturn = new LinkedList<RelatorioEnroladores>();
        return toReturn;
    }
    
    public static RelatorioEnroladores populateRelatotioEnroladores(ResultSet rs) throws SQLException {
        RelatorioEnroladores toReturn = new RelatorioEnroladores();
        toReturn.setMes_enrolacao(rs.getString("mes_enrolacao"));        
        toReturn.setQuinzena(rs.getString("quinzena"));
        toReturn.setGrande(rs.getString("sum(grande)"));
        toReturn.setPequena(rs.getString("sum(pequena)"));
        toReturn.setParadinha(rs.getString("sum(paradinha)"));
        return toReturn;
    }
    
}
