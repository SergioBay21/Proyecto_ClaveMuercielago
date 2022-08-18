/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesar;

/**
 *
 * @author sergi
 */
public class contar_letras {
    public void ContadorLetras(){
        int s;
        s = Vista.frm_interfaz.txt_area.getText().length();
        String log = String.valueOf(s);
        Vista.frm_interfaz.txt_longitud.setText("Letras: "+log);
}
    
}
