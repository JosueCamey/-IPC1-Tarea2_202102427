/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1;

/**
 *
 * @author Camey
 */
public class Registro {
 
    String contraseña;
    String usuario;
    
    
    Registro(String contraseña, String usuario){
        
        this.contraseña = contraseña;
        this.usuario = usuario;
        
        System.out.println("Usuario: "+ usuario);
        System.out.println("Contraseña: "+ contraseña);
        
        
    }

   /* public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }*/
    
    
    
    
}
