/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg1;

import java.util.Scanner;


/**
 *
 * @author Camey
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /* String nombre1 = "Josue Camey";
        int contra_usua = 202102427;
        
        Scanner nombre = new Scanner(System.in);
        System.out.println("Escribir Nombre de usuario");
        String nombreUsuario = nombre.nextLine();
        
        Scanner contraseña = new Scanner(System.in);
        System.out.println("Escribir Contraseña");
        int contraseña_usua = contraseña.nextInt();
        
        if (contraseña_usua == contra_usua && nombre1.equals(nombreUsuario)){
            System.out.println("Bienvenido");
        } else {
            System.out.println("Nombre o contraseña incorrecta");
        }*/
       
        
       /* System.out.println("Escribir nombre de usuario: ");
        Scanner nombre1 = new Scanner(System.in); 
        String nombre;
        nombre = nombre1.nextLine();
        
        System.out.println("Escribir contraseña con dígitos: ");
        Scanner contra = new Scanner(System.in);
        int contraseña;        
        contraseña = contra.nextInt();
       
       
        Registro usuario = new Registro(contraseña, nombre);*/
       
        Login ventana = new Login();
        ventana.setVisible(true);
        
        
        
        
        
    }
    
}
