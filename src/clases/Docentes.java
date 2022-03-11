/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author yanyg
 */
public class Docentes {
    public String nombre;
    public int cedula;
    public int edad;
    public String facultad;
    public String programa;
    
    //creamos metodo para construir nuestro objeto docentes y le pasamos los datospor parámetros
    public Docentes(String nombre, int cedula, int edad, String facultad, String programa){
        this.nombre=nombre;
        this.cedula=cedula;
        this.edad=edad;
        this.facultad=facultad;
        this.programa=programa;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCedula(){
        return cedula;
    }
    public int getEdad(){
        return edad;
    }
    public String getFacultad(){
        return facultad;
    }
    public String getPrograma(){
        return programa;
    }
    
}
