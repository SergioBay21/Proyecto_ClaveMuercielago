/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesar;

/**
 *
 * @author sergi
 */
public class palabras_impares {
    public void PalabrasImpares() {
        String str = Vista.frm_interfaz.txt_area.getText();
        char[] ch = str.toCharArray();
        int contador = 0;
        for (int i = 0; i < ch.length; i++) {
            String s = "";
            while (i < ch.length && ch[i] != ' ') {
                s = s + ch[i];
                i++;

                // if (s.length() % 2 == 0) {
                //}
            }
            if (s.length() % 2 != 0) {
                contador++;
            }
            String dato = String.valueOf(contador);
            Vista.frm_interfaz.txt_pimpares.setText(dato);
        }
    }
    
}
