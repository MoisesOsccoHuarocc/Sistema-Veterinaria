
package Datos;

import Entidad.Duenios;
import Entidad.Mascotas;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lecturatxt {
    public List<Duenios> leerDuenios() {
        List<Duenios> listaDuenios = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("duenios.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                Duenios duenio = new Duenios(datos[0], datos[1], datos[2], datos[3], datos[4]);
                listaDuenios.add(duenio);
            }
        } catch (IOException e) {
            System.out.println("Error al intentar leer el archivo " + "duenios.txt");
        }

        return listaDuenios;
    }

   public List<Mascotas> leerMascotas() {
    List<Mascotas> listaMascotasTemp = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader("mascotas.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            
            Mascotas mascota = new Mascotas(datos[0], datos[1], datos[2], datos[3]);
            listaMascotasTemp.add(mascota);
        }
    } catch (IOException e) {
        System.out.println("Error al intentar leer el archivo " + "mascotas.txt");
    }

    return listaMascotasTemp;
}



}
