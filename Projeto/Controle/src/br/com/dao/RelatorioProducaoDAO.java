/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.entidade.RelatorioProducao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class RelatorioProducaoDAO extends GenericDAO{
    
    public RelatorioProducaoDAO() {
    } 
    
    public List<RelatorioProducao> searchRelatorioProducao(String mes_fabricacao, String quinzena)throws SQLException{
        ResultSet rs = executeQuery("SELECT MES_FABRICACAO, QUINZENA, SUM(GRANDE), SUM(PEQUENA), SUM(PARADINHA) FROM PRODUCAO GROUP BY MES_FABRICACAO, QUINZENA HAVING MES_FABRICACAO = "+ "'" + mes_fabricacao + "'" + "AND QUINZENA ="+"'"+ quinzena +"'");
        List<RelatorioProducao> toReturn = new LinkedList<RelatorioProducao>();
        while(rs.next()){
           toReturn.add(populateRelatotioProducao(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<RelatorioProducao> loadTableProducao() throws SQLException{
        List<RelatorioProducao> toReturn = new LinkedList<RelatorioProducao>();
        return toReturn;
    }
    
    public static RelatorioProducao populateRelatotioProducao(ResultSet rs) throws SQLException {
        RelatorioProducao toReturn = new RelatorioProducao();
        toReturn.setMes_fabricacao(rs.getString("mes_fabricacao"));        
        toReturn.setQuinzena(rs.getString("quinzena"));
        toReturn.setGrande(rs.getString("sum(grande)"));
        toReturn.setPequena(rs.getString("sum(pequena)"));
        toReturn.setParadinha(rs.getString("sum(paradinha)"));
        return toReturn;
    }
}
