package com.mycompany.programa.usuarios;

import java.util.LinkedList;

import com.mycompany.programa.cartera.Cartera;
import com.mycompany.programa.eventos.Boleto;

public class Cliente extends Usuario implements Cloneable{
    String nombre; 
    String apellidos; 
    String correoElectronico; 
    Cartera cartera;
    LinkedList<Boleto> reservaciones; 

    public Cliente(String nombreUsuario, String Password, String nombre, String apellidos, String correoElectronico){
        super(nombreUsuario, Password);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.cartera = new Cartera();
    }

    //getter y setter para la cartera, pero ese código es de Pedro
    //Las funciones de compra, devolución 
    /*@Override
    public Cliente clone(){
        return new Cliente(this.getNombre(), this.getPassword());
    }*/

    /*public static void main(String[] args) {
        Cliente c1 = new Cliente("Mario", "12345");
        System.out.println("Antes de clonar: "+c1.getNombre());
        Cliente c2 = c1.clone();
        c2.setNombre("Yuga");
        c2.setPassword("777");
        System.out.println("Después de clonar y modificar");
        System.out.println(c2.getNombre());
        System.out.println(c1.getNombre());

    }*/

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
