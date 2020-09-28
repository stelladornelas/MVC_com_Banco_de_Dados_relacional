package loja.view;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal(){
        
        initComponents();
    }
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemConsultarClliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle Automático de Clientes");

        jMenu1.setText("Cadastrar");

        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultar");

        jMenuItemConsultarClliente.setText("Cliente");
        jMenuItemConsultarClliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarCllienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemConsultarClliente);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sair");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        TelaCadastroCliente tela = new TelaCadastroCliente();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed
    private void jMenuItemConsultarCllienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarCllienteActionPerformed
        TelaConsultaCliente tela_Consulta = new TelaConsultaCliente();
        tela_Consulta.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultarCllienteActionPerformed

      public static void main(String args[]) {
       
        java.awt.   EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemConsultarClliente;
    // End of variables declaration//GEN-END:variables
}
