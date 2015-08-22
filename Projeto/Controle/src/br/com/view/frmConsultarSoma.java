/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.view;

import br.com.dao.SomaConsultaDAO;
import br.com.entidade.SomaConsulta;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class frmConsultarSoma extends javax.swing.JDialog {
     private final SomaConsultaDAO dao = new SomaConsultaDAO();//Consulta e tabelas
     private final SomaConsultaDAO daoSomaConsulta;//Editar
     private List<SomaConsulta> somaConsulta = new LinkedList<SomaConsulta>();//importa List
     private final frmPrincipal control;//Editar
   
    public frmConsultarSoma(java.awt.Frame parent, boolean modal, SomaConsultaDAO daoSomaConsulta, frmPrincipal control) {
        super(parent, modal);
        this.daoSomaConsulta = daoSomaConsulta;//Editar
        this.control = control;//Editar
        initComponents();
        loadInitialData();
        tfIdEnroladorPesquisa.setDocument(new NumerosPermitidos());
        tfQuinzenaPesquisa.setDocument(new NumerosPermitidos());
        
        tfIdEnrolador.setDocument(new NumerosPermitidos());
        tfQuinzena.setDocument(new NumerosPermitidos());
        tfSoma.setDocument(new NumerosPermitidos());
        
        tfId.setEditable(false);
        tfIdExcluir.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfIdEnroladorPesquisa = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ftfPesquisaMesEnrolacao = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        tfQuinzenaPesquisa = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tfIdEnrolador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ftfMesEnrolacao = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        tfQuinzena = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfSoma = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btExcluir = new javax.swing.JButton();
        tfIdExcluir = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Soma");
        setResizable(false);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Consulta de Soma");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(252, 252, 252))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        tfIdEnroladorPesquisa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfIdEnroladorPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdEnroladorPesquisaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("ID Enrolador .:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Pesquisar por Mês da Enrolação .:");

        try {
            ftfPesquisaMesEnrolacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfPesquisaMesEnrolacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Quinzena .:");

        tfQuinzenaPesquisa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfQuinzenaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuinzenaPesquisaActionPerformed(evt);
            }
        });

        btPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.jpg"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfIdEnroladorPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftfPesquisaMesEnrolacao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfQuinzenaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btPesquisar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIdEnroladorPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel4)
                    .addComponent(ftfPesquisaMesEnrolacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuinzenaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btPesquisar))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar"));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("ID Enrolador .:");

        tfIdEnrolador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfIdEnrolador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdEnroladorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Mês da Enrolação .:");

        try {
            ftfMesEnrolacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfMesEnrolacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ftfMesEnrolacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfMesEnrolacaoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Quinzena .:");

        tfQuinzena.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfQuinzena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuinzenaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Soma .:");

        tfSoma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSomaActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.jpg"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btEditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("ID .:");

        tfId.setBackground(new java.awt.Color(204, 204, 204));
        tfId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfIdEnrolador, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfQuinzena, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(ftfMesEnrolacao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btEditar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfQuinzena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfIdEnrolador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfSoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(ftfMesEnrolacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btEditar)
                        .addComponent(btLimpar))))
        );

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Excluir"));

        btExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        tfIdExcluir.setBackground(new java.awt.Color(204, 204, 204));
        tfIdExcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfIdExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdExcluirActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("ID .:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(tfIdExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btExcluir)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfIdExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addComponent(btExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        btVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-icon.png"))); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha_selecionada = jTable1.getSelectedRow(); //Pegar a linha selecionada.

        //Editar
        tfId.setText(jTable1.getValueAt(linha_selecionada, 0).toString());
        tfIdEnrolador.setText(jTable1.getValueAt(linha_selecionada, 1).toString());
        ftfMesEnrolacao.setText(jTable1.getValueAt(linha_selecionada, 2).toString());
        tfQuinzena.setText(jTable1.getValueAt(linha_selecionada, 3).toString());
        tfSoma.setText(jTable1.getValueAt(linha_selecionada, 4).toString());
        
        //Excluir
        tfIdExcluir.setText(jTable1.getValueAt(linha_selecionada, 0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void tfIdEnroladorPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdEnroladorPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdEnroladorPesquisaActionPerformed

    private void tfQuinzenaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuinzenaPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuinzenaPesquisaActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String pesquisa_mes_enro = ftfPesquisaMesEnrolacao.getText();

        if(tfIdEnroladorPesquisa.getText().equals("")){
            JOptionPane.showMessageDialog(this, "O campo ID ENROLADOR não está formatado", "Validação", JOptionPane.ERROR_MESSAGE);
        }

        if(pesquisa_mes_enro.equals("  /    ")){
            JOptionPane.showMessageDialog(this, "O campo PESQUISAR POR MÊS DA ENROLAÇÃO não está formatado", "Validação", JOptionPane.ERROR_MESSAGE);
        }

        if(tfQuinzenaPesquisa.getText().equals("")){
            JOptionPane.showMessageDialog(this, "O campo QUINZENA não está formatado", "Validação", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                Pesquisa_loadInitialData();
                setCampos_Pesquisa();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao Pesquisar a Soma", "ERRO" + ex, JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void tfIdEnroladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdEnroladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdEnroladorActionPerformed

    private void ftfMesEnrolacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfMesEnrolacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfMesEnrolacaoActionPerformed

    private void tfQuinzenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuinzenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuinzenaActionPerformed

    private void tfSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSomaActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfId.setText("");
        tfIdEnrolador.setText("");
        ftfMesEnrolacao.setText("");
        tfQuinzena.setText("");
        tfSoma.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        String mes_enrolacao = ftfMesEnrolacao.getText();
        
         if(tfId.getText().equals("")){
            JOptionPane.showMessageDialog(this, "O campo ID não está formatado", "Validação", JOptionPane.ERROR_MESSAGE );
        }

        if(tfIdEnrolador.getText().equals("")){
            JOptionPane.showMessageDialog(this, "O campo ID ENROLADOR não está formatado", "Validação", JOptionPane.ERROR_MESSAGE );
        }

        if(mes_enrolacao.equals("  /    ")){
            JOptionPane.showMessageDialog(this, "O campo MÊS DA ENROLAÇÃO não está formatado", "Validação", JOptionPane.ERROR_MESSAGE);
        }

        if(tfQuinzena.getText().equals("")){
            JOptionPane.showMessageDialog(this, "O campo QUINZENA não está formatado", "Validação", JOptionPane.ERROR_MESSAGE);
        }

        if(tfSoma.getText().equals("")){
            JOptionPane.showMessageDialog(this, "O campo SOMA não está formatado", "Validação", JOptionPane.ERROR_MESSAGE);
        }
        else {
            int b = JOptionPane.showConfirmDialog(null, "Deseja Editar a Soma?" , "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (b == 0){
                try{
                    SomaConsulta somaConsulta = new SomaConsulta();
                    somaConsulta.setId_enrolador(tfIdEnrolador.getText());
                    somaConsulta.setMes_enrolacao(mes_enrolacao);
                    somaConsulta.setQuinzena(tfQuinzena.getText());
                    somaConsulta.setSoma(tfSoma.getText());
                    somaConsulta.setId(tfId.getText());
                    daoSomaConsulta.editSoma(somaConsulta);
                    JOptionPane.showMessageDialog(this, "Soma Editada com SUCESSO!" , "SUCESSO" , JOptionPane.INFORMATION_MESSAGE);
                    setCampos();
                    loadInitialData();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Erro ao Editar a Soma", "ERRO" + ex, JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if(tfIdExcluir.getText().equals("")){
            JOptionPane.showMessageDialog(this, "O campo ID não está formatado", "Validação", JOptionPane.ERROR_MESSAGE );
        }
        else{
            int b = JOptionPane.showConfirmDialog(null, "Deseja realmente EXCLUIR a Soma?" , "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (b == 0){
                try{
                    SomaConsulta somaConsulta = new SomaConsulta();
                    somaConsulta.setId(tfIdExcluir.getText());
                    daoSomaConsulta.deleteSoma(somaConsulta);
                    JOptionPane.showMessageDialog(this, "Soma Excluida com SUCESSO!" , "SUCESSO" , JOptionPane.INFORMATION_MESSAGE);
                    setCampos();
                    loadInitialData();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Erro ao Excluir a Soma", "ERRO" + ex, JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tfIdExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdExcluirActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JFormattedTextField ftfMesEnrolacao;
    private javax.swing.JFormattedTextField ftfPesquisaMesEnrolacao;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfIdEnrolador;
    private javax.swing.JTextField tfIdEnroladorPesquisa;
    private javax.swing.JTextField tfIdExcluir;
    private javax.swing.JTextField tfQuinzena;
    private javax.swing.JTextField tfQuinzenaPesquisa;
    private javax.swing.JTextField tfSoma;
    // End of variables declaration//GEN-END:variables
public void loadInitialData() {
    try {
        somaConsulta = dao.getallSomaConsulta();
    }catch (Exception ex) {
            ex.printStackTrace();
        }        
        jTable1.setModel(new MyTableModel(SomaConsulta.class, somaConsulta, jTable1));
}

public void Pesquisa_loadInitialData() {
        try {
            String pesquisa_mes_enro = ftfPesquisaMesEnrolacao.getText();
            SomaConsulta somConsulta = new SomaConsulta();
            somConsulta.setId_enrolador(tfIdEnroladorPesquisa.getText());
            somConsulta.setMes_enrolacao(pesquisa_mes_enro);
            somConsulta.setQuinzena(tfQuinzenaPesquisa.getText());
            somaConsulta = dao.searchSoma(somConsulta.getId_enrolador(), somConsulta.getMes_enrolacao(), somConsulta.getQuinzena());
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }        
        jTable1.setModel(new MyTableModel(SomaConsulta.class, somaConsulta, jTable1));
        
    }

public void setCampos() {
    //Limpa os campos do Editar
    tfId.setText("");
    tfIdEnrolador.setText("");
    ftfMesEnrolacao.setText("");
    tfQuinzena.setText("");
    tfSoma.setText("");
    
    //Limpa os campos do Excluir
    tfIdExcluir.setText("");
}

public void setCampos_Pesquisa() {
    tfIdEnroladorPesquisa.setText("");
    ftfPesquisaMesEnrolacao.setText("");
    tfQuinzenaPesquisa.setText("");
}

}
