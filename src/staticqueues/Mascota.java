/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticqueues;

/**
 *
 * @author ivan
 * ci 5310689
 */ 
 

public class Mascota {
    String nombre;
    int edad;
    String tipoAnimal;
    
    public Mascota(String nombre,int edad,String tipoAnimal){
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal =tipoAnimal;
    }

    public Mascota(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", "
                + "edad=" + edad + ", "
                + "tipoAnimal=" + tipoAnimal + '}';
    }
    
} 
