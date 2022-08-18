/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesar;

/**
 *
 * @author sergi
 */
public class ultima_palabra {

    public void UltimaPalabra() {
        String texto =  Vista.frm_interfaz.txt_area.getText();
        String upalabra = texto.substring(texto.lastIndexOf(" ")+1);
        Vista.frm_interfaz.txt_upalabra.setText("Ultima palabra: "+upalabra);
    }

}
