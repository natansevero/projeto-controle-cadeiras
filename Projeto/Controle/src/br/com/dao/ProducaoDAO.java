package br.com.dao;

import br.com.entidade.Producao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Israel
 */
public class ProducaoDAO extends GenericDAO{

    public ProducaoDAO() {
    }
    
    public List<Producao> searchProducao(String mes_fabricacao, String quinzena) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM PRODUCAO WHERE MES_FABRICACAO =" +"'"+ mes_fabricacao +"'"+ "AND QUINZENA ="+"'"+ quinzena +"'" + "ORDER BY MES_FABRICACAO, DATA_FABRICACAO ASC");
        List<Producao> toReturn = new LinkedList<Producao>();
        while(rs.next()){
           toReturn.add(populateProducao(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public void editProducao(Producao ctm) throws  SQLException {
        String query = "UPDATE PRODUCAO SET " + "MES_FABRICACAO = ?, DATA_FABRICACAO = ?, QUINZENA = ?, GRANDE = ?, PEQUENA = ?, PARADINHA = ? "+ "WHERE ID = ?";
        executeCommand(query, ctm.getMes_fabricacao(), ctm.getData_fabricacao(), ctm.getQuinzena(), ctm.getGrande(), ctm.getPequena(), ctm.getParadinha(), ctm.getId());
    }
    
    public void deleteProducao(Producao ctm) throws  SQLException {
        String query = "DELETE FROM PRODUCAO " + "WHERE ID = ?";
        executeCommand(query, ctm.getId());
    }
    
    public void addProducao(Producao ctm) throws SQLException{
        String query = "INSERT INTO PRODUCAO " + "(MES_FABRICACAO, DATA_FABRICACAO , QUINZENA, GRANDE , PEQUENA , PARADINHA) "+ "VALUES (?,?,?,?,?,?)";
        executeCommand(query, ctm.getMes_fabricacao(), ctm.getData_fabricacao(), ctm.getQuinzena(), ctm.getGrande(), ctm.getPequena(), ctm.getParadinha());
    }
    
    public Producao getProducao(int idProducao) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM PRODUCAO WHERE ID = ?", idProducao);
        Producao ctm = populateProducao(rs);
        rs.close();
        return ctm;
    }
    
    public List<Producao> getallProducao() throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM PRODUCAO ORDER BY MES_FABRICACAO, DATA_FABRICACAO ASC");
        List<Producao> toReturn = new LinkedList<Producao>();
        while(rs.next()){
           toReturn.add(populateProducao(rs));
        }
        rs.close();
        return toReturn;
    }

    public static Producao populateProducao(ResultSet rs) throws SQLException {
        Producao toReturn = new Producao();
        toReturn.setId(rs.getString("id"));
        toReturn.setMes_fabricacao(rs.getString("mes_fabricacao"));
        toReturn.setData_fabricacao(rs.getString("data_fabricacao"));
        toReturn.setQuinzena(rs.getString("quinzena"));
        toReturn.setGrande(rs.getString("grande"));
        toReturn.setPequena(rs.getString("pequena"));
        toReturn.setParadinha(rs.getString("paradinha"));
        return toReturn;
        
    } 
   
}
