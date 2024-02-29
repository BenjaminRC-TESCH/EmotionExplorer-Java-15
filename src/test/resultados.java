/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author BENJAMIN RAYON CORONA
 */
public class resultados extends javax.swing.JFrame {

    JFreeChart chart;

    public static int depresionR;
    public static int ansiedadR;
    public static int estresR;

    public static String depresionString;
    public static String ansiedadString;
    public static String estresString;

    public resultados() {

        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Test Salud Emocional");
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo_cetis96.png")).getImage());

        crearGrafico();
        calcularAreasIntereses();
        ChartPanel panel = new ChartPanel(chart, false);
        panel.setPreferredSize(new Dimension(550, 320));

        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(panel, BorderLayout.CENTER);

    }

    public int convertirValor(int valorOriginal) {
        if (valorOriginal == 0) {
            return 0;
        } else if (valorOriginal == 1) {
            return 4;
        } else if (valorOriginal == 2) {
            return 8;
        } else if (valorOriginal == 3) {
            return 13;
        } else if (valorOriginal == 4) {
            return 17;
        } else if (valorOriginal == 5) {
            return 21;
        } else if (valorOriginal == 6) {
            return 25;
        } else if (valorOriginal == 7) {
            return 29;
        } else if (valorOriginal == 8) {
            return 33;
        } else if (valorOriginal == 9) {
            return 38;
        } else if (valorOriginal == 10) {
            return 42;
        } else if (valorOriginal == 11) {
            return 46;
        } else if (valorOriginal == 12) {
            return 50;
        } else if (valorOriginal == 13) {
            return 54;
        } else if (valorOriginal == 14) {
            return 58;
        } else if (valorOriginal == 15) {
            return 63;
        } else if (valorOriginal == 16) {
            return 67;
        } else if (valorOriginal == 17) {
            return 71;
        } else if (valorOriginal == 18) {
            return 75;
        } else if (valorOriginal == 19) {
            return 79;
        } else if (valorOriginal == 20) {
            return 83;
        } else if (valorOriginal == 21) {
            return 89;
        } else if (valorOriginal == 22) {
            return 92;
        } else if (valorOriginal == 23) {
            return 96;
        } else if (valorOriginal == 24) {
            return 100;
        } else {
            return valorOriginal;
        }
    }

    public void crearGrafico() {
        preguntas intereses = new preguntas();

        DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();

        preguntas resultados = new preguntas();

        depresionR = resultados.depresion;
        ansiedadR = resultados.ansiedad;
        estresR = resultados.estres;

        dataset1.addValue(depresionR, "", "Depresión");
        dataset1.addValue(ansiedadR, "", "Ansiedad");
        dataset1.addValue(estresR, "", "Estres");

        dataset1.addValue(42, "", "");

        chart = ChartFactory.createBarChart3D(
                "", // chart title
                "", // domain axis label
                "", // range axis label
                dataset1, // data
                PlotOrientation.VERTICAL,
                true, // include legend
                true,
                false
        );

        /*
        ValueAxis axis2 = new NumberAxis3D("Kia (Marca especial)");
        
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeAxis(1, axis2);
        plot.setDataset(1, dataset2);
        plot.mapDatasetToRangeAxis(1, 1);
        
        CategoryItemRenderer renderer2 = new LineAndShapeRenderer();
        renderer2.setSeriesPaint(0, Color.red);
        plot.setRenderer(1, renderer2);
         */
    }

    public void calcularAreasIntereses() {

        // Determinar el rango de la variable depresion
        if (depresionR >= 0 && depresionR <= 9) {
            depresionString = "Las puntuaciones indican la presencia de síntomas depresivos normales. Esto sugiere que actualmente no estás experimentando una cantidad significativa de síntomas depresivos. Sin embargo, es importante seguir monitoreando tu bienestar emocional y buscar apoyo si notas algún cambio en tus síntomas o en tu estado de ánimo.";
        } else if (depresionR >= 10 && depresionR <= 13) {
            depresionString = "Las puntuaciones indican la presencia de síntomas depresivos leves. Es posible que estés experimentando algunos sentimientos de tristeza o desánimo, pero estos no están interfiriendo significativamente con tu funcionamiento diario. Es importante prestar atención a cómo te sientes y considerar estrategias para cuidar tu bienestar emocional.";
        } else if (depresionR >= 14 && depresionR <= 20) {
            depresionString = "Las puntuaciones indican la presencia de síntomas depresivos moderados. Es posible que estés experimentando un nivel notable de tristeza, desesperanza o falta de interés en actividades que antes disfrutabas. Considera buscar apoyo profesional para explorar formas de manejar estos síntomas y mejorar tu bienestar emocional.";
        } else if (depresionR >= 21 && depresionR <= 27) {
            depresionString = "Las puntuaciones indican la presencia de síntomas depresivos severos. Es posible que estés experimentando una angustia significativa y que los síntomas estén afectando seriamente tu capacidad para funcionar en la vida diaria. Es importante buscar ayuda profesional lo antes posible para recibir apoyo y tratamiento adecuado.";
        } else {
            depresionString = "Las puntuaciones indican la presencia de síntomas depresivos graves. Es probable que estés experimentando una gran cantidad de angustia emocional y que los síntomas estén teniendo un impacto significativo en todos los aspectos de tu vida. Es crucial buscar ayuda profesional de inmediato para recibir el apoyo y tratamiento necesario.";
        }

        // Determinar el rango de la variable ansiedad
        if (ansiedadR >= 0 && ansiedadR <= 7) {
            ansiedadString = "Por otro lado, existe las presencia de síntomas de ansiedad normales. Esto sugiere que actualmente no estás experimentando una cantidad significativa de síntomas de ansiedad. Sin embargo, es importante estar atento a cualquier cambio en tus niveles de ansiedad y buscar apoyo si es necesario.";
        } else if (ansiedadR >= 8 && ansiedadR <= 9) {
            ansiedadString = "Por otro lado, existe las presencia de síntomas de ansiedad leves. Puede que estés experimentando cierto nivel de nerviosismo o preocupación, pero esto no está interfiriendo en gran medida con tu funcionamiento diario. Es importante practicar técnicas de manejo del estrés y buscar apoyo si los síntomas empeoran.";
        } else if (ansiedadR >= 10 && ansiedadR <= 14) {
            ansiedadString = "Por otro lado, existe las presencia de síntomas de ansiedad moderados. Puede que estés experimentando niveles significativos de nerviosismo, preocupación o tensión, lo que puede estar afectando tu bienestar emocional y tu capacidad para enfrentar situaciones estresantes. Considera buscar ayuda profesional para aprender estrategias de manejo de la ansiedad.";
        } else if (ansiedadR >= 15 && ansiedadR <= 19) {
            ansiedadString = "Por otro lado, existe las presencia de síntomas de ansiedad severos. Es posible que estés experimentando una cantidad significativa de angustia y que los síntomas estén interfiriendo en tu capacidad para funcionar en la vida diaria. Es importante buscar ayuda profesional lo antes posible para recibir apoyo y tratamiento adecuado.";
        } else {
            ansiedadString = "Por otro lado, existe las presencia de síntomas de ansiedad graves. Es probable que estés experimentando una cantidad abrumadora de angustia emocional y que los síntomas estén teniendo un impacto significativo en todos los aspectos de tu vida. Es crucial buscar ayuda profesional de inmediato para recibir el apoyo y tratamiento necesario.";
        }

        // Determinar el rango de la variable estres
        if (estresR >= 0 && estresR <= 14) {
            estresString = "Finalmente los sintomas de estrés están dentro de un rango normal. Esto sugiere que actualmente no estás experimentando una cantidad significativa de estrés. Sin embargo, es importante mantener prácticas saludables de manejo del estrés y buscar apoyo si sientes que estás luchando para manejar las demandas de la vida diaria.";
        } else if (estresR >= 15 && estresR <= 18) {
            estresString = "Finalmente los sintomas de estrés están dentro de un rango leve. Puede que estés experimentando cierta tensión o presión, pero esto no está interfiriendo en gran medida con tu funcionamiento diario. Es importante practicar técnicas de manejo del estrés y autocuidado para mantener un equilibrio saludable.";
        } else if (estresR >= 19 && estresR <= 25) {
            estresString = "Finalmente los sintomas de estrés están dentro de un rango moderado. Puede que estés experimentando una cantidad significativa de tensión o presión, lo que puede estar afectando tu bienestar emocional y tu capacidad para enfrentar situaciones estresantes. Considera buscar apoyo profesional y aprender estrategias de manejo del estrés.";
        } else if (estresR >= 26 && estresR <= 33) {
            estresString = "Finalmente los sintomas de estrés están dentro de un rango severo. Es posible que estés experimentando una gran cantidad de angustia y que los síntomas de estrés estén afectando seriamente tu capacidad para funcionar en la vida diaria. Es importante buscar ayuda profesional lo antes posible para recibir apoyo y tratamiento adecuado.";
        } else {
            estresString = "Finalmente los sintomas de estrés están dentro de un rango grave. Es probable que estés experimentando una cantidad abrumadora de angustia emocional y que los síntomas de estrés estén teniendo un impacto significativo en todos los aspectos de tu vida. Es crucial buscar ayuda profesional de inmediato para recibir el apoyo y tratamiento necesario.";
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setText("Resultados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jAceptar.setBackground(new java.awt.Color(105, 20, 50));
        jAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jAceptar.setText("Aceptar");
        jAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAceptarActionPerformed
        reporte reporte = new reporte();
        reporte.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
