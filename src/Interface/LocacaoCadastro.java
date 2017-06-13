/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Dados.Cliente;
import Dados.Imovel;
import Dados.Locacao;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pedrowarmlingbotelho
 */
public class LocacaoCadastro extends PadraoCadastro {

    ArrayList<Locacao> listaLocacao;
    ArrayList<Imovel> listaImoveis;
    ArrayList<Cliente> listaCliente;
    javax.swing.JDesktopPane Desktop;

    /**
     * Creates new form CadLocacao
     *
     * @param listaLocacao
     * @param listaCliente
     * @param listaImoveis
     * @param Desktop
     */
    public LocacaoCadastro(ArrayList<Locacao> listaLocacao, ArrayList<Cliente> listaCliente, ArrayList<Imovel> listaImoveis, javax.swing.JDesktopPane Desktop) {
        this.listaLocacao = listaLocacao;
        this.listaImoveis = listaImoveis;
        this.listaCliente = listaCliente;
        this.Desktop = Desktop;
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

        painelC = new javax.swing.JPanel();
        lCliente = new javax.swing.JLabel();
        tCliente = new javax.swing.JTextField();
        lImovel = new javax.swing.JLabel();
        tImovel = new javax.swing.JTextField();
        lDataInicio = new javax.swing.JLabel();
        tDataInicio = new javax.swing.JFormattedTextField();
        lDataFim = new javax.swing.JLabel();
        tDataFim = new javax.swing.JFormattedTextField();
        bConsultarCliente = new javax.swing.JButton();
        bConsultarImovel = new javax.swing.JButton();
        lId = new javax.swing.JLabel();
        tId = new javax.swing.JTextField();

        setName("Adicionar Locação"); // NOI18N

        lCliente.setText("Id Cliente:");

        lImovel.setText("Id Imóvel:");

        lDataInicio.setText("Data de Inicio:");

        try {
            tDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lDataFim.setText("Data de Fim:");

        try {
            tDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        bConsultarCliente.setText("Consultar");
        bConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarClienteActionPerformed(evt);
            }
        });

        bConsultarImovel.setText("Consultar");
        bConsultarImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarImovelActionPerformed(evt);
            }
        });

        lId.setText("Id Locação:");

        javax.swing.GroupLayout painelCLayout = new javax.swing.GroupLayout(painelC);
        painelC.setLayout(painelCLayout);
        painelCLayout.setHorizontalGroup(
            painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCLayout.createSequentialGroup()
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lId))
                    .addGroup(painelCLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelCLayout.createSequentialGroup()
                                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lDataInicio)
                                    .addComponent(lImovel)
                                    .addComponent(lCliente))
                                .addGap(18, 18, 18)
                                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tCliente)
                                    .addComponent(tImovel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(tDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tId)))
                            .addGroup(painelCLayout.createSequentialGroup()
                                .addComponent(lDataFim)
                                .addGap(18, 18, 18)
                                .addComponent(tDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)))
                        .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bConsultarCliente)
                            .addComponent(bConsultarImovel))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        painelCLayout.setVerticalGroup(
            painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lId)
                    .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCliente)
                    .addComponent(tCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bConsultarCliente))
                .addGap(18, 18, 18)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lImovel)
                    .addComponent(tImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bConsultarImovel))
                .addGap(18, 18, 18)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDataInicio)
                    .addComponent(tDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDataFim)
                    .addComponent(tDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        getContentPane().add(painelC, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarClienteActionPerformed
        ClienteMostrar telaMostrarCliente = new ClienteMostrar(listaCliente);
        telaMostrarCliente.setVisible(true);
        this.Desktop.add(telaMostrarCliente, 0);
    }//GEN-LAST:event_bConsultarClienteActionPerformed

    private void bConsultarImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarImovelActionPerformed
        ImoveisMostrar telaMostrarImoveis = new ImoveisMostrar(listaImoveis);
        telaMostrarImoveis.setVisible(true);
        this.Desktop.add(telaMostrarImoveis, 0);
    }//GEN-LAST:event_bConsultarImovelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConsultarCliente;
    private javax.swing.JButton bConsultarImovel;
    private javax.swing.JLabel lCliente;
    private javax.swing.JLabel lDataFim;
    private javax.swing.JLabel lDataInicio;
    private javax.swing.JLabel lId;
    private javax.swing.JLabel lImovel;
    private javax.swing.JPanel painelC;
    private javax.swing.JTextField tCliente;
    private javax.swing.JFormattedTextField tDataFim;
    private javax.swing.JFormattedTextField tDataInicio;
    private javax.swing.JTextField tId;
    private javax.swing.JTextField tImovel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void bConfirmarActionPerformed(ActionEvent ae) {

        if ((tId.getText().equals(""))
                || (tCliente.getText().equals(""))
                || (tImovel.getText().equals(""))
                || (tDataInicio.getText().equals(""))
                || (tDataFim.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Por favor informe todos os campos!");
            return;
        }
        
        for (Locacao locacao : listaLocacao) {
            if (locacao.getId() == Integer.parseInt(tId.getText())) {
                JOptionPane.showMessageDialog(this, "Já existe uma locação com esse ID", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                tId.setText("");
                return;
            }
        }
        
        for (Cliente cliente : listaCliente) {
            if (cliente.getId() != Integer.parseInt(tCliente.getText())) {
                JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
                tCliente.setText("");
                return;
            }
        }
        
        for (Imovel imoveis : listaImoveis) {
            if (imoveis.getId() != Integer.parseInt(tImovel.getText())) {
                JOptionPane.showMessageDialog(null, "Imóvel não cadastrado");
                tImovel.setText("");
                return;
            }
        }

        Locacao locacao = new Locacao();
        locacao.setId(Integer.parseInt(tId.getText()));
        locacao.setIdCliente(tCliente.getText());
        locacao.setIdImovel(tImovel.getText());
        locacao.setDataInicio(tDataInicio.getText());
        locacao.setDataFim(tDataFim.getText());
        limparTela();
        listaLocacao.add(locacao);
        JOptionPane.showMessageDialog(null, "Itens inseridos com sucesso!");
    }

    @Override
    public void bLimparActionPerformed(ActionEvent ae) {
        limparTela();
    }

    @Override
    public void bCancelarActionPerformed(ActionEvent ae) {
        this.dispose();
    }

    public void limparTela() {
        tId.setText("");
        tCliente.setText("");
        tImovel.setText("");
        tDataInicio.setText("");
        tDataFim.setText("");
    }
}
