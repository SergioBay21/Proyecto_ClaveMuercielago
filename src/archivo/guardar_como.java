/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package archivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;


/**
 *
 * @author sergi
 */
public class guardar_como{

    public void GuardarComo() {
        String texto = Vista.frm_interfaz.txt_area.getText();
        JFileChooser guardarComo = new JFileChooser();
        guardarComo.setApproveButtonText("Guardar");
        guardarComo.showSaveDialog(null);
        File archivo = new File(guardarComo.getSelectedFile()+".txt");
        try{
            BufferedWriter salida = new BufferedWriter(new FileWriter(archivo));
            salida.write(texto);
            salida.close();
        }catch(Exception e){
            
        }
    }
}
