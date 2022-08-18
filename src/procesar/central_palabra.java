/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesar;

import java.util.StringTokenizer;

/**
 *
 * @author sergi
 */
public class central_palabra {

    public void PalabraCentral() {
        String delim = " ";
        String texto = Vista.frm_interfaz.txt_area.getText();
        StringTokenizer token = new StringTokenizer(texto, delim);
        int contador = token.countTokens();
        int cantidad = contador/2;
        String[] sp = texto.split(" ");
        Vista.frm_interfaz.txt_mpalabra.setText("Palabra media: "+sp[cantidad]);
    }

}
