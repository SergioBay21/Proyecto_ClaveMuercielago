/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesar;

/**
 *
 * @author sergi
 */
public class rep_o {

public void RepeticionesO() {
        String texto = Vista.frm_interfaz.txt_area.getText();
        char letra1;
        char letra2;
        char letra3;
        letra1 = 'o';
        letra2 = 'O';
        letra3 = 'ó';
        int n_a=0;
        for (int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) == letra1){
                n_a++;
            } else if (texto.charAt(i) == letra2){
                n_a++;
            }else if (texto.charAt(i) == letra3){
                n_a++;
            }
        }
        String n_veces = String.valueOf(n_a);
        Vista.frm_interfaz.txt_repo.setText(n_veces);
      }
}
