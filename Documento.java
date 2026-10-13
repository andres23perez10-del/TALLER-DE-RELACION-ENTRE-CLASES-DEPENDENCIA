/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Documento {
    private String contenido;

    public Documento(String contenido) { this.contenido = contenido; }
    public String getContenido() { return contenido; }
}
class Impresora {
    public void imprimir(Documento doc) {
        System.out.println("Imprimiendo: " + doc.getContenido());
    }
}

