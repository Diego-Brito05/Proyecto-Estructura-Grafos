/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Auxiliar;
import java.io.File;
import javax.swing.JOptionPane;
/**
 *
 * @author Diego
 */
public class Auxiliar {
    public static void main(String[] args) {
    // Crear un JFileChooser
        
    }
    public static void VerificarJSon(File Archivo) {
        
            if (Archivo.getName().toLowerCase().endsWith(".json")) {
                JOptionPane.showMessageDialog(null, "El archivo es un archivo JSON válido: " + Archivo.getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(null, "El archivo seleccionado no es un archivo JSON.");
            }

    }
}