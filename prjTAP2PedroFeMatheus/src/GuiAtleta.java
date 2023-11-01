
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 0031432312005
 */
public class GuiAtleta extends javax.swing.JFrame {

    private Component frame;

    /**
     * Creates new form GuiAtleta
     */
    public GuiAtleta() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("CPF");

        jLabel2.setText("Nome");

        jLabel3.setText("Idade");

        jLabel4.setText("Altura");

        jLabel5.setText("Peso");

        jTextField1.setName("txtCpf"); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEnabled(false);
        jTextField2.setName("txtNome"); // NOI18N

        jTextField3.setEnabled(false);
        jTextField3.setName("txtIdade"); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setEnabled(false);
        jTextField4.setName("txtAltura"); // NOI18N

        jTextField5.setEnabled(false);
        jTextField5.setName("txtPeso"); // NOI18N

        jButton1.setText("Consultar");
        jButton1.setName("btnConsultar"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Incluir");
        jButton2.setEnabled(false);
        jButton2.setName("btnincluir"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Alterar");
        jButton3.setEnabled(false);
        jButton3.setName("btnAlterar"); // NOI18N

        jButton4.setText("Excluir");
        jButton4.setEnabled(false);
        jButton4.setName("btnExcluir"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Sair");
        jButton5.setName("btnSair"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(46, 46, 46)
                        .addComponent(jButton2)
                        .addGap(58, 58, 58)
                        .addComponent(jButton3)
                        .addGap(66, 66, 66)
                        .addComponent(jButton4)
                        .addGap(70, 70, 70)
                        .addComponent(jButton5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(25, 25, 25)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(28, 28, 28)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(35, 35, 35)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String cpf = jTextField1.getText();

        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement("DELETE FROM tblAtleta WHERE CPF = ?");
            ps.setString(1, cpf);
            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(frame, "Atleta excluído com sucesso.");
            } else {
                JOptionPane.showMessageDialog(frame, "Nenhum atleta foi excluído. Verifique o CPF.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        // Limpa os campos após a exclusão
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");

        // Restaura a GUI para uma nova operação de consulta
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(false);
        jTextField5.setEnabled(false);
        jTextField1.requestFocus();

        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        String Cpf = jTextField1.getText();
        String nome = jTextField2.getText();
        int idade = Integer.parseInt(jTextField3.getText());
        double altura = Double.parseDouble(jTextField4.getText());
        double peso = Double.parseDouble(jTextField5.getText());

        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement("UPDATE tblAtleta SET Nome = ?, Idade = ?, Altura = ?, Peso = ? WHERE CPF = ?");
            ps.setString(1, nome);
            ps.setInt(2, idade);
            ps.setDouble(3, altura);
            ps.setDouble(4, peso);
            ps.setString(5, Cpf);
            int rowsUpdated = ps.executeUpdate();
            
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(frame, "Atleta alterado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(frame, "Nenhum atleta foi alterado. Verifique o CPF.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        // Limpa os campos após a alteração
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");

        // Restaura a GUI para uma nova operação de consulta
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(false);
        jTextField5.setEnabled(false);
        jTextField1.requestFocus();

        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Atleta atleta = null;
        String Cpf = jTextField1.getText(); // Supondo que txtCpf seja o campo de entrada para o CPF

        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement("SELECT * FROM tblAtleta WHERE CPF = ?");
            ps.setString(1, Cpf); // Estou assumindo que o CPF é uma string
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                atleta = new Atleta(rs.getString("CPF"), rs.getString("Nome"));
                atleta.setIdade(rs.getInt("Idade"));
                atleta.setAltura(rs.getDouble("Altura"));
                atleta.setPeso(rs.getDouble("Peso"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        if (atleta == null) {
            // Prepara a GUI para a operação de inclusão
            jTextField1.setEnabled(false);
            jTextField2.setEnabled(true);
            jTextField3.setEnabled(true);
            jTextField4.setEnabled(true);
            jTextField5.setEnabled(true);
            jTextField2.requestFocus();

            jButton1.setEnabled(false);
            jButton2.setEnabled(true);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
        } else {
            // Prepara a GUI para a operação de alteração ou exclusão
            jTextField2.setText(atleta.getNome());
            jTextField3.setText(String.valueOf(atleta.getIdade()));
            jTextField4.setText(String.valueOf(atleta.getAltura()));
            jTextField5.setText(String.valueOf(atleta.getPeso()));

            jTextField1.setEnabled(false);
            jTextField2.setEnabled(true);
            jTextField3.setEnabled(true);
            jTextField4.setEnabled(true);
            jTextField5.setEnabled(true);
            jTextField2.requestFocus();

            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   // Inicia a conexão com o banco de dados
        try{
             //Caregar o driver de conexão com o banco de dados
             Class.forName("oracle.jdbc.driver.OracleDriver");
        
             //Estabelece a conexão com o banco de dados Oracle  
                                                        
             connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.6:1521:xe",
                                                       "BD2312005",
                                                       "BD2312005");
             System.out.println("Conexão OK");
        }catch(Exception ex){
            System.out.println("Falha na conexão");
            System.out.println(ex.toString() + ex.getMessage());
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // Encerra a conexão com o banco de dados
        try {
            connection.close();
        }catch(Exception ex){
            System.out.println(ex.toString() + ex.getMessage());            
        }
    }//GEN-LAST:event_formWindowClosed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Atleta novoAtleta = new Atleta(jTextField1.getText(), jTextField2.getText());
        novoAtleta.setIdade(Integer.parseInt(jTextField3.getText()));
        novoAtleta.setAltura(Double.parseDouble(jTextField4.getText()));
        novoAtleta.setPeso(Double.parseDouble(jTextField5.getText() ));

        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement("INSERT INTO tblAtleta (CPF, Nome, Idade, Altura, Peso) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, novoAtleta.getCPF());
            ps.setString(2, novoAtleta.getNome());
            ps.setInt(3, novoAtleta.getIdade());
            ps.setDouble(4, novoAtleta.getAltura());
            ps.setDouble(5, novoAtleta.getPeso());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        // Limpa os campos após a inclusão
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");

        // Restaura a GUI para uma nova operação de consulta
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(false);
        jTextField5.setEnabled(false);
        jTextField1.requestFocus();

        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(GuiAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAtleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
    private Connection connection;
}
