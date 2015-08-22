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
public class Calculo implements java.io.Serializable {
    
    
    @SwingColumn(description = "ID", colorOfBackgound = "")
    private String id;
    @SwingColumn(description = "MÊS", colorOfBackgound = "")
    private String mes; 
    @SwingColumn(description = "QUINZENA", colorOfBackgound = "")
    private String quinzena;    
    @SwingColumn(description = "Q. PRODUÇÃO", colorOfBackgound = "")
    private String quantidade_producao;
    @SwingColumn(description = "Q. ENROLAÇÃO", colorOfBackgound = "")
    private String quantidade_enrolacao;
    @SwingColumn(description = "CÁLCULO", colorOfBackgound = "")
    private String calculo;
    @SwingColumn(description = "PASSOU EM", colorOfBackgound = "")
    private String passou;
    
    public Calculo(){
        
    }
    
     public Calculo(String id, String mes, String quinzena, String quantidade_producao, String quantidade_enrolacao, String calculo, String passou) {
     
        
        this.id = id;
        this.mes = mes;
        this.quinzena = quinzena;
        this.quantidade_producao = quantidade_producao;
        this.quantidade_enrolacao = quantidade_enrolacao;
        this.calculo = calculo;
        this.passou = passou;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getQuinzena() {
        return quinzena;
    }

    public void setQuinzena(String quinzena) {
        this.quinzena = quinzena;
    }

    public String getQuantidade_producao() {
        return quantidade_producao;
    }

    public void setQuantidade_producao(String quantidade_producao) {
        this.quantidade_producao = quantidade_producao;
    }

    public String getQuantidade_enrolacao() {
        return quantidade_enrolacao;
    }

    public void setQuantidade_enrolacao(String quantidade_enrolacao) {
        this.quantidade_enrolacao = quantidade_enrolacao;
    }

    public String getCalculo() {
        return calculo;
    }

    public void setCalculo(String calculo) {
        this.calculo = calculo;
    }

    public String getPassou() {
        return passou;
    }

    public void setPassou(String passou) {
        this.passou = passou;
    }
    
     
}
