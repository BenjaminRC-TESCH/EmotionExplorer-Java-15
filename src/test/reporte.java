/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

import com.itextpdf.text.Chunk;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import static test.resultados.depresionString;

/**
 *
 * @author BENJAMIN RAYON CORONA
 */
public class reporte extends javax.swing.JFrame {

    public String nombre;
    String textoInforme;

    public reporte() {
        initComponents();
        datos datos = new datos();
        resultados resultados = new resultados();
        this.setLocationRelativeTo(null);
        setTitle("Test Salud Emocional");
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo_cetis96.png")).getImage());

        textoInforme = "Se realizó la evaluación a " + datos.nombre.toUpperCase() + " cuyos resultados se adjuntan en el archivo. De acuerdo a las puntuaciones obtenidas en cada escala:\n"
                + "\n"
                + resultados.depresionString +"\n"
                + "\n"
                + resultados.ansiedadString +"\n"
                + "\n"
                + resultados.estresString +"\n"
                + "\n"
                + "Los resultados de la prueba que has realizado son una herramienta útil para comprender mejor ciertos aspectos de tu salud mental, "
                + "pero no deben ser interpretados como un diagnóstico definitivo. Es crucial tener en cuenta que la interpretación precisa de estos resultados requiere la "
                + "opinión y orientación de un profesional de la salud mental debidamente capacitado.\n";
               
        jReporte.setText(textoInforme);
        jReporte.setCaretPosition(0);
        SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs, StyleConstants.ALIGN_JUSTIFIED);
        jReporte.getStyledDocument().setParagraphAttributes(0, textoInforme.length(), attribs, false);
        jReporte.setEditable(false);
        jReporte.setCursor(null);
        jReporte.setCaretColor(Color.WHITE);
        jScrollPane.getVerticalScrollBar().setValue(0);
        getContentPane().setBackground(Color.WHITE);
        jScrollPane.setVerticalScrollBar(new ScrollBarCustom());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jReporte = new javax.swing.JTextPane();
        JReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_cetis96.png"))); // NOI18N

        jScrollPane.setBorder(null);

        jReporte.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jScrollPane.setViewportView(jReporte);

        JReporte.setBackground(new java.awt.Color(105, 20, 50));
        JReporte.setForeground(new java.awt.Color(255, 255, 255));
        JReporte.setText("Generar Reporte");
        JReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(labelLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(JReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 225, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelLogo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(JReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JReporteActionPerformed
        Document documento = new Document(PageSize.A4, 72, 72, 36, 36);
        datos datos = new datos();
        String dateTime = DateTimeFormatter.ofPattern("MM/dd/yyy, hh:mm:ss a")
                .format(LocalDateTime.now());

        try {
            String ruta = System.getProperty("user.home");

            PdfWriter writer = PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + datos.nombre.toLowerCase() + " resultados test" + ".pdf"));

            documento.open();
            
            Image header = Image.getInstance("imagenes/logo.png");

            header.setAlignment(1);
            documento.add(header);
            documento.add(Chunk.NEWLINE);

            Paragraph titutlo = new Paragraph("Resultados de test salud emocional");
            titutlo.setAlignment(1);
            documento.add(titutlo);
            documento.add(Chunk.NEWLINE);

            documento.add(new Paragraph("Nombre del test: Inventario Herrera y Montes"));
            documento.add(new Paragraph("Nombre del alumno: " + datos.nombre.toUpperCase()));
            documento.add(new Paragraph("Fecha de aplicación de la prueba: " + dateTime));
            documento.add(Chunk.NEWLINE);

            Paragraph textoresultado = new Paragraph(textoInforme);
            textoresultado.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(textoresultado);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);

            Paragraph linea = new Paragraph("__________________________________");
            linea.setAlignment(1);
            documento.add(linea);

            Paragraph acargo = new Paragraph("Nombre y firma del aplicador");
            acargo.setAlignment(1);
            documento.add(acargo);
            
            String URL = "Resultados/" + datos.nombre.toLowerCase() + " resultados test" + ".pdf";

            ProcessBuilder p = new ProcessBuilder();
            p.command("cmd.exe", "/c", URL);
            p.start();

            documento.close();
            dispose();
            System.exit(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_JReporteActionPerformed

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
            java.util.logging.Logger.getLogger(reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JReporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextPane jReporte;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel labelLogo;
    // End of variables declaration//GEN-END:variables
}
