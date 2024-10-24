/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LectorJson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import EDD.Lista;

/**
 *
 * @author Diego, Jose
 * version 15/10/24
 * Clase encargada del manejo del archivo Json
 */
public class LectorJson {
    
    /*
    Este metodo le permite al usuario seleccionar un archivo Json, posteoriormente lee el archivo y carga la informacion en el grafo
    
    @param Paradas, relaciones
    @ return
    */
   public File LecturaJson(Lista paradas, Lista relaciones) throws IOException {
    // Creamos el JFileChooser
    JFileChooser jfc = new JFileChooser();

    // Abrimos el cuadro de diálogo de selección de archivos
    int seleccion = jfc.showOpenDialog(null);

    // Si el usuario seleccionó un archivo
    if (seleccion == JFileChooser.APPROVE_OPTION) {
        // Obtenemos el archivo seleccionado
        File archivo = jfc.getSelectedFile();

        // Verificamos que sea un archivo .Json
        if (archivo.getName().toLowerCase().endsWith(".json")) {
            // Creamos un flujo de entrada para leer el archivo
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                int contador = 0;

                JOptionPane.showMessageDialog(null, "Este programa necesita guardar en el archivo los datos cargados en memoria");

                while ((linea = br.readLine()) != null) {
                    linea = linea.trim();

                    // Revisar si la línea es una parada
                    if (linea.endsWith("\"") || linea.endsWith(",") && !linea.startsWith("{") && !linea.startsWith("}")) {
                        contador = 1;
                    }
                    // Si es una parada con acceso peatonal a otra
                    else if (linea.startsWith("{") && (linea.endsWith(",") || linea.endsWith("}"))) {
                        contador = 2;
                    }
                    // Si es el inicio de una línea
                    else if (linea.endsWith("[")) {
                        contador = 3;
                    }
                    else{
                        continue;
                    }
                    
                    if (contador == 1) {
                        // Agregamos la línea a la lista de paradas
                        int nombre1Inicio = linea.indexOf("\"") + 1;
                        int nombre1Fin = linea.indexOf("\"", nombre1Inicio);
                        String nombre1 = linea.substring(nombre1Inicio, nombre1Fin);

                        if (paradas.EstaEn(nombre1)) {
                            relaciones.insertFinal(nombre1);
                        } else {
                            // Agregamos las líneas a la lista de relaciones y paradas
                            paradas.insertFinal(nombre1);
                            relaciones.insertFinal(nombre1);
                        }
                    } else if (contador == 2) {
                        int nombre1Inicio = linea.indexOf("\"") + 1;
                        int nombre1Fin = linea.indexOf("\"", nombre1Inicio);
                        String nombre1 = linea.substring(nombre1Inicio, nombre1Fin);

                        int nombre2Inicio = linea.indexOf("\"", nombre1Fin + 1) + 1;
                        int nombre2Fin = linea.indexOf("\"", nombre2Inicio);
                        String nombre2 = linea.substring(nombre2Inicio, nombre2Fin);

                        // Guardar en el formato deseado
                        String resulInv = nombre2 + ":" + nombre1;
                        String resultado = nombre1 + ":" + nombre2;
                        //Revisamos que no este su parada alterna Ej: "Petare:La Urbina" "La Urbina:Petare"
                        if (!paradas.EstaEn(resulInv)) {            
                            // Agregamos las líneas a la lista de relaciones y paradas
                            if (paradas.EstaEn(resultado)) {
                                relaciones.insertFinal(resultado);
                            } else {
                                paradas.insertFinal(resultado);
                                relaciones.insertFinal(resultado);
                            }
                        }
                        else{
                            relaciones.insertFinal(resulInv);
                        }
                    } else if (contador == 3) {
                        relaciones.insertFinal("-");
                    }

                    // Restablecer contador al final de cada iteración
                    contador = 0;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return archivo;
        }
        JOptionPane.showMessageDialog(null, "El archivo seleccionado no es compatible");
        return null;
    }
    JOptionPane.showMessageDialog(null, "El archivo seleccionado no es compatible");
    return null;

   }
}