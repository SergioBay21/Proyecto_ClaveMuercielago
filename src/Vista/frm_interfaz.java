/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergi
 */
public class frm_interfaz extends javax.swing.JFrame {

    public frm_interfaz() {
        initComponents();
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        btn_procesar = new javax.swing.JButton();
        lbl_longitud = new javax.swing.JLabel();
        txt_longitud = new javax.swing.JTextField();
        lbl_palabras = new javax.swing.JLabel();
        txt_palabras = new javax.swing.JTextField();
        lbl_pletra = new javax.swing.JLabel();
        txt_pletra = new javax.swing.JTextField();
        lbl_uletra = new javax.swing.JLabel();
        txt_uletra = new javax.swing.JTextField();
        lbl_ppalabra = new javax.swing.JLabel();
        txt_ppalabra = new javax.swing.JTextField();
        txt_letram = new javax.swing.JTextField();
        lbl_letram = new javax.swing.JLabel();
        lbl_mpalabra = new javax.swing.JLabel();
        txt_mpalabra = new javax.swing.JTextField();
        lbl_upalabra = new javax.swing.JLabel();
        txt_upalabra = new javax.swing.JTextField();
        lbl_repi = new javax.swing.JLabel();
        txt_repi = new javax.swing.JTextField();
        lbl_repo = new javax.swing.JLabel();
        txt_repo = new javax.swing.JTextField();
        lbl_ppalabra1 = new javax.swing.JLabel();
        txt_ppares = new javax.swing.JTextField();
        txt_repu = new javax.swing.JTextField();
        lbl_repu = new javax.swing.JLabel();
        lbl_mpalabra1 = new javax.swing.JLabel();
        lbl_repa = new javax.swing.JLabel();
        txt_repa = new javax.swing.JTextField();
        lbl_repe = new javax.swing.JLabel();
        txt_pimpares = new javax.swing.JTextField();
        txt_repe = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_murcielago = new javax.swing.JTextArea();
        lbl_murcielago = new javax.swing.JLabel();
        menu_barra = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        menu_abrir = new javax.swing.JMenuItem();
        menu_guardar = new javax.swing.JMenuItem();
        menu_gurdar_como = new javax.swing.JMenuItem();
        menu_editar = new javax.swing.JMenu();
        menu_copiar = new javax.swing.JMenuItem();
        menu_cortar = new javax.swing.JMenuItem();
        menu_pegar = new javax.swing.JMenuItem();
        menu_buscar = new javax.swing.JMenuItem();
        menu_reemplazar = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        btn_procesar.setText("Procesar");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });

        lbl_longitud.setText("Longitud del Texto");

        lbl_palabras.setText("Total Palabras");

        lbl_pletra.setText("Primer Letra");

        lbl_uletra.setText("Ultima Letra");

        lbl_ppalabra.setText("Primera Palabra");

        lbl_letram.setText("Letra Media");

        lbl_mpalabra.setText("Palabra Media");

        lbl_upalabra.setText("Ultima Palabra");

        lbl_repi.setText("Repeticiones de i");

        lbl_repo.setText("Repeticiones de o");

        lbl_ppalabra1.setText("Palabras par");

        lbl_repu.setText("Repeticiones de u");

        lbl_mpalabra1.setText("Palabras impar");

        lbl_repa.setText("Repeticiones de a");

        lbl_repe.setText("Repeticiones de e");

        txt_murcielago.setColumns(20);
        txt_murcielago.setRows(5);
        jScrollPane2.setViewportView(txt_murcielago);

        lbl_murcielago.setText("Clave Murcielago");

        menu_archivo.setText("Archivo");

        menu_abrir.setText("Abrir");
        menu_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_abrirActionPerformed(evt);
            }
        });
        menu_archivo.add(menu_abrir);

        menu_guardar.setText("Guardar");
        menu_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_guardarActionPerformed(evt);
            }
        });
        menu_archivo.add(menu_guardar);

        menu_gurdar_como.setText("Guardar como");
        menu_gurdar_como.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_gurdar_comoActionPerformed(evt);
            }
        });
        menu_archivo.add(menu_gurdar_como);

        menu_barra.add(menu_archivo);

        menu_editar.setText("Editar");

        menu_copiar.setText("Copiar");
        menu_copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_copiarActionPerformed(evt);
            }
        });
        menu_editar.add(menu_copiar);

        menu_cortar.setText("Cortar");
        menu_cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cortarActionPerformed(evt);
            }
        });
        menu_editar.add(menu_cortar);

        menu_pegar.setText("Pegar");
        menu_pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_pegarActionPerformed(evt);
            }
        });
        menu_editar.add(menu_pegar);

        menu_buscar.setText("Buscar");
        menu_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buscarActionPerformed(evt);
            }
        });
        menu_editar.add(menu_buscar);

        menu_reemplazar.setText("Reemplazar");
        menu_reemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_reemplazarActionPerformed(evt);
            }
        });
        menu_editar.add(menu_reemplazar);

        menu_barra.add(menu_editar);

        setJMenuBar(menu_barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_pletra)
                                    .addComponent(lbl_letram))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(btn_procesar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lbl_upalabra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_upalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_letram, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_ppalabra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_ppalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lbl_uletra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_uletra, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_pletra, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_palabras)
                                                .addGap(60, 60, 60)
                                                .addComponent(txt_palabras))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_longitud)
                                                .addGap(38, 38, 38)
                                                .addComponent(txt_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_mpalabra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_mpalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_repi)
                                    .addComponent(lbl_repu)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_repu, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbl_ppalabra1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_ppares, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lbl_repo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                            .addComponent(txt_repo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_repi, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_repa)
                                                    .addComponent(lbl_repe))
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txt_repe)
                                                    .addComponent(txt_repa, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbl_mpalabra1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_pimpares, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_murcielago)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btn_procesar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_longitud)
                            .addComponent(txt_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_palabras)
                            .addComponent(txt_palabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_pletra)
                            .addComponent(txt_pletra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_uletra)
                            .addComponent(txt_uletra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_letram)
                            .addComponent(txt_letram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ppalabra)
                            .addComponent(txt_ppalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_mpalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_mpalabra)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_repa)
                            .addComponent(txt_repa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_repe)
                            .addComponent(txt_repe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_repi)
                            .addComponent(txt_repi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_repo)
                            .addComponent(txt_repo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_repu)
                            .addComponent(txt_repu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ppalabra1)
                            .addComponent(txt_ppares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pimpares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_mpalabra1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_upalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_upalabra))
                .addGap(13, 13, 13)
                .addComponent(lbl_murcielago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_gurdar_comoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_gurdar_comoActionPerformed
        archivo.guardar_como prin = new archivo.guardar_como();
        prin.GuardarComo();
    }//GEN-LAST:event_menu_gurdar_comoActionPerformed

    private void menu_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_abrirActionPerformed
        archivo.abrir_archivo prin = new archivo.abrir_archivo();
        prin.AbrirArchivo();
    }//GEN-LAST:event_menu_abrirActionPerformed

    private void menu_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_guardarActionPerformed
        archivo.guardar prin = new archivo.guardar();
        prin.Guardar();
    }//GEN-LAST:event_menu_guardarActionPerformed

    private void menu_copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_copiarActionPerformed

        editar.copiar.copiar_txt(txt_area.getSelectedText());
    }//GEN-LAST:event_menu_copiarActionPerformed

    private void menu_cortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cortarActionPerformed
        editar.cortar.cortar_txt(txt_area.getSelectedText());
        txt_area.replaceSelection("");
    }//GEN-LAST:event_menu_cortarActionPerformed

    private void menu_pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_pegarActionPerformed
        try {
            editar.pegar.pegar_txt();
            txt_area.replaceSelection(editar.pegar.pegar_txt());
        } catch (UnsupportedFlavorException ex) {
            Logger.getLogger(frm_interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_menu_pegarActionPerformed

    private void menu_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buscarActionPerformed
        frm_buscar frm = new frm_buscar();
        frm.show();
    }//GEN-LAST:event_menu_buscarActionPerformed

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        procesar.contar_letras prin = new procesar.contar_letras();
        prin.ContadorLetras();
        procesar.contar_palabras prin1 = new procesar.contar_palabras();
        prin1.ContadorPalabras();
        procesar.primer_letra prin2 = new procesar.primer_letra();
        prin2.PrimerLetra();
        procesar.ulitima_letra prin3 = new procesar.ulitima_letra();
        prin3.UltimaLetra();
        procesar.central_letra prin4 = new procesar.central_letra();
        prin4.LetraCentral();
        procesar.primer_palabra prin5 = new procesar.primer_palabra();
        prin5.PrimerPalabra();
        procesar.ultima_palabra prin6 = new procesar.ultima_palabra();
        prin6.UltimaPalabra();
        procesar.central_palabra prin7 = new procesar.central_palabra();
        prin7.PalabraCentral();
        procesar.central_palabra prin8 = new procesar.central_palabra();
        prin8.PalabraCentral(); 
        procesar.rep_a prin9 = new procesar.rep_a();
        prin9.RepeticionesA();
        procesar.rep_e prin10 = new procesar.rep_e();
        prin10.RepeticionesE();
        procesar.rep_ii prin11 = new procesar.rep_ii();
        prin11.RepeticionesI();
        procesar.rep_o prin12 = new procesar.rep_o();
        prin12.RepeticionesO();
        procesar.rep_u prin13 = new procesar.rep_u();
        prin13.RepeticionesU();
        procesar.palabras_pares prin14 = new procesar.palabras_pares();
        prin14.PalabrasPares();
        procesar.palabras_impares prin15 = new procesar.palabras_impares();
        prin15.PalabrasImpares();
        procesar.convertir_palabra prin16 = new procesar.convertir_palabra();
        prin16.ConvertirMurcielago();

        
 
    }//GEN-LAST:event_btn_procesarActionPerformed

    private void menu_reemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_reemplazarActionPerformed
        // TODO add your handling code here:
        frm_reemplazar frm = new frm_reemplazar();
        frm.show();
    }//GEN-LAST:event_menu_reemplazarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_procesar;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_letram;
    private javax.swing.JLabel lbl_longitud;
    private javax.swing.JLabel lbl_mpalabra;
    private javax.swing.JLabel lbl_mpalabra1;
    private javax.swing.JLabel lbl_murcielago;
    private javax.swing.JLabel lbl_palabras;
    private javax.swing.JLabel lbl_pletra;
    private javax.swing.JLabel lbl_ppalabra;
    private javax.swing.JLabel lbl_ppalabra1;
    private javax.swing.JLabel lbl_repa;
    private javax.swing.JLabel lbl_repe;
    private javax.swing.JLabel lbl_repi;
    private javax.swing.JLabel lbl_repo;
    private javax.swing.JLabel lbl_repu;
    private javax.swing.JLabel lbl_uletra;
    private javax.swing.JLabel lbl_upalabra;
    private javax.swing.JMenuItem menu_abrir;
    private javax.swing.JMenu menu_archivo;
    private javax.swing.JMenuBar menu_barra;
    private javax.swing.JMenuItem menu_buscar;
    private javax.swing.JMenuItem menu_copiar;
    private javax.swing.JMenuItem menu_cortar;
    private javax.swing.JMenu menu_editar;
    private javax.swing.JMenuItem menu_guardar;
    private javax.swing.JMenuItem menu_gurdar_como;
    private javax.swing.JMenuItem menu_pegar;
    private javax.swing.JMenuItem menu_reemplazar;
    public static javax.swing.JTextArea txt_area;
    public static javax.swing.JTextField txt_letram;
    public static javax.swing.JTextField txt_longitud;
    public static javax.swing.JTextField txt_mpalabra;
    public static javax.swing.JTextArea txt_murcielago;
    public static javax.swing.JTextField txt_palabras;
    public static javax.swing.JTextField txt_pimpares;
    public static javax.swing.JTextField txt_pletra;
    public static javax.swing.JTextField txt_ppalabra;
    public static javax.swing.JTextField txt_ppares;
    public static javax.swing.JTextField txt_repa;
    public static javax.swing.JTextField txt_repe;
    public static javax.swing.JTextField txt_repi;
    public static javax.swing.JTextField txt_repo;
    public static javax.swing.JTextField txt_repu;
    public static javax.swing.JTextField txt_uletra;
    public static javax.swing.JTextField txt_upalabra;
    // End of variables declaration//GEN-END:variables
}
