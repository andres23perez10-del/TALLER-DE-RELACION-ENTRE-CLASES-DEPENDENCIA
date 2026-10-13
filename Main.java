/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el contenido del documento: ");
        Documento doc = new Documento(sc.nextLine());

        Impresora impresora = new Impresora();
        impresora.imprimir(doc);

        sc.close();
    }
}
