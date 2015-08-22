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
public class Clientes implements java.io.Serializable {
    
    
    @SwingColumn(description = "ID CLIENTE", colorOfBackgound = "")
    private String id_cliente;
    @SwingColumn(description = "NOME DO CLIENTE", colorOfBackgound = "")
    private String nome_cliente; 
    @SwingColumn(description = "CPF", colorOfBackgound = "")
    private String cpf;    
    @SwingColumn(description = "RG", colorOfBackgound = "")
    private String rg;
    @SwingColumn(description = "CNPJ", colorOfBackgound = "")
    private String cnpj;
    @SwingColumn(description = "CIDADE", colorOfBackgound = "")
    private String cidade;
    @SwingColumn(description = "ESTADO", colorOfBackgound = "")
    private String estado;
    @SwingColumn(description = "E-MAIL", colorOfBackgound = "")
    private String e_mail;
    @SwingColumn(description = "TELEFONE 1", colorOfBackgound = "")
    private String telefone_1;
    @SwingColumn(description = "TELEFONE 2", colorOfBackgound = "")
    private String telefone_2;
    
    public Clientes(){
        
    }
    
     public Clientes( String id_cliente, String nome_cliente, String cpf, String rg, String cnpj, String cidade, String estado, String e_mail, String telefone_1, String telefone_2) {
     
        
        this.id_cliente = id_cliente;
        this.nome_cliente = nome_cliente;
        this.cpf = cpf;
        this.rg = rg;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.estado = estado;
        this.e_mail = e_mail;
        this.telefone_1 = telefone_1;
        this.telefone_2 = telefone_2;
    }

     
    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getTelefone_1() {
        return telefone_1;
    }

    public void setTelefone_1(String telefone_1) {
        this.telefone_1 = telefone_1;
    }

    public String getTelefone_2() {
        return telefone_2;
    }

    public void setTelefone_2(String telefone_2) {
        this.telefone_2 = telefone_2;
    }
     
    
    
}
