/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.view;

import br.com.dao.CalculoDAO;
import br.com.entidade.Calculo;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class frmConsultarCalculo extends javax.swing.JDialog {
     private final CalculoDAO dao = new CalculoDAO();//Consulta e tabelas
     private final CalculoDAO daoCalculo;//Editar
     private List<Calculo> calculo = new LinkedList<Calculo>();//importa List
     private final frmPrincipal control;//Editar

    /**
     * Creates new form frmConsultarCalculo
     */
    public frmConsultarCalculo(java.awt.Frame parent, boolean modal, CalculoDAO daoCalculo, frmPrincipal control) {
        super(parent, modal); 
        this.daoCalculo = daoCalculo;//Editar
        this.control = control;//Editar
        initComponents();
        loadInitialData();
        
        tfQuinzenaPesquisa.setDocument(new NumerosPermitidos());
        
        tfQuinzena.setDocument(new NumerosPermitidos());
        tfQuantidadeProducao.setDocument(new NumerosPermitidos());
        tfQuantidadeEnrolacao.setDocument(new NumerosPermitidos());
        tfCalculo.setDocument(new NumerosPermitidos());
        tfPassou.setDocument(new TeclasPermitidas());
        
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

        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfPassou = new javax.swing.JTextField();
        tfCalculo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ftfMesCalculo = new javax.swing.JFormattedTextField();
        btEditar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tfQuantidadeProducao = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfQuinzena = new javax.swing.JTextField();
        tfQuantidadeEnrolacao = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btExcluir = new javax.swing.JButton();
        tfIdExcluir = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        ftfPesquisaMesCalculo = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        tfQuinzenaPesquisa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Cálculo");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar"));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Cálculo .:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Quantidade Enrolação .:");

        tfPassou.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfPassou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPassouActionPerformed(evt);
            }
        });

        tfCalculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Passou em .:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Mês .:");

        try {
            ftfMesCalculo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfMesCalculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ftfMesCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfMesCalculoActionPerformed(evt);
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

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Quantidade Produção .:");

        tfQuantidadeProducao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfQuantidadeProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantidadeProducaoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Quinzena .:");

        tfQuinzena.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfQuinzena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuinzenaActionPerformed(evt);
            }
        });

        tfQuantidadeEnrolacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfQuantidadeEnrolacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantidadeEnrolacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel6))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(jLabel15)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(ftfMesCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                        .addGap(134, 134, 134))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(tfQuinzena, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPassou, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfCalculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                .addComponent(tfQuantidadeEnrolacao, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfQuantidadeProducao)
                        .addGap(153, 153, 153)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btEditar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(tfQuantidadeEnrolacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tfCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tfPassou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ftfMesCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfQuinzena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar)
                    .addComponent(btLimpar)
                    .addComponent(tfQuantidadeProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(tfIdExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btExcluir)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12)
                .addComponent(tfIdExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btExcluir)
        );

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        try {
            ftfPesquisaMesCalculo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfPesquisaMesCalculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Pesquisar por Mês .:");

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

        tfQuinzenaPesquisa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfQuinzenaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuinzenaPesquisaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Quinzena .:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ftfPesquisaMesCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfQuinzenaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btPesquisar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(ftfPesquisaMesCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfQuinzenaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel14))
            .addComponent(btPesquisar)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Consulta de Cálculo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfPassouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPassouActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPassouActionPerformed

    private void ftfMesCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfMesCalculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfMesCalculoActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        String mes_calculo = ftfMesCalculo.getText();
        

        if(tfId.getText().equals("")){
            JOptionPane.showMessageDialog(this, "O campo ID não está formatado", "Validação", JOptionPane.ERROR_MESSAGE );
        }

        if(mes_calculo.equals("  /    ")){
            JOptionPane.showMessageDialog(this, "O campo MÊS não está formatado", "Validação", JOptionPane.ERROR_MESSAGE);
        }

        if(tfQuinzena.getText().equals("")){
            JOptionPane.showMessageDialog(this, "O campo QUINZENA não está formatado", "Validação", JOptionPane.ERROR_MESSAGE);
        }
        
        if(tfQuantidadeProducao.equals("")){
            JOptionPane.showMessageDialog(this, "O campo QUANTIDADE PRODUÇÃO não está formatado", "Validação", JOptionPane.ERROR_MESSAGE);
        }        

        if(tfQuantidadeEnrolacao.getText().equals("")){
            JOptionPane.showMessageDialog(this, "O campo QUANTIDADE ENROLAÇÃO não está formatado", "Validação", JOptionPane.ERROR_MESSAGE);
        }

        if(tfCalculo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "O campo CÁLCULO não está formatado", "Validação", JOptionPane.ERROR_MESSAGE);
        }

        if(tfPassou.getText().equals("")){
            JOptionPane.showMessageDialog(this, "O campo PASSOU EM não está formatado", "Validação", JOptionPane.ERROR_MESSAGE);
        }
        else {
            int b = JOptionPane.showConfirmDialog(null, "Deseja EDITAR o Cálculo?" , "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (b == 0){
                try{
                    Calculo calculo = new Calculo();
                    calculo.setMes(mes_calculo);
                    calculo.setQuinzena(tfQuinzena.getText());
                    calculo.setQuantidade_producao(tfQuantidadeProducao.getText());                    
                    calculo.setQuantidade_enrolacao(tfQuantidadeEnrolacao.getText());
                    calculo.setCalculo(tfCalculo.getText());
                    calculo.setPassou(tfPassou.getText());
                    calculo.setId(tfId.getText());
                    daoCalculo.editCalculo(calculo);
                    JOptionPane.showMessageDialog(this, "Cálculo Editado com SUCESSO!" , "SUCESSO" , JOptionPane.INFORMATION_MESSAGE);
                    setCampos();
                    loadInitialData();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Erro ao Editar o Cálculo", "ERRO" + ex, JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfId.setText("");
        ftfMesCalculo.setText("");
        tfQuinzena.setText("");
        tfQuantidadeProducao.setText("");
        tfQuantidadeEnrolacao.setText("");
        tfCalculo.setText("");
        tfPassou.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void tfQuantidadeProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantidadeProducaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantidadeProducaoActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if(tfIdExcluir.getText().equals("")){
            JOptionPane.showMessageDialog(this, "O campo ID não está formatado", "Validação", JOptionPane.ERROR_MESSAGE );
        }
        else{
            int b = JOptionPane.showConfirmDialog(null, "Deseja realmente EXCLUIR o Cálculo?" , "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (b == 0){
                try{
                    Calculo calculo = new Calculo();
                    calculo.setId(tfIdExcluir.getText());
                    daoCalculo.deleteCalculo(calculo);
                    JOptionPane.showMessageDialog(this, "Cálculo Excluido com SUCESSO!" , "SUCESSO" , JOptionPane.INFORMATION_MESSAGE);
                    setCampos();
                    loadInitialData();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Erro ao Excluir o Cálculo", "ERRO" + ex, JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tfIdExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdExcluirActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha_selecionada = jTable1.getSelectedRow(); //Pegar a linha selecionada.

        //Editar
        tfId.setText(jTable1.getValueAt(linha_selecionada, 0).toString());
        ftfMesCalculo.setText(jTable1.getValueAt(linha_selecionada, 1).toString());
        tfQuinzena.setText(jTable1.getValueAt(linha_selecionada, 2).toString());
        tfQuantidadeProducao.setText(jTable1.getValueAt(linha_selecionada, 3).toString());
        tfQuantidadeEnrolacao.setText(jTable1.getValueAt(linha_selecionada, 4).toString());
        tfCalculo.setText(jTable1.getValueAt(linha_selecionada, 5).toString());
        tfPassou.setText(jTable1.getValueAt(linha_selecionada, 6).toString());

        //Excluir
        tfIdExcluir.setText(jTable1.getValueAt(linha_selecionada, 0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String pesquisa_mes_calculo = ftfPesquisaMesCalculo.getText();

        if(pesquisa_mes_calculo.equals("  /    ")){
            JOptionPane.showMessageDialog(this, "O campo PESQUISAR POR MÊS não está formatado", "Validação", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(this, "Erro ao Pesquisar a Produção", "ERRO" + ex, JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_btPesquisarActionPerformed

    private void tfQuinzenaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuinzenaPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuinzenaPesquisaActionPerformed

    private void tfQuinzenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuinzenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuinzenaActionPerformed

    private void tfQuantidadeEnrolacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantidadeEnrolacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantidadeEnrolacaoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JFormattedTextField ftfMesCalculo;
    private javax.swing.JFormattedTextField ftfPesquisaMesCalculo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfCalculo;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfIdExcluir;
    private javax.swing.JTextField tfPassou;
    private javax.swing.JTextField tfQuantidadeEnrolacao;
    private javax.swing.JTextField tfQuantidadeProducao;
    private javax.swing.JTextField tfQuinzena;
    private javax.swing.JTextField tfQuinzenaPesquisa;
    // End of variables declaration//GEN-END:variables
public void loadInitialData() {
        try {
            calculo = dao.getallCalculo();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }        
        jTable1.setModel(new MyTableModel(Calculo.class, calculo, jTable1));
        
    }

public void Pesquisa_loadInitialData() {
        try {
            String pesquisa_mes_calculo = ftfPesquisaMesCalculo.getText();
            Calculo calc = new Calculo();
            calc.setMes(pesquisa_mes_calculo);
            calc.setQuinzena(tfQuinzenaPesquisa.getText());
            calculo = dao.searchCalculo(calc.getMes(), calc.getQuinzena());
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }        
        jTable1.setModel(new MyTableModel(Calculo.class, calculo, jTable1));
        
    }
    
public void setCampos() {
    //Limpa os campos do Editar
    tfId.setText("");       
    ftfMesCalculo.setText("");
    tfQuinzena.setText("");
    tfQuantidadeProducao.setText("");
    tfQuantidadeEnrolacao.setText("");
    tfCalculo.setText("");
    tfPassou.setText("");
    
    //Limpar o campo de excluir
    tfIdExcluir.setText("");
    
}

public void setCampos_Pesquisa() {
    ftfPesquisaMesCalculo.setText("");
    tfQuinzenaPesquisa.setText("");
}


}
