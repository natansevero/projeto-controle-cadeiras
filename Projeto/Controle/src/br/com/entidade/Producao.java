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
public class Producao implements java.io.Serializable {
    
    @SwingColumn(description = "ID", colorOfBackgound = "")
    private String id;
    @SwingColumn(description = "MÊS DA FABRICAÇÃO", colorOfBackgound = "")
    private String mes_fabricacao;
    @SwingColumn(description = "DATA DA FABRICAÇAO", colorOfBackgound = "")
    private String data_fabricacao;
    @SwingColumn(description = "QUINZENA", colorOfBackgound = "")
    private String quinzena;
    @SwingColumn(description = "GRANDE", colorOfBackgound = "")
    private String grande;
    @SwingColumn(description = "PEQUENA", colorOfBackgound = "")
    private String pequena;
    @SwingColumn(description = "PARADINHA", colorOfBackgound = "")
    private String paradinha;
    
    public Producao(){
        
    }
    
     public Producao(String id,String mes_fabricacao, String data_fabricacao, String quinzena, String grande, String pequena, String paradinha) {
     
        this.id = id; 
        this.mes_fabricacao = mes_fabricacao;
        this.data_fabricacao = data_fabricacao;
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

    public String getMes_fabricacao() {
        return mes_fabricacao;
    }

    public void setMes_fabricacao(String mes_fabricacao) {
        this.mes_fabricacao = mes_fabricacao;
    }

    public String getData_fabricacao() {
        return data_fabricacao;
    }

    public void setData_fabricacao(String data_fabricacao) {
        this.data_fabricacao = data_fabricacao;
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
