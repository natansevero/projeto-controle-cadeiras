/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.view;

import br.com.dao.CadeirasDAO;
import br.com.dao.EnroladoresDAO;
import br.com.dao.ProducaoDAO;
import br.com.dao.SomaConsultaDAO;
import br.com.dao.SomaDAO;
import br.com.dao.ClientesDAO;
import br.com.dao.VendasDAO;
import br.com.dao.RelatorioProducaoDAO;
import br.com.dao.RelatorioEnroladoresDAO;
import br.com.dao.CalculoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class frmPrincipal extends javax.swing.JFrame {
    private final ProducaoDAO daoProducao = new ProducaoDAO();
    private final EnroladoresDAO daoEnroladores = new EnroladoresDAO();
    private final CadeirasDAO daoCadeiras = new CadeirasDAO();
    private final SomaDAO daoSoma = new SomaDAO();
    private final SomaConsultaDAO daoSomaConsulta = new SomaConsultaDAO();
    private final ClientesDAO daoClientes = new ClientesDAO();
    private final VendasDAO daoVendas = new VendasDAO();
    private final RelatorioProducaoDAO daoRelatorioProducao = new RelatorioProducaoDAO();
    private final RelatorioEnroladoresDAO daoRelatorioEnroladores = new RelatorioEnroladoresDAO();
    private final CalculoDAO daoCalculo = new CalculoDAO();
    
    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmProducao = new javax.swing.JMenu();
        miCadastrar = new javax.swing.JMenuItem();
        miConsultar = new javax.swing.JMenuItem();
        jmEnroladores = new javax.swing.JMenu();
        jmiCadastrarEnrol = new javax.swing.JMenuItem();
        jmiConsultarEnrol = new javax.swing.JMenuItem();
        jmiCadasCadeiras = new javax.swing.JMenuItem();
        jmiConsulCadeiras = new javax.swing.JMenuItem();
        jmiSomaCadeiras = new javax.swing.JMenuItem();
        jmiConsultarSoma = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenu();
        jmiCadastarClientes = new javax.swing.JMenuItem();
        jmiConsultarClientes = new javax.swing.JMenuItem();
        jmVendas = new javax.swing.JMenu();
        jmiCadastrarVenda = new javax.swing.JMenuItem();
        jmiConsultarVenda = new javax.swing.JMenuItem();
        jmRelatorioFinal = new javax.swing.JMenu();
        jmiConsulRelatorio = new javax.swing.JMenuItem();
        jmiConsulCalculo = new javax.swing.JMenuItem();
        jmOpcoes = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo01.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Tela Principal");

        jMenuBar1.setName(""); // NOI18N

        jmProducao.setText("Produção   ");
        jmProducao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        miCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add_menor.png"))); // NOI18N
        miCadastrar.setText("Cadastrar");
        miCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarActionPerformed(evt);
            }
        });
        jmProducao.add(miCadastrar);

        miConsultar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tabela_menor.jpg"))); // NOI18N
        miConsultar.setText("Consultar");
        miConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarActionPerformed(evt);
            }
        });
        jmProducao.add(miConsultar);

        jMenuBar1.add(jmProducao);

        jmEnroladores.setText("Enroladores   ");
        jmEnroladores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jmiCadastrarEnrol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiCadastrarEnrol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_menor.jpg"))); // NOI18N
        jmiCadastrarEnrol.setText("Cadastrar");
        jmiCadastrarEnrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarEnrolActionPerformed(evt);
            }
        });
        jmEnroladores.add(jmiCadastrarEnrol);

        jmiConsultarEnrol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiConsultarEnrol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tabela_menor.jpg"))); // NOI18N
        jmiConsultarEnrol.setText("Consultar");
        jmiConsultarEnrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarEnrolActionPerformed(evt);
            }
        });
        jmEnroladores.add(jmiConsultarEnrol);

        jmiCadasCadeiras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiCadasCadeiras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add_menor.png"))); // NOI18N
        jmiCadasCadeiras.setText("Cadas. Cadeiras");
        jmiCadasCadeiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadasCadeirasActionPerformed(evt);
            }
        });
        jmEnroladores.add(jmiCadasCadeiras);

        jmiConsulCadeiras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiConsulCadeiras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadeira_menor.jpg"))); // NOI18N
        jmiConsulCadeiras.setText("Consul. Cadeiras");
        jmiConsulCadeiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsulCadeirasActionPerformed(evt);
            }
        });
        jmEnroladores.add(jmiConsulCadeiras);

        jmiSomaCadeiras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiSomaCadeiras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/customers_menor.jpg"))); // NOI18N
        jmiSomaCadeiras.setText("Somar Cad. dos Enroladores");
        jmiSomaCadeiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSomaCadeirasActionPerformed(evt);
            }
        });
        jmEnroladores.add(jmiSomaCadeiras);

        jmiConsultarSoma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiConsultarSoma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/soma_menor.jpg"))); // NOI18N
        jmiConsultarSoma.setText("Consultar Soma");
        jmiConsultarSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarSomaActionPerformed(evt);
            }
        });
        jmEnroladores.add(jmiConsultarSoma);

        jMenuBar1.add(jmEnroladores);

        jmClientes.setText("Clientes   ");
        jmClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jmiCadastarClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiCadastarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/customers_menor.jpg"))); // NOI18N
        jmiCadastarClientes.setText("Cadastrar");
        jmiCadastarClientes.setToolTipText("");
        jmiCadastarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastarClientesActionPerformed(evt);
            }
        });
        jmClientes.add(jmiCadastarClientes);

        jmiConsultarClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiConsultarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tabela_menor.jpg"))); // NOI18N
        jmiConsultarClientes.setText("Consultar");
        jmiConsultarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarClientesActionPerformed(evt);
            }
        });
        jmClientes.add(jmiConsultarClientes);

        jMenuBar1.add(jmClientes);

        jmVendas.setText("Vendas   ");
        jmVendas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jmiCadastrarVenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiCadastrarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add_menor.png"))); // NOI18N
        jmiCadastrarVenda.setText("Cadastrar");
        jmiCadastrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarVendaActionPerformed(evt);
            }
        });
        jmVendas.add(jmiCadastrarVenda);

        jmiConsultarVenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiConsultarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/money_menor.png"))); // NOI18N
        jmiConsultarVenda.setText("Consultar");
        jmiConsultarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarVendaActionPerformed(evt);
            }
        });
        jmVendas.add(jmiConsultarVenda);

        jMenuBar1.add(jmVendas);

        jmRelatorioFinal.setText("Relatório Final   ");
        jmRelatorioFinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jmiConsulRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiConsulRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tabela_menor.jpg"))); // NOI18N
        jmiConsulRelatorio.setText("Consultar Relatório");
        jmiConsulRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsulRelatorioActionPerformed(evt);
            }
        });
        jmRelatorioFinal.add(jmiConsulRelatorio);

        jmiConsulCalculo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiConsulCalculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/soma_menor.jpg"))); // NOI18N
        jmiConsulCalculo.setText("Consultar Cálculo");
        jmiConsulCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsulCalculoActionPerformed(evt);
            }
        });
        jmRelatorioFinal.add(jmiConsulCalculo);

        jMenuBar1.add(jmRelatorioFinal);

        jmOpcoes.setText("Opções");
        jmOpcoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jmiSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jmiSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-icon_menor.png"))); // NOI18N
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmOpcoes.add(jmiSair);

        jMenuBar1.add(jmOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel2)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(637, 487));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarActionPerformed
        frmCadastrarProducao dialog = new frmCadastrarProducao(new javax.swing.JFrame(), true,daoProducao,this);
        dialog.setVisible(true);     
    }//GEN-LAST:event_miCadastrarActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void miConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarActionPerformed
        frmConsultarProducao dialog = new frmConsultarProducao(new javax.swing.JFrame(), true,daoProducao,this);
        dialog.setVisible(true);
    }//GEN-LAST:event_miConsultarActionPerformed

    private void jmiCadastrarEnrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarEnrolActionPerformed
        frmCadastrarEnroladores dialog = new frmCadastrarEnroladores(new javax.swing.JFrame(), true,daoEnroladores,this);
        dialog.setVisible(true); 
    }//GEN-LAST:event_jmiCadastrarEnrolActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

    private void jmiConsultarEnrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarEnrolActionPerformed
        frmConsultarEnroladores dialog = new frmConsultarEnroladores(new javax.swing.JFrame(), true,daoEnroladores,this);
        dialog.setVisible(true); 
    }//GEN-LAST:event_jmiConsultarEnrolActionPerformed

    private void jmiCadasCadeirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadasCadeirasActionPerformed
        frmCadastrarCadeiras dialog = new frmCadastrarCadeiras(new javax.swing.JFrame(), true,daoCadeiras,this);
        dialog.setVisible(true); 
    }//GEN-LAST:event_jmiCadasCadeirasActionPerformed

    private void jmiConsulCadeirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsulCadeirasActionPerformed
        frmConsultarCadeiras dialog = new frmConsultarCadeiras(new javax.swing.JFrame(), true,daoCadeiras,this);
        dialog.setVisible(true); 
    }//GEN-LAST:event_jmiConsulCadeirasActionPerformed

    private void jmiSomaCadeirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSomaCadeirasActionPerformed
        frmSomaCadeirasEnrol dialog = new frmSomaCadeirasEnrol(new javax.swing.JFrame(), true,daoSoma,daoSomaConsulta,this);
        dialog.setVisible(true); 
    }//GEN-LAST:event_jmiSomaCadeirasActionPerformed

    private void jmiConsultarSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarSomaActionPerformed
        frmConsultarSoma dialog = new frmConsultarSoma(new javax.swing.JFrame(), true,daoSomaConsulta,this);
        dialog.setVisible(true); 
    }//GEN-LAST:event_jmiConsultarSomaActionPerformed

    private void jmiCadastarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastarClientesActionPerformed
        frmCadastrarClientes dialog = new frmCadastrarClientes(new javax.swing.JFrame(), true,daoClientes, this);
        dialog.setVisible(true); 
    }//GEN-LAST:event_jmiCadastarClientesActionPerformed

    private void jmiCadastrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarVendaActionPerformed
        frmCadastrarVendas dialog = new frmCadastrarVendas(new javax.swing.JFrame(), true,daoVendas, this);
        dialog.setVisible(true); 
    }//GEN-LAST:event_jmiCadastrarVendaActionPerformed

    private void jmiConsultarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarClientesActionPerformed
        frmConsultarClientes dialog = new frmConsultarClientes(new javax.swing.JFrame(), true,daoClientes, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_jmiConsultarClientesActionPerformed

    private void jmiConsultarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarVendaActionPerformed
        frmConsultarVendas dialog = new frmConsultarVendas(new javax.swing.JFrame(), true,daoVendas, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_jmiConsultarVendaActionPerformed

    private void jmiConsulRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsulRelatorioActionPerformed
        frmConsultarRelatorio dialog = new frmConsultarRelatorio(new javax.swing.JFrame(), true,daoRelatorioProducao, daoRelatorioEnroladores, daoCalculo, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_jmiConsulRelatorioActionPerformed

    private void jmiConsulCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsulCalculoActionPerformed
        frmConsultarCalculo dialog = new frmConsultarCalculo(new javax.swing.JFrame(), true,daoCalculo, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_jmiConsulCalculoActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmEnroladores;
    private javax.swing.JMenu jmOpcoes;
    private javax.swing.JMenu jmProducao;
    private javax.swing.JMenu jmRelatorioFinal;
    private javax.swing.JMenu jmVendas;
    private javax.swing.JMenuItem jmiCadasCadeiras;
    private javax.swing.JMenuItem jmiCadastarClientes;
    private javax.swing.JMenuItem jmiCadastrarEnrol;
    private javax.swing.JMenuItem jmiCadastrarVenda;
    private javax.swing.JMenuItem jmiConsulCadeiras;
    private javax.swing.JMenuItem jmiConsulCalculo;
    private javax.swing.JMenuItem jmiConsulRelatorio;
    private javax.swing.JMenuItem jmiConsultarClientes;
    private javax.swing.JMenuItem jmiConsultarEnrol;
    private javax.swing.JMenuItem jmiConsultarSoma;
    private javax.swing.JMenuItem jmiConsultarVenda;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiSomaCadeiras;
    private javax.swing.JMenuItem miCadastrar;
    private javax.swing.JMenuItem miConsultar;
    // End of variables declaration//GEN-END:variables
}