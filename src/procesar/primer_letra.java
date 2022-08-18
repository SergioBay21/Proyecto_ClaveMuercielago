/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesar;

/**
 *
 * @author sergi
 */
public class primer_letra {
    public void PrimerLetra(){
        String texto = Vista.frm_interfaz.txt_area.getText();
        char primer_letra = texto.charAt(0);
        Vista.frm_interfaz.txt_pletra.setText("Primer letra: "+primer_letra);
    }
}
