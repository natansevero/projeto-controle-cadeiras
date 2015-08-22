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
public class RelatorioProducao implements java.io.Serializable {
    
    @SwingColumn(description = "MÊS DA FABRICAÇÃO", colorOfBackgound = "")
    private String mes_fabricacao;
    @SwingColumn(description = "QUINZENA", colorOfBackgound = "")
    private String quinzena;
    @SwingColumn(description = "Q. GRANDE", colorOfBackgound = "")
    private String grande;
    @SwingColumn(description = "Q. PEQUENA", colorOfBackgound = "")
    private String pequena;
    @SwingColumn(description = "Q. PARADINHA", colorOfBackgound = "")
    private String paradinha;
    
    public RelatorioProducao(){
        
    }
    
    public RelatorioProducao(String mes_fabricacao, String quinzena, String grande, String pequena, String paradinha) {
      
        this.mes_fabricacao = mes_fabricacao;
        this.quinzena = quinzena;
        this.grande = grande;
        this.pequena = pequena;
        this.paradinha = paradinha;
    }

    public String getMes_fabricacao() {
        return mes_fabricacao;
    }

    public void setMes_fabricacao(String mes_fabricacao) {
        this.mes_fabricacao = mes_fabricacao;
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
