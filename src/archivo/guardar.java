/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivo;

import java.io.FileWriter;

/**
 *
 * @author sergi
 */
public class guardar extends abrir_archivo {
    public void Guardar(){
        String texto = Vista.frm_interfaz.txt_area.getText();
        try{
            FileWriter Writer=new FileWriter("C:\\Users\\sergi\\OneDrive\\Escritorio\\txt_ejemplo.txt");
            Writer.write(texto);
            Writer.close();
        }catch(Exception e){
            
        }
    }
    

}
