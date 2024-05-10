/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Entidad.Duenios;
import Entidad.Mascotas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lucas
 */
public class Escrituratxt {
    public void registrarDuenio(Duenios duenio) {
    String rutaArchivo = "duenios.txt";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
        // Escribir los datos en el archivo separados por comas
        writer.write(duenio.getNombre() + "," + duenio.getCelular() + "," + duenio.getEdad() + "," + duenio.getDireccion() + "," + duenio.getDni() + "\n");

        System.out.println("Registro guardado exitosamente en " + rutaArchivo);
    } catch (IOException e) {
        System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
    }
}
    public void registrarMascota(Mascotas mascota) {
        // Ruta del archivo donde se guardarán los registros
        String rutaArchivo = "mascotas.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Escribir los datos en el archivo separados por comas
            writer.write(mascota.getDniDuenio() + "," + mascota.getNombre() + "," + mascota.getEdad() + "," + mascota.getCondicion() + "\n");

            System.out.println("Registro de mascota guardado exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
        }
    }
}
