/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Dados.Cliente;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pedrowarmlingbotelho
 */
public class ClienteEditar extends PadraoEditar {

    ArrayList<Cliente> listaCliente;
    javax.swing.JDesktopPane Desktop;

    /**
     * Creates new form ClienteEditar
     */
    public ClienteEditar(ArrayList<Cliente> listaCliente, javax.swing.JDesktopPane Desktop) {
        initComponents();
        this.listaCliente = listaCliente;
        this.Desktop = Desktop;
        bSalvar.setEnabled(false);
    }

    public void limparTela() {
        tId.setText("");
        tNome.setText("");
        tNascimento.setText("");
        tCPF.setText("");
        tTelefone.setText("");
        tfCEP.setText("");
        tEndereco.setText("");
        tCidade.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelC = new javax.swing.JPanel();
        cbEstado = new javax.swing.JComboBox<>();
        lCidade = new javax.swing.JLabel();
        lId = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        tNascimento = new javax.swing.JFormattedTextField();
        lEndereco = new javax.swing.JLabel();
        lCEP = new javax.swing.JLabel();
        lUF = new javax.swing.JLabel();
        lCpf = new javax.swing.JLabel();
        tId = new javax.swing.JTextField();
        tCidade = new javax.swing.JTextField();
        lNascimento = new javax.swing.JLabel();
        tCPF = new javax.swing.JFormattedTextField();
        tEndereco = new javax.swing.JTextField();
        lTelefone = new javax.swing.JLabel();
        tfCEP = new javax.swing.JFormattedTextField();
        lNome = new javax.swing.JLabel();
        tTelefone = new javax.swing.JFormattedTextField();
        bConsultar = new javax.swing.JButton();
        bConfirmar = new javax.swing.JButton();

        painelC.setName(""); // NOI18N
        painelC.setPreferredSize(new java.awt.Dimension(579, 400));

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SE", "SP", "TO" }));
        cbEstado.setSelectedIndex(17);

        lCidade.setText("Cidade:");

        lId.setText("Identificação:");

        try {
            tNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lEndereco.setText("Endereço:");

        lCEP.setText("CEP:");

        lUF.setText("UF:");

        lCpf.setText("CPF:");

        lNascimento.setText("Nascimento:");

        try {
            tCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lTelefone.setText("Telefone:");

        try {
            tfCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lNome.setText("Nome:");

        try {
            tTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        bConsultar.setText("Consultar");
        bConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarActionPerformed(evt);
            }
        });

        bConfirmar.setText("Confirmar");
        bConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCLayout = new javax.swing.GroupLayout(painelC);
        painelC.setLayout(painelCLayout);
        painelCLayout.setHorizontalGroup(
            painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCLayout.createSequentialGroup()
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lCidade)
                            .addComponent(lEndereco))
                        .addGap(18, 18, 18)
                        .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(lUF)
                        .addGap(18, 18, 18)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lCEP)
                        .addGap(18, 18, 18)
                        .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelCLayout.createSequentialGroup()
                        .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lTelefone)
                                    .addComponent(lCpf)
                                    .addComponent(lNascimento)
                                    .addComponent(lNome)))
                            .addGroup(painelCLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lId)))
                        .addGap(18, 18, 18)
                        .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bConfirmar)
                                .addGroup(painelCLayout.createSequentialGroup()
                                    .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(bConsultar))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        painelCLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bConfirmar, bConsultar});

        painelCLayout.setVerticalGroup(
            painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lId)
                    .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNascimento)
                    .addComponent(tNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCpf)
                    .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelefone)
                    .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCEP)
                    .addComponent(tfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEndereco)
                    .addComponent(tEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCidade)
                    .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUF)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        getContentPane().add(painelC, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarActionPerformed
        ClienteMostrar telaMostrarCliente = new ClienteMostrar(listaCliente);
        telaMostrarCliente.setVisible(true);
        this.Desktop.add(telaMostrarCliente, 0);
    }//GEN-LAST:event_bConsultarActionPerformed

    private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarActionPerformed
        try {
            if (tId.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Código não informado", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                limparTela();
                bSalvar.setEnabled(false);
                return;
            } else {
                for (Cliente cliente : listaCliente) {
                    if (cliente.getId() == Integer.parseInt(tId.getText())) {
                        tNome.setText(cliente.getNome());
                        tNascimento.setText(cliente.getNascimento());
                        tCPF.setText(cliente.getCpf());
                        tTelefone.setText(cliente.getTelefone());
                        tfCEP.setText(cliente.getCep());
                        tEndereco.setText(cliente.getEndereco());
                        tCidade.setText(cliente.getCidade());
                        cbEstado.setSelectedItem(cliente.getUf());
                        bSalvar.setEnabled(true);
                        tId.setEditable(false);
                        return;
                    }
                }
            }

            if (!bSalvar.isEnabled()) {
                JOptionPane.showMessageDialog(this, "Cliente não cadastrado", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                limparTela();
                bSalvar.setEnabled(false);
            }
        } catch (NumberFormatException ee) {
            JOptionPane.showMessageDialog(this, "Informe um número no campo 'Identificação'", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            limparTela();
            bSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_bConfirmarActionPerformed

    @Override
    public void bSalvarActionPerformed(ActionEvent ae) {
        for (Cliente clientes : listaCliente) {
            if (clientes.getId() == Integer.parseInt(tId.getText())) {
                clientes.setNome(tNome.getText());
                clientes.setNascimento(tNascimento.getText());
                clientes.setCpf(tCPF.getText());
                clientes.setTelefone(tTelefone.getText());
                clientes.setCep(tfCEP.getText());
                clientes.setEndereco(tEndereco.getText());
                clientes.setCidade(tCidade.getText());
                clientes.setUf((String) cbEstado.getSelectedItem());
                limparTela();
                bSalvar.setEnabled(true);
                tId.setEditable(true);
                JOptionPane.showMessageDialog(null, "As modificações foram salvas!");
            }
        }
        
        if (!bSalvar.isEnabled()) {
            JOptionPane.showMessageDialog(this, "Cliente não cadastrado", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            limparTela();
            bSalvar.setEnabled(false);
        }
    }

    @Override
    public void bLimparActionPerformed(ActionEvent ae) {
        limparTela();
    }

    @Override
    public void bCancelarActionPerformed(ActionEvent ae) {
        this.dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConfirmar;
    private javax.swing.JButton bConsultar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel lCEP;
    private javax.swing.JLabel lCidade;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lEndereco;
    private javax.swing.JLabel lId;
    private javax.swing.JLabel lNascimento;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lTelefone;
    private javax.swing.JLabel lUF;
    private javax.swing.JPanel painelC;
    private javax.swing.JFormattedTextField tCPF;
    private javax.swing.JTextField tCidade;
    private javax.swing.JTextField tEndereco;
    private javax.swing.JTextField tId;
    private javax.swing.JFormattedTextField tNascimento;
    private javax.swing.JTextField tNome;
    private javax.swing.JFormattedTextField tTelefone;
    private javax.swing.JFormattedTextField tfCEP;
    // End of variables declaration//GEN-END:variables
}
