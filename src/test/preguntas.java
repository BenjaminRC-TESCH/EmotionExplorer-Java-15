/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author BENJAMIN RAYON CORONA
 */
public class preguntas extends javax.swing.JFrame {
    
    List<Integer> depresionQuestions = Arrays.asList(3, 5, 10, 13, 16, 17, 21, 24, 26, 31, 34, 37, 38, 42);
    List<Integer> ansiedadQuestions = Arrays.asList(2, 4, 7, 9, 15, 19, 20, 23, 25, 28, 30, 36, 40, 41);
    List<Integer> estresQuestions = Arrays.asList(1, 6, 8, 11, 12, 14, 18, 22, 27, 29, 32, 33, 35, 39);
    
    public static int depresion;
    public static int ansiedad;
    public static int estres;

    private int preguntaActual = 0; // Para llevar un seguimiento de la pregunta actual
    private List<Integer> respuestas = new ArrayList<>();
    private String[] preguntas = {
            "1. Me molesto por cosas muy triviales.",
            "2. Me di cuenta de que mi boca estaba seca.",
            "3. No lograba experimentar ningún sentimiento positivo en lo absoluto.",
            "4. Experimenté dificultad para respirar (por ejemplo, respiración excesivamente rápida, falta de aire en ausencia de esfuerzo físico)",
            "5. Simplemente parecía no poder seguir adelante.",
            "6. Tendía a reaccionar exageradamente a las situaciones",
            "7. Tenía la sensación de temblor (por ejemplo, piernas a punto de ceder)",
            "8. Me resultaba difícil relajarme",
            "9. Me encontré en situaciones que me producían tanta ansiedad que sentía un gran alivio cuando terminaban",
            "10. Sentía como si no tuviera deseos de nada",
            "11. Me di cuenta de que me irritaba con facilidad",
            "12. Sentía que me desgastaba más de la cuenta",
            "13. Me sentía triste y deprimido",
            "14. Me encontraba impaciente cuando me retrasaban de alguna manera.",
            "15. Tenía la sensación de que me iba a desmayar",
            "16. Sentía que había perdido interés en casi todo",
            "17. Sentía que no valía mucho como persona",
            "18. Sentía que estaba muy irritable",
            "19. Sudaba notablemente (por ejemplo, manos sudorosas) en ausencia de altas temperaturas o esfuerzo físico",
            "20. Me sentía asustado sin ninguna razón válida",
            "21. Sentía que la vida no tenía sentido",
            "22. Me resultaba difícil relajarme",
            "23. Tenía dificultad para tragar",
            "24. Parecía no poder disfrutar de las cosas que hacía",
            "25. Sentía mi corazón pesado pesea no estar haciendo esfuerzo físico (por ejemplo, sensación de aumento del ritmo cardíaco, latidos irregulares)",
            "26. Me sentía desanimado y triste",
            "27. Me encontraba muy irritable",
            "28. Sentía que estaba cerca del pánico",
            "29. Me resultaba difícil calmarme después de que algo me molestara",
            "30. Temía que me 'desestabilizara' alguna tarea trivial pero desconocida",
            "31. No podía entusiasmarme con nada",
            "32. Me resultaba difícil tolerar interrupciones en lo que estaba haciendo",
            "33. Estaba en un estado de tensión nerviosa",
            "34. Sentía que no valía mucho",
            "35. No toleraba nada que me impidiera seguir con lo que estaba haciendo",
            "36. Me sentía aterrorizado",
            "37. No veía nada en el futuro que me diera esperanzas",
            "38. Sentía que la vida carecía de sentido",
            "39. Me encontraba agitado",
            "40. Estaba preocupado por situaciones en las que podría entrar en pánico y hacer el ridículo",
            "41. Experimentaba temblores (por ejemplo, en las manos)",
            "42. Me costaba mantener la iniciativa para hacer las cosas"
    };

    public preguntas() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Test Salud Emocional");
        this.setResizable(false);

        Font customFont = new Font("Roboto Light", Font.PLAIN, 14);
        jOpcion0.setFont(customFont);
        jOpcion1.setFont(customFont);
        jOpcion2.setFont(customFont);
        jOpcion3.setFont(customFont);


        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo_cetis96.png")).getImage());
        mostrarPregunta();
    }

    public String StrToHtml() {
        return "<html><p>" + preguntas + "</p></html>";
    }

    private void mostrarPregunta() {
        if (preguntaActual < preguntas.length) {
            // Dividir el texto de la pregunta en líneas si es demasiado largo
            String pregunta = preguntas[preguntaActual];
            int tamanoLinea = 60; // Nueva longitud de línea
            if (pregunta.length() > tamanoLinea) {
                String[] lineas = dividirTexto(pregunta, tamanoLinea); // Divide en líneas cada 61 caracteres
                StringBuilder preguntaFormateada = new StringBuilder("<html>");
                for (String linea : lineas) {
                    preguntaFormateada.append(linea).append("<br>");
                }
                preguntaFormateada.append("</html>");
                jPregunta.setText(preguntaFormateada.toString());
            } else {
                jPregunta.setText(pregunta);
            }
            limpiarRadioButtons();
            this.jAceptar.setEnabled(false);
        } else {
            for (int i = 0; i < respuestas.size(); i++) {
                System.out.println("Pregunta " + (i + 1) + ": " + respuestas.get(i));
            }

            /*
            resultados resultado = new resultados();
            resultado.setVisible(true);
            this.setVisible(false);
             */
            
            System.out.println(estres);
            System.out.println(depresion);
            System.out.println(ansiedad);
            resultados resultados = new resultados();
            resultados.setVisible(true);
            this.setVisible(false);

        }
    }

// Función para dividir un texto en líneas de un tamaño dado
    private String[] dividirTexto(String texto, int tamanoLinea) {
        List<String> lineas = new ArrayList<>();
        String[] palabras = texto.split(" "); // Dividir el texto en palabras

        StringBuilder lineaActual = new StringBuilder();

        for (String palabra : palabras) {
            if (lineaActual.length() + palabra.length() <= tamanoLinea) {
                lineaActual.append(palabra).append(" "); // Agregar palabra a la línea actual
            } else {
                lineas.add(lineaActual.toString()); // Agregar línea completa a la lista
                lineaActual = new StringBuilder(palabra + " "); // Comenzar una nueva línea con la palabra actual
            }
        }

        // Agregar la última línea al resultado
        if (lineaActual.length() > 0) {
            lineas.add(lineaActual.toString());
        }

        return lineas.toArray(new String[0]);
    }

    private void guardarRespuesta() {
    int respuesta = -1; // Inicializamos la respuesta como -1 para detectar si no se seleccionó ninguna opción

    if (jOpcion0.isSelected()) {
        respuesta = 0;
    } else if (jOpcion1.isSelected()) {
        respuesta = 1;
    } else if (jOpcion2.isSelected()) {
        respuesta = 2;
    } else if (jOpcion3.isSelected()) {
        respuesta = 3;
    }

    respuestas.add(respuesta);

    // Verificar en qué categoría cae la pregunta actual y agregar la respuesta a la variable correspondiente
    if (depresionQuestions.contains(preguntaActual + 1)) {
        depresion += respuesta;
    } else if (ansiedadQuestions.contains(preguntaActual + 1)) {
        ansiedad += respuesta;
    } else if (estresQuestions.contains(preguntaActual + 1)) {
        estres += respuesta;
    }
}

   
    private void limpiarRadioButtons() {
        /*
        jOpcion0.setSelected(false);
        jOpcion1.setSelected(false);
        jOpcion2.setSelected(false);
        jOpcion3.setSelected(false);
        jOpcion4.setSelected(false);
         */

        buttonGroup1.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jPregunta = new javax.swing.JLabel();
        jOpcion0 = new test.RadioButtonCustom();
        jOpcion1 = new test.RadioButtonCustom();
        jOpcion2 = new test.RadioButtonCustom();
        jOpcion3 = new test.RadioButtonCustom();
        jAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 500));

        jTitulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jTitulo.setText("Responde");

        jPregunta.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N

        buttonGroup1.add(jOpcion0);
        jOpcion0.setText("No se aplicó en absoluto a mí - NUNCA");
        jOpcion0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcion0ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jOpcion1);
        jOpcion1.setText("Se aplicó en cierto grado, o parte del tiempo - A VECES");
        jOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcion1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jOpcion2);
        jOpcion2.setText("Se aplicó en gran medida, o buena parte del tiempo - A MENUDO");
        jOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcion2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jOpcion3);
        jOpcion3.setText("Se aplicó mucho, o la mayor parte del tiempo - CASI SIEMPRE");
        jOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcion3ActionPerformed(evt);
            }
        });

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
                .addGap(222, 222, 222)
                .addComponent(jAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jOpcion0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTitulo)
                        .addGap(231, 231, 231))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jTitulo)
                .addGap(46, 46, 46)
                .addComponent(jPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jOpcion0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAceptarActionPerformed
        guardarRespuesta();
        preguntaActual++;
        mostrarPregunta();
        System.out.println(respuestas);
    }//GEN-LAST:event_jAceptarActionPerformed

    private void jOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcion3ActionPerformed
        this.jAceptar.setEnabled(true);
    }//GEN-LAST:event_jOpcion3ActionPerformed

    private void jOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcion2ActionPerformed
        this.jAceptar.setEnabled(true);
    }//GEN-LAST:event_jOpcion2ActionPerformed

    private void jOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcion1ActionPerformed
        this.jAceptar.setEnabled(true);
    }//GEN-LAST:event_jOpcion1ActionPerformed

    private void jOpcion0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcion0ActionPerformed
        this.jAceptar.setEnabled(true);
    }//GEN-LAST:event_jOpcion0ActionPerformed

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
            java.util.logging.Logger.getLogger(preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new preguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jAceptar;
    private test.RadioButtonCustom jOpcion0;
    private test.RadioButtonCustom jOpcion1;
    private test.RadioButtonCustom jOpcion2;
    private test.RadioButtonCustom jOpcion3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPregunta;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
