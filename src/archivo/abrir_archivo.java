/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package archivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author sergi
 */
public class abrir_archivo {
    File leer_archivo;
    public String AbrirArchivo(){
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        leer_archivo = fc.getSelectedFile();
        if (leer_archivo.getName().endsWith("txt")) {
            try {
                FileReader fr = new FileReader(leer_archivo);
                BufferedReader br = new BufferedReader(fr);
                String texto = "";
                String linea_1 = "";
                while (((linea_1 = br.readLine()) != null)) {
                    texto +=linea_1+"\n" ;
                }
                Vista.frm_interfaz.txt_area.setText(texto);
            } catch (Exception e) {

            }

        } else {
            JOptionPane.showMessageDialog(null, "Archivo no admitido");
        }
        return null;
    }
}
