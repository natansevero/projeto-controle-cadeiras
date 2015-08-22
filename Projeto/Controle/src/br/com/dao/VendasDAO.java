/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.entidade.Vendas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Aluno
 */
public class VendasDAO extends GenericDAO {
    
    public VendasDAO() {
    }
    
    public List<Vendas> searchVendas(String id_cliente, String mes_venda, String quinzena) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM VENDAS WHERE ID_CLIENTE ="+ "'" + id_cliente + "'" + "AND MES_VENDA =" +"'"+ mes_venda +"'"+ "AND QUINZENA ="+"'"+ quinzena +"'"+"ORDER BY MES_VENDA, DATA_VENDA ASC");
        List<Vendas> toReturn = new LinkedList<Vendas>();
        while(rs.next()){
           toReturn.add(populateVendas(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public void editVendas(Vendas ctm) throws  SQLException {
        String query = "UPDATE VENDAS SET " + "ID_CLIENTE = ?, MES_VENDA = ?, DATA_VENDA = ?, QUINZENA = ?, GRANDE = ?, PEQUENA = ?, PARADINHA = ? "+ "WHERE ID = ?";
        executeCommand(query, ctm.getId_cliente(), ctm.getMes_venda(), ctm.getData_venda(), ctm.getQuinzena(), ctm.getGrande(), ctm.getPequena(), ctm.getParadinha(), ctm.getId());
    }
    
    public void deleteVendas(Vendas ctm) throws SQLException {
        String query = "DELETE FROM VENDAS " + "WHERE ID = ?";
        executeCommand(query, ctm.getId());
    }
    
    public void addVenda(Vendas ctm) throws SQLException{
        String query = "INSERT INTO VENDAS " + "(ID_CLIENTE, MES_VENDA, DATA_VENDA, QUINZENA, GRANDE, PEQUENA, PARADINHA) "+ "VALUES (?,?,?,?,?,?,?)";
        executeCommand(query, ctm.getId_cliente(), ctm.getMes_venda(), ctm.getData_venda(), ctm.getQuinzena(), ctm.getGrande(), ctm.getPequena(), ctm.getParadinha());
    }
    
    public Vendas getVendas(int idVendas) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM VENDAS WHERE ID = ?", idVendas);
        Vendas ctm = populateVendas(rs);
        rs.close();
        return ctm;
    }
    
    
    public List<Vendas> getallVendas() throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM VENDAS ORDER BY MES_VENDA, DATA_VENDA ASC");
        List<Vendas> toReturn = new LinkedList<Vendas>();
        while(rs.next()){
           toReturn.add(populateVendas(rs));
        }
        rs.close();
        return toReturn;
    }

    public static Vendas populateVendas(ResultSet rs) throws SQLException {
        Vendas toReturn = new Vendas();
        toReturn.setId(rs.getString("id"));
        toReturn.setId_cliente(rs.getString("id_cliente"));
        toReturn.setMes_venda(rs.getString("mes_venda"));
        toReturn.setData_venda(rs.getString("data_venda"));
        toReturn.setQuinzena(rs.getString("quinzena"));
        toReturn.setGrande(rs.getString("grande"));
        toReturn.setPequena(rs.getString("pequena"));
        toReturn.setParadinha(rs.getString("paradinha"));
        return toReturn;
        
    } 
}
