/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesar;

/**
 *
 * @author sergi
 */
public class convertir_palabra{
    public void ConvertirMurcielago(){
        String texto = Vista.frm_interfaz.txt_area.getText().toUpperCase();

        String murci = texto
                .replace("M", "0")
                .replace("U", "1")
                .replace("R", "2")
                .replace("C", "3")
                .replace("I", "4")
                .replace("E", "5")
                .replace("L", "6")
                .replace("A", "7")
                .replace("G", "8")
                .replace("O", "9");

        Vista.frm_interfaz.txt_murcielago.setText(murci);
    }
}
