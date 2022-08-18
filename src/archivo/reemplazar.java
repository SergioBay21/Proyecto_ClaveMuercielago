/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivo;

public class reemplazar {
    public void reemplazarpalabra(){
        String texto = Vista.frm_interfaz.txt_area.getText();
        String palabra = Vista.frm_reemplazar.txt_palabra.getText();
        String reemplazo = Vista.frm_reemplazar.txt_reemplazo.getText();
        
        Vista.frm_interfaz.txt_area.setText(texto.replaceAll(palabra, reemplazo));
    }
}
