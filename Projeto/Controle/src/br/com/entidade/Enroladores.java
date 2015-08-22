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
public class Enroladores implements java.io.Serializable {
    
    @SwingColumn(description = "ID ENROLADOR", colorOfBackgound = "")
    private String id_enrolador;
    
    @SwingColumn(description = "NOME", colorOfBackgound = "")
    private String nome_enrolador;
    
    public Enroladores(){
        
    }
    
     public Enroladores(String id_enrolador, String nome_enrolador) {
         
        this.id_enrolador = id_enrolador; 
        this.nome_enrolador = nome_enrolador;
    }

    public String getId_enrolador() {
        return id_enrolador;
    }

    public void setId_enrolador(String id_enrolador) {
        this.id_enrolador = id_enrolador;
    } 

    public String getNome_enrolador() {
        return nome_enrolador;
    }

    public void setNome_enrolador(String nome_enrolador) {
        this.nome_enrolador = nome_enrolador;
    }
    
     
}
