package test;

import javax.swing.ImageIcon;

/**
 *
 * @author BENJAMIN RAYON CORONA
 */
public class instrucciones extends javax.swing.JFrame {

    public instrucciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Test Salud Emocional");
        this.setResizable(false);

        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo_cetis96.png")).getImage());

        String instruccionesHTML = "<html>"
                + "<div style='text-align: justify; '>"
                + "El DASS-42 es una escala de autoinforme de 42 ítems diseñada para medir los estados emocionales negativos "
                + "de depresión, ansiedad y estrés. El valor principal del DASS en un entorno clínico es clarificar el locus de "
                + "la perturbación emocional, como parte de la tarea más amplia de evaluación clínica. La función esencial del "
                + "DASS es evaluar la gravedad de los síntomas principales de depresión, ansiedad y estrés. Dado que se ha demostrado "
                + "que las escalas del DASS tienen una alta consistencia interna y ofrecen discriminaciones significativas en una variedad "
                + "de entornos, las escalas deben satisfacer las necesidades tanto de investigadores como de clínicos que deseen medir el estado "
                + "actual o el cambio en el estado con el tiempo (por ejemplo, en el transcurso del tratamiento).<br>"
                + "<br>"
                + "Por favor, lea cada afirmación y elija un número 0, 1, 2 o 3 que indique cuánto se aplicó la afirmación a usted durante "
                + "la última semana. No hay respuestas correctas o incorrectas. No dedique demasiado tiempo a ninguna afirmación."
                + "</div></html>";

        jInstrucciones.setText(instruccionesHTML);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jInstrucciones = new javax.swing.JLabel();
        jComenzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 500));

        jTitulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jTitulo.setText("Instrucciones");

        jInstrucciones.setBackground(new java.awt.Color(255, 255, 255));
        jInstrucciones.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jComenzar.setBackground(new java.awt.Color(105, 20, 50));
        jComenzar.setForeground(new java.awt.Color(255, 255, 255));
        jComenzar.setText("Comenzar");
        jComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComenzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComenzar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(275, 275, 275))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTitulo)
                .addGap(40, 40, 40)
                .addComponent(jInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComenzarActionPerformed
        preguntas intereses = new preguntas();
        intereses.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jComenzarActionPerformed

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
            java.util.logging.Logger.getLogger(instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new instrucciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jComenzar;
    private javax.swing.JLabel jInstrucciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
