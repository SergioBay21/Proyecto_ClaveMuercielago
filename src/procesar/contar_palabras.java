/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesar;

/**
 *
 * @author sergi
 */
public class contar_palabras {
    public void ContadorPalabras(){
        String texto = Vista.frm_interfaz.txt_area.getText();
        String[] palabras = texto.split("\\s+");
        int c_letras = palabras.length;
        Vista.frm_interfaz.txt_palabras.setText("Palabras: "+c_letras);
    }
}
