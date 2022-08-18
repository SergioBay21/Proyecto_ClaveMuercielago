/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesar;

/**
 *
 * @author sergi
 */
public class ulitima_letra {
    public void UltimaLetra(){
        String texto = Vista.frm_interfaz.txt_area.getText();
        char ul_letra = texto.charAt(texto.length() - 1);
        Vista.frm_interfaz.txt_uletra.setText("Ultima Letra: "+ul_letra);
    }
    
}
