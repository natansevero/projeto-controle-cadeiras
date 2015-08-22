/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.entidade;

import br.com.view.SwingColumn;
/**
 *
 * @author Aluno
 */
public class Vendas implements java.io.Serializable{
    
    @SwingColumn(description = "ID", colorOfBackgound = "")
    private String id;
    @SwingColumn(description = "ID CLIENTE", colorOfBackgound = "")
    private String id_cliente;
    @SwingColumn(description = "MÊS DA VENDA", colorOfBackgound = "")
    private String mes_venda;
    @SwingColumn(description = "DATA DA VENDA", colorOfBackgound = "")
    private String data_venda;
    @SwingColumn(description = "QUINZENA", colorOfBackgound = "")
    private String quinzena;
    @SwingColumn(description = "GRANDE", colorOfBackgound = "")
    private String grande;
    @SwingColumn(description = "PEQUENA", colorOfBackgound = "")
    private String pequena;
    @SwingColumn(description = "PARADINHA", colorOfBackgound = "")
    private String paradinha;
    
    public Vendas(){
        
    }
    
    public Vendas(String id, String id_cliente, String mes_venda, String data_venda, String quinzena, String grande, String pequena, String paradinha) {
     
        this.id = id;
        this.id_cliente = id_cliente;
        this.mes_venda = mes_venda;
        this.data_venda = data_venda;
        this.quinzena = quinzena;
        this.grande = grande;
        this.pequena = pequena;
        this.paradinha = paradinha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getMes_venda() {
        return mes_venda;
    }

    public void setMes_venda(String mes_venda) {
        this.mes_venda = mes_venda;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public String getQuinzena() {
        return quinzena;
    }

    public void setQuinzena(String quinzena) {
        this.quinzena = quinzena;
    }

    public String getGrande() {
        return grande;
    }

    public void setGrande(String grande) {
        this.grande = grande;
    }

    public String getPequena() {
        return pequena;
    }

    public void setPequena(String pequena) {
        this.pequena = pequena;
    }

    public String getParadinha() {
        return paradinha;
    }

    public void setParadinha(String paradinha) {
        this.paradinha = paradinha;
    }
    
    
}
