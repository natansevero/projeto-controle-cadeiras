/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dao;

import br.com.entidade.Clientes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Aluno
 */
public class ClientesDAO extends GenericDAO{
    
    public ClientesDAO() {
    }
    
     public List<Clientes> searchClienteEstado(String estado) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM CLIENTE WHERE ESTADO=" + "'" + estado + "'"+"ORDER BY NOME_CLIENTE ASC");
        List<Clientes> toReturn = new LinkedList<Clientes>();
        while(rs.next()){
           toReturn.add(populateClientes(rs));
        }
        rs.close();
        return toReturn;
    }
    
     public List<Clientes> searchClienteCnpj(String cnpj) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM CLIENTE WHERE CNPJ=" + "'"+cnpj+"'"+ "ORDER BY NOME_CLIENTE ASC");
        List<Clientes> toReturn = new LinkedList<Clientes>();
        while(rs.next()){
           toReturn.add(populateClientes(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<Clientes> searchCliente(String nome_cliente) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM CLIENTE WHERE NOME_CLIENTE LIKE" + "'" + nome_cliente + "%'"+"ORDER BY NOME_CLIENTE ASC");
        List<Clientes> toReturn = new LinkedList<Clientes>();
        while(rs.next()){
           toReturn.add(populateClientes(rs));
        }
        rs.close();
        return toReturn;
    }
    
   public void editCliente(Clientes ctm) throws  SQLException {
        String query = "UPDATE CLIENTE SET " + "NOME_CLIENTE = ?, CPF = ?, RG = ?, CNPJ = ?, CIDADE = ?, ESTADO = ?, E_MAIL = ?, TEL_1 = ?, TEL_2 = ?"+ "WHERE ID_CLIENTE = ?";
        executeCommand(query, ctm.getNome_cliente(), ctm.getCpf(), ctm.getRg(), ctm.getCnpj(), ctm.getCidade(), ctm.getEstado(), ctm.getE_mail(), ctm.getTelefone_1(), ctm.getTelefone_2(), ctm.getId_cliente());
   }
    
    public void deleteCliente(Clientes ctm) throws SQLException {
        String query = "DELETE FROM CLIENTE " + "WHERE ID_CLIENTE = ?";
        executeCommand(query, ctm.getId_cliente());
    }
    
    public void addCliente(Clientes ctm) throws SQLException{
        String query = "INSERT INTO CLIENTE " + "(NOME_CLIENTE, CPF, RG, CNPJ, CIDADE, ESTADO, E_MAIL, TEL_1, TEL_2) "+ "VALUES (?,?,?,?,?,?,?,?,?)";
        executeCommand(query, ctm.getNome_cliente(), ctm.getCpf(), ctm.getRg(), ctm.getCnpj(), ctm.getCidade(), ctm.getEstado(), ctm.getE_mail(), ctm.getTelefone_1(), ctm.getTelefone_2());
    }
    
    public Clientes getCadeiras(int idClientes) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM CLIENTE WHERE ID = ?", idClientes);
        Clientes ctm = populateClientes(rs);
        rs.close();
        return ctm;
    }
    
    
    public List<Clientes> getallClientes() throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM CLIENTE");
        List<Clientes> toReturn = new LinkedList<Clientes>();
        while(rs.next()){
           toReturn.add(populateClientes(rs));
        }
        rs.close();
        return toReturn;
    }

    public static Clientes populateClientes(ResultSet rs) throws SQLException {
        Clientes toReturn = new Clientes();
        toReturn.setId_cliente(rs.getString("id_cliente"));
        toReturn.setNome_cliente(rs.getString("nome_cliente"));
        toReturn.setCpf(rs.getString("cpf"));
        toReturn.setRg(rs.getString("rg"));
        toReturn.setCnpj(rs.getString("cnpj"));
        toReturn.setCidade(rs.getString("cidade"));
        toReturn.setEstado(rs.getString("estado"));
        toReturn.setE_mail(rs.getString("e_mail"));
        toReturn.setTelefone_1(rs.getString("tel_1"));
        toReturn.setTelefone_2(rs.getString("tel_2"));
        return toReturn;
        
    } 
}
