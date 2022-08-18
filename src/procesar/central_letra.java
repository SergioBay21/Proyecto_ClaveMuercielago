/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesar;

/**
 *
 * @author sergi
 */
public class central_letra {
    public String LetraCentral(){
        String texto = Vista.frm_interfaz.txt_area.getText();
        int len = texto.length();
        int medio = len / 2;
        char letra_media = texto.charAt(medio);
        String media = Character.toString(letra_media);
        Vista.frm_interfaz.txt_letram.setText(media);
        return null;
    }
}
