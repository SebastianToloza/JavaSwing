package VIsta;

import Controlador.Controlador;
import java.awt.Color;
import javax.swing.JPanel;
public class FormularioRegistro extends javax.swing.JFrame {

    public FormularioRegistro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Mostrador = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelTituolo = new javax.swing.JLabel();
        LabelSerial = new javax.swing.JLabel();
        CampoSerial = new javax.swing.JTextField();
        BotonRegistro = new javax.swing.JButton();
        LabelModelo = new javax.swing.JLabel();
        CampoModelo = new javax.swing.JTextField();
        Cambio = new javax.swing.JLabel();
        BotonImprimir = new javax.swing.JButton();
        AdvertenciaSerial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        Mostrador.setText("hola");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Mostrador, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Mostrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        LabelTituolo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelTituolo.setForeground(new java.awt.Color(0, 0, 0));
        LabelTituolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTituolo.setText("Registro vehiculo");

        LabelSerial.setForeground(new java.awt.Color(0, 0, 0));
        LabelSerial.setText("Digite el serial del Vehiculo");

        CampoSerial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoSerialFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoSerialFocusLost(evt);
            }
        });
        CampoSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSerialActionPerformed(evt);
            }
        });

        BotonRegistro.setText("Registrat");
        BotonRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistroMouseClicked(evt);
            }
        });
        BotonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroActionPerformed(evt);
            }
        });

        LabelModelo.setForeground(new java.awt.Color(0, 0, 0));
        LabelModelo.setText("Digite modelo del vehiculo");

        Cambio.setForeground(new java.awt.Color(0, 0, 0));

        BotonImprimir.setText("Imprimir");
        BotonImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonImprimirMouseClicked(evt);
            }
        });

        AdvertenciaSerial.setForeground(new java.awt.Color(204, 0, 0));
        AdvertenciaSerial.setText("holas");
        AdvertenciaSerial.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(LabelTituolo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(CampoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(LabelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AdvertenciaSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelSerial)
                                    .addComponent(CampoSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addComponent(Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BotonImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonRegistro)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LabelTituolo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(AdvertenciaSerial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSerial)
                        .addGap(18, 18, 18)
                        .addComponent(CampoSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(LabelModelo)))
                .addGap(18, 18, 18)
                .addComponent(CampoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegistro)
                    .addComponent(BotonImprimir))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //---------------------------------------------------------------------------------
    private void CampoSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSerialActionPerformed
    }//GEN-LAST:event_CampoSerialActionPerformed

    private void BotonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroActionPerformed
    }//GEN-LAST:event_BotonRegistroActionPerformed
    //---------------------------------------------------------------------------------
    
    
    
    
    private void BotonRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistroMouseClicked
        String auxSereal = CampoSerial.getText();
        String auxModelo =CampoModelo.getText();
        int auxSerial = Integer.parseInt(auxSereal);
        Controlador objControlador = new Controlador();
        objControlador.crearCarro(auxSerial, auxModelo);
    }//GEN-LAST:event_BotonRegistroMouseClicked

    
    
    private void CampoSerialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoSerialFocusGained
       
    }//GEN-LAST:event_CampoSerialFocusGained

    
    
    private void BotonImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonImprimirMouseClicked
      resultado objResultad= new resultado();
      objResultad.setVisible(true);    
        Controlador objControlador = new Controlador();
        System.out.println(objControlador.impromirInformacion().size());
        for(int i = 0 ; i<objControlador.impromirInformacion().size() ; i++){
            objResultad.imprimir("SSSSSSSSSSSSSss");
            String modeloVehiculo =objControlador.impromirInformacion().get(i).getModelo_vehivulo();
            int serialVehiculo=objControlador.impromirInformacion().get(i).getSerial_vehiculo();
            Cambio.setText("Modelo:"+modeloVehiculo+" \nSerial: "+serialVehiculo);
       
        }
    }//GEN-LAST:event_BotonImprimirMouseClicked

    private void CampoSerialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoSerialFocusLost
        Controlador objControlador = new Controlador();
        String auxSereal = CampoSerial.getText();
        int auxSerial = Integer.parseInt(auxSereal);
            if(objControlador.impromirInformacion().size()==0){
                AdvertenciaSerial.setForeground(Color.green);   

                AdvertenciaSerial.setText("La Id agregada Es valida");

            }else{
                for (int i = 0; i < objControlador.impromirInformacion().size(); i++) {
                    if (objControlador.impromirInformacion().get(i).getSerial_vehiculo() != auxSerial && auxSerial != 0) {
                        AdvertenciaSerial.setText("hola");
                        System.out.println("holaa");

                    } else {
                        AdvertenciaSerial.setText("La Id agregada ya existe");

                    }

                }     
            }
            
            

    }//GEN-LAST:event_CampoSerialFocusLost

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdvertenciaSerial;
    private javax.swing.JButton BotonImprimir;
    private javax.swing.JButton BotonRegistro;
    private javax.swing.JLabel Cambio;
    private javax.swing.JTextField CampoModelo;
    private javax.swing.JTextField CampoSerial;
    private javax.swing.JLabel LabelModelo;
    private javax.swing.JLabel LabelSerial;
    private javax.swing.JLabel LabelTituolo;
    private javax.swing.JLabel Mostrador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
