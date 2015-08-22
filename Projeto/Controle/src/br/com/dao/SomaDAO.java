/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.entidade.Soma;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Aluno
 */
public class SomaDAO extends GenericDAO {
    
    public SomaDAO() {
    } 
    
     //Mostar as colunas da tabela.
     public List<Soma> loadTtable() throws SQLException{
        List<Soma> toReturn = new LinkedList<Soma>();
        return toReturn;
    }
    
    public List<Soma> searchSoma(String id_enrolador, String mes_enrolacao, String quinzena) throws SQLException{
        ResultSet rs = executeQuery("SELECT ID_ENROLADOR, MES_ENROLACAO, QUINZENA, SUM(GRANDE), SUM(PEQUENA), SUM(PARADINHA) FROM CADEIRAS GROUP BY ID_ENROLADOR, MES_ENROLACAO, QUINZENA HAVING ID_ENROLADOR = "+ "'" + id_enrolador + "'" + "AND MES_ENROLACAO = " +"'"+ mes_enrolacao +"'"+ "AND QUINZENA ="+"'"+ quinzena +"'");
        List<Soma> toReturn = new LinkedList<Soma>();
        while(rs.next()){
           toReturn.add(populateSoma(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public Soma getSoma(int idSoma) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM SOMA WHERE ID = ?", idSoma);
        Soma ctm = populateSoma(rs);
        rs.close();
        return ctm;
    }
   
    
    public static Soma populateSoma(ResultSet rs) throws SQLException {
        Soma toReturn = new Soma();
        toReturn.setId_enrolador(rs.getString("id_enrolador"));
        toReturn.setMes_enrolacao(rs.getString("mes_enrolacao"));        
        toReturn.setQuinzena(rs.getString("quinzena"));
        toReturn.setGrande(rs.getString("sum(grande)"));
        toReturn.setPequena(rs.getString("sum(pequena)"));
        toReturn.setParadinha(rs.getString("sum(paradinha)"));
        return toReturn;
    }
        
    
        
    
    
}
