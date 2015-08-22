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
public class SomaConsulta implements java.io.Serializable {
    
    @SwingColumn(description = "ID", colorOfBackgound = "")
    private String id;
    @SwingColumn(description = "ID ENROLADOR", colorOfBackgound = "")
    private String id_enrolador;
    @SwingColumn(description = "MÊS DA ENROLAÇÃO", colorOfBackgound = "")
    private String mes_enrolacao; 
    @SwingColumn(description = "QUINZENA", colorOfBackgound = "")
    private String quinzena;    
    @SwingColumn(description = "SOMA", colorOfBackgound = "")
    private String soma;
    
    public SomaConsulta(){
        
    }
    
     public SomaConsulta(String id, String id_enrolador, String mes_enrolacao, String quinzena, String soma) {
         
        this.id = id;
        this.id_enrolador = id_enrolador; 
        this.mes_enrolacao = mes_enrolacao;
        this.quinzena = quinzena;
        this.soma = soma;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getSoma() {
        return soma;
    }

    public void setSoma(String soma) {
        this.soma = soma;
    }
     
     
    
}