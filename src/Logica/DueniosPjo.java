/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.Lecturatxt;
import Entidad.Duenios;
import java.util.List;
import javax.swing.JOptionPane;

public class DueniosPjo {
    public boolean buscarDuenioPorDni(String dniBuscado) {
        Lecturatxt leer=new Lecturatxt();
        
    for (Duenios duenio : leer.leerDuenios()) {
        if (duenio.getDni().equals(dniBuscado)) {
            return true;
        }
    }
    JOptionPane.showMessageDialog(null, "El dueño con DNI  no existe.", "Alerta", JOptionPane.WARNING_MESSAGE);
    return false;  // Retorna null si no se encuentra el dueño con el dni proporcionado
}
public String buscarNombreDuenioPorDni(String dniBuscado) {
    Lecturatxt leer =new Lecturatxt();
    for (Duenios duenio : leer.leerDuenios()) {
        if (duenio.getDni().equals(dniBuscado)) {
            return duenio.getNombre();
        }
    }
    
    return null;  // Retorna null si no se encuentra el dueño con el dni proporcionado
}

}
