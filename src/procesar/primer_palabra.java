/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesar;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author sergi
 */
public class primer_palabra {

    public void PrimerPalabra() {
        Scanner sc = new Scanner(System.in);
        String texto = Vista.frm_interfaz.txt_area.getText();
        StringTokenizer tokens = new StringTokenizer(texto);
        String primerapalabra = tokens.nextToken();
        Vista.frm_interfaz.txt_ppalabra.setText(primerapalabra);
    }
}
