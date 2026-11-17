package tela;

import java.sql.Connection;
import conexao.Conexao;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author VITORIA NUNES FARIAS
 */
public class frmConsultaAnimais extends javax.swing.JFrame {

    private void atualizarTabela(){
       DefaultTableModel modelo = (DefaultTableModel) tabConsultaAnimais.getModel();
       
       modelo.setRowCount(0);
       
       String sql = "SELECT * FROM animal " + "ORDER BY id";
       
       try (Connection conex = Conexao.conectar();
             PreparedStatement stmt = conex.prepareStatement(sql);
             ResultSet resultado = stmt.executeQuery()){
             
           
            while (resultado.next()){
            
                modelo.addRow(new Object[]{
                    resultado.getInt("id"),
                    resultado.getString("especie"),
                    resultado.getString("nome"),
                    resultado.getInt("idade"),
                });
            }          
         } catch (SQLException erro) {
             JOptionPane.showMessageDialog(this, "Erro ao atualizar tabela: \n" + erro.getMessage(), "Erro no banco de dados", JOptionPane.ERROR_MESSAGE);
         }
        
    }

    
  
    public frmConsultaAnimais() {
        initComponents();
        tabConsultaAnimais.setModel(new DefaultTableModel(new Object[] [] {}, new String [] {"ID", "Especie", "Nome", "Idade"}){
                          @Override
                          public boolean isCellEditable(int linha, int coluna){
                             return false;
                          }
                          });
                    
        tabConsultaAnimais.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        
        atualizarTabela(); 
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabConsultaAnimais = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAtualizarTabela = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        btnLocalizar = new javax.swing.JButton();
        cbmPesquisarPor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnSairConsultaAnimais = new javax.swing.JButton();
        btnExcluirConsultaAnimal = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabConsultaAnimais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabConsultaAnimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabConsultaAnimaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabConsultaAnimais);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA DE ANIMAIS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );

        btnAtualizarTabela.setBackground(new java.awt.Color(255, 204, 102));
        btnAtualizarTabela.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizarTabela.setForeground(new java.awt.Color(0, 0, 0));
        btnAtualizarTabela.setText("Atualizar Tabela");
        btnAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTabelaActionPerformed(evt);
            }
        });

        txtPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pesquisar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(204, 102, 0))); // NOI18N

        btnLocalizar.setBackground(new java.awt.Color(255, 204, 102));
        btnLocalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLocalizar.setForeground(new java.awt.Color(0, 0, 0));
        btnLocalizar.setText("Localizar");
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });

        cbmPesquisarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Especie" }));
        cbmPesquisarPor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pesquisado Por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(204, 102, 0))); // NOI18N
        cbmPesquisarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmPesquisarPorActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tela/consulta animal.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");

        btnSairConsultaAnimais.setBackground(new java.awt.Color(255, 204, 102));
        btnSairConsultaAnimais.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSairConsultaAnimais.setForeground(new java.awt.Color(0, 0, 0));
        btnSairConsultaAnimais.setText("Sair");
        btnSairConsultaAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairConsultaAnimaisActionPerformed(evt);
            }
        });

        btnExcluirConsultaAnimal.setBackground(new java.awt.Color(255, 204, 102));
        btnExcluirConsultaAnimal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluirConsultaAnimal.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluirConsultaAnimal.setText("Excluir");
        btnExcluirConsultaAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirConsultaAnimalActionPerformed(evt);
            }
        });

        txtId.setEditable(false);

        jLabel3.setBackground(new java.awt.Color(204, 102, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 102, 0));
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 102, 0));
        jLabel4.setText("Especie");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 102, 0));
        jLabel5.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 102, 0));
        jLabel6.setText("Idade");

        btnAlterar.setBackground(new java.awt.Color(255, 204, 102));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(0, 0, 0));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLocalizar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbmPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtualizarTabela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirConsultaAnimal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSairConsultaAnimais)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbmPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(1, 70, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocalizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizarTabela)
                    .addComponent(btnExcluirConsultaAnimal)
                    .addComponent(btnSairConsultaAnimais)
                    .addComponent(btnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
        String pesquisa = txtPesquisar.getText().trim();
        if (pesquisa.isEmpty()){
           JOptionPane.showMessageDialog(this, "Digite o nome ou parte do nome do animal", "Pequisa Vazia", JOptionPane.WARNING_MESSAGE);
           return;
        }
        
        DefaultTableModel modelo = (DefaultTableModel) tabConsultaAnimais.getModel();
        
        modelo.setRowCount(0);
        
        String sql = "SELECT * FROM animal " + "WHERE nome ILIKE ? " + "ORDER BY nome";
        
        try(Connection conex = Conexao.conectar();
            PreparedStatement stmt = conex.prepareStatement(sql)){
        stmt.setString(1,"%" + pesquisa + "%");
        
           try(ResultSet resultado = stmt.executeQuery()){
              while (resultado.next()){
                modelo.addRow(new Object [] {
                   resultado.getInt("id"),
                   resultado.getString("especie"),
                   resultado.getString("nome"),
                   resultado.getInt("idade")});
              }
           
           }
           if(modelo.getRowCount() == 0){
            JOptionPane.showMessageDialog(this, "Nenhum animal encontrado para: " + pesquisa, "Resultado da pesquisa", JOptionPane.INFORMATION_MESSAGE);
           }
        }catch(SQLException erro){
          JOptionPane.showMessageDialog(this, "Erro ao localizar animal: \n" + erro.getMessage(), "Erro no banco de dados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void cbmPesquisarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmPesquisarPorActionPerformed
       String pesquisa = cbmPesquisarPor.getSelectedItem().toString();
        String sql = "";
        if (pesquisa == "Nome"){
            sql = "SELECT * FROM animal "
                   + "WHERE nome ILIKE ? "
                   + "ORDER BY nome"; 
        } else {
            sql = "SELECT * FROM animal "
                   + "WHERE especie ILIKE ? "
                   + "ORDER BY nome"; 
        }
    }//GEN-LAST:event_cbmPesquisarPorActionPerformed

    private void btnAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTabelaActionPerformed
        atualizarTabela();
        txtPesquisar.setText("");
        txtPesquisar.requestFocus();
    }//GEN-LAST:event_btnAtualizarTabelaActionPerformed

    private void btnSairConsultaAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairConsultaAnimaisActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairConsultaAnimaisActionPerformed

    private void btnExcluirConsultaAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirConsultaAnimalActionPerformed
        int linha = tabConsultaAnimais.getSelectedRow();
        
        if(linha == -1){
          JOptionPane.showMessageDialog(this, "Selecione um animal para excluir");
          return;
        }
        
        int id = Integer.parseInt(tabConsultaAnimais.getValueAt(linha, 0).toString());
        
        int  resposta = JOptionPane.showConfirmDialog(this,"Deseja realmente excluir o animal do id " + id + " ?", "Confirmar Exclusão", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resposta != JOptionPane.YES_OPTION){
          return;
        }
        
        String sql = "DELETE FROM animal WHERE id = ?";
        
        try(Connection conex = Conexao.conectar();
             PreparedStatement stmt = conex.prepareStatement(sql)){
          
            stmt.setInt(1, id);
            
            int registros = stmt.executeUpdate();
            if(registros > 0){
               JOptionPane.showMessageDialog(this, "Animal excluido com sucesso!");
               atualizarTabela();
            } else{
               JOptionPane.showMessageDialog(this, "Animal nao encontrado");
            }
        } catch(SQLException erro){
           JOptionPane.showMessageDialog(this, "Erro ao excluir animal: " + erro.getMessage());
        }
    }//GEN-LAST:event_btnExcluirConsultaAnimalActionPerformed

    private void tabConsultaAnimaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabConsultaAnimaisMouseClicked
        // Vamos capturar a linha selecionada
        int linha = tabConsultaAnimais.getSelectedRow();
        
        // Se nao houver linha selecionada
        if(linha == -1){
         return;
        }
        
        // Vamos preencher os valores da coluna para os campos da tela
        txtId.setText(tabConsultaAnimais.getValueAt(linha, 0).toString());
        txtEspecie.setText(tabConsultaAnimais.getValueAt(linha, 1).toString());
        txtNome.setText(tabConsultaAnimais.getValueAt(linha, 2).toString());
        txtIdade.setText(tabConsultaAnimais.getValueAt(linha, 3).toString());
    }//GEN-LAST:event_tabConsultaAnimaisMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // capturar a linha selecionada
        int linha = tabConsultaAnimais.getSelectedRow();
        
        if(linha == -1){
          JOptionPane.showMessageDialog(this, "Selecione um animal da tabela para alterar");
          return;
        }
        
        // pegar o id da linha selecionada
        // o id nao sera alterado
        int id = Integer.parseInt(tabConsultaAnimais.getValueAt(linha, 0).toString());
        
        // vamos ler os novos valores digitados nos campos especie, nome, idade
        String especie = txtEspecie.getText().trim();
        String nome = txtEspecie.getText().trim();
        String IdadeTexto = txtEspecie.getText().trim();
        
        // validar se todos os campos estao preenchidos
        if (especie.isEmpty() || nome.isEmpty() || IdadeTexto.isEmpty()){
          JOptionPane.showMessageDialog(this, "Preencha todos os campos");
          return;
        }
        
        // Verificar se o idade é um numero inteiro valido
        int idade;
        
        try{
          idade = Integer.parseInt(IdadeTexto);
          
          if(idade < 0){
            JOptionPane.showMessageDialog(this, "A idade nao pode ser negativa");
            return;
          }
        } catch(NumberFormatException erro){
           JOptionPane.showMessageDialog(this, "A idade deve ser um numero inteiro");
           return;
        }
        
        // pedir confirmaçaõ antes de gravar no banco de dados
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja alterar os dados do animal de ID " + id + " ?", "Confirmar alteracao", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if( resposta != JOptionPane.YES_OPTION){
          return;
        }
        
        // alteramos apenas a especie, nome e idade
        // Where garante que somente o animal selecionado seja atualizado
        
        String sql = """
                     UPDATE animal SET especie = ?, nome = ?, idade = ? WHERE id = ?
                     """;
        
        try(Connection conex = Conexao.conectar();
             PreparedStatement stmt = conex.prepareStatement(sql)){
         // preencher os parametros(?) na mesma ordem do sql
         stmt.setString(1, especie);
         stmt.setString(2, nome);
         stmt.setInt(3, idade);
         stmt.setInt(4, id);
         
         // executamos a alteracao no banco de dados 
         int registros = stmt.executeUpdate();
         if(registros > 0){
           JOptionPane.showMessageDialog(this, "Animal alterado com sucesso!");
           atualizarTabela();
           txtId.setText("");
           txtEspecie.setText("");
           txtNome.setText("");
           txtIdade.setText("");
         }else {
           JOptionPane.showMessageDialog(this, "Animal nao encontrado");
         }
        }catch(SQLException erro){
          JOptionPane.showMessageDialog(this, "Erro ao alterar animal: " + erro.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

   
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmConsultaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultaAnimais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizarTabela;
    private javax.swing.JButton btnExcluirConsultaAnimal;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnSairConsultaAnimais;
    private javax.swing.JComboBox<String> cbmPesquisarPor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabConsultaAnimais;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
