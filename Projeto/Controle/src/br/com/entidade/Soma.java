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
public class Soma implements java.io.Serializable {
    
    @SwingColumn(description = "ID ENROLADOR", colorOfBackgound = "")
    private String id_enrolador;
    @SwingColumn(description = "MÊS DA ENROLAÇÃO", colorOfBackgound = "")
    private String mes_enrolacao; 
    @SwingColumn(description = "QUINZENA", colorOfBackgound = "")
    private String quinzena;    
    @SwingColumn(description = "Q. GRANDE", colorOfBackgound = "")
    private String grande;
    @SwingColumn(description = "Q. PEQUENA", colorOfBackgound = "")
    private String pequena;
    @SwingColumn(description = "Q. PARADINHA", colorOfBackgound = "")
    private String paradinha;
    
    public Soma(){
        
    }
    
     public Soma(String id_enrolador, String mes_enrolacao, String quinzena, String grande, String pequena, String paradinha) {
     
        this.id_enrolador = id_enrolador; 
        this.mes_enrolacao = mes_enrolacao;
        this.quinzena = quinzena;
        this.grande = grande;
        this.pequena = pequena;
        this.paradinha = paradinha;
    }

    public String getId_enrolador() {
        return id_enrolador;
    }

    public void setId_enrolador(String id_enrolador) {
        this.id_enrolador = id_enrolador;
    }

    public String getMes_enrolacao() {
        return mes_enrolacao;
    }

    public void setMes_enrolacao(String mes_enrolacao) {
        this.mes_enrolacao = mes_enrolacao;
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
